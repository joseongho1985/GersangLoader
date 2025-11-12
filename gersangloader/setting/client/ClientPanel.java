package gersangloader.setting.client;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class ClientPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	public static JLabel lblNewLabel_2, lblNewLabel_4, lblNewLabel_5;

	/**
	 * Create the panel.
	 */
	public ClientPanel() {
		
		setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(new GridLayout(4, 1, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("클라이언트 경로");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_1);

		lblNewLabel_2 = new JLabel(new ClientFile().getNthPath(0));
		panel.add(lblNewLabel_2);

		lblNewLabel_4 = new JLabel(new ClientFile().getNthPath(1));
		panel.add(lblNewLabel_4);

		lblNewLabel_5 = new JLabel(new ClientFile().getNthPath(2));
		panel.add(lblNewLabel_5);

		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.WEST);
		panel_1.setLayout(new GridLayout(4, 1, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Client");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel);

		JButton btnNewButton_3 = new JButton("1");
		panel_1.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("2");
		panel_1.add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("3");
		panel_1.add(btnNewButton_5);
		btnNewButton_5.addActionListener(new ClientListener());

		btnNewButton_4.addActionListener(new ClientListener());
		btnNewButton_3.addActionListener(new ClientListener());

		

	}

}
