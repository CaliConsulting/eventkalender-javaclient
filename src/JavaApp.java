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
import javax.swing.JOptionPane;
import javax.swing.JComboBox;


public class JavaApp {

	private JFrame frame;
	private String NameC;
	private String NameCA;
	private String[] Singular = {"Nation", "Event", "Student"};
	private String[] Plural = {"Nationer", "Events", "Studenter"};
	private String[] CBMetadata = {"Nationer", "Events", "Studenter"};
	private String[] CBData = {"Nationer", "Events", "Studenter"};
	private JComboBox J = new JComboBox (Singular);
	private JComboBox JI = new JComboBox (Plural);
	private JButton B = new JButton("Hämta");

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
		
		JButton B = new JButton("Hämta");
		B.setBounds(79, 92, 117, 29);
		B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    JButton source = (JButton) e.getSource();
				String buttonText = source.getText();
				JOptionPane.showMessageDialog(null, "Du kommer nu att " + buttonText);
			}
		});
		panel_1.setLayout(null);
		panel_1.add(B);
		
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(29, 222, 461, 128);
		panel_1.add(textArea_1);
		
		JComboBox comboBox = new JComboBox(Singular);
		comboBox.setBounds(65, 17, 160, 51);
		panel_1.add(comboBox);
		comboBox.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent event) {
		        JComboBox<String> combo = (JComboBox<String>) event.getSource();
		        String selectedBook = (String) combo.getSelectedItem();
		 
		        if (selectedBook.equals("Nation")) {
		            System.out.println("wtf man");
		        } else if (selectedBook.equals("Event")) {
		            System.out.println("Hamps you shall obey!");
		        }
		    }
		});
		
		
		JButton button = new JButton("Hämta");
		button.setBounds(345, 92, 117, 29);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(button);
		
		JComboBox comboBox_1 = new JComboBox(Plural);
		comboBox_1.setBounds(335, 17, 169, 51);
		panel_1.add(comboBox_1);
		comboBox_1.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent event) {
		        JComboBox<String> combo = (JComboBox<String>) event.getSource();
		        String selectedBook = (String) combo.getSelectedItem();
		 
		        if (selectedBook.equals("Nationer")) {
		            System.out.println("Nice one Hamps");
		        } else if (selectedBook.equals("Events")) {
		            System.out.println("Too bad");
		        }
		    }
		});
		JLabel lblVljEn = new JLabel("Välj en");
		lblVljEn.setBounds(12, 33, 61, 16);
		lblVljEn.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		panel_1.add(lblVljEn);
		
		JLabel lblVljFlera = new JLabel("Välj flera");
		lblVljFlera.setBounds(272, 33, 61, 16);
		lblVljFlera.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		panel_1.add(lblVljFlera);
		
		
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Databas ws", null, panel, null);
		panel.setLayout(null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(0, 0, 529, 382);
		panel.add(tabbedPane_1);
		
		JPanel panel_3 = new JPanel();
		tabbedPane_1.addTab("Data", null, panel_3, null);
		panel_3.setLayout(null);
		
		JComboBox Data_Combobox = new JComboBox(CBData);
		Data_Combobox.setBounds(163, 19, 164, 27);
		panel_3.add(Data_Combobox);
		
		JPanel PanelMetadata = new JPanel();
		tabbedPane_1.addTab("Metadata", null, PanelMetadata, null);
		PanelMetadata.setLayout(null);
		
		JComboBox Metadata_ComboBox = new JComboBox(CBMetadata);
		Metadata_ComboBox.setBounds(177, 17, 164, 27);
		PanelMetadata.add(Metadata_ComboBox);
		
		
	
	}
}
