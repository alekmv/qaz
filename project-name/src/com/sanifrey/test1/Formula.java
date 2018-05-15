/**
 * ������������� �������������� ������ � ������
 */
package com.sanifrey.test1;

import javax.swing.JOptionPane;

/**
 * ��������� ����� � ������������� public
 */
public class Formula {	
	/**
	 * ��������� ��������� ����������� ����������. FreeArea - �������� ���������
	 * ������� � �������. AllArea - �������� ���� ������� �������.
	 * Amount - ���������� ��������. Obj - �������� ������. 
	 * number - ����������, ������� ���������� ����� ������� � ������� ��������� �������
	 */
	private static float FreeArea;
	private static float AllArea;
	private static int Amount = 0;
	private static Objects[] Obj = new Objects[1024];
	private int number=1;
	/**
	 * ��������� ����� ��� ������� ��������� ������� � �������
	 * 
	 */
	private String AddObject(float width, float length) {
		/**
		 * ��������� ���� �� ������� ��������
		 */
		if (width != 0.0 && length != 0.0) {
			/**
			 * ��������� � ������� ����������, ��� �������� ������
			 */
			Amount += 1;
			/**
			 * ������ ��������� ������
			 */
			Obj[Amount] = new Objects();
			/**
			 * ������������� ��� ������� �������� ����������� �������� �����
			 */
			Obj[Amount].setArea(width * length);
			/**
			 * ������������� ��� ������� �������� ������ �������
			 */
			Obj[Amount].setWidth(width);
			/**
			 * ������������� ��� ������� �������� ����� �������
			 */
			Obj[Amount].setLength(length);
		} else {
			/**
			 * ���� ���� ��������� �������� ����������, �� �������� ���������� ����
			 */
			JOptionPane.showMessageDialog(null, "��������� ���� ���������� ����������!");
		}
		/**
		 * ���������� �������� Amount
		 */
		return String.valueOf(Amount);
	}
	
	/**
	 * ��������� ����� ��� ��������� ��������(�������� ��������)
	 */
	private String DeleteObjects() {
		/**
		 * �������� �������
		 */
		Amount = 0;
		/**
		 * ���������� FreeArea ����������� �������� AllArea, �� ������� ��������� � ��������� ������� ���������� ����� ����� ������������ � �������.
		 */
		FreeArea = AllArea;
		/**
		 * ���������� �������� ���������� �������� ����� ���������
		 */
		return String.valueOf(Amount);
	}

	/**
	 * ��������� ������ ��������� ������� � �������
	 */
	private String FormulaFree(float area) {
		/**
		 * AllArea ����������� �������� area
		 */
		AllArea = area;
		FreeArea = AllArea;
		/**
		 * ������ ��������� ������� � �������
		 */
		for (number = 1; number < Amount+1; number++) {
			FreeArea = FreeArea - Obj[number].getArea();
		}
		/**
		 * ���� �������� ��������� �������(FreeArea) � ������� ������ ����(��� ��������
		 * ���������� �������), �� ����������� �������� ��������� �������(FreeArea) �
		 * ����.
		 */
		if (FreeArea < 0)
			FreeArea = 0;
		/**
		 * ���������� �������� ��������� �������
		 */
		return String.valueOf(FreeArea);
	}

	/**
	 * ��������� ����� ��� ������ ���������� ������ FormulaFree.
	 */
	public String PFormula(String area) {
		/**
		 * ��������� ������������ ����� ����, ��� ����� ��������� ������, ��� ������
		 * ���������� try
		 */
		try {
			FormulaFree(Float.parseFloat(area));
		} 
		/**
		 * ���������� catch
		 */
		catch (Exception e) {
			/**
			 * ������������ ���������� ���� Exception e
			 */
			JOptionPane.showMessageDialog(null, "������ � ������� ��������� �������! \n���� ��������� �������!");
		}
		/**
		 * ���������� �������� ��������� �������
		 */
		return String.valueOf(FreeArea);

	}

	/**
	 * ������ ��� ��������� �������� ��������� ������� � �������.
	 */
	public static float getFreeArea() {
		return FreeArea;
	}

	/**
	 * ������ ��� ��������� �������� ���� ������� � �������.
	 */
	public static float getAllArea() {
		return AllArea;
	}
	
	/**
	 * ��������� ����� ��� ���������� ��������
	 */
	public String PublicAddObject(String width, String length) {
		/**
		 * ��������� ������������ ����� ����, ��� ����� ��������� ������, ��� ������
		 * ���������� try
		 */
		try {
			/**
			 * �������� ����� ��� ���������� ��������
			 */
			AddObject(Float.parseFloat(width), Float.parseFloat(length));
		} 
		/**
		 * ���������� catch
		 */
		catch (Exception e) {
			/**
			 * ������������ ���������� ���� Exception e
			 */
			JOptionPane.showMessageDialog(null, "������ �� ����� ���������� �������! \n���� ��������� �������!");
		}
		/**
		 * ���������� �������� ���������� ��������
		 */
		return String.valueOf(Amount);

	}

	/**
	 * ��������� ����� ��� �������� ��������, ����� ��� ������ ���������� ������
	 */
	public String PublicDeleteObjects() {
		return DeleteObjects();
	}
	/**
	 * ������ ��� ��������� Obj
	 */
	public static Objects[] getObj1() {
		return Obj;

	}
	/**
	 * ������ ��� ��������� �������� Amount
	 */
	public static int getAmount() {
		return Amount;
	}

	public static Objects[] getObj() {
		// TODO Auto-generated method stub
		return null;
	}

}