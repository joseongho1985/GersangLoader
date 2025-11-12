package gersangloader.etc;

import java.awt.BorderLayout;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

public class DonationPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public DonationPanel() {
		setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel = new JLabel("후원자 명단");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel, BorderLayout.NORTH);

		JLabel lblNewLabel_1 = new JLabel("후원 방법");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel_1, BorderLayout.SOUTH);

		JList<String> list = new JList<>();
		list.setEnabled(false);
		DefaultListModel<String> model = new DefaultListModel<>();
		model.addElement("1");
		model.addElement("2");
		model.addElement("3");
		model.addElement("4");
		model.addElement("1");
		model.addElement("2");
		model.addElement("3");
		model.addElement("4");
		model.addElement("1");
		model.addElement("2");
		model.addElement("3");
		model.addElement("4");
		list.setModel(model);
		JScrollPane scrollPane = new JScrollPane(list);

		add(scrollPane, BorderLayout.CENTER);

	}

}
