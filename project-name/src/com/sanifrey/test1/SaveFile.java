/**
 * ������������� �������������� ������ � ������
 */
package com.sanifrey.test1;

/**
 * ��������� ���������� ��� ���������� ��������������� �����
 */
import java.io.FileNotFoundException;
/**
 * ��������� ���������� ��� ���������� �����
 */
import java.io.PrintWriter;
/**
 * ���������� ���������� ��� ������ � ����������� ������
 */
import javax.swing.JOptionPane;

/**
 * ��������� ����� � ������������� public
 */
public class SaveFile {
	/**
	 * ����� SaveInFile ��� ���������� ����������� ������� � ���� "Results.txt".
	 */
	private void SaveInFile() {
		/**
		 * ��������� ������������ ����� ����, ��� ����� ��������� ������, ��� ������
		 * ���������� try
		 */
		int i;
		Objects[] obj = Formula.getObj();
		try {
			/**
			 * ������� ��������� ���������� ������
			 */
			PrintWriter writer = new PrintWriter("Results.txt");
			/**
			 * ���������� ����� ���������� � ������� � ����: -����� ������� �������
			 * -��������� ������� � �������
			 */
			writer.println("=======================\n" + "\nTOTAL AREA: " + Formula.getAllArea() + ";\nFREE AREA: "
					+ Formula.getFreeArea() + ";\nObjects: "+ Formula.getAmount());
			/**
			 * ����� ���������� �� ������� �������
			 */
			for (i = 1; i < Formula.getAmount() + 1; i++) {
				writer.println("=======================\n" + "\nObject �" + i + ";\nwidth:" + obj[i].getWidth()
						+ ";\nlength:" + obj[i].getLength() + ";\nOccupies Area:" + obj[i].getArea());
			}

			/**
			 * ��������� ������ � ������ � ��������� �������� �����.
			 */
			writer.close();
			/**
			 * ���������� ���� � ����������� �� �������� ����������
			 */
			JOptionPane.showMessageDialog(null, "���������� ��������� �������");
		}
		/**
		 * ���������� catch
		 */
		catch (FileNotFoundException e) {
			/**
			 * ������������ ���������� ���� FileNotFoundException e
			 */
			e.printStackTrace();
		}
	}

	/**
	 * ��������� ����� ��� ������ SaveInFile
	 */
	public void PSaveInFile() {
		SaveInFile();
	}
}