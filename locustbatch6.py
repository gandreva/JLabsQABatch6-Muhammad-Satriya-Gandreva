from locust import HttpUser, between, task

class QuickStartUser(HttpUser):
    host = "https://api-staging-builder.engineer.ai"
    wait_time = between(1,5)
    token = ''

    def on_start(self):
        reqBodyLogin = {"email": "jogidemo321@gmail.com", "password": "builder123"}
        headersLogin = {"content-type":"application/json"}

        response = self.client.post("/users/sign_in",headers = headersLogin, json = reqBodyLogin, name="Login")
        self.token = response.json()['user']['authtoken']

    @task(1)
    def dashboard(self):
        headersDashboard = {"content-type":"application/json","authtoken":self.token}

        response = self.client.get("/build_cards?status=completed",headers = headersDashboard, name= "Dashboard")
        print(response.text)

    @task(5)
    def user(self):
        headersUser = {"content-type":"application/json","authtoken":self.token}

        response = self.client.get("/user",headers = headersUser, name= "User")
        print(response.text)

