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


import cronus.cali.CronusServiceSoapProxy;
import cronus.cali.SerializableKeyValuePairOfStringString;
import eventkalender.cali.Event;
import eventkalender.cali.EventkalenderServiceSoapProxy;
import eventkalender.cali.Nation;
import eventkalender.cali.Person;

import java.awt.TextArea;
import javax.swing.JTextPane;


public class JavaApp {

	private EventkalenderServiceSoapProxy eventProxy;
	private CronusServiceSoapProxy cronusProxy;
	
	private JFrame frame;
	private String NameC;
	private String NameCA;
	private String[] SelectionList = {"Nation", "Nationer", "Person", "Personer", "Event", "Events"};
	private String[] CBMetadata = {"Anställda", "Tabeller", "Tabell-begränsningar", "Nycklar", "Index", "Anställningsstatistik", "Anställningsrelationer", "Anställningskvalifikationer", "Anställningsfrånvaro", "Anställningskolumner", "Anställningssetup"};
	private String[] CBData = {"Anställda", "Sjukaste Personen", "Sjukaste personen år 2004-2005", "Anställningsstatistik", "Anställningsrelationer", "Anställningskvalifikationer", "Anställningsfrånvaro", "Anställningssetup"};
	private JComboBox J = new JComboBox (SelectionList);
	private JButton B = new JButton("Hämta");
	private JTextField txtId;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

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
		cronusProxy = new CronusServiceSoapProxy();
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
	        	else if (userSelection.equals("Event")) {
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
						Event event = eventProxy.getEvent(id);
						if (event != null) {
						txtOutput.setText("Du har valt: " + event.getName());
						} else {
							txtOutput.setText("Nation med ID " + id + " finns inte");
						}
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
					boolean isInt = Metoder.isStringInt(txtId.getText());
		        	if (!isInt) {
		        		txtOutput.setText("Ange giltigt heltal");
		        	}
					int id = Integer.parseInt(txtId.getText());
		        	
		        	try {
						Person p = eventProxy.getPerson(id);
						if (p != null) {
							txtOutput.setText("Du har valt: " + p.getFirstName() + " " + p.getLastName());
						} else {
							txtOutput.setText("Nation med ID " + id + " finns inte");
						}
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
		Data_Combobox.setBounds(150, 23, 215, 26);
		panel_3.add(Data_Combobox);
		
		final TextArea txtOutPutData = new TextArea();
		txtOutPutData.setBounds(31, 187, 460, 157);
		txtOutPutData.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		panel_3.add(txtOutPutData);
		
		JButton btnNewButton = new JButton("Hämta");
		btnNewButton.setBounds(198, 143, 110, 30);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

		        String CronusSelection = (String) Data_Combobox.getSelectedItem();
		        
		         if (CronusSelection.equals("Anställda")) {
		        	try {
						SerializableKeyValuePairOfStringString[][] employeeData = cronusProxy.getEmployeeData();
						
						txtOutPutData.setText("Data om anställda: " + employeeData);
		        	} catch (RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		         }	
		         
		         
		         else  if (CronusSelection.equals("Anställningsstatistik")) {
			        	try {
							SerializableKeyValuePairOfStringString[][] employeeStatisticsData = cronusProxy.getEmployeeStatisticsGroupData();
							
							txtOutPutData.setText("Data om anställninsstatistik: " + employeeStatisticsData);
			        	} catch (RemoteException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
			         }
		         
		         else if (CronusSelection.equals("Anställningsrelationer")) {
			        	try {
							SerializableKeyValuePairOfStringString[][] employeeRelativeData = cronusProxy.getEmployeeRelativeData();
							
							txtOutPutData.setText("Data om anställninsstatistik: " + employeeRelativeData);
			        	} catch (RemoteException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
			         }
		         
		         else  if (CronusSelection.equals("Anställningskvalifikationer")) {
			        	try {
							SerializableKeyValuePairOfStringString[][] employeeQualificationData = cronusProxy.getEmployeeQualificationData();
							
							txtOutPutData.setText("Data om anställninskvalifikationer: " + employeeQualificationData);
			        	} catch (RemoteException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
			         }
		         
		         else   if (CronusSelection.equals("Anställningsfrånvaro")) {
			        	try {
							SerializableKeyValuePairOfStringString[][] employeeAbsenceData = cronusProxy.getEmployeeAbsenceData();
							
							txtOutPutData.setText("Data om Anställningsfrånvaro: " + employeeAbsenceData);
			        	} catch (RemoteException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
			         }
		         
		         else  if (CronusSelection.equals("Anställningssetup")) {
			        	try {
							SerializableKeyValuePairOfStringString[][] employeeSetupData = cronusProxy.getEmployeePortalSetupData();
							
							txtOutPutData.setText("Data om Anställningssetup: " + employeeSetupData);
			        	} catch (RemoteException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
			         }
		         
		         else if (CronusSelection.equals("Sjukaste personen år 2004-2005")) {
			        	try {
			        		SerializableKeyValuePairOfStringString[][] SjukastPersonEfterÅr = cronusProxy.getIllPersonsByYear(2004, 2005);
								txtOutPutData.setText("Sjukaste personen år 2004-2005: " + SjukastPersonEfterÅr);
						} catch (RemoteException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
			        }
     
		         else if (CronusSelection.equals("Sjukaste personen")) {
		        	try {
		        		SerializableKeyValuePairOfStringString[] SjukastPerson = cronusProxy.getIllestPerson();
							txtOutPutData.setText("Sjukaste personen: " + SjukastPerson);
					} catch (RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		        }
			}
				
		});
		panel_3.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Var god välj");
		lblNewLabel_1.setBounds(50, 25, 90, 20);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		panel_3.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Start year:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setBounds(73, 75, 67, 18);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblEndYear = new JLabel("End year:");
		lblEndYear.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblEndYear.setBounds(301, 100, 67, 18);
		panel_3.add(lblEndYear);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(387, 75, 86, 20);
		panel_3.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(387, 100, 86, 20);
		panel_3.add(textField_4);
		
		JPanel PanelMetadata = new JPanel();
		tabbedPane_1.addTab("Metadata", null, PanelMetadata, null);
		PanelMetadata.setLayout(null);
		
		final JComboBox Metadata_Combobox = new JComboBox(CBMetadata);
		Metadata_Combobox.setBounds(155, 29, 215, 26);
		PanelMetadata.add(Metadata_Combobox);
		
		final TextArea txtOutPutMetadata = new TextArea();
		txtOutPutMetadata.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtOutPutMetadata.setBounds(31, 178, 460, 166);
		PanelMetadata.add(txtOutPutMetadata);
	
		JButton Hämta_Metadata = new JButton("Hämta");
		Hämta_Metadata.setBounds(209, 76, 110, 30);
		PanelMetadata.add(Hämta_Metadata);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

		        String MDCronusSelection = (String) Metadata_Combobox.getSelectedItem();
		        
		        if (MDCronusSelection.equals("Anställda")) {
		        	try {
						SerializableKeyValuePairOfStringString[][] employeeData = cronusProxy.getEmployeeMetadata();
						
						txtOutPutData.setText("Data om anställda: " + employeeData);
		        	} catch (RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		         }	
		         
		         
		         if (MDCronusSelection.equals("Anställningsstatistik")) {
			        	try {
							SerializableKeyValuePairOfStringString[][] employeeStatisticsData = cronusProxy.getEmployeeStatisticsGroupMetadata();
							
							txtOutPutData.setText("Data om anställninsstatistik: " + employeeStatisticsData);
			        	} catch (RemoteException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
			         }
		         
		         if (MDCronusSelection.equals("Anställningsrelationer")) {
			        	try {
							SerializableKeyValuePairOfStringString[][] employeeRelativeData = cronusProxy.getEmployeeRelativeMetadata();
							
							txtOutPutData.setText("Data om anställninsstatistik: " + employeeRelativeData);
			        	} catch (RemoteException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
			         }
		         
		         if (MDCronusSelection.equals("Anställningskvalifikationer")) {
			        	try {
							SerializableKeyValuePairOfStringString[][] employeeQualificationData = cronusProxy.getEmployeeQualificationMetadata();
							
							txtOutPutData.setText("Data om anställninskvalifikationer: " + employeeQualificationData);
			        	} catch (RemoteException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
			         }
		         
		         if (MDCronusSelection.equals("Anställningsfrånvaro")) {
			        	try {
							SerializableKeyValuePairOfStringString[][] employeeAbsenceData = cronusProxy.getEmployeeAbsenceMetadata();
							
							txtOutPutData.setText("Data om Anställningsfrånvaro: " + employeeAbsenceData);
			        	} catch (RemoteException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
			         }
		         
		         if (MDCronusSelection.equals("Anställningssetup")) {
			        	try {
							SerializableKeyValuePairOfStringString[][] employeeSetupData = cronusProxy.getEmployeePortalSetupMetadata();
							
							txtOutPutData.setText("Data om Anställningssetup: " + employeeSetupData);
			        	} catch (RemoteException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
			         }
		         
		         if (MDCronusSelection.equals("Tabeller")) {
			        	try {
							SerializableKeyValuePairOfStringString[][] employeeAbsenceData = cronusProxy.getEmployeeAbsenceMetadata();
							
							txtOutPutData.setText("Data om Anställningsfrånvaro: " + employeeAbsenceData);
			        	} catch (RemoteException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
			         }
		        
			}
		});
		
		
		JPanel panel = new JPanel();
		tabbedPane_1.addTab("New tab", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblId = new JLabel("ID nr:");
		lblId.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblId.setBounds(33, 25, 46, 14);
		panel.add(lblId);
		
		JLabel lblFrnamn = new JLabel("Förnamn:");
		lblFrnamn.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblFrnamn.setBounds(33, 50, 72, 14);
		panel.add(lblFrnamn);
		
		JLabel lblEfternamn = new JLabel("Efternamn:");
		lblEfternamn.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblEfternamn.setBounds(33, 75, 75, 14);
		panel.add(lblEfternamn);
		
		TextArea txtOutPutoklar = new TextArea();
		txtOutPutoklar.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtOutPutoklar.setBounds(33, 192, 460, 152);
		panel.add(txtOutPutoklar);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(115, 23, 97, 20);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(115, 48, 97, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(115, 73, 97, 20);
		panel.add(textField_2);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(115, 105, 97, 28);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Uppdatera");
		btnNewButton_3.setBounds(33, 158, 97, 28);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(396, 158, 97, 28);
		panel.add(btnNewButton_4);
		
		
	
	}
}
