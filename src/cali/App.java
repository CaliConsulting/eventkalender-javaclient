package cali;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import cali.controller.Controller;
import cali.model.EmployeeTableModel;
import cali.model.EventTableModel;
import cali.model.NationTableModel;
import cali.model.PersonTableModel;
import cali.model.SerializableKeyValuePairTableModel;
import cali.model.StringTableModel;
import cali.utility.ExceptionHandler;
import cali.utility.Utility;
import cronus.cali.Employee;

public class App {

	private Controller controller;

	private JFrame frame;
	private String NameC;
	private String NameCA;
	private String[] cmbEventkalenderContents = { "Nation", "Nationer", "Person", "Personer", "Event", "Events" };
	private String[] cmbMetadataContents = { "Anställda", "Tabeller", "Tabellbegränsningar", "Nycklar", "Index",
			"Anställningsstatistik", "Anställningsrelationer", "Anställningskvalifikationer", "Anställningsfrånvaro",
			"Kolumner för anställningstabeller", "Anställningssetup" };
	private String[] CBData = { "Anställda", "Sjukaste personen", "Sjukaste personen år 2004-2005",
			"Anställningsstatistik", "Anställningsrelationer", "Anställningskvalifikationer", "Anställningsfrånvaro",
			"Anställningssetup" };

	private JComboBox J = new JComboBox(cmbEventkalenderContents);

	private JButton B = new JButton("Hämta");
	private JTextField txtEventkalenderId;
	private JTextField txtEmployeeId;
	private JTextField txtEmployeeFörnamn;
	private JTextField txtEmployeeEfternamn;
	private JTable tblDataWS;
	private JTable tblMetadataWS;
	private JTable tblEventkalender;
	private JTextField txtOutput;
	private JTable tblEmployeeWS;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
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
	public App() {
		controller = new Controller();

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 799, 519);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JTabbedPane tbpnParent = new JTabbedPane(JTabbedPane.TOP);
		tbpnParent.setBounds(0, 0, 783, 446);
		frame.getContentPane().add(tbpnParent);

		JPanel pnlEventkalender = new JPanel();
		tbpnParent.addTab("Eventkalender ws", null, pnlEventkalender, null);
		pnlEventkalender.setLayout(null);
		
		JTabbedPane tbpnEventkalender = new JTabbedPane(JTabbedPane.TOP);
		tbpnEventkalender.setBounds(0, 0, 778, 407);
		pnlEventkalender.add(tbpnEventkalender);
		
		JPanel pnlGetFile = new JPanel();
		tbpnEventkalender.addTab("Hämta fil", null, pnlGetFile, null);
				pnlGetFile.setLayout(null);
		
				final JComboBox cmbEventkalenderChoice = new JComboBox(cmbEventkalenderContents);
				cmbEventkalenderChoice.setBounds(209, 6, 68, 20);
				pnlGetFile.add(cmbEventkalenderChoice);
				
						JButton btnEventkalenderGetData = new JButton("Hämta");
						btnEventkalenderGetData.setBounds(282, 5, 63, 23);
						pnlGetFile.add(btnEventkalenderGetData);
						JLabel lblEventkalenderChoice = new JLabel("Var god välj:");
						lblEventkalenderChoice.setBounds(350, 8, 79, 17);
						pnlGetFile.add(lblEventkalenderChoice);
						lblEventkalenderChoice.setFont(new Font("Times New Roman", Font.BOLD, 14));
						
								txtEventkalenderId = new JTextField();
								txtEventkalenderId.setBounds(434, 6, 86, 20);
								pnlGetFile.add(txtEventkalenderId);
								txtEventkalenderId.setColumns(10);
								
										JLabel lblEventkalenderId = new JLabel("ID nr:");
										lblEventkalenderId.setBounds(525, 8, 39, 17);
										pnlGetFile.add(lblEventkalenderId);
										lblEventkalenderId.setFont(new Font("Times New Roman", Font.BOLD, 14));
										
												JScrollPane scpnEventkalender = new JScrollPane();
												scpnEventkalender.setBounds(160, 33, 452, 402);
												pnlGetFile.add(scpnEventkalender);
												
														tblEventkalender = new JTable();
														scpnEventkalender.setViewportView(tblEventkalender);
														
														JPanel pnlGetCollections = new JPanel();
														tbpnEventkalender.addTab("Hämta listor", null, pnlGetCollections, null);
														pnlGetCollections.setLayout(null);
														
														JComboBox comboBox = new JComboBox(new Object[]{});
														comboBox.setBounds(366, 11, 105, 20);
														pnlGetCollections.add(comboBox);
														
