package gersangloader.setting.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFileChooser;

public class ClientListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		switch (e.getActionCommand()) {
		case "Client 1":
			ClientPanel.lblNewLabel_2.setText(getDirectoryPath(0));
			break;
		case "Client 2":
			ClientPanel.lblNewLabel_4.setText(getDirectoryPath(1));
			break;
		case "Client 3":
			ClientPanel.lblNewLabel_5.setText(getDirectoryPath(2));
			break;
		}
	}

	String getDirectoryPath(int i) {
		JFileChooser chooser = new JFileChooser();
		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		chooser.showOpenDialog(chooser);

		new ClientFile().setPath(chooser.getSelectedFile().getPath(), i);

		return new ClientFile().getNthPath(i);
	}
}
