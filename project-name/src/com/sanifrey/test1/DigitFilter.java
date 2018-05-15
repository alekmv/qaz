/**
* ������������� �������������� ������ � ������
 */
package com.sanifrey.test1;

/**
 * ���������� ���������� ��� ������ � ����������� �����������
 */
import javax.swing.JTextField;

/**
 * ���������� ���������� ��� ������ � ������� ���������� ���������
 */
import javax.swing.text.AttributeSet;
/**
 * ���������� ���������� ��� ���������� �������
 * ��������� �� ������������, ������� �� ����������.
 */
import javax.swing.text.BadLocationException;
/**
 * ���������� ���������� ��� ������ � ������� ����������
 */
import javax.swing.text.PlainDocument;

/**
 * ��������� ����� � ������������� public
 */
public class DigitFilter {
	
	/**
	 * ����� TextFilter, ������� ��������� �� ����
	 * ��� ��������� TextField � length(����� ������)
	 * ��� ����������� �������� �������� � ���� �����.
	 */
	private static void TextFilter(JTextField TextField, final int length) {
		/**
		 * ��������� ������ �������� ��������
		 */
		TextField.setDocument(new PlainDocument() {
			String chars = "0123456789.";
			/**
			 * �������� ��������� ������ � �������� ������� insertString().
			 * ��� ������ ������ �� ���������� ���������� ������
			 * ����������(BadLocationException).
			 */
			public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
				/**
				 * �������� ���������� ������ ������
				 */
				if (chars.indexOf(str) != -1) {
					/**
					 * �������� ����� �������� ��������
					 */
					if (getLength() < length) {
						/**
						 * ���� ��������
						 */
						super.insertString(offs, str, a);
					}
				}
			}
		});
	}
	public static void PTextFilter(JTextField TextField, final int length) {
		TextFilter(TextField,length);
	}
	
}