/**
 * Устанавливаем принадлежность класса к пакету
 */
package com.sanifrey.test1;

/**
 * Подключаем библиотеку для работы с графическим интерфейсом
 */
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
/**
 * Подключаем класс событий
 */
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Объявляем класс с модификатором public
 */
public class Otdel {
	/**
	 * Для создания основного контейнера для приложения используем контейнер JFrame
	 */
	private JFrame frame;
	/**
	 * Объявляем кнопки. button_save - Кнопка для сохранения результатов.
	 * button_Menu - Кнопка сокрытия окна "Отделочник".
	 */
	private JButton button_save;
	private JButton button_Menu;
	/**
	 * Объявляем поля ввода JTextField. textField_AllArea - Поле для вывода значения
	 * всей площади комнаты. textField_FreeArea - Поле для вывода значения свободной
	 * площади.
	 */
	private JTextField textField_AllArea;
	private JTextField textField_FreeArea;
	/**
	 * Объявляем элементы для отображения текста. label_AllArea - Отображает "Общая
	 * площадь". label_FreeArea - Отображает "Свободная площадь".
	 */
	private JLabel label_AllArea;
	private JLabel label_FreeArea;
	/**
	 * Инициализируем экземпляры классов
	 */
	private SaveFile sf;
	private ComponentsCreator cc;
	private PanelCreator pc;
	/**
	 * Объявляем массив ButtonName для хранения идентификаторов JButton.
	 */
	private JButton ButtonName[] = { button_save, button_Menu };
	/**
	 * Объявляем массив Button_keys_label для хранения названия кнопок.
	 */
	private String Button_keys_label[] = { "Сохранить", "В меню" };
	/**
	 * Объявляем массив Button_Bounds для хранения координат расположения кнопки и
	 * её размеров.
	 */
	private int Button_Bounds[] = { 10, 180, 105, 23, 340, 227, 84, 23 };
	/**
	 * Объявляем массив ButtonName для хранения идентификаторов JTextField.
	 */
	private JTextField TextFieldName[] = { textField_AllArea, textField_FreeArea };
	/**
	 * Объявляем массив TextField_Bounds для хранения координат расположения поля
	 * ввода и её размеров.
	 */
	private int TextField_Bounds[] = { 10, 31, 86, 20, 10, 77, 86, 20 };
	/**
	 * Объявляем массив TextField_Editable для хранения информации о возможности
	 * редактировать конкретное поле.
	 */
	private boolean TextField_Editable[] = { false, false };
	/**
	 * Объявляем массив ButtonName для хранения идентификаторов JLabel.
	 */
	private JLabel JLabelName[] = { label_AllArea, label_FreeArea };
	/**
	 * Объявляем массив JLabel_Bounds для хранения координат расположения label'a и
	 * её размеров.
	 */
	private int JLabel_Bounds[] = { 10, 11, 137, 14, 10, 57, 137, 14 };
	/**
	 * Объявляем массив JLabel_text для хранения информации, что будет написано в
	 * label'e.
	 */
	private String JLabel_text[] = { "Общая площадь", "Свободная площадь" };
	/**
	 * Создаем экземпляр класса eHandler и возвращает ссылку на вновь созданный
	 * объект
	 */
	private eHandler handler = new eHandler();
	/**
	 * Счётчик используется для подсчёта сдвига в массивах, связанных с координатами
	 * и размеров компонента.
	 */
	private int Counter;

	/**
	 * Вызываем конструктор
	 */
	public Otdel() {
		/**
		 * Вызываем метод
		 */
		initialize();
	}

