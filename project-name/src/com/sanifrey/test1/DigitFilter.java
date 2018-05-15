/**
* Устанавливаем принадлежность класса к пакету
 */
package com.sanifrey.test1;

/**
 * Подключаем библиотеку для работы с графическим интерфейсом
 */
import javax.swing.JTextField;

/**
 * Подключаем библиотеку для работы с набором уникальных атрибутов
 */
import javax.swing.text.AttributeSet;
/**
 * Подключаем библиотеку для исключения попытки
 * сослаться на расположение, которое не существует.
 */
import javax.swing.text.BadLocationException;
/**
 * Подключаем библиотеку для работы с простым документом
 */
import javax.swing.text.PlainDocument;

/**
 * Объявляем класс с модификатором public
 */
public class DigitFilter {
	
	/**
	 * Метод TextFilter, который принимает на вход
	 * два параметра TextField и length(длина строки)
	 * для ограничения вводимых символов в поле ввода.
	 */
	private static void TextFilter(JTextField TextField, final int length) {
		/**
		 * Вставляем фильтр вводимых символов
		 */
		TextField.setDocument(new PlainDocument() {
			String chars = "0123456789.";
			/**
			 * Операции занесения текста в документ методом insertString().
			 * Для защиты метода от исключений используем список
			 * исключений(BadLocationException).
			 */
			public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
				/**
				 * Проверка отсутствие пустой строки
				 */
				if (chars.indexOf(str) != -1) {
					/**
					 * Проверка длины введённых символов
					 */
					if (getLength() < length) {
						/**
						 * Ввод символов
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