package gersangloader.setting.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFileChooser;

import gersangloader.ErrorDialog;

public class ClientListener implements ActionListener {
	private ClientFile file;

	public ClientListener(){
		try {
			file = new ClientFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			new ErrorDialog(e.getMessage());
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int i = Integer.parseInt(e.getActionCommand()) - 1;
		JFileChooser chooser = new JFileChooser();
		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		chooser.showOpenDialog(chooser);

		try {
			file.setPath(chooser.getSelectedFile().getPath(), i);
			ClientPanel.pathList.get(i).setText(file.getNthPath(i));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			new ErrorDialog(e1.getMessage());
		}
	}

	public String getNthPath(int i) {
		// TODO Auto-generated method stub
		String tmp ="클라이언트를 설정이 필요합니다.";
		tmp = file.getNthPath(i);
		return tmp;
	}
}
