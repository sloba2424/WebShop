package gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;
import javax.swing.UIManager;
import java.awt.Color;

public class MainDisplayPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public MainDisplayPanel() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		

		
		CBTree tree = new CBTree();
		tree.setBorder(new TitledBorder(null, "Kategorije", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		tree.addCheckChangeEventListener(new CBTree.CheckChangeEventListener() {
            public void checkStateChanged(CBTree.CheckChangeEvent event) {
                System.out.println("event");
               
				TreePath[] paths = tree.getCheckedPaths();
                for (TreePath tp : paths) {
                    for (Object pathPart : tp.getPath()) {
                        System.out.print(pathPart + ",");
                    }                   
                    System.out.println();
                }
            }           
        });  
		GridBagConstraints gbc_tree = new GridBagConstraints();
		gbc_tree.insets = new Insets(0, 0, 5, 5);
		gbc_tree.fill = GridBagConstraints.BOTH;
		gbc_tree.gridx = 0;
		gbc_tree.gridy = 1;
		add(tree, gbc_tree);
		
		ProizvodiPanel proizvodiPanel = new ProizvodiPanel();
		proizvodiPanel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Proizvodi", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GridBagConstraints gbc_proizvodiPanel = new GridBagConstraints();
		gbc_proizvodiPanel.insets = new Insets(0, 0, 5, 5);
		gbc_proizvodiPanel.fill = GridBagConstraints.BOTH;
		gbc_proizvodiPanel.gridx = 2;
		gbc_proizvodiPanel.gridy = 1;
		add(proizvodiPanel, gbc_proizvodiPanel);

	}

}
