package gersangloader.setting.login;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class LoginPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	protected static ArrayList<JTextField> idList;
	protected static ArrayList<JPasswordField> passwordList;

	/**
	 * Create the panel.
	 */
	public LoginPanel() {
		idList = new ArrayList<JTextField>();
		passwordList = new ArrayList<JPasswordField>();

		setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(4, 2, 0, 0));

		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("비밀번호");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_1);

		JTextField textField = new JTextField();
		panel.add(textField);
		idList.add(textField);

		JPasswordField passwordField = new JPasswordField();
		passwordList.add(passwordField);
		panel.add(passwordField);

		JTextField textField_1 = new JTextField();
		idList.add(textField_1);
		panel.add(textField_1);

		JPasswordField passwordField_1 = new JPasswordField();
		passwordList.add(passwordField_1);
		panel.add(passwordField_1);

		JTextField textField_2 = new JTextField();
		idList.add(textField_2);
		panel.add(textField_2);

		JPasswordField passwordField_2 = new JPasswordField();
		passwordList.add(passwordField_2);
		panel.add(passwordField_2);

		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.EAST);
		panel_1.setLayout(new GridLayout(4, 1, 0, 0));

		JLabel lblNewLabel_2 = new JLabel("로그인");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_2);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("1");
		rdbtnNewRadioButton.addItemListener(new LoginListener());
		panel_1.add(rdbtnNewRadioButton);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("2");
		rdbtnNewRadioButton_1.addItemListener(new LoginListener());
		panel_1.add(rdbtnNewRadioButton_1);

		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("3");
		rdbtnNewRadioButton_2.addItemListener(new LoginListener());
		panel_1.add(rdbtnNewRadioButton_2);

		JPanel panel_2 = new JPanel();
		add(panel_2, BorderLayout.WEST);
		panel_2.setLayout(new GridLayout(4, 1, 0, 0));

		JLabel lblNewLabel_3 = new JLabel("실행");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_3);

		JButton btnNewButton = new JButton("1");
		panel_2.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("2");
		panel_2.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("3");
		panel_2.add(btnNewButton_2);

		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnNewRadioButton);
		group.add(rdbtnNewRadioButton_1);
		group.add(rdbtnNewRadioButton_2);

	}


}
