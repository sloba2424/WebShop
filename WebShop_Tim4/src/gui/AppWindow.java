package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import java.awt.Insets;

public class AppWindow {

	public JFrame frame;
	
	public AppWindow() {
		initialize();
	}

	private void initialize() {
		
		frame = new JFrame();
		frame.setTitle("Web App");
		frame.setBounds(100, 100, 830, 630);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{434, 0};
		gridBagLayout.rowHeights = new int[]{141, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(AppWindow.class.getResource("/resources/webshopbanner-BEZH.jpg")));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		frame.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		UserUnderPanel userUnderPanel = new UserUnderPanel();
		GridBagConstraints gbc_userUnderPanel = new GridBagConstraints();
		gbc_userUnderPanel.insets = new Insets(0, 0, 5, 0);
		gbc_userUnderPanel.fill = GridBagConstraints.HORIZONTAL;
		gbc_userUnderPanel.gridx = 0;
		gbc_userUnderPanel.gridy = 1;
		frame.getContentPane().add(userUnderPanel, gbc_userUnderPanel);
		
		MainDisplayPanel mainDisplayPanel = new MainDisplayPanel();
		GridBagConstraints gbc_mainDisplayPanel = new GridBagConstraints();
		gbc_mainDisplayPanel.insets = new Insets(0, 0, 5, 0);
		gbc_mainDisplayPanel.fill = GridBagConstraints.BOTH;
		gbc_mainDisplayPanel.gridx = 0;
		gbc_mainDisplayPanel.gridy = 2;
		frame.getContentPane().add(mainDisplayPanel, gbc_mainDisplayPanel);
	}

}
