package gersangloader.setting.login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginListener implements ActionListener {
	String id, password;

	public LoginListener() {
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		switch (e.getActionCommand()) {
		case "1": {
			String password = "";
			for(char cha : LoginPanel.passwordField.getPassword()) {
				Character.toString(cha);
				password += cha;
			}
			System.out.print("id: " + LoginPanel.textField.getText() +" password: "+ password);

			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + e.getActionCommand());
		}

	}

}
