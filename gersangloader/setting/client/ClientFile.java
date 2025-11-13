package gersangloader.setting.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ClientFile {

	private String[] pathList;

	public ClientFile() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		File file = new File("client_list.txt");
		pathList = new String[3];

		if (file.exists()) {
			readPathList();

		} else {
			pathList[0] = "Select 1을 눌러 거상클라 1을 선택";
			pathList[1] = "Select 2을 눌러 거상클라 2을 선택";
			pathList[2] = "Select 3을 눌러 거상클라 3을 선택";
		}
	}

	public String getNthPath(int i) {

		return pathList[i];
	}

	private void readPathList() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("client_list.txt"));
		String str;
		for (int i = 0; i < 3; i++) {
			str = reader.readLine();
			pathList[i] = str;
		}
		reader.close();

	}

	public void setPath(String path, int i) throws IOException {
		pathList[i] = path;
		writePathList();
	}

	public void setPathList(String[] list) throws IOException {
		pathList = list;
		writePathList();
	}

	private void writePathList() throws IOException {

		BufferedWriter writer = new BufferedWriter(new FileWriter("client_list.txt"));

		for (int i = 0; i < 3; i++) {
			writer.write(pathList[i]);
			writer.newLine();
		}
		writer.close();
	}

}
