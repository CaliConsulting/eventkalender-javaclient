package cali;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
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
import javax.swing.JTextPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
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
import eventkalender.cali.Event;
import eventkalender.cali.Nation;
import eventkalender.cali.Person;

public class App {

	private Controller controller;

	private String[] cmbEventkalenderContents;
	private String[] cmbMetadataContents;
	private String[] cmbDataContents;

	private JFrame frame;

	private JPanel pnlCronus;
	private JPanel pnlDataWS;
	private JPanel pnlEmployeeWS;
	private JPanel pnlEventkalender;
	private JPanel pnlGetCollections;
	private JPanel pnlGetFile;
	private JPanel pnlMetadataWS;

	private JTabbedPane tbpnCronus;
	private JTabbedPane tbpnEventkalender;
	private JTabbedPane tbpnParent;

	private JLabel lblChooseFile;
	private JLabel lblDataWSChoose;
	private JLabel lblEventkalenderChoice;
	private JLabel lblEventkalenderId;
	private JLabel lblEmployees;
	private JLabel lblEmployeeId;
	private JLabel lblEmployeeFirstname;
	private JLabel lblEmployeeLastname;
	private JLabel lblMetadataWSChoose;

	private JComboBox cmbDataWS;
	private JComboBox cmbEventkalenderChoice;
	private JComboBox cbxFiles;
	private JComboBox cmbMetadataWS;

	private JButton btnAddEmployee;
	private JButton btnDeleteEmployee;
	private JButton btnEventkalenderGetData;
	private JButton btnGetDataWS;
	private JButton btnGetMetadataWS;
	private JButton btnUpdateEmployee;

	private JTextField txtEmployeeId;
	private JTextField txtEmployeeFirstname;
	private JTextField txtEmployeeLastname;
	private JTextField txtEventkalenderId;
	private JTextField txtOutput;

	private JTextPane txtFileContent;

	private JScrollPane scpnDataWS;
	private JScrollPane scpnEventkalender;
	private JScrollPane scpnEmployeeWS;
	private JScrollPane scpnMetadataWS;

	private JTable tblDataWS;
	private JTable tblEmployeeWS;
	private JTable tblEventkalender;
	private JTable tblMetadataWS;

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

		cmbEventkalenderContents = new String[] { "Nation", "Nationer", "Person", "Personer", "Event", "Events" };
		cmbMetadataContents = new String[] { "Anställda", "Tabeller", "Tabellbegränsningar", "Nycklar", "Index",
				"Anställningsstatistik", "Anställningsrelationer", "Anställningskvalifikationer",
				"Anställningsfrånvaro", "Kolumner för anställningstabeller", "Anställningssetup" };
		cmbDataContents = new String[] { "Anställda", "Sjukaste personen", "Sjukaste personen år 2004-2005",
				"Anställningsstatistik", "Anställningsrelationer", "Anställningskvalifikationer",
				"Anställningsfrånvaro", "Anställningssetup" };

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

		txtFileContent = new JTextPane();
		txtFileContent.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtFileContent.setBounds(0, 74, 773, 316);
		pnlGetFile.add(txtFileContent);

		lblChooseFile = new JLabel("Filnamn: ");
		lblChooseFile.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblChooseFile.setBounds(246, 23, 79, 17);
		pnlGetFile.add(lblChooseFile);

