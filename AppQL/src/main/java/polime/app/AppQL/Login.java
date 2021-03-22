package polime.app.AppQL;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import polime.app.AppQL.dao.NguoiDungDao;
import polime.app.AppQL.helper.datavalue;
import polime.app.AppQL.helper.java;
import polime.app.AppQL.model.NguoiDung;

import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtusername;
	private JPasswordField txtpassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Login dialog = new Login();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Login() {
		setBounds(100, 100, 548, 302);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.GRAY);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Tên đăng nhập");
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(242, 28, 198, 24);
		contentPanel.add(lblNewLabel);

		txtusername = new JTextField();
		txtusername.setBounds(242, 62, 217, 31);
		contentPanel.add(txtusername);
		txtusername.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Mật khẩu");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(242, 103, 198, 24);
		contentPanel.add(lblNewLabel_1);

		JButton btlogout = new JButton("Thoát");
		btlogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btlogout.setIcon(new ImageIcon(Login.class.getResource("/image/logout-icon-16.png")));
		btlogout.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btlogout.setBounds(386, 210, 120, 24);
		contentPanel.add(btlogout);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBackground(Color.CYAN);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setIcon(new ImageIcon(Login.class.getResource("/image/Student-3-icon.png")));
		lblNewLabel_2.setBounds(56, 38, 133, 165);
		contentPanel.add(lblNewLabel_2);
		final JButton btlogin = new JButton("Đăng nhập");
		btlogin.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				StringBuilder sb = new StringBuilder();
				datavalue.value(txtusername, sb,
						"Năm nay 21 tuổi, chưa gặp cái trường hợp để trống tài khoản bao giờ cả");
				datavalue.value(txtpassword, sb,
						"Năm nay 21 tuổi, chưa gặp cái trường hợp để trống mật khẩu bao giờ cả");
				if (sb.length() > 0) {
					java.showerormess(btlogin, sb.toString(), "Lỗi rồi nha !!!");
					return;
				}
				NguoiDungDao dao = new NguoiDungDao();
				try {
					NguoiDung nd = dao.checklogin(txtusername.getText(), new String(txtpassword.getPassword()));
					if (nd == null) {
						java.showerormess(btlogin, "Tên đăng nhập hoặc mật khẩu sai", "Lỗi");
					} else {
						mainform a = new mainform();
						a.setVisible(true);
					}
				} catch (Exception e2) {
					e2.printStackTrace();
					java.showerormess(btlogin, e2.getMessage(), "Lỗi");
				}
			}
		});
		btlogin.setIcon(new ImageIcon(Login.class.getResource("/image/Login-icon-16.png")));
		btlogin.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btlogin.setBounds(228, 210, 140, 24);
		contentPanel.add(btlogin);

		txtpassword = new JPasswordField();
		txtpassword.setBounds(242, 144, 217, 24);
		contentPanel.add(txtpassword);
	}
}
