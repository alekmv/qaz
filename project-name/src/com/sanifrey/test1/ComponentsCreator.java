/**
 * ������������� �������������� ������ � ������
 */
package com.sanifrey.test1;
/**
 * ���������� ���������� ��� ������ � ����������� �����������
 */
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ComponentsCreator {
	/**
	 * ��������� ������ JFrame
	 */
	private JFrame plframe;
	
	/**
	 * �������� �����������
	 */
	public ComponentsCreator(JFrame frame) {
		this.plframe = frame;
	}

	/**
	 * ��������� ����� ��� �������� ������������� ���� (JTextField).
	 * 1-�� �������� - ��� ������ textField'� �������� ��������� ���������.
	 * 2-�� �������� - ��������� �� �������������.
	 * 3-�� �������� - ���������� ���������� �� ��� X.
	 * 4-�� �������� - ���������� ���������� �� ��� Y.
	 * 5-�� �������� - ������.
	 * 6-�� �������� - �����.
		
	 */
	private void JTextFieldSettings(JTextField textField, boolean bool, int x, int y, int xw, int yh) {
		
		/**
		 * ������� setBounds ��������� ����� ���������� ��� textField.
		 * ������ ���������� 4 ��������: ������ �����, ������ ������, ����� ����������, ������ ����������.
		 */
		textField.setBounds(x, y, xw, yh);
		
		/**
		 * ������� setColumns ��������� �������� ����� ������ ���� 10.
		 */
		textField.setColumns(10);
		/**
		 * ���������� ��� ������ �� �������������� ����.
		 * bool - ����������, ������� ����� ��������� ��������: true ��� false.
		 * ��� �������� true - �������������� ���������.
		 * ��� �������� false - �������������� ���������.
		 */
		textField.setEditable(bool);
		/**
		 * ��������� ��������� �� ������
		 */
		plframe.getContentPane().add(textField);
		/**
		 * ���� �������������� ���� ����������, �� ���������� "������ ������".
		 */
		if (bool == true)
			/**
			 * ��� ���� ����� textField �������� �������� ������������ �����: 9.
			 */
			DigitFilter.PTextFilter(textField, 9);
	}
	
	/**
	 * ��������� ����� ��� ������������� label-��.
	 * 	 * 1-�� �������� - ��� ������ label'� �������� ��������� ���������.
		 * 2-�� �������� - ��� ����� �������� ���� label'��.
		 * 3-�� �������� - ���������� ���������� �� ��� X.
		 * 4-�� �������� - ���������� ���������� �� ��� Y.
		 * 5-�� �������� - ������.
		 * 6-�� �������� - �����.
	 */
	private void JLabelSettings(JLabel label, String text, int x, int y, int xw, int yh) {
		
		/**
		 * ������� setBounds ��������� ����� ���������� ��� label.
		 * ������ ���������� 4 ��������: ������ �����, ������ ������, ����� ����������, ������ ����������.
		 */
		label.setBounds(x, y, xw, yh);
		/**
		 * ��������� ����� ��� label
		 */
		label.setText(text);
		/**
		 * ��������� ��������� �� ������
		 */
		plframe.getContentPane().add(label);
	}
	
	/**
	 * ��������� ����� ��� ������������� ������(JButton).
	 * 	 * 1-�� �������� - ��� ������ button'� �������� ��������� ���������.
		 * 2-�� �������� - ��� ����� �������� � ���� ������.
		 * 3-�� �������� - ���������� ���������� �� ��� X.
		 * 4-�� �������� - ���������� ���������� �� ��� Y.
		 * 5-�� �������� - ������.
		 * 6-�� �������� - �����.
	 */
	private void JButtonSettings(JButton button, String text, int x, int y, int xw, int yh) {
		/**
		 * ������� setBounds ��������� ����� ���������� ��� button.
		 * ������ ���������� 4 ��������: ������ �����, ������ ������, ����� ����������, ������ ����������.
		 */
		button.setBounds(x, y, xw, yh);
		/**
		 * ��������� ����� ��� button.
		 */
		button.setText(text);
		/**
		 * ��������� ��������� �� ������
		 */
		plframe.getContentPane().add(button);
	}

	/**
	 * ��������� ����� PJTextFieldSettings ��� ������ ���������� ������ JTextFieldSettings
	 */
	public void PJTextFieldSettings(JTextField textField, boolean bool, int x, int y, int xw, int yh) {
		JTextFieldSettings(textField, bool, x, y, xw, yh);
	}

	/**
	 * ��������� ����� PJLabelSettings ��� ������ ���������� ������ JLabelSettings
	 */
	public void PJLabelSettings(JLabel label, String text, int x, int y, int xw, int yh) {
		JLabelSettings(label, text, x, y, xw, yh);
	}

	/**
	 * ��������� ����� PJButtonSettings ��� ������ ���������� ������ JButtonSettings
	 */
	public void PJButtonSettings(JButton button, String text, int x, int y, int xw, int yh) {
		JButtonSettings(button, text, x, y, xw, yh);
	}
}