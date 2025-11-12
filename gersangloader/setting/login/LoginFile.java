package gersangloader.setting.login;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LoginFile {

	private static String[] pathList;

	public LoginFile() throws IOException {
		super();
		// TODO Auto-generated constructor stub

		pathList = new String[3];

		BufferedReader reader = new BufferedReader(new FileReader("client_list.txt"));
		String str;
		for (int i = 0; i < 3; i++) {
			str = reader.readLine();
			pathList[i] = str;
		}
		reader.close();

	}

	public String getNthPath(int i) {

		return pathList[i];
	}
}