		try {
			cbxFiles = new JComboBox(controller.getFiles());
			cbxFiles.setSelectedIndex(-1);
		} catch (RemoteException ex) {
			txtOutput.setText(ExceptionHandler.getErrorMessage(ex));
		}
		cbxFiles.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				try {
					String path = cbxFiles.getSelectedItem().toString();
					txtFileContent.setText(controller.getFile(path));
				} catch (RemoteException ex) {
					txtOutput.setText(ExceptionHandler.getErrorMessage(ex));
				}
			}
		});
		cbxFiles.setBounds(324, 23, 187, 22);
		pnlGetFile.add(cbxFiles);

		pnlGetCollections = new JPanel();
		tbpnEventkalender.addTab("Hämta listor", null, pnlGetCollections, null);
		pnlGetCollections.setLayout(null);

		cmbEventkalenderChoice = new JComboBox(cmbEventkalenderContents);
		cmbEventkalenderChoice.setBounds(305, 9, 213, 28);
		pnlGetCollections.add(cmbEventkalenderChoice);

		btnEventkalenderGetData = new JButton("Hämta");
		btnEventkalenderGetData.setBounds(329, 92, 110, 30);
		btnEventkalenderGetData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
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
						Nation n = controller.getNation(id);
						if (n == null) {
							txtOutput.setText("Nation med ID" + id + " finns inte");
							return;
						}
						model = new NationTableModel(n);
					} else if (selection.equals("Event")) {
						Event e = controller.getEvent(id);
						if (e == null) {
							txtOutput.setText("Event med ID" + id + " finns inte");
							return;
						}
						model = new EventTableModel(e);
					} else if (selection.equals("Person")) {
						Person p = controller.getPerson(id);
						if (p == null) {
							txtOutput.setText("Person med ID" + id + " finns inte");
							return;
						}
						model = new PersonTableModel(p);
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
		pnlGetCollections.add(btnEventkalenderGetData);

		lblEventkalenderChoice = new JLabel("Var god välj:");
		lblEventkalenderChoice.setBounds(216, 14, 79, 17);
		lblEventkalenderChoice.setFont(new Font("Times New Roman", Font.BOLD, 14));
		pnlGetCollections.add(lblEventkalenderChoice);

		txtEventkalenderId = new JTextField();
		txtEventkalenderId.setBounds(305, 59, 86, 20);
		pnlGetCollections.add(txtEventkalenderId);
		txtEventkalenderId.setColumns(10);

		lblEventkalenderId = new JLabel("ID nr:");
		lblEventkalenderId.setBounds(256, 60, 39, 17);
		lblEventkalenderId.setFont(new Font("Times New Roman", Font.BOLD, 14));
		pnlGetCollections.add(lblEventkalenderId);

		scpnEventkalender = new JScrollPane();
		scpnEventkalender.setBounds(0, 133, 773, 257);
		pnlGetCollections.add(scpnEventkalender);

		tblEventkalender = new JTable();
		scpnEventkalender.setViewportView(tblEventkalender);

		pnlCronus = new JPanel();
		tbpnParent.addTab("Cronus ws", null, pnlCronus, null);
		pnlCronus.setLayout(null);

		tbpnCronus = new JTabbedPane(JTabbedPane.TOP);
		tbpnCronus.setBounds(0, 0, 778, 418);
		pnlCronus.add(tbpnCronus);

		pnlDataWS = new JPanel();
		tbpnCronus.addTab("Data", null, pnlDataWS, null);
		pnlDataWS.setLayout(null);

		cmbDataWS = new JComboBox(cmbDataContents);
		cmbDataWS.setBounds(284, 23, 215, 26);
		pnlDataWS.add(cmbDataWS);

		scpnDataWS = new JScrollPane();
		scpnDataWS.setBounds(0, 101, 773, 289);
		pnlDataWS.add(scpnDataWS);

		tblDataWS = new JTable();
		scpnDataWS.setViewportView(tblDataWS);

		btnGetDataWS = new JButton("Hämta");
		btnGetDataWS.setBounds(331, 60, 110, 30);
		btnGetDataWS.addActionListener(new ActionListener() {
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
		pnlDataWS.add(btnGetDataWS);

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

		btnGetMetadataWS = new JButton("Hämta");
		btnGetMetadataWS.setBounds(331, 60, 110, 30);
		pnlMetadataWS.add(btnGetMetadataWS);

		lblMetadataWSChoose = new JLabel("Var god välj:");
		lblMetadataWSChoose.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblMetadataWSChoose.setBounds(184, 25, 90, 20);
		btnGetMetadataWS.addActionListener(new ActionListener() {
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
		pnlMetadataWS.add(lblMetadataWSChoose);

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

		lblEmployeeId = new JLabel("ID nr:");
		lblEmployeeId.setBounds(33, 62, 46, 14);
		lblEmployeeId.setFont(new Font("Times New Roman", Font.BOLD, 14));
		pnlEmployeeWS.add(lblEmployeeId);

		lblEmployeeFirstname = new JLabel("Förnamn:");
		lblEmployeeFirstname.setBounds(33, 91, 72, 14);
		lblEmployeeFirstname.setFont(new Font("Times New Roman", Font.BOLD, 14));
		pnlEmployeeWS.add(lblEmployeeFirstname);

		lblEmployeeLastname = new JLabel("Efternamn:");
		lblEmployeeLastname.setBounds(33, 122, 75, 14);
		lblEmployeeLastname.setFont(new Font("Times New Roman", Font.BOLD, 14));
		pnlEmployeeWS.add(lblEmployeeLastname);

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
		btnAddEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOutput.setText("");
				String no = txtEmployeeId.getText();
				String firstName = txtEmployeeFirstname.getText();
				String lastName = txtEmployeeLastname.getText();
				if (Utility.isEmpty(no, firstName, lastName)) {
					txtOutput.setText("Var god ange ID, förnamn och efternamn");
					return;
				}
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
		pnlEmployeeWS.add(btnAddEmployee);

		btnDeleteEmployee = new JButton("Radera");
		btnDeleteEmployee.setBounds(480, 11, 97, 28);
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
		pnlEmployeeWS.add(btnDeleteEmployee);

		btnUpdateEmployee = new JButton("Uppdatera");
		btnUpdateEmployee.setBounds(115, 195, 97, 28);
		btnUpdateEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOutput.setText("");
				String no = txtEmployeeId.getText();
				String firstName = txtEmployeeFirstname.getText();
				String lastName = txtEmployeeLastname.getText();
				if (Utility.isEmpty(no, firstName, lastName)) {
					txtOutput.setText("Var god ange ID, förnamn och efternamn");
					return;
				}
				try {
					controller.updateEmployee(no, firstName, lastName);
					TableModel model = new EmployeeTableModel(controller.getEmployees());
					tblEmployeeWS.setModel(model);
				} catch (RemoteException ex) {
					txtOutput.setText(ExceptionHandler.getErrorMessage(ex));
				}
			}
		});
		pnlEmployeeWS.add(btnUpdateEmployee);

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
