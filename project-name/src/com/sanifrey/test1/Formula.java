/**
 * Устанавливаем принадлежность класса к пакету
 */
package com.sanifrey.test1;

import javax.swing.JOptionPane;

/**
 * Объявляем класс с модификатором public
 */
public class Formula {	
	/**
	 * Объявляем приватные статические переменные. FreeArea - значение свободной
	 * площади в комнате. AllArea - значение всей площади комнаты.
	 * Amount - Количество объектов. Obj - экземляр класса. 
	 * number - переменная, которая обозначает номер объекта в расчёте свободной площади
	 */
	private static float FreeArea;
	private static float AllArea;
	private static int Amount = 0;
	private static Objects[] Obj = new Objects[1024];
	private int number=1;
	/**
	 * Приватный метод для расчёта свободной площади в комнате
	 * 
	 */
	private String AddObject(float width, float length) {
		/**
		 * Проверяем поля на нулевые значения
		 */
		if (width != 0.0 && length != 0.0) {
			/**
			 * добавляем в счётчик информацию, что добавлен объект
			 */
			Amount += 1;
			/**
			 * Создаём экземпляр класса
			 */
			Obj[Amount] = new Objects();
			/**
			 * Устанавливаем для объекта значение занимаемого объектом места
			 */
			Obj[Amount].setArea(width * length);
			/**
			 * Устанавливаем для объекта значение ширины объекта
			 */
			Obj[Amount].setWidth(width);
			/**
			 * Устанавливаем для объекта значение длины объекта
			 */
			Obj[Amount].setLength(length);
		} else {
			/**
			 * Если поля заполнены нулевыми значениями, то появится диалоговое окно
			 */
			JOptionPane.showMessageDialog(null, "Заполните поля ненулевыми значениями!");
		}
		/**
		 * Возвращаем значение Amount
		 */
		return String.valueOf(Amount);
	}
	
	/**
	 * Приватный метод для обнуления счётчика(удаления объектов)
	 */
	private String DeleteObjects() {
		/**
		 * Обнуляем счётчик
		 */
		Amount = 0;
		/**
		 * Переменной FreeArea присваиваем значение AllArea, тк счётчик обнулился и свободная площадь становится равна всему пространтсву в комнате.
		 */
		FreeArea = AllArea;
		/**
		 * Возвращаем значение количества объектов после обнуления
		 */
		return String.valueOf(Amount);
	}

	/**
	 * Выполняем расчёт свободной площади в комнате
	 */
	private String FormulaFree(float area) {
		/**
		 * AllArea присваиваем значение area
		 */
		AllArea = area;
		FreeArea = AllArea;
		/**
		 * Расчёт свободное площади в комнате
		 */
		for (number = 1; number < Amount+1; number++) {
			FreeArea = FreeArea - Obj[number].getArea();
		}
		/**
		 * Если значение свободной площади(FreeArea) в комнате меньше нуля(что является
		 * логической ошибкой), то присваиваем значение свободной площади(FreeArea) к
		 * нулю.
		 */
		if (FreeArea < 0)
			FreeArea = 0;
		/**
		 * Возвращаем значение свободной площади
		 */
		return String.valueOf(FreeArea);
	}

	/**
	 * Публичный метод для вызова приватного метода FormulaFree.
	 */
	public String PFormula(String area) {
		/**
		 * Выполняем отслеживание блока кода, где может произойти ошибка, при помощи
		 * исключения try
		 */
		try {
			FormulaFree(Float.parseFloat(area));
		} 
		/**
		 * Исключение catch
		 */
		catch (Exception e) {
			/**
			 * Обрабатываем исключение типа Exception e
			 */
			JOptionPane.showMessageDialog(null, "Ошибка в расчёте свободной площади! \nПоля заполнены неверно!");
		}
		/**
		 * Возвращаем значение свободной площади
		 */
		return String.valueOf(FreeArea);

	}

	/**
	 * Геттер для получения значения свободной площади в комнате.
	 */
	public static float getFreeArea() {
		return FreeArea;
	}

	/**
	 * Геттер для получения значения всей площади в комнате.
	 */
	public static float getAllArea() {
		return AllArea;
	}
	
	/**
	 * Публичный метод для добавления объектов
	 */
	public String PublicAddObject(String width, String length) {
		/**
		 * Выполняем отслеживание блока кода, где может произойти ошибка, при помощи
		 * исключения try
		 */
		try {
			/**
			 * Вызываем метод для добавления объектов
			 */
			AddObject(Float.parseFloat(width), Float.parseFloat(length));
		} 
		/**
		 * Исключение catch
		 */
		catch (Exception e) {
			/**
			 * Обрабатываем исключение типа Exception e
			 */
			JOptionPane.showMessageDialog(null, "Ошибка во время добавления объекта! \nПоля заполнены неверно!");
		}
		/**
		 * Возвращаем значение количества объектов
		 */
		return String.valueOf(Amount);

	}

	/**
	 * Публичный метод для удаления объектов, нужен для вызова приватного метода
	 */
	public String PublicDeleteObjects() {
		return DeleteObjects();
	}
	/**
	 * Геттер для получения Obj
	 */
	public static Objects[] getObj1() {
		return Obj;

	}
	/**
	 * Геттер для получения значение Amount
	 */
	public static int getAmount() {
		return Amount;
	}

	public static Objects[] getObj() {
		// TODO Auto-generated method stub
		return null;
	}

}