														JButton button = new JButton("Hämta");
														button.setBounds(326, 90, 110, 30);
														pnlGetCollections.add(button);
														
														textField = new JTextField();
														textField.setColumns(10);
														textField.setBounds(355, 52, 116, 20);
														pnlGetCollections.add(textField);
														
														JLabel label = new JLabel("ID nr:");
														label.setFont(new Font("Times New Roman", Font.BOLD, 14));
														label.setBounds(306, 53, 39, 17);
														pnlGetCollections.add(label);
														
														JLabel label_1 = new JLabel("Var god välj:");
														label_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
														label_1.setBounds(271, 12, 79, 17);
														pnlGetCollections.add(label_1);
														
														JScrollPane scrollPane = new JScrollPane();
														scrollPane.setBounds(0, 141, 773, 255);
														pnlGetCollections.add(scrollPane);
						btnEventkalenderGetData.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								txtOutput.setText("");

								String selection = (String) cmbEventkalenderChoice.getSelectedItem();
								int id = -1;
								if (Utility.isSubPart(cmbEventkalenderContents, selection)) {
									if (txtEventkalenderId.getText().equals("")) {
										txtOutput.setText("Var god fyll i ID-fältet!");
										return;
									}
									boolean isInt = Utility.isStringInt(txtEventkalenderId.getText());
									if (!isInt) {
										txtOutput.setText("Ange giltigt heltal");
										return;
									}
									id = Integer.parseInt(txtEventkalenderId.getText());
								}

