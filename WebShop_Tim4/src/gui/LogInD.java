package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.RegistrovaniKupac;

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
		
		JLabel lblNewLabel = new JLabel("Korisnicko ime");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 1;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Lozinka");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 3;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
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
				rg = new RegistrovaniKupac();
				
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
