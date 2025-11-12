package gersangloader.setting.login;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JRadioButton;

import org.example.Login;

public class LoginListener implements ItemListener {

	// @Override
	// public void actionPerformed(ActionEvent e) {
	// // TODO Auto-generated method stub
	// int i = Integer.parseInt(e.getActionCommand())-1;
	// ArrayList<String> account = getAccount(i);

	// new Login( account.get(0),account.get(1));
	// }

	public ArrayList<String> getAccount(int i) {
		String password = "";
		for (char cha : LoginPanel.passwordList.get(i).getPassword()) {
			Character.toString(cha);
			password += cha;
		}

		ArrayList<String> account = new ArrayList<>();
		account.add(LoginPanel.idList.get(i).getText());
		account.add(password);

		return account;
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if (e.getStateChange() == ItemEvent.SELECTED) {
			JRadioButton btn = (JRadioButton) e.getItem();
			btn.getText();
			int i = Integer.parseInt(btn.getText()) - 1;
			ArrayList<String> account = getAccount(i);

			new Login(account.get(0), account.get(1));
		}
	}

}
