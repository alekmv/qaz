/**
 * Устанавливаем принадлежность класса к пакету
 */
package com.sanifrey.test1;
/**
 * Подключаем библиотеку для работы с графическим интерфейсом
 */
import javax.swing.JFrame;

public class PanelCreator {
	/**
	 * Приватный метод для создания и указания параметров панели
	 */
	private void CreatePanel(JFrame frame, boolean arg, String Title) {
		/**
		 * Отображаем окно
		 */
		frame.setVisible(arg);
		/**
		 * Устанавливаем название окна
		 */
		frame.setTitle(Title);
		/**
		 * Указываем координаты верхней левой вершины окна, а также его ширину и высоту.
		 */
		frame.setBounds(100, 100, 480, 313);
		/**
		 * Указываем операцию, которая будет произведена при закрытии окна.
		 */
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/**
		 * Устанавливаем менеджер NullLayout для самостоятельного расположения элементов
		 */
		frame.getContentPane().setLayout(null);
		/**
		 * Запрет на изменение размера окна
		 */
		frame.setResizable(false);
	}
	/**
	 * Публичный метод для вызова приватного метода
	 */
	public void PCreatePanel(JFrame frame, boolean arg, String Title) {
		CreatePanel(frame, arg, Title);
	}
}