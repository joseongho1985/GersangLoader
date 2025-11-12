package gersangloader.setting.login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JRadioButton;

import org.example.Login;

import gersangloader.ErrorDialog;

public class LoginListener implements ItemListener, ActionListener {

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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		int i = Integer.parseInt(e.getActionCommand()) - 1;

		try {

			String path = new LoginFile().getNthPath(i);
			new ProcessBuilder(path + File.separator + "Run.exe").start();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			new ErrorDialog(e1.getMessage());
		}
	}
}
