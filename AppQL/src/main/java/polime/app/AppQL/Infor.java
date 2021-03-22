package polime.app.AppQL;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Infor extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Infor dialog = new Infor();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Infor() {
		setBounds(100, 100, 550, 354);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel_1 = new JLabel("Quản lý sinh viên");
			lblNewLabel_1.setForeground(Color.BLUE);
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
			lblNewLabel_1.setBounds(110, 22, 280, 61);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Đơn vị : Sinh viên");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.ITALIC, 20));
			lblNewLabel_2.setBounds(110, 93, 233, 35);
			contentPanel.add(lblNewLabel_2);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("Trường đại học công nghệ-Hutech");
			lblNewLabel_3.setFont(new Font("Tahoma", Font.ITALIC, 20));
			lblNewLabel_3.setBounds(110, 138, 337, 21);
			contentPanel.add(lblNewLabel_3);
		}

		{
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(
					new ImageIcon(Infor.class.getResource("/polime/app/AppQL/images/Person-Male-Light-icon-48.png")));
			lblNewLabel.setBounds(21, 102, 85, 110);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_4 = new JLabel("Người sáng lập : Nguyễn Văn Thành");
			lblNewLabel_4.setFont(new Font("Tahoma", Font.ITALIC, 20));
			lblNewLabel_4.setBounds(110, 187, 323, 25);
			contentPanel.add(lblNewLabel_4);
		}
		{
			JSeparator separator = new JSeparator();
			separator.setBounds(110, 126, 337, 2);
			contentPanel.add(separator);
		}
		{
			JSeparator separator = new JSeparator();
			separator.setBounds(110, 165, 337, 12);
			contentPanel.add(separator);
		}
		{
			JSeparator separator = new JSeparator();
			separator.setBounds(110, 222, 337, 2);
			contentPanel.add(separator);
		}
		{
			final JButton btnNewButton = new JButton("Đóng");
			btnNewButton.addActionListener(new ActionListener() {
				@SuppressWarnings("deprecation")
				public void actionPerformed(ActionEvent e) {
					btnNewButton.disable();
				}
			});
			btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
			btnNewButton.setIcon(
					new ImageIcon(Infor.class.getResource("/polime/app/AppQL/images/Actions-edit-delete-icon-48.png")));
			btnNewButton.setBounds(358, 246, 142, 42);
			contentPanel.add(btnNewButton);
		}

	}

}
