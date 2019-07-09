package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;

import model.Aplikacija;
import model.Proizvod;

import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ProizvodMini extends JPanel {
	private Proizvod proizvod;

	/**
	 * Create the panel.
	 */
	public ProizvodMini() {
		setBorder(new TitledBorder(null, "Stolica 1", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{46, 39, 25, 0};
		gridBagLayout.rowHeights = new int[]{145, 32, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				DetaljiProizvodaPanel dpp = new DetaljiProizvodaPanel();
				dpp.setVisible(true);
			}
		});
		lblNewLabel.setIcon(new ImageIcon(new ImageIcon(ProizvodMini.class.getResource("/resources/amisco-alto-dining-chair.jpg")).getImage().getScaledInstance(120, 145, Image.SCALE_DEFAULT)));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.SOUTH;
		gbc_lblNewLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridwidth = 3;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("699.99\u20AC");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.SOUTH;
		gbc_lblNewLabel_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter()  
		{  
		    public void mouseClicked(MouseEvent e)  
		    {  
		    	/*ovde implementiraj dodavanje u korpu
		    	 * moras prvo iz aplikacije getovati ulogovanog korisnika, pa dodati u njegovu korpu proizvod, pa javiti gui korpi da doda
		    	 */
		    	Aplikacija app = Aplikacija.getInstance();
		    }  
		}); 
		lblNewLabel_2.setIcon(new ImageIcon(new ImageIcon(ProizvodMini.class.getResource("/resources/Add-Cart-512.png")).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel_2.gridx = 2;
		gbc_lblNewLabel_2.gridy = 1;
		add(lblNewLabel_2, gbc_lblNewLabel_2);

	}
	
	public ProizvodMini(Proizvod p) {
		proizvod = p;
	}

	public Proizvod getProizvod() {
		return proizvod;
	}

	
}
