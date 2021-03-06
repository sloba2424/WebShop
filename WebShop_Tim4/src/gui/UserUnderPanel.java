package gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Aplikacija;
import model.Main;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UserUnderPanel extends JPanel {
	private JTextField textField;
	private JLabel lblGuest;
	private LogInD lid;
	private JButton btnLogIn;
	private KorpaDialog kd;
	/**
	 * Create the panel.
	 */
	public UserUnderPanel() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 24, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				lblNewLabel_2.setIcon(new ImageIcon(new ImageIcon(UserUnderPanel.class.getResource("/resources/2772.png")).getImage().getScaledInstance(38, 18, Image.SCALE_DEFAULT)));
				
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				lblNewLabel_2.setIcon(new ImageIcon(new ImageIcon(UserUnderPanel.class.getResource("/resources/2772.png")).getImage().getScaledInstance(40, 20, Image.SCALE_DEFAULT)));
				kd = new KorpaDialog();
				kd.setVisible(true);
				kd.setModal(true);
			}
		});
		lblNewLabel_2.setIcon(new ImageIcon(new ImageIcon(UserUnderPanel.class.getResource("/resources/2772.png")).getImage().getScaledInstance(40, 20, Image.SCALE_DEFAULT)));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 1;
		add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		lblGuest = new JLabel("Guest");
		GridBagConstraints gbc_lblGuest = new GridBagConstraints();
		gbc_lblGuest.anchor = GridBagConstraints.WEST;
		gbc_lblGuest.insets = new Insets(0, 0, 5, 5);
		gbc_lblGuest.gridx = 2;
		gbc_lblGuest.gridy = 1;
		add(lblGuest, gbc_lblGuest);
		
		JLabel lblNewLabel = new JLabel("Search");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 4;
		gbc_lblNewLabel.gridy = 1;
		add(lblNewLabel, gbc_lblNewLabel);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 6;
		gbc_textField.gridy = 1;
		add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(new ImageIcon(UserUnderPanel.class.getResource("/resources/63322.png")).getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 7;
		gbc_lblNewLabel_1.gridy = 1;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("  ");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 8;
		gbc_lblNewLabel_3.gridy = 1;
		add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		btnLogIn = new JButton("Prijavi se");
		btnLogIn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Aplikacija app = Aplikacija.getInstance();
				if (app.getUlogovan() == null) {
				lid = new LogInD();
				lid.setVisible(true);
				lid.setModal(true);
				}else {
					app.setUlogovan(null);
					AppWindow window = Main.getWindow();
					UserUnderPanel panel = window.getUserUnderPanel();
					panel.setUsernameText("Guest");
					panel.setBtnLogIn("Prijavi se");
				}
			}
		});
		GridBagConstraints gbc_btnLogIn = new GridBagConstraints();
		gbc_btnLogIn.insets = new Insets(0, 0, 5, 5);
		gbc_btnLogIn.gridx = 9;
		gbc_btnLogIn.gridy = 1;
		add(btnLogIn, gbc_btnLogIn);
		
		/*
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(new ImageIcon(UserUnderPanel.class.getResource("/resources/Artboard_20-512.png")).getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 7;
		gbc_lblNewLabel_2.gridy = 1;
		add(lblNewLabel_2, gbc_lblNewLabel_2);
		*/

	}
	
	public void setUsernameText(String username)
	{
		lblGuest.setText(username);
	}
	
	public void setBtnLogIn(String logOut)
	{
		
		btnLogIn.setText(logOut);
	}

}
