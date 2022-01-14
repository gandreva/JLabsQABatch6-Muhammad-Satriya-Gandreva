package qaautomation.tugas1;

import java.util.TreeMap;
import java.util.TreeSet;

public class Tugas1 {

	public static void main(String args[]) {
	       
        TreeMap<Integer, String> sCode = new TreeMap<>();
		sCode.put(1001, "VSAT IP");
		sCode.put(1012, "VSAT SCPC");
		sCode.put(1003, "M2M");
		sCode.put(1024, "BGAN");
		
		for (Integer key : sCode.keySet()) {
			System.out.println("Service Code " + sCode.get(key) + " is " + key);
		}


		TreeSet<Integer> rCode = new TreeSet<>();

		rCode.add(1001);
		rCode.add(1012);
		rCode.add(1024);
		rCode.add(1012);
		rCode.add(1001);
		rCode.add(1036);

		for (Integer item : rCode) {
			System.out.println("List Code " + item);
		}
	
	}

}
