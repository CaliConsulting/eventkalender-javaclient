package cali.utility;

import java.rmi.RemoteException;

import javax.swing.JTextPane;

public class ExceptionHandler {

	public static void getErrorMessage(Exception e, JTextPane pane) {
		String message = getErrorMessage(e);
		if (pane != null) {
			pane.setText(message);
		}
	}

	public static String getErrorMessage(Exception e) {
		String message = "";

		message = getGenericErrorMessage(e);

		return message;
	}

	private static String getGenericErrorMessage(Exception e) {
		String message = "";
		if (e instanceof NumberFormatException) {
			message = "Fältet accepterar inte denna indata, var god kontrollera formattering på tal och text";
		} else if (e instanceof NullPointerException) {
			message = "Var god ange värden för alla fält";
		} else if (e instanceof RemoteException) {
			message = "Fel uppstod vid kommunikation med webbtjänsten";
		} else {
			message = e.getMessage();
		}
		return message;
	}

}