								TableModel model = null;
								try {
									if (selection.equals("Nation")) {
										// Nation n = eventProxy.getNation(id);
										model = new NationTableModel(controller.getNation(id));
									} else if (selection.equals("Event")) {
										model = new EventTableModel(controller.getEvent(id));
									} else if (selection.equals("Person")) {
										model = new PersonTableModel(controller.getPerson(id));
									} else if (selection.equals("Nationer")) {
										model = new NationTableModel(controller.getNations());
									} else if (selection.equals("Events")) {
										model = new EventTableModel(controller.getEvents());
									} else if (selection.equals("Personer")) {
										model = new PersonTableModel(controller.getPersons());
									}
								} catch (Exception ex) {
									txtOutput.setText(ExceptionHandler.getErrorMessage(ex));
								}
								if (model != null) {
									tblEventkalender.setModel(model);
								}
							}
						});

		JPanel pnlCronus = new JPanel();
		tbpnParent.addTab("Cronus ws", null, pnlCronus, null);
		pnlCronus.setLayout(null);

		JTabbedPane tbpnCronus = new JTabbedPane(JTabbedPane.TOP);
		tbpnCronus.setBounds(0, 0, 778, 418);
		pnlCronus.add(tbpnCronus);

		JPanel pnlDataWS = new JPanel();
		tbpnCronus.addTab("Data", null, pnlDataWS, null);
		pnlDataWS.setLayout(null);

		final JComboBox cmbDataWS = new JComboBox(CBData);
		cmbDataWS.setBounds(284, 23, 215, 26);
		pnlDataWS.add(cmbDataWS);

		JScrollPane scpnDataWS = new JScrollPane();
		scpnDataWS.setBounds(0, 101, 773, 289);
		pnlDataWS.add(scpnDataWS);

		tblDataWS = new JTable();
		scpnDataWS.setViewportView(tblDataWS);

		JButton btnDataWS = new JButton("Hämta");
		btnDataWS.setBounds(331, 60, 110, 30);
		btnDataWS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOutput.setText("");

				String selection = (String) cmbDataWS.getSelectedItem();
				TableModel model = null;

				try {
					if (selection.equals("Anställda")) {
						model = new SerializableKeyValuePairTableModel(controller.getEmployeeData());
					} else if (selection.equals("Anställningsstatistik")) {
						model = new SerializableKeyValuePairTableModel(controller.getEmployeeStatisticsGroupData());
					} else if (selection.equals("Anställningsrelationer")) {
						model = new SerializableKeyValuePairTableModel(controller.getEmployeeRelativeData());
					} else if (selection.equals("Anställningskvalifikationer")) {
						model = new SerializableKeyValuePairTableModel(controller.getEmployeeQualificationData());
					} else if (selection.equals("Anställningsfrånvaro")) {
						model = new SerializableKeyValuePairTableModel(controller.getEmployeeAbsenceData());
					} else if (selection.equals("Anställningssetup")) {
						model = new SerializableKeyValuePairTableModel(controller.getEmployeePortalSetupData());
					} else if (selection.equals("Sjukaste personen år 2004-2005")) {
						model = new SerializableKeyValuePairTableModel(controller.getIllPersonsByYear(2004, 2005));
					} else if (selection.equals("Sjukaste personen")) {
						model = new SerializableKeyValuePairTableModel(controller.getIllestPerson());
					}
				} catch (Exception ex) {
					txtOutput.setText(ExceptionHandler.getErrorMessage(ex));
				}
				if (model != null) {
					tblDataWS.setModel(model);
				}
			}
		});
		pnlDataWS.add(btnDataWS);

		 JLabel lblDataWSChoose = new JLabel("Var god välj:");
		 lblDataWSChoose.setBounds(184, 25, 90, 20);
		 lblDataWSChoose.setFont(new Font("Times New Roman", Font.BOLD, 14));
		 pnlDataWS.add(lblDataWSChoose);

		JPanel pnlMetadataWS = new JPanel();
		tbpnCronus.addTab("Metadata", null, pnlMetadataWS, null);
		pnlMetadataWS.setLayout(null);

		final JComboBox cmbMetadataWS = new JComboBox(cmbMetadataContents);
		cmbMetadataWS.setBounds(284, 23, 215, 26);
		pnlMetadataWS.add(cmbMetadataWS);

		JScrollPane scpnMetadataWS = new JScrollPane();
		scpnMetadataWS.setBounds(0, 101, 773, 289);
		pnlMetadataWS.add(scpnMetadataWS);

		tblMetadataWS = new JTable();
		scpnMetadataWS.setViewportView(tblMetadataWS);

		JButton btnMetadataWS = new JButton("Hämta");
		btnMetadataWS.setBounds(331, 60, 110, 30);
		pnlMetadataWS.add(btnMetadataWS);
		
		JLabel lblMetadataWSChoose = new JLabel("Var god välj:");
		lblMetadataWSChoose.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblMetadataWSChoose.setBounds(184, 25, 90, 20);
		pnlMetadataWS.add(lblMetadataWSChoose);
		btnMetadataWS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOutput.setText("");

				String selection = (String) cmbMetadataWS.getSelectedItem();
				TableModel model = null;

				try {
					if (selection.equals("Anställda")) {
						model = new SerializableKeyValuePairTableModel(controller.getEmployeeMetadata());
					} else if (selection.equals("Anställningsstatistik")) {
						model = new SerializableKeyValuePairTableModel(controller.getEmployeeStatisticsGroupMetadata());
					} else if (selection.equals("Anställningsrelationer")) {
						model = new SerializableKeyValuePairTableModel(controller.getEmployeeRelativeMetadata());
					} else if (selection.equals("Anställningskvalifikationer")) {
						model = new SerializableKeyValuePairTableModel(controller.getEmployeeQualificationMetadata());
					} else if (selection.equals("Anställningsfrånvaro")) {
						model = new SerializableKeyValuePairTableModel(controller.getEmployeeAbsenceMetadata());
					} else if (selection.equals("Anställningssetup")) {
						model = new SerializableKeyValuePairTableModel(controller.getEmployeePortalSetupMetadata());
					} else if (selection.equals("Tabeller")) {
						model = new StringTableModel(controller.getTables());
					} else if (selection.equals("Tabellbegränsningar")) {
						model = new StringTableModel(controller.getTableConstraints());
					} else if (selection.equals("Kolumner för anställningstabeller")) {
						model = new StringTableModel(controller.getColumnsForEmployeeTable());
					} else if (selection.equals("Index")) {
						model = new StringTableModel(controller.getIndexes());
					} else if (selection.equals("Nycklar")) {
						model = new StringTableModel(controller.getKeys());
					}
				} catch (Exception ex) {
					txtOutput.setText(ExceptionHandler.getErrorMessage(ex));
				}
				if (model != null) {
					tblMetadataWS.setModel(model);
				}
			}
		});

		JPanel pnlEmployeeWS = new JPanel();
		tbpnCronus.addTab("Employee", null, pnlEmployeeWS, null);
		pnlEmployeeWS.setLayout(null);
		
		JScrollPane scpnEmployeeWS = new JScrollPane();
		scpnEmployeeWS.setBounds(283, 50, 490, 340);
		pnlEmployeeWS.add(scpnEmployeeWS);
		
		try {
			tblEmployeeWS = new JTable(new EmployeeTableModel(controller.getEmployees()));
		} catch (RemoteException e3) {
			txtOutput.setText(ExceptionHandler.getErrorMessage(e3));
		}
		
		tblEmployeeWS.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				int rs = tblEmployeeWS.getSelectedRow();
				if (rs > -1) {
					txtEmployeeId.setText(tblEmployeeWS.getValueAt(rs, 0).toString());
					txtEmployeeFörnamn.setText(tblEmployeeWS.getValueAt(rs, 2).toString());
					txtEmployeeEfternamn.setText(tblEmployeeWS.getValueAt(rs, 3).toString());
				}
			}
		});
		scpnEmployeeWS.setViewportView(tblEmployeeWS);
		
		JLabel lblId = new JLabel("ID nr:");
		lblId.setBounds(33, 62, 46, 14);
		lblId.setFont(new Font("Times New Roman", Font.BOLD, 14));
		pnlEmployeeWS.add(lblId);

		JLabel lblFrnamn = new JLabel("Förnamn:");
		lblFrnamn.setBounds(33, 91, 72, 14);
		lblFrnamn.setFont(new Font("Times New Roman", Font.BOLD, 14));
		pnlEmployeeWS.add(lblFrnamn);

		JLabel lblEfternamn = new JLabel("Efternamn:");
		lblEfternamn.setBounds(33, 122, 75, 14);
		lblEfternamn.setFont(new Font("Times New Roman", Font.BOLD, 14));
		pnlEmployeeWS.add(lblEfternamn);

		txtEmployeeId = new JTextField();
		txtEmployeeId.setBounds(115, 60, 97, 20);
		txtEmployeeId.setColumns(10);
		pnlEmployeeWS.add(txtEmployeeId);

		txtEmployeeFörnamn = new JTextField();
		txtEmployeeFörnamn.setBounds(115, 89, 97, 20);
		txtEmployeeFörnamn.setColumns(10);
		pnlEmployeeWS.add(txtEmployeeFörnamn);

		txtEmployeeEfternamn = new JTextField();
		txtEmployeeEfternamn.setBounds(115, 120, 97, 20);
		txtEmployeeEfternamn.setColumns(10);
		pnlEmployeeWS.add(txtEmployeeEfternamn);
		
		JButton btnAddEmployee = new JButton("Lägg till");
		btnAddEmployee.setBounds(115, 151, 97, 28);
		pnlEmployeeWS.add(btnAddEmployee);
		btnAddEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOutput.setText("");
				String no = txtEmployeeId.getText();
				String firstName = txtEmployeeFörnamn.getText();
				String lastName = txtEmployeeEfternamn.getText();
				try {
					if(controller.getEmployee(no) == null) {
						controller.addEmployee(no, firstName, lastName);
				} else {
					txtOutput.setText("Var god välj ett unikt ID nr");
				}
				} catch (RemoteException e1) {
					e1.printStackTrace();
				}
				TableModel m = null;
				try {
					m = new EmployeeTableModel(controller.getEmployees());
				} catch (RemoteException e1) {
					e1.printStackTrace();
				}
				if (m != null) {
					tblEmployeeWS.setModel(m);
				}
			}
				
		});
		
		JButton btnDeleteEmployee = new JButton("Radera");
		btnDeleteEmployee.setBounds(480, 11, 97, 28);
		pnlEmployeeWS.add(btnDeleteEmployee);
		btnDeleteEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOutput.setText("");
				
				int i = tblEmployeeWS.getSelectedRow();
				String no = (String) tblEmployeeWS.getValueAt(i, 0);
				try {
					controller.deleteEmployee(no);
				} catch (RemoteException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}	
				TableModel m = null;
				try {
					m = new EmployeeTableModel(controller.getEmployees());
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				tblEmployeeWS.setModel(m);
			}
		});
		
		JButton btnUpdateEmployee = new JButton("Uppdatera");
		btnUpdateEmployee.setBounds(115, 195, 97, 28);
		pnlEmployeeWS.add(btnUpdateEmployee);
		btnUpdateEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOutput.setText("");
				
				String no = txtEmployeeId.getText();
				String firstName = txtEmployeeFörnamn.getText();
				String lastName = txtEmployeeEfternamn.getText();
				try {
				controller.updateEmployee(no, firstName, lastName);
				} catch (RemoteException e1) {
				e1.printStackTrace();
				}
				TableModel m = null;
				try {
					m = new EmployeeTableModel(controller.getEmployees());
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if (m != null) {
					tblEmployeeWS.setModel(m);
				}
			}
				
		});
		JLabel lblNewLabel = new JLabel("Anställda");
		lblNewLabel.setBounds(68, 21, 97, 20);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		pnlEmployeeWS.add(lblNewLabel);

		txtOutput = new JTextField();
		txtOutput.setBounds(0, 447, 783, 33);
		frame.getContentPane().add(txtOutput);
		txtOutput.setColumns(10);
	}
}
