package polime.app.AppQL;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.ImageIcon;

public class GPAPanel extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public GPAPanel() {
		setLayout(null);

		JLabel lblNewLabel = new JLabel("Sinh viên");
		lblNewLabel.setIcon(new ImageIcon(
				GPAPanel.class.getResource("/polime/app/AppQL/images/10207-man-student-light-skin-tone-icon-24.png")));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(37, 21, 118, 29);
		add(lblNewLabel);

		JSeparator separator = new JSeparator();
		separator.setBounds(37, 64, 555, 13);
		add(separator);

		JLabel lblNewLabel_1 = new JLabel("Mã số sinh viên");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(37, 73, 132, 16);
		add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(231, 70, 140, 19);
		add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("Tìm kiếm");
		btnNewButton.setIcon(new ImageIcon(GPAPanel.class.getResource("/polime/app/AppQL/images/search-icon-24.png")));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(460, 69, 128, 29);
		add(btnNewButton);

		JLabel lblNewLabel_2 = new JLabel("Mã sinh viên");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(37, 112, 106, 16);
		add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("Tiếng anh");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(37, 209, 81, 13);
		add(lblNewLabel_2_1);

		JLabel lblNewLabel_1_1 = new JLabel("Họ tên");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(37, 160, 81, 16);
		add(lblNewLabel_1_1);

		JLabel lblNewLabel_2_2 = new JLabel("Văn");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_2.setBounds(37, 304, 151, 19);
		add(lblNewLabel_2_2);

		JLabel lblNewLabel_1_2 = new JLabel("Toán");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(37, 255, 118, 19);
		add(lblNewLabel_1_2);

		textField_1 = new JTextField();
		textField_1.setBounds(231, 113, 140, 19);
		add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_2_3 = new JLabel("DTB");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_3.setBounds(486, 198, 87, 35);
		add(lblNewLabel_2_3);

		JLabel lblNewLabel_1_4 = new JLabel("9.5");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_4.setBounds(486, 258, 45, 13);
		add(lblNewLabel_1_4);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(231, 208, 140, 19);
		add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(231, 160, 140, 19);
		add(textField_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(231, 306, 140, 19);
		add(textField_4);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(231, 257, 140, 19);
		add(textField_5);

		JButton btnhapmoi = new JButton("Nhập mới");
		btnhapmoi.setIcon(new ImageIcon(GPAPanel.class.getResource("/polime/app/AppQL/images/new-icon-16.png")));
		btnhapmoi.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnhapmoi.setBounds(51, 350, 118, 29);
		add(btnhapmoi);

		JButton btluu = new JButton("Lưu");
		btluu.setIcon(new ImageIcon(GPAPanel.class.getResource("/polime/app/AppQL/images/Save-icon.png")));
		btluu.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btluu.setBounds(212, 350, 96, 29);
		add(btluu);

		JButton btxoa = new JButton("Xóa");
		btxoa.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btxoa.setIcon(
				new ImageIcon(GPAPanel.class.getResource("/polime/app/AppQL/images/Actions-edit-delete-icon-16.png")));
		btxoa.setBounds(471, 350, 96, 29);
		add(btxoa);

		JButton btsua = new JButton("Sửa");
		btsua.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btsua.setIcon(new ImageIcon(
				GPAPanel.class.getResource("/polime/app/AppQL/images/Actions-document-edit-icon-16.png")));
		btsua.setBounds(337, 350, 96, 29);
		add(btsua);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(37, 400, 535, 119);
		add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(37, 338, 556, 2);
		add(separator_1);

	}
}
