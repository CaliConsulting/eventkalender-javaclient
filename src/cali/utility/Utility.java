package cali.utility;

import java.util.List;

import javax.swing.table.TableModel;

import cali.model.SerializableKeyValuePairTableModel;
import cronus.cali.SerializableKeyValuePairOfStringString;

public class Utility {
	
	public static boolean isStringInt(String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch (NumberFormatException ex) {
			return false;
		}
	}
	
	public static TableModel getData(SerializableKeyValuePairOfStringString[] data) {
		return getData(new SerializableKeyValuePairOfStringString[][] { data });
	}

	public static TableModel getData(SerializableKeyValuePairOfStringString[][] data) {
		// Invalid data; return null immediately
		if (data == null || data[0] == null || data[0][0] == null) {
			return null;
		}

		String[] headers = new String[data[0].length];
		for (int i = 0; i < headers.length; i++) {
			headers[i] = data[0][i].getKey();
		}

		String[][] arr = dataToArray(data);
		TableModel model = new SerializableKeyValuePairTableModel(headers, arr);
		return model;
	}
	
	public static String[][] dataToArray(SerializableKeyValuePairOfStringString[][] data) {
		// Invalid data; return null immediately
		if (data == null || data[0] == null || data[0][0] == null) {
			return null;
		}

		String[][] arr = new String[data.length][data[0].length];

		for (int i = 0; i < data.length; i++) {
			SerializableKeyValuePairOfStringString[] inner = data[i];
			for (int j = 0; j < inner.length; j++) {
				arr[i][j] = inner[j].getValue();
			}
		}
		return arr;
	}

	// public static TableModel getData(SerializableKeyValuePairOfStringString[]
	// sjukastedata) {
	// TableModel d = new DefaultTableModel(0, 1);
	//
	// for (int k = 0; k < sjukastedata.length; k++) {
	//
	// d.setValueAt(sjukastedata[0], 0, 0);
	// SerializableKeyValuePairOfStringString[] s = sjukastedata;
	// for (int k = 1; k < s.length; k++) {
	// SerializableKeyValuePairOfStringString s1 = s[k];
	// d.setValueAt(s1.getValue(), k, 0);
	// }
	// return d;
	// }

	// }
	//
	//
	// public static String getDataString(String[] DataString) {
	// String output = "";
	// for (int i = 1; i < DataString.length; i++) {
	// String p = DataString[i];
	// output += System.lineSeparator();
	// output += p;
	//
	// }
	// return output;
	// }

}