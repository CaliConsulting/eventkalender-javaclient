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
	private String[] CBMetadata = {"Anställda", "Tabeller", "Tabellbegränsningar", "Nycklar", "Index", "Anställningsstatistik", "Anställningsrelationer", "Anställningskvalifikationer", "Anställningsfrånvaro", "Kolumner för anställningstabeller", "Anställningssetup"};
	private String[] CBData = {"Anställda", "Sjukaste personen", "Sjukaste personen år 2004-2005", "Anställningsstatistik", "Anställningsrelationer", "Anställningskvalifikationer", "Anställningsfrånvaro", "Anställningssetup"};
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
		
		JPanel Eventkalender_panel = new JPanel();
		tabbedPane.addTab("Eventkalender ws", null, Eventkalender_panel, null);
		Eventkalender_panel.setLayout(null);
		
		final JComboBox UserSelectionBox = new JComboBox(SelectionList);
		UserSelectionBox.setBounds(153, 29, 215, 26);
		Eventkalender_panel.add(UserSelectionBox);
		
		
		final JTextArea txtOutput = new JTextArea();
		txtOutput.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtOutput.setBounds(29, 222, 461, 128);
		Eventkalender_panel.add(txtOutput);
		
		JButton EK_btn = new JButton("Hämta");
		EK_btn.setBounds(206, 127, 110, 30);
		EK_btn.addActionListener(new ActionListener() {
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
		Eventkalender_panel.add(EK_btn);
		JLabel VarGodVälj = new JLabel("Var god välj:");
		VarGodVälj.setBounds(52, 34, 99, 16);
		VarGodVälj.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Eventkalender_panel.add(VarGodVälj);
		
		txtId = new JTextField();
		txtId.setBounds(153, 79, 86, 20);
		Eventkalender_panel.add(txtId);
		txtId.setColumns(10);
		
		JLabel IDnr = new JLabel("ID nr:");
		IDnr.setFont(new Font("Times New Roman", Font.BOLD, 14));
		IDnr.setBounds(52, 81, 57, 14);
		Eventkalender_panel.add(IDnr);
		
		JPanel Cronus_panel = new JPanel();
		tabbedPane.addTab("Databas ws", null, Cronus_panel, null);
		Cronus_panel.setLayout(null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(0, 0, 529, 382);
		Cronus_panel.add(tabbedPane_1);
		
		JPanel Data_panel = new JPanel();
		tabbedPane_1.addTab("Data", null, Data_panel, null);
		Data_panel.setLayout(null);
		
		final JComboBox Data_Combobox = new JComboBox(CBData);
		Data_Combobox.setBounds(150, 23, 215, 26);
		Data_panel.add(Data_Combobox);
		
		final TextArea txtOutPutData = new TextArea();
		txtOutPutData.setBounds(31, 187, 460, 157);
		txtOutPutData.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		Data_panel.add(txtOutPutData);
		
		JButton Data_btn = new JButton("Hämta");
		Data_btn.setBounds(198, 143, 110, 30);
		Data_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

		        String CronusSelection = (String) Data_Combobox.getSelectedItem();
		        
		         if (CronusSelection.equals("Anställda")) {
		        	try {
						SerializableKeyValuePairOfStringString[][] employeeData = cronusProxy.getEmployeeData();
						String output = Metoder.getData(employeeData);
						txtOutPutData.setText("Data om anställda: " + output);
		        	} catch (RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		         }	
		         
		         
		         else  if (CronusSelection.equals("Anställningsstatistik")) {
			        	try {
							SerializableKeyValuePairOfStringString[][] employeeStatisticsData = cronusProxy.getEmployeeStatisticsGroupData();
							String output = Metoder.getData(employeeStatisticsData);
							txtOutPutData.setText("Data om anställninsstatistik: " + output);
			        	} catch (RemoteException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
			         }
		         
		         else if (CronusSelection.equals("Anställningsrelationer")) {
			        	try {
			        		SerializableKeyValuePairOfStringString[][] employeeRelativeData = cronusProxy.getEmployeeRelativeData();
			        		String output = Metoder.getData(employeeRelativeData);		
							txtOutPutData.setText("Data om anställningsrelationer" + output);
			        	} catch (RemoteException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
			         }
		         
		         else  if (CronusSelection.equals("Anställningskvalifikationer")) {
			        	try {
							SerializableKeyValuePairOfStringString[][] employeeQualificationData = cronusProxy.getEmployeeQualificationData();
							String output = Metoder.getData(employeeQualificationData);
							txtOutPutData.setText("Data om anställninskvalifikationer: " + output);
			        	} catch (RemoteException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
			         }
		         
		         else   if (CronusSelection.equals("Anställningsfrånvaro")) {
			        	try {
							SerializableKeyValuePairOfStringString[][] employeeAbsenceData = cronusProxy.getEmployeeAbsenceData();
							String output = Metoder.getData(employeeAbsenceData);
							txtOutPutData.setText("Data om Anställningsfrånvaro: " + output);
			        	} catch (RemoteException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
			         }
		         
		         else  if (CronusSelection.equals("Anställningssetup")) {
			        	try {
							SerializableKeyValuePairOfStringString[][] employeeSetupData = cronusProxy.getEmployeePortalSetupData();
							String output = Metoder.getData(employeeSetupData);
								txtOutPutData.setText("Data om Anställningssetup: " + output);
			        	} catch (RemoteException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
			         }
		         
		         else if (CronusSelection.equals("Sjukaste personen år 2004-2005")) {
			        	try {
			        		SerializableKeyValuePairOfStringString[][] illPersonsByYear = cronusProxy.getIllPersonsByYear(2004, 2005);
			        		String output = Metoder.getData(illPersonsByYear);
								txtOutPutData.setText("Sjukaste personen år 2004-2005: " + output);
						} catch (RemoteException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
			        	
			        }
     
		         else if (CronusSelection.equals("Sjukaste personen")) {
		        	try {
		        		SerializableKeyValuePairOfStringString[] sjukastPerson = cronusProxy.getIllestPerson();
		        		String output = Metoder.getData(sjukastPerson);
							txtOutPutData.setText("Sjukaste personen: " + output);
					} catch (RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		        }
			}
				
		});
		Data_panel.add(Data_btn);
		
		JLabel lblNewLabel_1 = new JLabel("Var god välj");
		lblNewLabel_1.setBounds(50, 25, 90, 20);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Data_panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Start year:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setBounds(73, 75, 67, 18);
		Data_panel.add(lblNewLabel_2);
		
		JLabel lblEndYear = new JLabel("End year:");
		lblEndYear.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblEndYear.setBounds(301, 100, 67, 18);
		Data_panel.add(lblEndYear);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(387, 75, 86, 20);
		Data_panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(387, 100, 86, 20);
		Data_panel.add(textField_4);
		
		JPanel Metadata_panel = new JPanel();
		tabbedPane_1.addTab("Metadata", null, Metadata_panel, null);
		Metadata_panel.setLayout(null);
		
		final JComboBox Metadata_Combobox = new JComboBox(CBMetadata);
		Metadata_Combobox.setBounds(155, 29, 215, 26);
		Metadata_panel.add(Metadata_Combobox);
		
		final TextArea txtOutPutMetadata = new TextArea();
		txtOutPutMetadata.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtOutPutMetadata.setBounds(31, 178, 460, 166);
		Metadata_panel.add(txtOutPutMetadata);
	
		JButton Metadata_btn = new JButton("Hämta");
		Metadata_btn.setBounds(209, 76, 110, 30);
		Metadata_panel.add(Metadata_btn);
		Metadata_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

		        String MDCronusSelection = (String) Metadata_Combobox.getSelectedItem();
		        
		        if (MDCronusSelection.equals("Anställda")) {
		        	try {
						SerializableKeyValuePairOfStringString[][] employeeMetadata = cronusProxy.getEmployeeMetadata();
						String output = Metoder.getData(employeeMetadata);
						txtOutPutMetadata.setText("Data om anställda: " + output);
		        	} catch (RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		         }	
		         
		         
		        else if (MDCronusSelection.equals("Anställningsstatistik")) {
			        	try {
							SerializableKeyValuePairOfStringString[][] employeeStatisticsMetadata = cronusProxy.getEmployeeStatisticsGroupMetadata();
							String output = Metoder.getData(employeeStatisticsMetadata);
							txtOutPutMetadata.setText("Data om anställninsstatistik: " + output);
			        	} catch (RemoteException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
			         }
		         
		        else  if (MDCronusSelection.equals("Anställningsrelationer")) {
			        	try {
							SerializableKeyValuePairOfStringString[][] employeeRelativeMetadata = cronusProxy.getEmployeeRelativeMetadata();
							String output = Metoder.getData(employeeRelativeMetadata);
							txtOutPutMetadata.setText("Data om anställningsrelationer: " + output);
			        	} catch (RemoteException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
			         }
		         
		        else  if (MDCronusSelection.equals("Anställningskvalifikationer")) {
			        	try {
							SerializableKeyValuePairOfStringString[][] employeeQualificationMetadata = cronusProxy.getEmployeeQualificationMetadata();
							String output = Metoder.getData(employeeQualificationMetadata);
							txtOutPutMetadata.setText("Data om anställninskvalifikationer: " + output);
			        	} catch (RemoteException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
			         }
		         
		        else if (MDCronusSelection.equals("Anställningsfrånvaro")) {
			        	try {
							SerializableKeyValuePairOfStringString[][] employeeAbsenceMetadata = cronusProxy.getEmployeeAbsenceMetadata();
							String output = Metoder.getData(employeeAbsenceMetadata);
							txtOutPutMetadata.setText("Data om Anställningsfrånvaro: " + output);
			        	} catch (RemoteException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
			         }
		         
		        else if (MDCronusSelection.equals("Anställningssetup")) {
			        	try {
							SerializableKeyValuePairOfStringString[][] employeeSetupMetadata = cronusProxy.getEmployeePortalSetupMetadata();
							String output = Metoder.getData(employeeSetupMetadata);
							txtOutPutMetadata.setText("Data om Anställningssetup: " + output);
			        	} catch (RemoteException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
			         }
		         
		        else if (MDCronusSelection.equals("Tabeller")) {
			        	try {
							String[] tables = cronusProxy.getTables();
							String output = Metoder.getDataString(tables);
							txtOutPutMetadata.setText("Data om alla tabeller: " + output);
			        	} catch (RemoteException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
			         }
		        
		        else if (MDCronusSelection.equals("Tabellbegränsningar")) {
		        	try {
						String[] tableConstraints = cronusProxy.getTableConstraints();
						String output = Metoder.getDataString(tableConstraints);
						txtOutPutMetadata.setText("Data om alla tabellbegränsningar: " + output);
		        	} catch (RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		         }
		        
		        else if (MDCronusSelection.equals("Kolumner för anställningstabeller")) {
		        	try {
						String[] columnsForEmployeeTable = cronusProxy.getColumnsForEmployeeTable();
						String output = Metoder.getDataString(columnsForEmployeeTable);
						txtOutPutMetadata.setText("Kolumner för anställningstabeller: " + output);
		        	} catch (RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		         }
		        
		        else if (MDCronusSelection.equals("Index")) {
		        	try {
						String[] indexes = cronusProxy.getIndexes();
						String output = Metoder.getDataString(indexes);
						txtOutPutMetadata.setText("index: " + output);
		        	} catch (RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		         }
		        
		        else if (MDCronusSelection.equals("Nycklar")) {
		        	try {
						String[] keys = cronusProxy.getKeys();
						String output = Metoder.getDataString(keys);
						txtOutPutMetadata.setText("index: " + output);
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
