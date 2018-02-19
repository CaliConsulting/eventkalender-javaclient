import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.rmi.RemoteException;

import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import cali.se.lu.ics.www.Event;
import cali.se.lu.ics.www.EventkalenderServiceSoapProxy;
import cali.se.lu.ics.www.Nation;
import cali.se.lu.ics.www.Person;
import java.awt.TextArea;
import javax.swing.JTextPane;


public class JavaApp {

	private EventkalenderServiceSoapProxy eventProxy;
	
	private JFrame frame;
	private String NameC;
	private String NameCA;
	private String[] SelectionList = {"Nation", "Nationer", "Person", "Personer", "Event", "Events"};
	private String[] CBMetadata = {"Anställda", "Tabeller", "Tabell-begränsningar", "Nycklar", "Index", "Anställningsstatistik", "Anställningsrelationer", "Anställningskvalifikationer", "Anställningsfrånvaro", "Anställningskolumner", "Anställningssetup"};
	private String[] CBData = {"Anställda", "Sjukaste Personen", "Sjukaste personen/år", "Anställningsstatistik", "Anställningsrelationer", "Anställningskvalifikationer", "Anställningfrånvaro", "Anställningssetup"};
	private JComboBox J = new JComboBox (SelectionList);
	private JButton B = new JButton("Hämta");
	private JTextField txtId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaApp window = new JavaApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JavaApp() {
		initialize();
		
		eventProxy = new EventkalenderServiceSoapProxy();
	}

	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 550, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 550, 428);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Eventkalender ws", null, panel_1, null);
		panel_1.setLayout(null);
		
		final JComboBox UserSelectionBox = new JComboBox(SelectionList);
		UserSelectionBox.setBounds(153, 29, 215, 26);
		panel_1.add(UserSelectionBox);
		
		
		final JTextArea txtOutput = new JTextArea();
		txtOutput.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtOutput.setBounds(29, 222, 461, 128);
		panel_1.add(txtOutput);
		
		JButton B = new JButton("Hämta");
		B.setBounds(206, 127, 110, 30);
		B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		        String userSelection = (String) UserSelectionBox.getSelectedItem();
		 
		        if (userSelection.equals("Nation")) {
		        	if(txtId.getText().equals("")) {
		        		txtOutput.setText("Var god fyll i ID-fältet!");
		        		return;
		        	}
		        	int id = Integer.parseInt(txtId.getText());
		        	try {
						Nation n = eventProxy.getNation(id);
						if (n != null) {
							txtOutput.setText("Du har valt: " + n.getName());
						} else {
							txtOutput.setText("Nation med ID " + id + " finns inte");
						}
					} catch (RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		        }
	        	else if (userSelection.equals("Event")) {
		        	if(txtId.getText().equals("")) {
		        		txtOutput.setText("Var god fyll i ID-fältet!");
		        		return;
		        	}
		        	int id = Integer.parseInt(txtId.getText());
		        	
		        	try {
						Event event = eventProxy.getEvent(id);
						txtOutput.setText("Du har valt: " + event.getName());
						
					} catch (RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		        }
	        	else if (userSelection.equals("Person")) {
					if(txtId.getText().equals("")) {
		        		txtOutput.setText("Var god fyll i ID-fältet!");
		        		return;
		        	}
					
					int id = Integer.parseInt(txtId.getText());
		        	
		        	try {
						Person p = eventProxy.getPerson(id);
						txtOutput.setText("Du har valt: " + p.getFirstName() + " " + p.getLastName());
						} catch (RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
	        	}
	        	else if (userSelection.equals("Nationer")) {
		        	try {
						Nation[] nationer = eventProxy.getNations();
						
						String output = "Alla nationer: ";
						
						for (int i = 0; i < nationer.length; i++) {
							output += System.lineSeparator();
							output += nationer[i].getName();
						}
						txtOutput.setText(output);
						
					} catch (RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
	        	}
	        	else if (userSelection.equals("Events")) {
		        	try {
						Event[] events = eventProxy.getEvents();
						
						String output = "Alla events: ";
						
						for (int i = 0; i < events.length; i++) {
							output += System.lineSeparator();
							output += events[i].getName();
						}
						txtOutput.setText(output);
						
					} catch (RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
	        	}
	        	else if (userSelection.equals("Personer")) {
		        	try {
						Person[] personer = eventProxy.getPersons();
						
						String output = "Alla personer: ";
						
						for (int i = 0; i < personer.length; i++) {
							output += System.lineSeparator();
							output += personer[i].getFirstName() + " " + personer[i].getLastName();
						}
						txtOutput.setText(output);
						
					} catch (RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
	        	}
	        }
		});
		panel_1.add(B);
		JLabel VarGodVälj = new JLabel("Var god välj:");
		VarGodVälj.setBounds(52, 34, 99, 16);
		VarGodVälj.setFont(new Font("Times New Roman", Font.BOLD, 14));
		panel_1.add(VarGodVälj);
		
		txtId = new JTextField();
		txtId.setBounds(153, 79, 86, 20);
		panel_1.add(txtId);
		txtId.setColumns(10);
		
		JLabel IDnr = new JLabel("ID nr:");
		IDnr.setFont(new Font("Times New Roman", Font.BOLD, 14));
		IDnr.setBounds(52, 81, 57, 14);
		panel_1.add(IDnr);
		
		
		
		JPanel CronusPanel = new JPanel();
		tabbedPane.addTab("Databas ws", null, CronusPanel, null);
		CronusPanel.setLayout(null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(0, 0, 529, 382);
		CronusPanel.add(tabbedPane_1);
		
		JPanel panel_3 = new JPanel();
		tabbedPane_1.addTab("Data", null, panel_3, null);
		panel_3.setLayout(null);
		
		final JComboBox Data_Combobox = new JComboBox(CBData);
		Data_Combobox.setBounds(177, 20, 165, 27);
		panel_3.add(Data_Combobox);
		
		JButton btnNewButton = new JButton("Hämta");
		btnNewButton.setBounds(215, 65, 90, 28);
		panel_3.add(btnNewButton);
		B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
		        String userSelection = (String) Data_Combobox.getSelectedItem();
		        if (userSelection.equals("Sjukaste personen")) {
		        	if(txtId.getText().equals("")) {
		        		txtOutput.setText("Var god fyll i ID-fältet!");
		        		return;
		        	}
		        	boolean isInt = Metoder.isStringInt(txtId.getText());
		        	if (!isInt) {
		        		txtOutput.setText("Ange giltigt heltal");
		        	}
		        	int id = Integer.parseInt(txtId.getText());
		        	try {
						Nation n = eventProxy.getNation(id);
						if (n != null) {
							txtOutput.setText("Du har valt: " + n.getName());
						} else {
							txtOutput.setText("Nation med ID " + id + " finns inte");
						}
					} catch (RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		        }
			}
		});
		        
		
		
		
		TextArea textArea = new TextArea();
		textArea.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textArea.setBounds(31, 178, 460, 166);
		panel_3.add(textArea);
		
		JPanel PanelMetadata = new JPanel();
		tabbedPane_1.addTab("Metadata", null, PanelMetadata, null);
		PanelMetadata.setLayout(null);
		
		JComboBox Metadata_ComboBox = new JComboBox(CBMetadata);
		Metadata_ComboBox.setBounds(177, 20, 165, 27);
		PanelMetadata.add(Metadata_ComboBox);
		
		JButton btnNewButton_1 = new JButton("Hämta");
		btnNewButton_1.setBounds(215, 65, 90, 28);
		PanelMetadata.add(btnNewButton_1);
		
		TextArea textArea_1 = new TextArea();
		textArea_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textArea_1.setBounds(31, 178, 460, 166);
		PanelMetadata.add(textArea_1);
		
		
	
	}
}
