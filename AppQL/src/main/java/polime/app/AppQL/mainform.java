package polime.app.AppQL;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTabbedPane;

public class mainform extends JFrame {
	private StudentPanel mStudentPanel;
	private GPAPanel mGpaPanel;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainform frame = new mainform();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	@SuppressWarnings("deprecation")
	public mainform() {
		setLocationRelativeTo(null);
		setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
		Login lg = new Login();
		lg.setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 915, 779);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(10, 10, 209, 22);
		contentPane.add(menuBar);

		JMenu mnNewMenu = new JMenu("Hệ thống");
		mnNewMenu.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(mnNewMenu);

		JMenuItem menudangxuat = new JMenuItem("Đăng xuất   ");
		menudangxuat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		menudangxuat.setIcon(new ImageIcon(mainform.class.getResource("/image/logout-icon-16.png")));
		menudangxuat.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, InputEvent.CTRL_MASK));
		menudangxuat.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mnNewMenu.add(menudangxuat);

		JMenu mnNewMenu_1 = new JMenu("Quản lý");
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(mnNewMenu_1);

		JMenu mnNewMenu_2 = new JMenu("Trợ giúp");
		mnNewMenu_2.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(mnNewMenu_2);

		JMenuItem menuthongtin = new JMenuItem("Thông tin ");
		menuthongtin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Infor infor = new Infor();
				infor.setVisible(true);
			}
		});
		menuthongtin.setIcon(new ImageIcon(mainform.class.getResource("/image/Actions-help-about-icon-16.png")));
		menuthongtin.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F3, InputEvent.ALT_MASK));
		menuthongtin.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mnNewMenu_2.add(menuthongtin);

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 42, 760, 2);
		contentPane.add(separator);

		JButton btdangxuat = new JButton("Đăng xuất");
		btdangxuat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login lg = new Login();
				lg.setVisible(true);
			}
		});
		btdangxuat.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btdangxuat.setIcon(new ImageIcon(mainform.class.getResource("/image/logout-icon-16.png")));
		btdangxuat.setBounds(10, 42, 184, 22);
		contentPane.add(btdangxuat);

		

		

		final JTabbedPane tbpanel = new JTabbedPane(JTabbedPane.TOP);
		tbpanel.setBounds(10, 74, 857, 627);

		JButton btgioithieu = new JButton("Giới thiệu");
		btgioithieu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Infor infor = new Infor();
				infor.setVisible(true);
			}
		});
		btgioithieu.setIcon(new ImageIcon(mainform.class.getResource("/image/Actions-help-about-icon-16.png")));
		btgioithieu.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btgioithieu.setBounds(602, 42, 168, 22);
		contentPane.add(btgioithieu);

		JMenuItem menuquanlydiem = new JMenuItem("Quản lý bảng điểm");
		menuquanlydiem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (mGpaPanel == null) {
					mGpaPanel = new GPAPanel();
					ImageIcon icon = new ImageIcon(getClass()
							.getResource("/polime/app/AppQL/images/10207-man-student-light-skin-tone-icon-16.png"));
					tbpanel.addTab("Quản lý bảng điểm", icon, mGpaPanel, "Quản lý bảng điểm");
				}
				tbpanel.setSelectedComponent(mGpaPanel);
			}

		});
		menuquanlydiem.setIcon(
				new ImageIcon(mainform.class.getResource("/image/Apps-preferences-desktop-user-password-icon-16.png")));
		menuquanlydiem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F2, InputEvent.ALT_MASK));
		menuquanlydiem.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mnNewMenu_1.add(menuquanlydiem);
		contentPane.add(tbpanel);

		JMenuItem menuquanlysinhvien = new JMenuItem("Quản lý sinh viên");
		menuquanlysinhvien.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (mStudentPanel == null) {
					mStudentPanel = new StudentPanel();
					ImageIcon icon = new ImageIcon(getClass()
							.getResource("/polime/app/AppQL/images/10207-man-student-light-skin-tone-icon-16.png"));
					tbpanel.addTab("Quản lý sinh viên", icon, mStudentPanel, "Quản lý sinh viên");
				}
				tbpanel.setSelectedComponent(mStudentPanel);
			}
		});
		
		JButton btquanlysinhvien = new JButton("Quản lý sinh viên");
		btquanlysinhvien.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (mStudentPanel == null) {
					mStudentPanel = new StudentPanel();
					ImageIcon icon = new ImageIcon(getClass()
							.getResource("/polime/app/AppQL/images/10207-man-student-light-skin-tone-icon-16.png"));
					tbpanel.addTab("Quản lý sinh viên", icon, mStudentPanel, "Quản lý sinh viên");
				}
				tbpanel.setSelectedComponent(mStudentPanel);
			}
		});
		btquanlysinhvien.setIcon(new ImageIcon(mainform.class.getResource("/image/Person-Male-Light-icon-16.png")));
		btquanlysinhvien.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btquanlysinhvien.setBounds(204, 42, 189, 22);
		contentPane.add(btquanlysinhvien);
		
		JButton btquanlydiem = new JButton("Quản lý điểm");
		btquanlydiem.setIcon(
				new ImageIcon(mainform.class.getResource("/image/Apps-preferences-desktop-user-password-icon-16.png")));
		btquanlydiem.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btquanlydiem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (mGpaPanel == null) {
					mGpaPanel = new GPAPanel();
					ImageIcon icon = new ImageIcon(getClass()
							.getResource("/polime/app/AppQL/images/10207-man-student-light-skin-tone-icon-16.png"));
					tbpanel.addTab("Quản lý bảng điểm", icon, mGpaPanel, "Quản lý bảng điểm");
				}
				tbpanel.setSelectedComponent(mGpaPanel);
			}
		});
		btquanlydiem.setBounds(403, 42, 189, 22);
		contentPane.add(btquanlydiem);
		
		JSeparator separator_1 = new JSeparator();
		mnNewMenu_1.add(separator_1);
		menuquanlysinhvien.setIcon(new ImageIcon(mainform.class.getResource("/image/Person-Male-Light-icon-16.png")));
		menuquanlysinhvien.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, InputEvent.ALT_MASK));
		menuquanlysinhvien.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mnNewMenu_1.add(menuquanlysinhvien);
	}
}
