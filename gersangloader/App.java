package gersangloader;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;

import gersangloader.main.FooterPanel;
import gersangloader.main.MenuPanel;
import gersangloader.setting.login.LoginPanel;

public class App {

	public static JFrame frmGersangStation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			App window = new App();
			frmGersangStation.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Create the application.
	 */
	public App() {
		frmGersangStation = new JFrame();
		frmGersangStation.setResizable(false);
		frmGersangStation.setTitle("Gersang Loader");
		frmGersangStation.setBounds(100, 100, 400, 200);
		frmGersangStation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		MenuPanel menubar = new MenuPanel();
		frmGersangStation.getContentPane().add(menubar, BorderLayout.NORTH);
		menubar.setLayout(new FlowLayout(FlowLayout.LEADING, 5, 5));

		FooterPanel footer = new FooterPanel();
		frmGersangStation.getContentPane().add(footer, BorderLayout.SOUTH);

		LoginPanel login = new LoginPanel();
		frmGersangStation.getContentPane().add(login, BorderLayout.CENTER);

	}

}