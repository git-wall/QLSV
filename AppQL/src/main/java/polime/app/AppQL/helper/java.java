package polime.app.AppQL.helper;

import java.awt.Component;

import javax.swing.JOptionPane;

public class java {
	public static void showmess(Component parent, String content, String title) {
		JOptionPane.showMessageDialog(parent, content, title, JOptionPane.INFORMATION_MESSAGE);
	}

	public static void showerormess(Component parent, String content, String title) {
		JOptionPane.showMessageDialog(parent, content, title, JOptionPane.ERROR_MESSAGE);
	}

	public static int showcomfirmess(Component parent, String content, String title) {
		int choose = JOptionPane.showConfirmDialog(parent, content, title, JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE);
		return choose;
	}
}
