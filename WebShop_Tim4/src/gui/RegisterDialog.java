package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.TitledBorder;
import javax.swing.JOptionPane;

import model.Aplikacija;
import model.KorisnickiNalog;
import model.RegistrovaniKupac;
import model.TipKorisnika;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JToggleButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

public class RegisterDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField ImeTextField;
	private JTextField PrezimeTextField;
	private JTextField GradTextField;
	private JTextField PbrojTextField;
	private JTextField AdresaTextField;
	private JTextField KorisnickoTextField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField mailTextField;
	private ButtonGroup bg;
	
	private JRadioButton rdbtnMuki;
	private JRadioButton rdbtnenski;
	private JButton cancelButton;
	private JButton okButton;
	
	/**
	 * Create the dialog.
	 */
	public RegisterDialog() {
		setTitle("Registracija");
		setBounds(100, 100, 626, 312);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		
		bg = new ButtonGroup();
		
		contentPanel.setLayout(gbl_contentPanel);
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Licni podaci", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			GridBagConstraints gbc_panel = new GridBagConstraints();
			gbc_panel.fill = GridBagConstraints.BOTH;
			gbc_panel.insets = new Insets(0, 0, 5, 5);
			gbc_panel.gridx = 1;
			gbc_panel.gridy = 1;
			contentPanel.add(panel, gbc_panel);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0};
			gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			{
				JLabel lblIme = new JLabel("Ime");
				GridBagConstraints gbc_lblIme = new GridBagConstraints();
				gbc_lblIme.anchor = GridBagConstraints.WEST;
				gbc_lblIme.insets = new Insets(0, 0, 5, 5);
				gbc_lblIme.gridx = 1;
				gbc_lblIme.gridy = 1;
				panel.add(lblIme, gbc_lblIme);
			}
			{
				ImeTextField = new JTextField();
				GridBagConstraints gbc_textField = new GridBagConstraints();
				gbc_textField.insets = new Insets(0, 0, 5, 0);
				gbc_textField.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField.gridx = 3;
				gbc_textField.gridy = 1;
				panel.add(ImeTextField, gbc_textField);
				ImeTextField.setColumns(10);
			}
			{
				JLabel lblPrezime = new JLabel("Prezime");
				GridBagConstraints gbc_lblPrezime = new GridBagConstraints();
				gbc_lblPrezime.anchor = GridBagConstraints.WEST;
				gbc_lblPrezime.insets = new Insets(0, 0, 5, 5);
				gbc_lblPrezime.gridx = 1;
				gbc_lblPrezime.gridy = 3;
				panel.add(lblPrezime, gbc_lblPrezime);
			}
			{
				PrezimeTextField = new JTextField();
				GridBagConstraints gbc_textField_1 = new GridBagConstraints();
				gbc_textField_1.insets = new Insets(0, 0, 5, 0);
				gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_1.gridx = 3;
				gbc_textField_1.gridy = 3;
				panel.add(PrezimeTextField, gbc_textField_1);
				PrezimeTextField.setColumns(10);
			}
			{
				JLabel lblDrzava = new JLabel("Grad");
				GridBagConstraints gbc_lblDrzava = new GridBagConstraints();
				gbc_lblDrzava.anchor = GridBagConstraints.WEST;
				gbc_lblDrzava.insets = new Insets(0, 0, 5, 5);
				gbc_lblDrzava.gridx = 1;
				gbc_lblDrzava.gridy = 5;
				panel.add(lblDrzava, gbc_lblDrzava);
			}
			{
				GradTextField = new JTextField();
				GridBagConstraints gbc_textField_3 = new GridBagConstraints();
				gbc_textField_3.insets = new Insets(0, 0, 5, 0);
				gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_3.gridx = 3;
				gbc_textField_3.gridy = 5;
				panel.add(GradTextField, gbc_textField_3);
				GradTextField.setColumns(10);
			}
			{
				JLabel lblPotanskiBroj = new JLabel("Po\u0161tanski broj");
				GridBagConstraints gbc_lblPotanskiBroj = new GridBagConstraints();
				gbc_lblPotanskiBroj.insets = new Insets(0, 0, 5, 5);
				gbc_lblPotanskiBroj.anchor = GridBagConstraints.WEST;
				gbc_lblPotanskiBroj.gridx = 1;
				gbc_lblPotanskiBroj.gridy = 7;
				panel.add(lblPotanskiBroj, gbc_lblPotanskiBroj);
			}
			{
				PbrojTextField = new JTextField();
				GridBagConstraints gbc_textField_4 = new GridBagConstraints();
				gbc_textField_4.insets = new Insets(0, 0, 5, 0);
				gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_4.gridx = 3;
				gbc_textField_4.gridy = 7;
				panel.add(PbrojTextField, gbc_textField_4);
				PbrojTextField.setColumns(10);
			}
			{
				JLabel lblAdresa = new JLabel("Adresa");
				GridBagConstraints gbc_lblAdresa = new GridBagConstraints();
				gbc_lblAdresa.insets = new Insets(0, 0, 5, 5);
				gbc_lblAdresa.anchor = GridBagConstraints.WEST;
				gbc_lblAdresa.gridx = 1;
				gbc_lblAdresa.gridy = 9;
				panel.add(lblAdresa, gbc_lblAdresa);
			}
			{
				AdresaTextField = new JTextField();
				GridBagConstraints gbc_textField_5 = new GridBagConstraints();
				gbc_textField_5.insets = new Insets(0, 0, 5, 0);
				gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_5.gridx = 3;
				gbc_textField_5.gridy = 9;
				panel.add(AdresaTextField, gbc_textField_5);
				AdresaTextField.setColumns(10);
			}
			{
				JLabel lblNewLabel = new JLabel("Pol");
				GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
				gbc_lblNewLabel.anchor = GridBagConstraints.NORTHWEST;
				gbc_lblNewLabel.insets = new Insets(0, 0, 0, 5);
				gbc_lblNewLabel.gridx = 1;
				gbc_lblNewLabel.gridy = 11;
				panel.add(lblNewLabel, gbc_lblNewLabel);
			}
			{
				JPanel PolPanel = new JPanel();
				GridBagConstraints gbc_panel_1 = new GridBagConstraints();
				gbc_panel_1.fill = GridBagConstraints.BOTH;
				gbc_panel_1.gridx = 3;
				gbc_panel_1.gridy = 11;
				panel.add(PolPanel, gbc_panel_1);
				PolPanel.setLayout(new BoxLayout(PolPanel, BoxLayout.Y_AXIS));
				{
					rdbtnMuki = new JRadioButton("Mu\u0161ki");
					rdbtnMuki.setSelected(true);
					PolPanel.add(rdbtnMuki);
				}
				{
					rdbtnenski = new JRadioButton("\u017Denski");
					PolPanel.add(rdbtnenski);
				}
				
				bg.add(rdbtnMuki);
				bg.add(rdbtnenski);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Podaci naloga", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			GridBagConstraints gbc_panel = new GridBagConstraints();
			gbc_panel.insets = new Insets(0, 0, 5, 5);
			gbc_panel.fill = GridBagConstraints.BOTH;
			gbc_panel.gridx = 3;
			gbc_panel.gridy = 1;
			contentPanel.add(panel, gbc_panel);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
			gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			{
				JLabel label = new JLabel("");
				GridBagConstraints gbc_label = new GridBagConstraints();
				gbc_label.insets = new Insets(0, 0, 5, 5);
				gbc_label.gridx = 4;
				gbc_label.gridy = 0;
				panel.add(label, gbc_label);
			}
			{
				JLabel lblKorisnickoIme = new JLabel("Korisnicko ime");
				GridBagConstraints gbc_lblKorisnickoIme = new GridBagConstraints();
				gbc_lblKorisnickoIme.anchor = GridBagConstraints.WEST;
				gbc_lblKorisnickoIme.insets = new Insets(0, 0, 5, 5);
				gbc_lblKorisnickoIme.gridx = 1;
				gbc_lblKorisnickoIme.gridy = 2;
				panel.add(lblKorisnickoIme, gbc_lblKorisnickoIme);
			}
			{
				KorisnickoTextField = new JTextField();
				GridBagConstraints gbc_textField_2 = new GridBagConstraints();
				gbc_textField_2.insets = new Insets(0, 0, 5, 5);
				gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_2.gridx = 3;
				gbc_textField_2.gridy = 2;
				panel.add(KorisnickoTextField, gbc_textField_2);
				KorisnickoTextField.setColumns(10);
			}
			{
				JLabel lblLozinka = new JLabel("Lozinka");
				GridBagConstraints gbc_lblLozinka = new GridBagConstraints();
				gbc_lblLozinka.anchor = GridBagConstraints.WEST;
				gbc_lblLozinka.insets = new Insets(0, 0, 5, 5);
				gbc_lblLozinka.gridx = 1;
				gbc_lblLozinka.gridy = 4;
				panel.add(lblLozinka, gbc_lblLozinka);
			}
			{
				passwordField = new JPasswordField();
				GridBagConstraints gbc_passwordField = new GridBagConstraints();
				gbc_passwordField.insets = new Insets(0, 0, 5, 5);
				gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
				gbc_passwordField.gridx = 3;
				gbc_passwordField.gridy = 4;
				panel.add(passwordField, gbc_passwordField);
			}
			{
				JLabel lblPonoviteLozinku = new JLabel("Ponovite lozinku");
				GridBagConstraints gbc_lblPonoviteLozinku = new GridBagConstraints();
				gbc_lblPonoviteLozinku.anchor = GridBagConstraints.WEST;
				gbc_lblPonoviteLozinku.insets = new Insets(0, 0, 5, 5);
				gbc_lblPonoviteLozinku.gridx = 1;
				gbc_lblPonoviteLozinku.gridy = 6;
				panel.add(lblPonoviteLozinku, gbc_lblPonoviteLozinku);
			}
			{
				passwordField_1 = new JPasswordField();
				GridBagConstraints gbc_passwordField_1 = new GridBagConstraints();
				gbc_passwordField_1.insets = new Insets(0, 0, 5, 5);
				gbc_passwordField_1.fill = GridBagConstraints.HORIZONTAL;
				gbc_passwordField_1.gridx = 3;
				gbc_passwordField_1.gridy = 6;
				panel.add(passwordField_1, gbc_passwordField_1);
			}
			{
				JLabel lblEmail = new JLabel("E-Mail");
				GridBagConstraints gbc_lblEmail = new GridBagConstraints();
				gbc_lblEmail.anchor = GridBagConstraints.WEST;
				gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
				gbc_lblEmail.gridx = 1;
				gbc_lblEmail.gridy = 8;
				panel.add(lblEmail, gbc_lblEmail);
			}
			{
				mailTextField = new JTextField();
				GridBagConstraints gbc_textField_6 = new GridBagConstraints();
				gbc_textField_6.insets = new Insets(0, 0, 5, 5);
				gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_6.gridx = 3;
				gbc_textField_6.gridy = 8;
				panel.add(mailTextField, gbc_textField_6);
				mailTextField.setColumns(10);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			GridBagLayout gbl_buttonPane = new GridBagLayout();
			gbl_buttonPane.columnWidths = new int[]{446, 89, 0, 0, 65, 0};
			gbl_buttonPane.rowHeights = new int[]{23, 0, 0, 0};
			gbl_buttonPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_buttonPane.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
			buttonPane.setLayout(gbl_buttonPane);
			{
				okButton = new JButton("Otkazi");
				okButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						close();
					}
				});
				okButton.setHorizontalAlignment(SwingConstants.LEFT);
				//okButton.setActionCommand("Cancel");
				GridBagConstraints gbc_okButton = new GridBagConstraints();
				gbc_okButton.anchor = GridBagConstraints.NORTHWEST;
				gbc_okButton.insets = new Insets(0, 0, 5, 5);
				gbc_okButton.gridx = 1;
				gbc_okButton.gridy = 1;
				buttonPane.add(okButton, gbc_okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				cancelButton = new JButton("Registruj se");
				//cancelButton.setActionCommand("OK");
				cancelButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
						String ime = ImeTextField.getText();
						String prez = PrezimeTextField.getText();
						String grad = GradTextField.getText();
						String adresa = AdresaTextField.getText();
						String eAdresa = mailTextField.getText();
						String pttBroj = PbrojTextField.getText();
						String korisnicko = KorisnickoTextField.getText();
						String lozinka = String.valueOf(passwordField.getPassword());
						String ponovljenaLozinka = String.valueOf(passwordField_1.getPassword());
						
						String message;
						
						ImeTextField.setBackground(Color.WHITE);
						passwordField_1.setBackground(Color.WHITE);
						mailTextField.setBackground(Color.WHITE);
						
						Aplikacija app = Aplikacija.getInstance();
						int tmp = app.registrovanje(ime, prez, grad, pttBroj, adresa, korisnicko, lozinka, ponovljenaLozinka, eAdresa);
						if(tmp == 1)
						{
							message = "Korisničko ime već postoji!";
							ImeTextField.setBackground(Color.RED);
						}
						else if(tmp == 2)
						{
							message = "Ponovljena lozinka nije ista!";
							passwordField_1.setBackground(Color.RED);
							
						}
						else if(tmp == 3)
						{
							message = "Nepravilna e-adresa!";
							mailTextField.setBackground(Color.RED);
						}
						else if(tmp == 0)
						{
							ImeTextField.setBackground(Color.WHITE);
							passwordField_1.setBackground(Color.WHITE);
							mailTextField.setBackground(Color.WHITE);
							
							KorisnickiNalog kn = new KorisnickiNalog(korisnicko, lozinka, TipKorisnika.registrovaniKupac);
							RegistrovaniKupac rg = new RegistrovaniKupac(kn);
							
							app.dodajKupca(rg);
							app.dodajKorisnickiNalog(kn);
							
							close();
						}
						
					}
				});
				GridBagConstraints gbc_cancelButton = new GridBagConstraints();
				gbc_cancelButton.insets = new Insets(0, 0, 5, 5);
				gbc_cancelButton.anchor = GridBagConstraints.NORTHWEST;
				gbc_cancelButton.gridx = 3;
				gbc_cancelButton.gridy = 1;
				buttonPane.add(cancelButton, gbc_cancelButton);
			}
		}
	}
	
	private void close() {
		this.setVisible(false);
		passwordField.setText(null);
		ImeTextField.setText(null);
		this.dispose();
	}

}







