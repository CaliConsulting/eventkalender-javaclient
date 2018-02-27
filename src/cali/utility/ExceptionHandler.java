package cali.utility;

import java.rmi.RemoteException;

import javax.swing.JTextPane;
import javax.xml.soap.SOAPException;

public class ExceptionHandler {

	public static void getErrorMessage(Exception e, JTextPane pane) {
		String message = getErrorMessage(e);
		if (pane != null) {
			pane.setText(message);
		}
	}

	public static String getErrorMessage(Exception e) {
		String message = "";
		if (e instanceof NumberFormatException) {
			message = "Fältet accepterar inte denna indata, var god kontrollera formattering på tal och text";
		} else if (e instanceof NullPointerException) {
			message = "Var god ange giltiga värden för alla fält. Om du försökte hämta något från databasen, kontrollera om den valda primärnyckeln existerar";
		} else if (e instanceof SOAPException) {
			message = "Ett SOAP-fel inträffade vid kommunikation med webbtjänsten";
		} else if (e instanceof RemoteException) {
			message = "Fel uppstod vid kommunikation med webbtjänsten";
		} else {
			message = e.getMessage();
		}
		return message;
	}

}
