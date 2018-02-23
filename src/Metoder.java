

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

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
	
//	Gamla metoden!
	// public static String getData(SerializableKeyValuePairOfStringString[][] jdata) {
//		String output = "";
//		for (int i = 0; i < jdata.length; i++) {
//			SerializableKeyValuePairOfStringString[] s = jdata[i];
//			for (int k = 0; k < s.length; k++) {
//				SerializableKeyValuePairOfStringString s1 = s[k];
//				if ( 1==1) {
//					s1.getKey();
//				output += System.lineSeparator();
//				output += "- " + s1.getValue();
//			}
//		 }
//		}
//
//		return output;
//	}
		
		public static TableModel getData(SerializableKeyValuePairOfStringString[][] data) {
			TableModel d = new DefaultTableModel(0, 1);
			for (int k = 0; k < data.length; k++) {
				SerializableKeyValuePairOfStringString[] s = data[k];
			d.setValueAt(data[0], 0, 0);
			for (int j = 1; j < s.length; j++) {
				SerializableKeyValuePairOfStringString s1 = s[j];
				d.setValueAt(s1.getValue(), j, 0);
			}
			}
			return d;
			
		}
		public static TableModel getData(SerializableKeyValuePairOfStringString[] sjukastedata) {
			TableModel d = new DefaultTableModel(0, 1);
			
			for (int k = 0; k < sjukastedata.length; k++) {
			
			d.setValueAt(sjukastedata[0], 0, 0);
			SerializableKeyValuePairOfStringString[] s = sjukastedata;
			for (int k = 1; k < s.length; k++) {
				SerializableKeyValuePairOfStringString s1 = s[k];
				d.setValueAt(s1.getValue(), k, 0);
			}
			return d;
		}
	

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
	

