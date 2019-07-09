package gui;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.ImageIcon;
import java.awt.Insets;
import javax.swing.border.TitledBorder;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.DefaultComboBoxModel;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class DetaljiProizvodaPanel extends JDialog {

	/**
	 * Create the panel.
	 */
	public DetaljiProizvodaPanel() {
		setSize(487, 300);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon( new ImageIcon(DetaljiProizvodaPanel.class.getResource("/resources/amisco-alto-dining-chair.jpg")).getImage().getScaledInstance(140, 250, Image.SCALE_DEFAULT)));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Opis proizvoda", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 3;
		gbc_panel.gridy = 1;
		getContentPane().add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel_1 = new JLabel("Naziv proizvoda:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Obi\u010Dna stolica");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2.gridx = 2;
		gbc_lblNewLabel_2.gridy = 1;
		panel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JLabel lblifraArtikla = new JLabel("\u0160ifra artikla:");
		GridBagConstraints gbc_lblifraArtikla = new GridBagConstraints();
		gbc_lblifraArtikla.anchor = GridBagConstraints.WEST;
		gbc_lblifraArtikla.insets = new Insets(0, 0, 5, 5);
		gbc_lblifraArtikla.gridx = 0;
		gbc_lblifraArtikla.gridy = 2;
		panel.add(lblifraArtikla, gbc_lblifraArtikla);
		
		JLabel lblIs = new JLabel("IS00001");
		GridBagConstraints gbc_lblIs = new GridBagConstraints();
		gbc_lblIs.insets = new Insets(0, 0, 5, 0);
		gbc_lblIs.anchor = GridBagConstraints.WEST;
		gbc_lblIs.gridx = 2;
		gbc_lblIs.gridy = 2;
		panel.add(lblIs, gbc_lblIs);
		
		JLabel lblDimenzijeXV = new JLabel("Dimenzije(\u0160 x V x D):");
		GridBagConstraints gbc_lblDimenzijeXV = new GridBagConstraints();
		gbc_lblDimenzijeXV.insets = new Insets(0, 0, 5, 5);
		gbc_lblDimenzijeXV.gridx = 0;
		gbc_lblDimenzijeXV.gridy = 3;
		panel.add(lblDimenzijeXV, gbc_lblDimenzijeXV);
		
		JLabel lblX = new JLabel("42 x 107 x 55");
		GridBagConstraints gbc_lblX = new GridBagConstraints();
		gbc_lblX.anchor = GridBagConstraints.WEST;
		gbc_lblX.insets = new Insets(0, 0, 5, 0);
		gbc_lblX.gridx = 2;
		gbc_lblX.gridy = 3;
		panel.add(lblX, gbc_lblX);
		
		JLabel lblBoja = new JLabel("Boja:");
		GridBagConstraints gbc_lblBoja = new GridBagConstraints();
		gbc_lblBoja.anchor = GridBagConstraints.WEST;
		gbc_lblBoja.insets = new Insets(0, 0, 5, 5);
		gbc_lblBoja.gridx = 0;
		gbc_lblBoja.gridy = 4;
		panel.add(lblBoja, gbc_lblBoja);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String s = (String) comboBox.getSelectedItem();
				
				switch (s) {//check for a match
	                case "BLUE":
	                	lblNewLabel.setIcon(new ImageIcon( new ImageIcon(DetaljiProizvodaPanel.class.getResource("/resources/amisco-alto-dining-chair_BLUE.jpeg")).getImage().getScaledInstance(140, 250, Image.SCALE_DEFAULT)));
	                    break;
	                case "GREEN":
	                	lblNewLabel.setIcon(new ImageIcon( new ImageIcon(DetaljiProizvodaPanel.class.getResource("/resources/amisco-alto-dining-chair_GREEN.jpeg")).getImage().getScaledInstance(140, 250, Image.SCALE_DEFAULT)));
	                    break;
	                case "RED":
	                	lblNewLabel.setIcon(new ImageIcon( new ImageIcon(DetaljiProizvodaPanel.class.getResource("/resources/amisco-alto-dining-chair_RED.jpeg")).getImage().getScaledInstance(140, 250, Image.SCALE_DEFAULT)));
	                    break;
	                case "BEIGE":
	                	lblNewLabel.setIcon(new ImageIcon( new ImageIcon(DetaljiProizvodaPanel.class.getResource("/resources/amisco-alto-dining-chair.jpg")).getImage().getScaledInstance(140, 250, Image.SCALE_DEFAULT)));
	                    break;
	                default:
	                    
	                    break;
				}
			}
		});
		
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"BEIGE", "BLUE", "GREEN", "RED"}));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 2;
		gbc_comboBox.gridy = 4;
		panel.add(comboBox, gbc_comboBox);
		
		JLabel lblOpis = new JLabel("Opis:");
		GridBagConstraints gbc_lblOpis = new GridBagConstraints();
		gbc_lblOpis.anchor = GridBagConstraints.WEST;
		gbc_lblOpis.insets = new Insets(0, 0, 5, 5);
		gbc_lblOpis.gridx = 0;
		gbc_lblOpis.gridy = 5;
		panel.add(lblOpis, gbc_lblOpis);
		
		JLabel lblLjepaZaUkuu = new JLabel("Ljepa za uku\u0107u");
		GridBagConstraints gbc_lblLjepaZaUkuu = new GridBagConstraints();
		gbc_lblLjepaZaUkuu.anchor = GridBagConstraints.WEST;
		gbc_lblLjepaZaUkuu.insets = new Insets(0, 0, 5, 0);
		gbc_lblLjepaZaUkuu.gridx = 2;
		gbc_lblLjepaZaUkuu.gridy = 5;
		panel.add(lblLjepaZaUkuu, gbc_lblLjepaZaUkuu);
		
		JLabel lblCena = new JLabel("Cena:");
		GridBagConstraints gbc_lblCena = new GridBagConstraints();
		gbc_lblCena.anchor = GridBagConstraints.WEST;
		gbc_lblCena.insets = new Insets(0, 0, 0, 5);
		gbc_lblCena.gridx = 0;
		gbc_lblCena.gridy = 7;
		panel.add(lblCena, gbc_lblCena);
		
		JLabel label = new JLabel("699.99\u20AC");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.WEST;
		gbc_label.gridx = 2;
		gbc_label.gridy = 7;
		panel.add(label, gbc_label);
		
		JButton btnDodajUKorpu = new JButton("Dodaj u korpu");
		GridBagConstraints gbc_btnDodajUKorpu = new GridBagConstraints();
		gbc_btnDodajUKorpu.anchor = GridBagConstraints.EAST;
		gbc_btnDodajUKorpu.insets = new Insets(0, 0, 5, 5);
		gbc_btnDodajUKorpu.gridx = 3;
		gbc_btnDodajUKorpu.gridy = 3;
		getContentPane().add(btnDodajUKorpu, gbc_btnDodajUKorpu);

	}

}
