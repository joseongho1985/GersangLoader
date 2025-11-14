package gersangloader.etc;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class UseagePanel extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public UseagePanel() {
		setLayout(new GridLayout(5, 1, 0, 0));
		
		JLabel lblNewLabel = new JLabel("사용방법");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("1. 설정 > 클라이언트에서 클라이언트를 선택해주세요.");
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("2. 설정 > 로그인에서 아이디와 비밀번호를 입력해주세요.");
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("3. 로그인 단추를 눌러주세요.");
		add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("4. 실행 버튼을 눌러주세요.");
		add(lblNewLabel_4);

	}

}