	/**
	 * Инициализируем компоненты фрейма
	 */
	private void initialize() {
		/**
		 * Создаем экземпляр класса JFrame
		 */
		frame = new JFrame();
		/**
		 * Создаем экземпляр класса ComponentsCreator
		 */
		cc = new ComponentsCreator(frame);
		/**
		 * Создаем экземпляр класса PanelCreator
		 */
		pc = new PanelCreator();
		/**
		 * Создаём простые компоненты класса JButton
		 */
		for (int i = 0; i <= 1; i++) {
			ButtonName[i] = new JButton();
			/**
			 * При помощи метода PJButtonSettings задаем параметры для кнопок. 1-ый параметр
			 * - Для какого button'а задаются следующие параметры. 2-ой параметр - Что будет
			 * написано в этой кнопке. 3-ий параметр - Координата размещения по оси X. 4-ый
			 * параметр - Координата размещения по оси Y. 5-ый параметр - Ширина. 6-ой
			 * параметр - Длина.
			 */
			cc.PJButtonSettings(ButtonName[i], Button_keys_label[i], Button_Bounds[Counter + i],
					Button_Bounds[Counter + i + 1], Button_Bounds[Counter + i + 2], Button_Bounds[Counter + i + 3]);
			ButtonName[i].addActionListener(handler);
			Counter += 3;
		}
		/**
		 * Обнуление счётчика для использования в следующем массиве
		 */
		Counter = 0;
		/**
		 * Создаём простые компоненты класса JTextField
		 */
		for (int i = 0; i <= 1; i++) {
			/**
			 * Создаем экземпляр класса JTextField
			 */
			TextFieldName[i] = new JTextField();
			/**
			 * При помощи метода PJTextFieldSettings задаем параметры для textField-ов. 1-ый
			 * параметр - Для какого textField'а задаются следующие параметры. 2-ой параметр
			 * - Разрешено ли редактировать. 3-ий параметр - Координата размещения по оси X.
			 * 4-ый параметр - Координата размещения по оси Y. 5-ый параметр - Ширина. 6-ой
			 * параметр - Длина.
			 */
			cc.PJTextFieldSettings(TextFieldName[i], TextField_Editable[i], TextField_Bounds[Counter + i],
					TextField_Bounds[Counter + i + 1], TextField_Bounds[Counter + i + 2],
					TextField_Bounds[Counter + i + 3]);
			/**
			 * К "Counter" прибавляем "3" для того, чтобы правильно получать данные из
			 * массива TextField_Bounds с информацией о координатах и размеров полей ввода.
			 */
			Counter += 3;
		}
		/**
		 * Обнуление счётчика для использования в следующем массиве
		 */
		Counter = 0;
		/**
		 * Создаём простые компоненты класса JLabel
		 */
		for (int i = 0; i <= 1; i++) {
			JLabelName[i] = new JLabel();
			/**
			 * При помощи метода PJLabelSettings задаем параметры для label-ов. 1-ый
			 * параметр - Для какого label'а задаются следующие параметры. 2-ой параметр -
			 * Что будет показано этим label'ом. 3-ий параметр - Координата размещения по
			 * оси X. 4-ый параметр - Координата размещения по оси Y. 5-ый параметр -
			 * Ширина. 6-ой параметр - Длина.
			 */
			cc.PJLabelSettings(JLabelName[i], JLabel_text[i], JLabel_Bounds[Counter + i],
					JLabel_Bounds[Counter + i + 1], JLabel_Bounds[Counter + i + 2], JLabel_Bounds[Counter + i + 3]);
			Counter += 3;
		}
		/**
		 * Обнуление счётчика
		 */
		Counter = 0;
		/**
		 * При помощи метода PCreatePanel задаем необходимые параметры для frame
		 */
		pc.PCreatePanel(frame, false, "Отделочник");
	}

	private class eHandler implements ActionListener {
		/**
		 * Интерфейс ActionListener требует только реализации одного метода —
		 * actionPerformed.
		 * 
		 * ActionEvent - событие
		 */
		public void actionPerformed(ActionEvent e) {
			/**
			 * Проверка нажатия на кнопку button_save
			 */
			if (e.getSource() == getButtonName(0)) {
				SaveInFile();
			}
			/**
			 * Проверка нажатия на кнопку button_Menu
			 */
			else if (e.getSource() == getButtonName(1)) {
				/**
				 * Скрываем окно "Планировщик"
				 */
				frame.setVisible(false);
			}
		}
	}

	/**
	 * Метод для обновления текстовых полей при открытии окна "Отделочник"
	 */
	private void UpdateTextFields() {
		/**
		 * Заполняем поле textField_AllArea в окне "Отделочник" получая значения через
		 * геттер getAllArea()
		 */
		setTextField(0, String.valueOf(Formula.getAllArea()));
		/**
		 * Заполняем поле textField_FreeArea в окне "Отделочник" получая значения через
		 * геттер getFreeArea()
		 */
		setTextField(1, String.valueOf(Formula.getFreeArea()));
	}

	/**
	 * Метод для сохранения в файл
	 */
	private void SaveInFile() {
		/**
		 * Создаем экземпляр класса SaveFile
		 */
		sf = new SaveFile();
		/**
		 * Вызываем метод PSaveInFile
		 */
		sf.PSaveInFile();
	}

	public JButton getButtonName(int i) {
		/**
		 * Получаем значение из поля ввода ButtonName[i]
		 */
		return ButtonName[i];
	}

	public void setTextField(int i, String text) {
		/**
		 * Записываем в TextFieldName[i] значение text
		 */
		this.TextFieldName[i].setText(text);
	}

	/**
	 * Публичный метод для установки в окне "Планировщик" значения setVisible
	 */
	public void Visiable(boolean arg) {
		frame.setVisible(arg);
		/**
		 * Обновляем поля ввода
		 */
		UpdateTextFields();
	}
}