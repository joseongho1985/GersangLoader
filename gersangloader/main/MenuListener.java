package gersangloader.main;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.JPanel;

import gersangloader.App;
import gersangloader.ErrorDialog;
import gersangloader.etc.DonationPanel;
import gersangloader.etc.InformationPanel;
import gersangloader.etc.UseagePanel;
import gersangloader.setting.client.ClientPanel;
import gersangloader.setting.login.LoginPanel;

public class MenuListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		switch (e.getActionCommand()) {
		case "클라이언트":
			changePanel(new ClientPanel());
			break;
		case "로그인":
			changePanel(new LoginPanel());
			break;
		case "사용방법":
			changePanel(new UseagePanel());
			break;
		case "정보":
			changePanel(new InformationPanel());
			break;
		case "후원":
			changePanel(new DonationPanel());
			break;
		case "거상 홈페이지":
			try {
				Desktop.getDesktop().browse(new URI("https://www.gersang.co.kr"));
			} catch (IOException | URISyntaxException e1) {
				// TODO Auto-generated catch block
				ErrorDialog dialog = new ErrorDialog(e1.getMessage());
				dialog.setVisible(true);
			}
			break;
		case "문의 게시판":
			try {
				Desktop.getDesktop().browse(new URI("https://github.com/joseongho1985/GersangLoader/issues"));
			} catch (IOException | URISyntaxException e1) {
				// TODO Auto-generated catch block
				ErrorDialog dialog = new ErrorDialog(e1.getMessage());
				dialog.setVisible(true);
			}
			break;
		case "거상로더 홈페이지":
			try {
				Desktop.getDesktop().browse(new URI("https://github.com/joseongho1985/GersangLoader"));
			} catch (IOException | URISyntaxException e1) {
				// TODO Auto-generated catch block
				ErrorDialog dialog = new ErrorDialog(e1.getMessage());
				dialog.setVisible(true);
			}
			break;
		case "패치 노트":
			try {
				Desktop.getDesktop().browse(new URI("https://github.com/joseongho1985/GersangLoader/releases"));
			} catch (IOException | URISyntaxException e1) {
				// TODO Auto-generated catch block
				ErrorDialog dialog = new ErrorDialog(e1.getMessage());
				dialog.setVisible(true);
			}
			break;

		}
	}

	void changePanel(JPanel panel) {
		App.frmGersangStation.getContentPane().remove(2);
		App.frmGersangStation.getContentPane().add(panel, BorderLayout.CENTER);
		App.frmGersangStation.revalidate();

	}

}
