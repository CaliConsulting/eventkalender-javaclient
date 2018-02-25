package cali;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableModel;

import cali.controller.Controller;
import cali.model.EventTableModel;
import cali.model.NationTableModel;
import cali.model.PersonTableModel;
import cali.model.SerializableKeyValuePairTableModel;
import cali.model.StringTableModel;
import cali.utility.ExceptionHandler;
import cali.utility.Utility;

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
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable tblDataWS;
	private JTable tblMetadataWS;
	private JTable tblEventkalender;
	private JTextField txtOutput;

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

		final JComboBox cmbEventkalenderChoice = new JComboBox(cmbEventkalenderContents);
		cmbEventkalenderChoice.setBounds(310, 29, 215, 26);
		pnlEventkalender.add(cmbEventkalenderChoice);

		JButton btnEventkalenderGetData = new JButton("Hämta");
		btnEventkalenderGetData.setBounds(334, 110, 110, 30);
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
		pnlEventkalender.add(btnEventkalenderGetData);
		JLabel lblEventkalenderChoice = new JLabel("Var god välj:");
		lblEventkalenderChoice.setBounds(209, 34, 99, 16);
		lblEventkalenderChoice.setFont(new Font("Times New Roman", Font.BOLD, 14));
		pnlEventkalender.add(lblEventkalenderChoice);

		txtEventkalenderId = new JTextField();
		txtEventkalenderId.setBounds(310, 79, 86, 20);
		pnlEventkalender.add(txtEventkalenderId);
		txtEventkalenderId.setColumns(10);

		JLabel lblEventkalenderId = new JLabel("ID nr:");
		lblEventkalenderId.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblEventkalenderId.setBounds(209, 81, 57, 14);
		pnlEventkalender.add(lblEventkalenderId);

		JScrollPane scpnEventkalender = new JScrollPane();
		scpnEventkalender.setBounds(0, 151, 778, 267);
		pnlEventkalender.add(scpnEventkalender);

		tblEventkalender = new JTable();
		scpnEventkalender.setViewportView(tblEventkalender);

		JPanel pnlCronus = new JPanel();
		tbpnParent.addTab("Databas ws", null, pnlCronus, null);
		pnlCronus.setLayout(null);

		JTabbedPane tbpnWS = new JTabbedPane(JTabbedPane.TOP);
		tbpnWS.setBounds(0, 0, 778, 418);
		pnlCronus.add(tbpnWS);

		JPanel pnlDataWS = new JPanel();
		tbpnWS.addTab("Data", null, pnlDataWS, null);
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
		tbpnWS.addTab("Metadata", null, pnlMetadataWS, null);
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
		tbpnWS.addTab("Employee", null, pnlEmployeeWS, null);
		pnlEmployeeWS.setLayout(null);

		JLabel lblId = new JLabel("ID nr:");
		lblId.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblId.setBounds(33, 25, 46, 14);
		pnlEmployeeWS.add(lblId);

		JLabel lblFrnamn = new JLabel("Förnamn:");
		lblFrnamn.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblFrnamn.setBounds(33, 50, 72, 14);
		pnlEmployeeWS.add(lblFrnamn);

		JLabel lblEfternamn = new JLabel("Efternamn:");
		lblEfternamn.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblEfternamn.setBounds(33, 75, 75, 14);
		pnlEmployeeWS.add(lblEfternamn);

		TextArea txtOutPutoklar = new TextArea();
		txtOutPutoklar.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtOutPutoklar.setBounds(33, 192, 460, 152);
		pnlEmployeeWS.add(txtOutPutoklar);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(115, 23, 97, 20);
		pnlEmployeeWS.add(textField);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(115, 48, 97, 20);
		pnlEmployeeWS.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(115, 73, 97, 20);
		pnlEmployeeWS.add(textField_2);

		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(115, 105, 97, 28);
		pnlEmployeeWS.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Uppdatera");
		btnNewButton_3.setBounds(33, 158, 97, 28);
		pnlEmployeeWS.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(396, 158, 97, 28);
		pnlEmployeeWS.add(btnNewButton_4);

		txtOutput = new JTextField();
		txtOutput.setBounds(0, 447, 783, 33);
		frame.getContentPane().add(txtOutput);
		txtOutput.setColumns(10);
	}
}
