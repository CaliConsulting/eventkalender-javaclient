package cali;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

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
import javax.swing.JTextPane;

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
	private JTextField txtEmployeeFirstname;
	private JTextField txtEmployeeLastname;
	private JTable tblDataWS;
	private JTable tblMetadataWS;
	private JTable tblEventkalender;
	private JTextField txtOutput;
	private JTable tblEmployeeWS;
	private JTabbedPane tbpnParent;
	private JPanel pnlEventkalender;
	private JTabbedPane tbpnEventkalender;
	private JPanel pnlGetFile;
	private JPanel pnlGetCollections;
	private JComboBox cmbEventkalenderChoice;
	private JButton btnEventkalenderGetData;
	private JLabel lblEventkalenderChoice;
	private JLabel lblEventkalenderId;
	private JScrollPane scpnEventkalender;
	private JPanel pnlCronus;
	private JTabbedPane tbpnCronus;
	private JPanel pnlDataWS;
	private JComboBox cmbDataWS;
	private JScrollPane scpnDataWS;
	private JButton btnDataWS;
	private JLabel lblDataWSChoose;
	private JPanel pnlMetadataWS;
	private JComboBox cmbMetadataWS;
	private JScrollPane scpnMetadataWS;
	private JButton btnMetadataWS;
	private JLabel lblMetadataWSChoose;
	private JPanel pnlEmployeeWS;
	private JScrollPane scpnEmployeeWS;
	private JLabel lblId;
	private JLabel lblFrnamn;
	private JLabel lblEfternamn;
	private JButton btnAddEmployee;
	private JButton btnDeleteEmployee;
	private JButton btnUpdateEmployee;
	private JLabel lblEmployees;
	private JTextField txtFilePath;

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

		tbpnParent = new JTabbedPane(JTabbedPane.TOP);
		tbpnParent.setBounds(0, 0, 783, 446);
		frame.getContentPane().add(tbpnParent);

		pnlEventkalender = new JPanel();
		tbpnParent.addTab("Eventkalender ws", null, pnlEventkalender, null);
		pnlEventkalender.setLayout(null);

		tbpnEventkalender = new JTabbedPane(JTabbedPane.TOP);
		tbpnEventkalender.setBounds(0, 0, 778, 418);
		pnlEventkalender.add(tbpnEventkalender);

		pnlGetFile = new JPanel();
		tbpnEventkalender.addTab("Hämta fil", null, pnlGetFile, null);
		pnlGetFile.setLayout(null);
		
		JTextPane txtFileContent = new JTextPane();
		txtFileContent.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtFileContent.setBounds(0, 109, 773, 281);
		pnlGetFile.add(txtFileContent);
		
		JButton btnGetFile = new JButton("Hämta");
		btnGetFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtOutput.setText("");
				String path = txtFilePath.getText();
				if ("".equals(path)) {
					txtOutput.setText("Var god ange en filsökväg");
					return;
				}
				try {
					String[] files = controller.getFiles();
					List<String> filesAsList = Arrays.asList(files);
					if (!filesAsList.contains(path)) {
						txtOutput.setText("Fil med sökväg " + path + " existerar inte");
						return;
					}
					txtFileContent.setText(controller.getFile(path));
				} catch (RemoteException ex) {
					txtOutput.setText(ExceptionHandler.getErrorMessage(ex));
				}
			}
		});
		btnGetFile.setBounds(326, 64, 110, 30);
		pnlGetFile.add(btnGetFile);
		
		JLabel lblChooseFile = new JLabel("Filnamn: ");
		lblChooseFile.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblChooseFile.setBounds(246, 23, 79, 17);
		pnlGetFile.add(lblChooseFile);
		
		txtFilePath = new JTextField();
		txtFilePath.setBounds(326, 22, 162, 20);
		pnlGetFile.add(txtFilePath);
		txtFilePath.setColumns(10);

		pnlGetCollections = new JPanel();
		tbpnEventkalender.addTab("Hämta listor", null, pnlGetCollections, null);
		pnlGetCollections.setLayout(null);

		cmbEventkalenderChoice = new JComboBox(cmbEventkalenderContents);
		cmbEventkalenderChoice.setBounds(305, 9, 213, 28);
		pnlGetCollections.add(cmbEventkalenderChoice);

		btnEventkalenderGetData = new JButton("Hämta");
		btnEventkalenderGetData.setBounds(329, 92, 110, 30);
		pnlGetCollections.add(btnEventkalenderGetData);
		lblEventkalenderChoice = new JLabel("Var god välj:");
		lblEventkalenderChoice.setBounds(216, 14, 79, 17);
		pnlGetCollections.add(lblEventkalenderChoice);
		lblEventkalenderChoice.setFont(new Font("Times New Roman", Font.BOLD, 14));

		txtEventkalenderId = new JTextField();
		txtEventkalenderId.setBounds(305, 59, 86, 20);
		pnlGetCollections.add(txtEventkalenderId);
		txtEventkalenderId.setColumns(10);

		lblEventkalenderId = new JLabel("ID nr:");
		lblEventkalenderId.setBounds(256, 60, 39, 17);
		pnlGetCollections.add(lblEventkalenderId);
		lblEventkalenderId.setFont(new Font("Times New Roman", Font.BOLD, 14));

		scpnEventkalender = new JScrollPane();
		scpnEventkalender.setBounds(0, 133, 773, 257);
		pnlGetCollections.add(scpnEventkalender);

		tblEventkalender = new JTable();
		scpnEventkalender.setViewportView(tblEventkalender);
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

				try {
					TableModel model = null;
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
					tblEventkalender.setModel(model);
				} catch (Exception ex) {
					txtOutput.setText(ExceptionHandler.getErrorMessage(ex));
				}
			}
		});

		pnlCronus = new JPanel();
		tbpnParent.addTab("Cronus ws", null, pnlCronus, null);
		pnlCronus.setLayout(null);

		tbpnCronus = new JTabbedPane(JTabbedPane.TOP);
		tbpnCronus.setBounds(0, 0, 778, 418);
		pnlCronus.add(tbpnCronus);

		pnlDataWS = new JPanel();
		tbpnCronus.addTab("Data", null, pnlDataWS, null);
		pnlDataWS.setLayout(null);

		cmbDataWS = new JComboBox(CBData);
		cmbDataWS.setBounds(284, 23, 215, 26);
		pnlDataWS.add(cmbDataWS);

		scpnDataWS = new JScrollPane();
		scpnDataWS.setBounds(0, 101, 773, 289);
		pnlDataWS.add(scpnDataWS);

		tblDataWS = new JTable();
		scpnDataWS.setViewportView(tblDataWS);

		btnDataWS = new JButton("Hämta");
		btnDataWS.setBounds(331, 60, 110, 30);
		btnDataWS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOutput.setText("");
				String selection = (String) cmbDataWS.getSelectedItem();
				
				try {
					TableModel model = null;
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
					tblDataWS.setModel(model);
				} catch (Exception ex) {
					txtOutput.setText(ExceptionHandler.getErrorMessage(ex));
				}
			}
		});
		pnlDataWS.add(btnDataWS);

		lblDataWSChoose = new JLabel("Var god välj:");
		lblDataWSChoose.setBounds(184, 25, 90, 20);
		lblDataWSChoose.setFont(new Font("Times New Roman", Font.BOLD, 14));
		pnlDataWS.add(lblDataWSChoose);

		pnlMetadataWS = new JPanel();
		tbpnCronus.addTab("Metadata", null, pnlMetadataWS, null);
		pnlMetadataWS.setLayout(null);

		cmbMetadataWS = new JComboBox(cmbMetadataContents);
		cmbMetadataWS.setBounds(284, 23, 215, 26);
		pnlMetadataWS.add(cmbMetadataWS);

		scpnMetadataWS = new JScrollPane();
		scpnMetadataWS.setBounds(0, 101, 773, 289);
		pnlMetadataWS.add(scpnMetadataWS);

		tblMetadataWS = new JTable();
		scpnMetadataWS.setViewportView(tblMetadataWS);

		btnMetadataWS = new JButton("Hämta");
		btnMetadataWS.setBounds(331, 60, 110, 30);
		pnlMetadataWS.add(btnMetadataWS);

		lblMetadataWSChoose = new JLabel("Var god välj:");
		lblMetadataWSChoose.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblMetadataWSChoose.setBounds(184, 25, 90, 20);
		pnlMetadataWS.add(lblMetadataWSChoose);
		btnMetadataWS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOutput.setText("");
				String selection = (String) cmbMetadataWS.getSelectedItem();
				try {
					TableModel model = null;
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
					tblMetadataWS.setModel(model);
				} catch (Exception ex) {
					txtOutput.setText(ExceptionHandler.getErrorMessage(ex));
				}
			}
		});

		pnlEmployeeWS = new JPanel();
		tbpnCronus.addTab("Employee", null, pnlEmployeeWS, null);
		pnlEmployeeWS.setLayout(null);

		scpnEmployeeWS = new JScrollPane();
		scpnEmployeeWS.setBounds(283, 50, 490, 340);
		pnlEmployeeWS.add(scpnEmployeeWS);

		try {
			tblEmployeeWS = new JTable(new EmployeeTableModel(controller.getEmployees()));
		} catch (RemoteException ex) {
			txtOutput.setText(ExceptionHandler.getErrorMessage(ex));
		}
		tblEmployeeWS.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				int rs = tblEmployeeWS.getSelectedRow();
				if (rs > -1) {
					txtEmployeeId.setText(tblEmployeeWS.getValueAt(rs, 0).toString());
					txtEmployeeFirstname.setText(tblEmployeeWS.getValueAt(rs, 2).toString());
					txtEmployeeLastname.setText(tblEmployeeWS.getValueAt(rs, 3).toString());
				}
			}
		});
		scpnEmployeeWS.setViewportView(tblEmployeeWS);

		lblId = new JLabel("ID nr:");
		lblId.setBounds(33, 62, 46, 14);
		lblId.setFont(new Font("Times New Roman", Font.BOLD, 14));
		pnlEmployeeWS.add(lblId);

		lblFrnamn = new JLabel("Förnamn:");
		lblFrnamn.setBounds(33, 91, 72, 14);
		lblFrnamn.setFont(new Font("Times New Roman", Font.BOLD, 14));
		pnlEmployeeWS.add(lblFrnamn);

		lblEfternamn = new JLabel("Efternamn:");
		lblEfternamn.setBounds(33, 122, 75, 14);
		lblEfternamn.setFont(new Font("Times New Roman", Font.BOLD, 14));
		pnlEmployeeWS.add(lblEfternamn);

		txtEmployeeId = new JTextField();
		txtEmployeeId.setBounds(115, 60, 97, 20);
		txtEmployeeId.setColumns(10);
		pnlEmployeeWS.add(txtEmployeeId);

		txtEmployeeFirstname = new JTextField();
		txtEmployeeFirstname.setBounds(115, 89, 97, 20);
		txtEmployeeFirstname.setColumns(10);
		pnlEmployeeWS.add(txtEmployeeFirstname);

		txtEmployeeLastname = new JTextField();
		txtEmployeeLastname.setBounds(115, 120, 97, 20);
		txtEmployeeLastname.setColumns(10);
		pnlEmployeeWS.add(txtEmployeeLastname);

		btnAddEmployee = new JButton("Lägg till");
		btnAddEmployee.setBounds(115, 151, 97, 28);
		pnlEmployeeWS.add(btnAddEmployee);
		btnAddEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOutput.setText("");
				String no = txtEmployeeId.getText();
				String firstName = txtEmployeeFirstname.getText();
				String lastName = txtEmployeeLastname.getText();
				try {
					if (controller.getEmployee(no) == null) {
						controller.addEmployee(no, firstName, lastName);
					} else {
						txtOutput.setText("Var god välj ett unikt ID nr");
					}
					TableModel model = new EmployeeTableModel(controller.getEmployees());
					tblEmployeeWS.setModel(model);
				} catch (RemoteException ex) {
					txtOutput.setText(ExceptionHandler.getErrorMessage(ex));
				}
			}
		});

		btnDeleteEmployee = new JButton("Radera");
		btnDeleteEmployee.setBounds(480, 11, 97, 28);
		pnlEmployeeWS.add(btnDeleteEmployee);
		btnDeleteEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOutput.setText("");
				int rowIndex = tblEmployeeWS.getSelectedRow();
				if (rowIndex < 0) {
					txtOutput.setText("Var god välj en anställd i listan att radera");
					return;
				}
				String no = (String) tblEmployeeWS.getValueAt(rowIndex, 0);
				try {
					controller.deleteEmployee(no);
					TableModel model = new EmployeeTableModel(controller.getEmployees());
					tblEmployeeWS.setModel(model);
				} catch (RemoteException ex) {
					txtOutput.setText(ExceptionHandler.getErrorMessage(ex));
				}
			}
		});

		btnUpdateEmployee = new JButton("Uppdatera");
		btnUpdateEmployee.setBounds(115, 195, 97, 28);
		pnlEmployeeWS.add(btnUpdateEmployee);
		btnUpdateEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOutput.setText("");
				String no = txtEmployeeId.getText();
				String firstName = txtEmployeeFirstname.getText();
				String lastName = txtEmployeeLastname.getText();
				try {
					controller.updateEmployee(no, firstName, lastName);
					TableModel model = new EmployeeTableModel(controller.getEmployees());
					tblEmployeeWS.setModel(model);
				} catch (RemoteException ex) {
					txtOutput.setText(ExceptionHandler.getErrorMessage(ex));
				}
			}
		});
		lblEmployees = new JLabel("Anställda");
		lblEmployees.setBounds(68, 21, 97, 20);
		lblEmployees.setFont(new Font("Times New Roman", Font.BOLD, 16));
		pnlEmployeeWS.add(lblEmployees);

		txtOutput = new JTextField();
		txtOutput.setBounds(0, 447, 783, 33);
		frame.getContentPane().add(txtOutput);
		txtOutput.setColumns(10);
	}
}
