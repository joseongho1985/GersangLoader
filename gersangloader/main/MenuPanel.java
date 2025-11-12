package gersangloader.main;

import java.awt.FlowLayout;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MenuPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private static JLabel lblNewLabel;

	/**
	 * Create the panel.
	 */
	public MenuPanel() {
		setLayout(new FlowLayout(FlowLayout.LEADING, 0, 0));

		JMenuBar menuBar = new JMenuBar();
		add(menuBar);

		JMenu mnNewMenu = new JMenu("설정");
		menuBar.add(mnNewMenu);

		JMenuItem mntmNewMenuItem = new JMenuItem("로그인");
		mntmNewMenuItem.addActionListener(new MenuListener());
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("클라이언트");
		mntmNewMenuItem_6.addActionListener(new MenuListener());
		mnNewMenu.add(mntmNewMenuItem_6);

		JMenu mnNewMenu_1 = new JMenu("외부링크");
		menuBar.add(mnNewMenu_1);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("거상 홈페이지");
		mntmNewMenuItem_1.addActionListener(new MenuListener());
		mnNewMenu_1.add(mntmNewMenuItem_1);

		JMenuItem mntmNewMenuItem_2 = new JMenuItem("문의 게시판");
		mntmNewMenuItem_2.addActionListener(new MenuListener());
		mnNewMenu_1.add(mntmNewMenuItem_2);

		JMenuItem mntmNewMenuItem_5 = new JMenuItem("패치 노트");
		mntmNewMenuItem_5.addActionListener(new MenuListener());
		mnNewMenu_1.add(mntmNewMenuItem_5);

		JMenu mnNewMenu_2 = new JMenu("기타");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("사용방법");
		mntmNewMenuItem_7.addActionListener(new MenuListener());
		mnNewMenu_2.add(mntmNewMenuItem_7);

		JMenuItem mntmNewMenuItem_3 = new JMenuItem("정보");
		mnNewMenu_2.add(mntmNewMenuItem_3);
		mntmNewMenuItem_3.addActionListener(new MenuListener());

		JMenuItem mntmNewMenuItem_4 = new JMenuItem("후원");
		mnNewMenu_2.add(mntmNewMenuItem_4);
		mntmNewMenuItem_4.addActionListener(new MenuListener());

		JLabel lblNewLabel_1 = new JLabel("최근 후원자: ");
		add(lblNewLabel_1);
		lblNewLabel = new JLabel();
		add(lblNewLabel);

		Queue<String> donor = new LinkedList<String>();
		donor.add("태극서버 나루상인");
		donor.add("나루상인 태극서버");

		TimerTask task = new TimerTask() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				String str = donor.poll();
				lblNewLabel.setText(str);
				lblNewLabel.revalidate();
				donor.add(str);
			}
		};

		new Timer().scheduleAtFixedRate(task, 1000, 2000);

	}

}
