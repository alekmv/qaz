/**
 * Устанавливаем принадлежность класса к пакету
 */
package com.sanifrey.test1;
/**
 * Подключаем библиотеку для работы с графическим интерфейсом
 */
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ComponentsCreator {
	/**
	 * Экземпляр класса JFrame
	 */
	private JFrame plframe;
	
	/**
	 * Вызываем конструктор
	 */
	public ComponentsCreator(JFrame frame) {
		this.plframe = frame;
	}

	/**
	 * Приватный метод для указания характеристик поля (JTextField).
	 * 1-ый параметр - Для какого textField'а задаются следующие параметры.
	 * 2-ой параметр - Разрешено ли редактировать.
	 * 3-ий параметр - Координата размещения по оси X.
	 * 4-ый параметр - Координата размещения по оси Y.
	 * 5-ый параметр - Ширина.
	 * 6-ой параметр - Длина.
		
	 */
	private void JTextFieldSettings(JTextField textField, boolean bool, int x, int y, int xw, int yh) {
		
		/**
		 * Методом setBounds указываем точно размещения для textField.
		 * Методу передаются 4 значения: отступ слева, отступ сверху, длина компонента, высота компонента.
		 */
		textField.setBounds(x, y, xw, yh);
		
		/**
		 * Методом setColumns указываем значение длины строки поля 10.
		 */
		textField.setColumns(10);
		/**
		 * Разрешение или запрет на редактирование поля.
		 * bool - переменная, которая может принимать значения: true или false.
		 * При значении true - редактирование разрешено.
		 * При значении false - редактирование запрещено.
		 */
		textField.setEditable(bool);
		/**
		 * Добавляем компонент на панель
		 */
		plframe.getContentPane().add(textField);
		/**
		 * Если редактирование поле подключено, то подключить "фильтр текста".
		 */
		if (bool == true)
			/**
			 * Для поля ввода textField передаем значение максимальной длины: 9.
			 */
			DigitFilter.PTextFilter(textField, 9);
	}
	
	/**
	 * Приватный метод для характеристик label-ов.
	 * 	 * 1-ый параметр - Для какого label'а задаются следующие параметры.
		 * 2-ой параметр - Что будет показано этим label'ом.
		 * 3-ий параметр - Координата размещения по оси X.
		 * 4-ый параметр - Координата размещения по оси Y.
		 * 5-ый параметр - Ширина.
		 * 6-ой параметр - Длина.
	 */
	private void JLabelSettings(JLabel label, String text, int x, int y, int xw, int yh) {
		
		/**
		 * Методом setBounds указываем точно размещения для label.
		 * Методу передаются 4 значения: отступ слева, отступ сверху, длина компонента, высота компонента.
		 */
		label.setBounds(x, y, xw, yh);
		/**
		 * Указываем текст для label
		 */
		label.setText(text);
		/**
		 * Добавляем компонент на панель
		 */
		plframe.getContentPane().add(label);
	}
	
	/**
	 * Приватный метод для характеристик кнопок(JButton).
	 * 	 * 1-ый параметр - Для какого button'а задаются следующие параметры.
		 * 2-ой параметр - Что будет написано в этой кнопке.
		 * 3-ий параметр - Координата размещения по оси X.
		 * 4-ый параметр - Координата размещения по оси Y.
		 * 5-ый параметр - Ширина.
		 * 6-ой параметр - Длина.
	 */
	private void JButtonSettings(JButton button, String text, int x, int y, int xw, int yh) {
		/**
		 * Методом setBounds указываем точно размещения для button.
		 * Методу передаются 4 значения: отступ слева, отступ сверху, длина компонента, высота компонента.
		 */
		button.setBounds(x, y, xw, yh);
		/**
		 * Указываем текст для button.
		 */
		button.setText(text);
		/**
		 * Добавляем компонент на панель
		 */
		plframe.getContentPane().add(button);
	}

	/**
	 * Публичный метод PJTextFieldSettings для вызова приватного метода JTextFieldSettings
	 */
	public void PJTextFieldSettings(JTextField textField, boolean bool, int x, int y, int xw, int yh) {
		JTextFieldSettings(textField, bool, x, y, xw, yh);
	}

	/**
	 * Публичный метод PJLabelSettings для вызова приватного метода JLabelSettings
	 */
	public void PJLabelSettings(JLabel label, String text, int x, int y, int xw, int yh) {
		JLabelSettings(label, text, x, y, xw, yh);
	}

	/**
	 * Публичный метод PJButtonSettings для вызова приватного метода JButtonSettings
	 */
	public void PJButtonSettings(JButton button, String text, int x, int y, int xw, int yh) {
		JButtonSettings(button, text, x, y, xw, yh);
	}
}