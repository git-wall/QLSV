package polime.app.AppQL;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import polime.app.AppQL.dao.SinhVienDao;
import polime.app.AppQL.helper.datavalue;
import polime.app.AppQL.helper.java;
import polime.app.AppQL.model.SinhVien;

public class StudentPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private mainform parentform;
	private JTextField txtsdt;
	private JTextField txtemail;
	private JTextField txthoten;
	private JTextField txtmssv;
	private ButtonGroup a = new ButtonGroup();
	private JTable table;
	private JTextField txtdiachi;

	/**
	 * Create the panel.
	 */
	public StudentPanel() {
		setLayout(null);

		JLabel lblNewLabel = new JLabel("Sinh viên");
		lblNewLabel.setBounds(10, 10, 115, 21);
		lblNewLabel.setIcon(
				new ImageIcon(StudentPanel.class.getResource("/image/10207-man-student-light-skin-tone-icon-24.png")));
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		add(lblNewLabel);

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 38, 647, 13);
		add(separator);

		JLabel lblNewLabel_1 = new JLabel("MSSV");
		lblNewLabel_1.setBounds(36, 65, 45, 13);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Họ & Tên");
		lblNewLabel_2.setBounds(36, 109, 69, 13);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Email");
		lblNewLabel_3.setBounds(36, 150, 45, 13);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("SDT");
		lblNewLabel_4.setBounds(36, 194, 45, 13);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Giới Tính");
		lblNewLabel_5.setBounds(36, 243, 89, 13);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("Địa chỉ");
		lblNewLabel_6.setBounds(36, 292, 45, 13);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(lblNewLabel_6);

		final JRadioButton rdonam = new JRadioButton("Nam");
		rdonam.setBounds(131, 239, 58, 21);
		rdonam.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(rdonam);
		a.add(rdonam);

		final JRadioButton rdonu = new JRadioButton("Nữ");
		rdonu.setBounds(253, 239, 45, 21);
		rdonu.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(rdonu);
		a.add(rdonu);

		txtsdt = new JTextField();
		txtsdt.setBounds(131, 191, 218, 19);
		txtsdt.setColumns(10);
		add(txtsdt);

		txtemail = new JTextField();
		txtemail.setBounds(131, 147, 218, 19);
		txtemail.setColumns(10);
		add(txtemail);

		txthoten = new JTextField();
		txthoten.setBounds(131, 106, 218, 19);
		txthoten.setColumns(10);
		add(txthoten);

		txtmssv = new JTextField();
		txtmssv.setBounds(131, 62, 218, 19);
		txtmssv.setColumns(10);
		add(txtmssv);

		JButton bttimkiem = new JButton("Tìm Kiếm");
		bttimkiem.setBounds(445, 61, 139, 33);
		bttimkiem.setIcon(new ImageIcon(StudentPanel.class.getResource("/image/search-icon-24.png")));
		bttimkiem.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(bttimkiem);

		JButton btluu = new JButton("Lưu");
		btluu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StringBuilder sb = new StringBuilder();
				datavalue.value(txtmssv, sb, "Mã số sinh viên không được để trống !");
				datavalue.value(txthoten, sb, "Họ và tên sinh viên không được để trống !");
				if (sb.length() > 0) {
					java.showerormess(parentform, sb.toString(), "Lỗi");
					return;
				}
				try {
					SinhVien sv = new SinhVien();
					sv.setMaSinhVien(txtmssv.getText());
					sv.setHoTen(txthoten.getText());
					sv.setEmail(txtemail.getText());
					sv.setSDT(txtsdt.getText());
					sv.setGioiTinh(rdonam.isSelected() ? 1 : 0);
					sv.setDiaChi(txtdiachi.getText());
					SinhVienDao dao = new SinhVienDao();
					if (dao.insert(sv)) {
						java.showmess(parentform, "Sinh viên đã được lưu /(^0^)/", "Thông báo");
					} else {
						java.showcomfirmess(parentform, "Sinh viên không lưu được do lỗi kỹ thuật =(", "Cảnh báo !!!");
					}
				} catch (Exception e2) {
					e2.printStackTrace();
					java.showerormess(parentform, e2.getMessage(), "Lỗi");
				}
			}

		});
		btluu.setBounds(445, 166, 139, 33);
		btluu.setIcon(new ImageIcon(StudentPanel.class.getResource("/image/Save-icon.png")));
		btluu.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(btluu);

		JButton btsua = new JButton("Sửa");
		btsua.setBounds(445, 217, 139, 33);
		btsua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StringBuilder sb = new StringBuilder();
				datavalue.value(txtmssv, sb, "Mã số sinh viên không được để trống !");
				datavalue.value(txthoten, sb, "Họ và tên sinh viên không được để trống !");
				if (sb.length() > 0) {
					java.showerormess(parentform, sb.toString(), "Lỗi");
					return;
				}
				if (java.showcomfirmess(parentform, "Bạn có muốn cập nhật sinh viên không ",
						"Hỏi") == JOptionPane.NO_OPTION) {
					return;
				}
				try {
					SinhVien sv = new SinhVien();
					sv.setMaSinhVien(txtmssv.getText());
					sv.setHoTen(txthoten.getText());
					sv.setEmail(txtemail.getText());
					sv.setSDT(txtsdt.getText());
					sv.setGioiTinh(rdonam.isSelected() ? 1 : 0);
					sv.setDiaChi(txtdiachi.getText());
					SinhVienDao dao = new SinhVienDao();
					if (dao.update(sv)) {
						java.showmess(parentform, "Sinh viên đã được cập nhật +)", "Thông báo");
					} else {
						java.showcomfirmess(parentform, "Sinh viên không cập nhật được do lỗi kỹ thuật +(",
								"Cảnh báo !!!");
					}
				} catch (Exception e2) {
					e2.printStackTrace();
					java.showerormess(parentform, e2.getMessage(), "Lỗi");
				}
			}
		});
		btsua.setIcon(new ImageIcon(StudentPanel.class.getResource("/image/Actions-document-edit-icon-16.png")));
		btsua.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(btsua);

		JScrollPane sptable = new JScrollPane();
		sptable.setBounds(25, 366, 592, 130);
		add(sptable);

		table = new JTable();
		sptable.setViewportView(table);

		JButton btnhapmoi = new JButton("Nhập mới");
		btnhapmoi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtmssv.setText("");
				txthoten.setText("");
				txtemail.setText("");
				txtsdt.setText("");
				txtdiachi.setText("");
			}
		});
		btnhapmoi.setBounds(445, 113, 139, 33);
		btnhapmoi.setIcon(new ImageIcon(StudentPanel.class.getResource("/image/new-icon-16.png")));
		btnhapmoi.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(btnhapmoi);

		txtdiachi = new JTextField();
		txtdiachi.setColumns(10);
		txtdiachi.setBounds(131, 290, 218, 51);
		add(txtdiachi);

		JButton btnNewButton = new JButton("Xoa");
		btnNewButton.setBounds(445, 284, 85, 21);
		add(btnNewButton);
	}
}
