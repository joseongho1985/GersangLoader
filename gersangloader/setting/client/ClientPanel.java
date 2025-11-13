package gersangloader.setting.client;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class ClientPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	public static ArrayList<JLabel> pathList;
	private ClientListener listener;

	/**
	 * Create the panel.
	 */
	public ClientPanel() {
		listener = new ClientListener();
		pathList = new ArrayList<JLabel>();
		
		setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(new GridLayout(4, 1, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("클라이언트 경로");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel(listener.getNthPath(0));
		pathList.add(lblNewLabel_2);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_4 = new JLabel(listener.getNthPath(1));
		pathList.add(lblNewLabel_4);
		panel.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel(listener.getNthPath(2));
		pathList.add(lblNewLabel_5);
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

		btnNewButton_5.addActionListener(listener);
		btnNewButton_4.addActionListener(listener);
		btnNewButton_3.addActionListener(listener);
	}
}
