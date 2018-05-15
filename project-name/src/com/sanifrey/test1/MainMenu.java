/**
 * Устанавливаем принадлежность класса к пакету
 */
package com.sanifrey.test1;
/**
 * Добавляем библиотеку для работы с асинхронными событиями
 */
import java.awt.EventQueue;
/**
 * Подключаем класс событий
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Подключаем библиотеку для работы с графическим интерфейсом
 */
import javax.swing.JFrame;

import javax.swing.JButton;
/**
 * Объявляем класс с модификатором public
 */
public class MainMenu {
	/**
	 * Для создания основного контейнера для приложения используем контейнер JFrame
	 */
	private JFrame frame;

	/**
	 * Запуск приложения
	 */
	public static void main(String[] args) {
		/**
		 * Объявляем, что это необходимо выполнять в главном потоке
		 */
		EventQueue.invokeLater(new Runnable() {
			/**
			 * Метод run
			 */
			public void run() {
				/**
				 * Выполняем отслеживание блока кода, где может произойти ошибка, при помощи
				 * исключения try
				 */
				try {
					/**
					 * Создаём объект window
					 */
					MainMenu window = new MainMenu();
					/**
					 * Отображаем окно
					 */
					window.frame.setVisible(true);
					/**
					 * Исключение catch
					 */
				} catch (Exception e) {
					/**
					 * Обрабатываем исключение типа Exception e
					 */
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Вызываем конструктор
	 */
	public MainMenu() {
		/**
		 * Вызываем метод initialize для инициализации элементов фрейма
		 */
		initialize();
	}
	/**
	 * Создаем экземпляр класса eHandler и возвращает ссылку на вновь созданный объект
	 */
	private eHandler handler = new eHandler();
	/**
	 * Объявляем кнопки.
	 * button_Planirov - Кнопка для открытия окна "Планировщик".
	 * button_Otdelochnik - Кнопка для открытия окна "Отделочник".
	 */
	private JButton button_Planirov;
	private JButton button_Otdelochnik;
	
	/**
	 * Объявляем приватные переменные
	 */
	private ComponentsCreator cc;
	/**
	 * Счётчик используется для подсчёта сдвига в массивах, связанных с координатами и размеров компонента.
	 */
	private int Counter;
	/**
	 * Объявляем массив ButtonName для хранения идентификаторов JButton.
	 */
	private JButton ButtonName[]= {button_Planirov,button_Otdelochnik};
	/**
	 * Объявляем массив Button_keys_label для хранения названия кнопок.
	 */
	private String Button_keys_label[] = {"Планировщик","Отделочник"};
	/**
	 * Объявляем массив Button_Bounds для хранения координат расположения кнопки и её размеров.
	 */
	private int Button_Bounds[] = {11, 0, 150, 271,300, 0, 150, 270};
	/**
	 * Инициализируем компоненты фрейма
	 */
	private void initialize() {
		/**
		 * Создаём объект
		 */
		frame = new JFrame();
		/**
		 * Создаем экземпляр класса PanelCreator
		 */
		PanelCreator pc = new PanelCreator();
		/**
		 * Вызываем метод для задания параметров окна
		 */
		pc.PCreatePanel(frame, true, "Главное меню");
		/**
		 * Создаем экземпляр класса ComponentsCreator
		 */
		cc = new ComponentsCreator(frame);
		/**
		 * Обнуляем счётчик
		 */
		Counter = 0;
		for(int i=0;i<ButtonName.length;i++) {
			/**
			 * Создаем экземпляр класса
			 */
        	ButtonName[i] = new JButton();
    		/**
    		 * При помощи метода PJButtonSettings задаем параметры для кнопок.
    		 * 1-ый параметр - Для какого button'а задаются следующие параметры.
    		 * 2-ой параметр - Что будет написано в этой кнопке.
    		 * 3-ий параметр - Координата размещения по оси X.
    		 * 4-ый параметр - Координата размещения по оси Y.
    		 * 5-ый параметр - Ширина.
    		 * 6-ой параметр - Длина.
    		 */
            cc.PJButtonSettings(ButtonName[i],Button_keys_label[i], Button_Bounds[Counter+i], Button_Bounds[Counter+i+1], Button_Bounds[Counter+i+2], Button_Bounds[Counter+i+3]);
			/**
			 * Подключаем слушателя
			 */
            ButtonName[i].addActionListener(handler);
       		/**
    		 * К "k" прибавляем "3" для того, чтобы правильно получать данные из массива Button_Bounds с информацией о координатах и размеров полей ввода.
    		 */
            Counter+=3;
		}
		
	}
	/**
	 * Создаём новый класс и реализуем интерфейс.
	 * implements это ключевое слово, предназначенное для реализации интерфейса (interface).
	 */
	private class eHandler implements ActionListener {
		/**
		 * Создаем экземпляр класса Otdel
		 */
		Otdel ot = new Otdel();
		/**
		 * Создаем экземпляр класса Planir
		 */
		Planir mp = new Planir();
		/**
		 * Интерфейс ActionListener требует только реализации одного метода —
		 * actionPerformed.
		 * 
		 * ActionEvent - событие
		 */
		public void actionPerformed(ActionEvent e) {
			/**
			 * Проверка нажатия на кнопку ButtonName[0](button_AddObject)
			 */
				if (e.getSource() == ButtonName[0]) {
					/**
					 * Делаем видимым окно "Планировщик"
					 */
					mp.Visiable(true);
				}
				/**
				 * Проверка нажатия на кнопку ButtonName[1](button_CountFreeArea)
				 */
				else if(e.getSource() == ButtonName[1]){
					/**
					 * Делаем видимым окно "Отделочник"
					 */
					ot.Visiable(true);
				}
		}

	}
}