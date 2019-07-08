package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Kontroler;
import model.NaCekanju;
import model.Narudzbenica;
import model.Stanje;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.CheckboxGroup;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NarudzbenicaDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private ButtonGroup bg;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private SimBankeDialog sbd;
	
	private Narudzbenica narudzbenica;
	
	private Kontroler kontroler;
	

	/**
	 * Create the dialog.
	 */
	public NarudzbenicaDialog() {
		
		narudzbenica = new Narudzbenica();
		narudzbenica.prikaziStanje();
		kontroler = new Kontroler();
		sbd = new SimBankeDialog();
		
		setTitle("Formiranje narudzbenice");
		setBounds(100, 100, 450, 228);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		
		bg = new ButtonGroup();
		
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblNewLabel = new JLabel("Ime");
			GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
			gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
			gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel.gridx = 1;
			gbc_lblNewLabel.gridy = 1;
			contentPanel.add(lblNewLabel, gbc_lblNewLabel);
		}
		{
			textField = new JTextField();
			GridBagConstraints gbc_textField = new GridBagConstraints();
			gbc_textField.insets = new Insets(0, 0, 5, 0);
			gbc_textField.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField.gridx = 3;
			gbc_textField.gridy = 1;
			contentPanel.add(textField, gbc_textField);
			textField.setColumns(10);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Prezime");
			GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
			gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
			gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_1.gridx = 1;
			gbc_lblNewLabel_1.gridy = 3;
			contentPanel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		}
		{
			textField_1 = new JTextField();
			GridBagConstraints gbc_textField_1 = new GridBagConstraints();
			gbc_textField_1.insets = new Insets(0, 0, 5, 0);
			gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_1.gridx = 3;
			gbc_textField_1.gridy = 3;
			contentPanel.add(textField_1, gbc_textField_1);
			textField_1.setColumns(10);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Adresa dostave");
			GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
			gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_2.anchor = GridBagConstraints.ABOVE_BASELINE_LEADING;
			gbc_lblNewLabel_2.gridx = 1;
			gbc_lblNewLabel_2.gridy = 5;
			contentPanel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		}
		{
			textField_2 = new JTextField();
			GridBagConstraints gbc_textField_2 = new GridBagConstraints();
			gbc_textField_2.insets = new Insets(0, 0, 5, 0);
			gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_2.gridx = 3;
			gbc_textField_2.gridy = 5;
			contentPanel.add(textField_2, gbc_textField_2);
			textField_2.setColumns(10);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("Na\u010Din pla\u0107anja");
			GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
			gbc_lblNewLabel_3.anchor = GridBagConstraints.NORTHWEST;
			gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_3.gridx = 1;
			gbc_lblNewLabel_3.gridy = 8;
			contentPanel.add(lblNewLabel_3, gbc_lblNewLabel_3);
		}
		
		{
			JPanel panel = new JPanel();
			GridBagConstraints gbc_panel = new GridBagConstraints();
			gbc_panel.insets = new Insets(0, 0, 5, 0);
			gbc_panel.fill = GridBagConstraints.BOTH;
			gbc_panel.gridx = 3;
			gbc_panel.gridy = 8;
			contentPanel.add(panel, gbc_panel);
			panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
			{
				rdbtnNewRadioButton = new JRadioButton("Kreditna kartica");
				rdbtnNewRadioButton.setSelected(true);
				panel.add(rdbtnNewRadioButton);
			}
			{
				rdbtnNewRadioButton_1 = new JRadioButton("PayPal");
				panel.add(rdbtnNewRadioButton_1);
			}
		}
		
		bg.add(rdbtnNewRadioButton);
		bg.add(rdbtnNewRadioButton_1);
		{
			JLabel lblUkupno = new JLabel("Ukupno");
			GridBagConstraints gbc_lblUkupno = new GridBagConstraints();
			gbc_lblUkupno.anchor = GridBagConstraints.WEST;
			gbc_lblUkupno.insets = new Insets(0, 0, 5, 5);
			gbc_lblUkupno.gridx = 1;
			gbc_lblUkupno.gridy = 10;
			contentPanel.add(lblUkupno, gbc_lblUkupno);
		}
		{
			JLabel lblNewLabel_4 = new JLabel("1899\u20AC");
			GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
			gbc_lblNewLabel_4.anchor = GridBagConstraints.WEST;
			gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 0);
			gbc_lblNewLabel_4.gridx = 3;
			gbc_lblNewLabel_4.gridy = 10;
			contentPanel.add(lblNewLabel_4, gbc_lblNewLabel_4);
		}
		
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Otkazi");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Naru\u010Di");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						sbd.setVisible(true);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		
		sbd.btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				kontroler.placenjaNarudzbenice(narudzbenica);
				System.out.println("Naruzbenica je u stanju: " + narudzbenica.stanje.toString());
				
			}
		});
		
		sbd.btnNewButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				kontroler.odbijenoPlacanje(narudzbenica);
				System.out.println("Naruzbenica je u stanju: " +narudzbenica.stanje.toString());
				
			}
		});
	}

}