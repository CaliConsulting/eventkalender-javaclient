

import java.util.ArrayList;
import java.util.List;

import cronus.cali.SerializableKeyValuePairOfStringString;

public class Metoder {
	
	List<String[]> listan;

	public static boolean isStringInt(String s) {
	    try {
	        Integer.parseInt(s);
	        return true;
	    } catch (NumberFormatException ex) {
	        return false;
	    }
	}
	
	public void GetData(SerializableKeyValuePairOfStringString[][] a) 
	{
		listan = new ArrayList<String[]>();
		
		for(int i = 0; i>a.length; i++) {
			//listan.add(a[i]
			
		}
	}
	
}

