package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Aplikacija;
import model.KorisnickiNalog;
import model.Main;
import model.RegistrovaniKupac;
import static model.TipKorisnika.*;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.Closeable;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class LogInD extends JDialog {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private RegisterDialog rd;
	private RegistrovaniKupac rg;

	/**
	 * Create the frame.
	 */
	public LogInD() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel usernameLabel = new JLabel("Korisnicko ime");
		GridBagConstraints gbc_usernameLabel = new GridBagConstraints();
		gbc_usernameLabel.insets = new Insets(0, 0, 5, 5);
		gbc_usernameLabel.gridx = 1;
		gbc_usernameLabel.gridy = 1;
		contentPane.add(usernameLabel, gbc_usernameLabel);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 1;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel passwordLabel = new JLabel("Lozinka");
		GridBagConstraints gbc_passwordLabel = new GridBagConstraints();
		gbc_passwordLabel.anchor = GridBagConstraints.WEST;
		gbc_passwordLabel.insets = new Insets(0, 0, 5, 5);
		gbc_passwordLabel.gridx = 1;
		gbc_passwordLabel.gridy = 3;
		contentPane.add(passwordLabel, gbc_passwordLabel);
		
		passwordField = new JPasswordField();
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.insets = new Insets(0, 0, 5, 5);
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.gridx = 3;
		gbc_passwordField.gridy = 3;
		contentPane.add(passwordField, gbc_passwordField);
		
		JButton btnCancel = new JButton("Otkazi");
		btnCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				close();
			}
		});
		
		JLabel lblNisiRegistrovan = new JLabel("");
		lblNisiRegistrovan.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				lblNisiRegistrovan.setIcon(new ImageIcon(new ImageIcon(LogInD.class.getResource("/resources/registruj_se.png")).getImage().getScaledInstance(85, 18, Image.SCALE_DEFAULT)));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				lblNisiRegistrovan.setIcon(new ImageIcon(new ImageIcon(LogInD.class.getResource("/resources/registruj_se.png")).getImage().getScaledInstance(90, 20, Image.SCALE_DEFAULT)));
				
				rd = new RegisterDialog();
				rd.setModal(true);
				rd.setVisible(true);
				
			}
		});
		lblNisiRegistrovan.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNisiRegistrovan.setIcon(new ImageIcon(new ImageIcon(LogInD.class.getResource("/resources/registruj_se.png")).getImage().getScaledInstance(90, 20, Image.SCALE_DEFAULT)));
		GridBagConstraints gbc_lblNisiRegistrovan = new GridBagConstraints();
		gbc_lblNisiRegistrovan.anchor = GridBagConstraints.WEST;
		gbc_lblNisiRegistrovan.insets = new Insets(0, 0, 5, 5);
		gbc_lblNisiRegistrovan.gridx = 3;
		gbc_lblNisiRegistrovan.gridy = 5;
		contentPane.add(lblNisiRegistrovan, gbc_lblNisiRegistrovan);
		GridBagConstraints gbc_btnCancel = new GridBagConstraints();
		gbc_btnCancel.insets = new Insets(0, 0, 5, 5);
		gbc_btnCancel.gridx = 1;
		gbc_btnCancel.gridy = 7;
		contentPane.add(btnCancel, gbc_btnCancel);
		
		JButton btnNewButton = new JButton("Prijavi se");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Aplikacija app = Aplikacija.getInstance();
				String korisnickoIme = textField.getText();
				String sifra = String.valueOf(passwordField.getPassword());
				KorisnickiNalog kn = app.pronadjiNalog(korisnickoIme, sifra);

				if (kn != null) //ako je logovanje uspesno
				{
					rg = new RegistrovaniKupac(kn);
					app.setUlogovan(rg);
					AppWindow window = Main.getWindow();
					UserUnderPanel panel = window.getUserUnderPanel();
					panel.setUsernameText(korisnickoIme);
					panel.setBtnLogIn("Odjavi se");
					close();
				}
				else {
					/*
					 * ovde treba mali dijalog da je uneo nevalidan username/password
					 */
					passwordField.setText("");
				}
				
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.anchor = GridBagConstraints.EAST;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 3;
		gbc_btnNewButton.gridy = 7;
		contentPane.add(btnNewButton, gbc_btnNewButton);
	}
	
	private void close() {
		this.setVisible(false);
		passwordField.setText(null);
		textField.setText(null);
		this.dispose();
	}

}
