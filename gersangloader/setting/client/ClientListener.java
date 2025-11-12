package gersangloader.setting.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFileChooser;

public class ClientListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int i = Integer.parseInt(e.getActionCommand())-1;
		ClientPanel.pathList.get(i).setText(getDirectoryPath(i));
	}

	String getDirectoryPath(int i) {
		JFileChooser chooser = new JFileChooser();
		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		chooser.showOpenDialog(chooser);

		new ClientFile().setPath(chooser.getSelectedFile().getPath(), i);

		return new ClientFile().getNthPath(i);
	}
}
