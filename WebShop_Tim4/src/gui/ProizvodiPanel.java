package gui;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.TitledBorder;

public class ProizvodiPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public ProizvodiPanel() {
		setBorder(new TitledBorder(null, "Preporuceni proizvodi", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		ProizvodMini proizvodMini = new ProizvodMini();
		GridBagConstraints gbc_proizvodMini = new GridBagConstraints();
		gbc_proizvodMini.insets = new Insets(0, 0, 5, 5);
		gbc_proizvodMini.fill = GridBagConstraints.BOTH;
		gbc_proizvodMini.gridx = 1;
		gbc_proizvodMini.gridy = 1;
		add(proizvodMini, gbc_proizvodMini);
		
		ProizvodMini proizvodMini_1 = new ProizvodMini();
		GridBagConstraints gbc_proizvodMini_1 = new GridBagConstraints();
		gbc_proizvodMini_1.insets = new Insets(0, 0, 5, 5);
		gbc_proizvodMini_1.fill = GridBagConstraints.BOTH;
		gbc_proizvodMini_1.gridx = 4;
		gbc_proizvodMini_1.gridy = 1;
		add(proizvodMini_1, gbc_proizvodMini_1);
		
		ProizvodMini proizvodMini_2 = new ProizvodMini();
		GridBagConstraints gbc_proizvodMini_2 = new GridBagConstraints();
		gbc_proizvodMini_2.insets = new Insets(0, 0, 5, 5);
		gbc_proizvodMini_2.fill = GridBagConstraints.BOTH;
		gbc_proizvodMini_2.gridx = 6;
		gbc_proizvodMini_2.gridy = 1;
		add(proizvodMini_2, gbc_proizvodMini_2);

	}
}
