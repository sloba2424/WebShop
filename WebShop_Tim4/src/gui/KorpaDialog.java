package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.BoxLayout;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
//import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.SwingConstants;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class KorpaDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private NarudzbenicaDialog nd;


	/**
	 * Create the dialog.
	 */
	public KorpaDialog() {
		setTitle("Korpa");
		setBounds(100, 100, 450, 357);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
		{
			JScrollPane scrollPane = new JScrollPane();
			contentPanel.add(scrollPane);
			{
				JPanel panel = new JPanel();
				scrollPane.setViewportView(panel);
				panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
				{
					StavkaKorpePanel stavkaKorpePanel = new StavkaKorpePanel();
					panel.add(stavkaKorpePanel);
				}
				{
					StavkaKorpePanel stavkaKorpePanel = new StavkaKorpePanel();
					panel.add(stavkaKorpePanel);
				}
				{
					StavkaKorpePanel stavkaKorpePanel = new StavkaKorpePanel();
					panel.add(stavkaKorpePanel);
				}
			}
		}
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{0, 0, 0, 0};
			gbl_panel.rowHeights = new int[]{0, 0, 0, 0};
			gbl_panel.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			{
				JLabel lblTotal = new JLabel("Total: 1899 \u20AC");
				GridBagConstraints gbc_lblTotal = new GridBagConstraints();
				gbc_lblTotal.insets = new Insets(0, 0, 5, 0);
				gbc_lblTotal.anchor = GridBagConstraints.NORTHEAST;
				gbc_lblTotal.gridx = 2;
				gbc_lblTotal.gridy = 1;
				panel.add(lblTotal, gbc_lblTotal);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Otkazi");
				okButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						close();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Nastavi");
				cancelButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						nd = new NarudzbenicaDialog();
						nd.setVisible(true);
						dispose();
						nd.setModal(true);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	
	private void close() {
		this.setVisible(false);
		this.dispose();
	}

}
