

import java.rmi.RemoteException;
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
	
	
	
	public static String getData(SerializableKeyValuePairOfStringString[][] data) {
		String output = "";
		for (int i = 0; i < data.length; i++) {
			SerializableKeyValuePairOfStringString[] s = data[i];
			for (int k = 0; k < s.length; k++) {
				SerializableKeyValuePairOfStringString s1 = s[k];
				if ( 1==1) {
					s1.getKey();
				output += System.lineSeparator();
				output += "- " + s1.getValue();
			}
		 }
		}
	
		return output;
	}
	
	public static String getData(SerializableKeyValuePairOfStringString[] sjukastedata) {
		String output = "";
			SerializableKeyValuePairOfStringString[] s = sjukastedata;
			for (int k = 0; k < s.length; k++) {
				SerializableKeyValuePairOfStringString s1 = s[k];
				output += System.lineSeparator();
				output += s1.getKey() + s1.getValue();
			}
		return output;
	}
			
	public static String getDataString(String[] DataString) {
		String output = "";
		for (int i = 1; i < DataString.length; i++) {
			String p = DataString[i];
			output += System.lineSeparator();
			output += p;
		
		}
		return output;
	}
	
}
	

