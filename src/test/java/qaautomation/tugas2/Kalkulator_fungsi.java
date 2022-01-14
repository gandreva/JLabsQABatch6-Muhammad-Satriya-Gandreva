package qaautomation.tugas2;

class Kalkulator_fungsi {
    
    private int inputan1;
    private int inputan2;
    private int hasil;
 
    //membuat method set dan get

    public int getInputan1() {
        return inputan1;
    }

    public void setInputan1(int inputan1) {
        this.inputan1 = inputan1;
    }

    public int getInputan2() {
        return inputan2;
    }

    public void setInputan2(int inputan2) {
        this.inputan2 = inputan2;
    }

    public int getHasil() {
        return hasil;
    }

    public void setHasil(int hasil) {
        this.hasil = hasil;
    }
    
    //rumus
    public void sum(){
        hasil = inputan1+inputan2;
    }
 
    public void subtract(){
        hasil = inputan1-inputan2;
    }
    
    public void divide (){
        hasil = inputan1/inputan2;
    }
    public void multiplication(){
        hasil = inputan1*inputan2;
    }
}
