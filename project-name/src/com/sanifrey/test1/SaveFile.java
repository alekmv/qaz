/**
 * Устанавливаем принадлежность класса к пакету
 */
package com.sanifrey.test1;

/**
 * Добавляем библиотеку для исключения несуществующего файла
 */
import java.io.FileNotFoundException;
/**
 * Добавляем библиотеку для сохранения файла
 */
import java.io.PrintWriter;
/**
 * Подключаем библиотеку для работы с диалоговыми окнами
 */
import javax.swing.JOptionPane;

/**
 * Объявляем класс с модификатором public
 */
public class SaveFile {
	/**
	 * Метод SaveInFile для сохранения результатов расчёта в файл "Results.txt".
	 */
	private void SaveInFile() {
		/**
		 * Выполняем отслеживание блока кода, где может произойти ошибка, при помощи
		 * исключения try
		 */
		int i;
		Objects[] obj = Formula.getObj();
		try {
			/**
			 * Создаем экземпляр указанного класса
			 */
			PrintWriter writer = new PrintWriter("Results.txt");
			/**
			 * Записываем общую информацию о комнате в файл: -Общая площадь комнаты
			 * -Незанятая площадь в комнате
			 */
			writer.println("=======================\n" + "\nTOTAL AREA: " + Formula.getAllArea() + ";\nFREE AREA: "
					+ Formula.getFreeArea() + ";\nObjects: "+ Formula.getAmount());
			/**
			 * Вывод информации по каждому объекту
			 */
			for (i = 1; i < Formula.getAmount() + 1; i++) {
				writer.println("=======================\n" + "\nObject №" + i + ";\nwidth:" + obj[i].getWidth()
						+ ";\nlength:" + obj[i].getLength() + ";\nOccupies Area:" + obj[i].getArea());
			}

			/**
			 * Завершаем работу с файлом и закрываем выходной поток.
			 */
			writer.close();
			/**
			 * Диалоговое окно с информацией об успешном сохранении
			 */
			JOptionPane.showMessageDialog(null, "Сохранение выполнено успешно");
		}
		/**
		 * Исключение catch
		 */
		catch (FileNotFoundException e) {
			/**
			 * Обрабатываем исключение типа FileNotFoundException e
			 */
			e.printStackTrace();
		}
	}

	/**
	 * Публичный метод для вызова SaveInFile
	 */
	public void PSaveInFile() {
		SaveInFile();
	}
}