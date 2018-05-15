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

public class Planir {
	/**
	 * Объявляем конструктор JFrame
	 */
	private JFrame frame;
	/**
	 * Объявляем поля ввода JTextField. textField_AllArea - Поле для ввода значения
	 * всей площади комнаты. textField_WidthObj - Поле для ввода значения ширины
	 * объекта. textField_LengthObj - Поле для ввода значения длины объекта.
	 * textField_FreeArea - Поле для вывода значения свободной площади в комнате.
	 * textField_AmountObj - Поле для вывода количества объектов.
	 */
	private JTextField textField_AllArea;
	private JTextField textField_WidthObj;
	private JTextField textField_LengthObj;
	private JTextField textField_FreeArea;
	private JTextField textField_AmountObj;
	/**
	 * Создаем экземпляр класса eHandler и возвращает ссылку на вновь созданный
	 * объект
	 */
	private eHandler handler = new eHandler();
	/**
	 * Объявляем элементы для отображения текста. label_AllArea - Отображает
	 * "Введите площадь всей комнаты". label_ParametersObj - Отображает "Параметры
	 * объекта". label_WidthObj - Отображает "Ширина". label_LengthObj - Отображает
	 * "Длина". label_AmountObj - Отображает "Количество объектов".
	 */
	private JLabel label_AllArea;
	private JLabel label_ParametersObj;
	private JLabel label_WidthObj;
	private JLabel label_LengthObj;
	private JLabel label_AmountObj;
	/**
	 * Объявляем кнопки. button_AddObject - Кнопка для добавления объекта.
	 * button_CountFreeArea - Кнопка для вызова метода по подсчёту свободной площади
	 * в комнате. button_GoToMainMenu - Кнопка для возвращения в главное меню.
	 * button_DeleteAllObjects - Кнопка для удаления всех объектов из расчётов.
	 */
	private JButton button_AddObject;
	private JButton button_CountFreeArea;
	private JButton button_GoToMainMenu;
	private JButton button_DeleteAllObjects;
	/**
	 * Объявляем приватные переменные
	 */
	private ComponentsCreator cc;
	private PanelCreator pc;
	private Formula fl;
	/**
	 * Объявляем массив ButtonName для хранения идентификаторов JButton.
	 */
	private JButton ButtonName[] = { button_AddObject, button_CountFreeArea, button_GoToMainMenu,
			button_DeleteAllObjects };
	/**
	 * Объявляем массив Button_keys_label для хранения названия кнопок.
	 */
	private String Button_keys_label[] = { "Добавить объект", "Расчёт свободной площади", "В меню",
			"Удалить все объекты" };
	/**
	 * Объявляем массив Button_Bounds для хранения координат расположения кнопки и
	 * её размеров.
	 */
	private int Button_Bounds[] = { 10, 193, 150, 23, 10, 227, 230, 23, 361, 240, 93, 23, 170, 193, 164, 23 };
	/**
	 * Объявляем массив ButtonName для хранения идентификаторов JTextField.
	 */
	private JTextField TextFieldName[] = { textField_AllArea, textField_WidthObj, textField_LengthObj,
			textField_FreeArea, textField_AmountObj };
	/**
	 * Объявляем массив TextField_Bounds для хранения координат расположения поля
	 * ввода и её размеров.
	 */
	private int TextField_Bounds[] = { 10, 20, 86, 20, 10, 109, 86, 20, 10, 155, 86, 20, 248, 228, 86, 20, 308, 58, 44,
			20 };
	/**
	 * Объявляем массив TextField_Editable для хранения информации о возможности
	 * редактировать конкретное поле.
	 */
	private boolean TextField_Editable[] = { true, true, true, false, false };
	/**
	 * Объявляем массив ButtonName для хранения идентификаторов JLabel.
	 */
	private JLabel JLabelName[] = { label_AllArea, label_ParametersObj, label_WidthObj, label_LengthObj,
			label_AmountObj };
	/**
	 * Объявляем массив JLabel_Bounds для хранения координат расположения label'a и
	 * её размеров.
	 */
	private int JLabel_Bounds[] = { 10, 0, 434, 14, 10, 61, 123, 14, 10, 89, 69, 14, 10, 135, 69, 14, 168, 61, 130,
			14 };
	/**
	 * Объявляем массив JLabel_text для хранения информации, что будет написано в
	 * label'e.
	 */
	private String JLabel_text[] = { "Введите площадь всей комнаты", "Параметры объекта", "Ширина", "Длина",
			"Количество объектов:" };
	/**
	 * Счётчик используется для подсчёта сдвига в массивах, связанных с координатами
	 * и размеров компонента.
	 */
	private int Counter;

	/**
	 * Вызываем конструктор.
	 */
	public Planir() {
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
		 * Создаем экземпляр класса Formula
		 */
		fl = new Formula();
		/**
		 * Создаем экземпляр класса ComponentsCreator
		 */
		cc = new ComponentsCreator(frame);
		/**
		 * Создаем экземпляр класса PanelCreator
		 */
		pc = new PanelCreator();
		Counter = 0;
		/**
		 * Создаём простые компоненты класса JTextField
		 */
		for (int i = 0; i <TextFieldName.length; i++) {
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
		 * Создаём простые компоненты класса JButton
		 */
		for (int i = 0; i<ButtonName.length; i++) {
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
		 * Создаём простые компоненты класса JLabel
		 */
		for (int i = 0; i <JLabelName.length; i++) {
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
		 * При помощи метода PCreatePanel задаем необходимые параметры для frame
		 */
		pc.PCreatePanel(frame, false, "Планировщик");
		/**
		 * При выполнении первой загрузки вызываем метод FirstLoad для того, чтобы
		 * заполнилось поле с информацией о значении количества объектов
		 */
		FirstLoad();
	}

	/**
	 * Создаём новый класс и реализуем интерфейс. implements это ключевое слово,
	 * предназначенное для реализации интерфейса (interface).
	 */
	private class eHandler implements ActionListener {
		/**
		 * Интерфейс ActionListener требует только реализации одного метода —
		 * actionPerformed.
		 * 
		 * ActionEvent - событие
		 */
		public void actionPerformed(ActionEvent e) {
			/**
			 * Проверка нажатия на кнопку button_AddObject
			 */
			if (e.getSource() == getButtonName(0)) {
				/**
				 * При помощи метода setTextField заполняем поле textField_AmountObj
				 */
				setTextField(4, fl.PublicAddObject(getTextFieldName(1), getTextFieldName(2)));
			}
			/**
			 * Проверка нажатия на кнопку button_CountFreeArea
			 */
			else if (e.getSource() == getButtonName(1)) {
				/**
				 * При помощи метода setTextField заполняем поле textField_FreeArea
				 */
				setTextField(3, fl.PFormula(getTextFieldName(0)));
			}
			/**
			 * Проверка нажатия на кнопку button_GoToMainMenu
			 */
			else if (e.getSource() == getButtonName(2)) {
				/**
				 * Скрываем окно "Планировщик"
				 */
				frame.setVisible(false);
			}
			/**
			 * Проверка нажатия на кнопку DeleteAllObjects
			 */
			else if (e.getSource() == getButtonName(3)) {
				/**
				 * При помощи метода setTextField заполняем поле textField_AmountObj
				 */
				setTextField(4, fl.PublicDeleteObjects());
			}
		}
	}

	/**
	 * Приваный метод для заполнения полей(JTextField) значением типа String
	 */
	public void setTextField(int i, String text) {
		/**
		 * Записываем в TextFieldName[i] значение text
		 */
		this.TextFieldName[i].setText(text);
	}

	/**
	 * Приваный, который заполняет поле textField_AmountObj значением кол-ва
	 * созданных объектов.
	 */
	private void FirstLoad() {
		setTextField(4, String.valueOf(Formula.getAmount()));
	}

	/**
	 * Геттер для получения значения из поля textField_AllArea
	 */
	public String getTextFieldName(int i) {
		/**
		 * Получаем значение из поля ввода TextFieldName[i]
		 */
		return TextFieldName[i].getText();
	}

	/**
	 * Публичный метод для указания значения для setVisiable в окне "Планировщик"
	 */
	public void Visiable(boolean arg) {
		frame.setVisible(arg);
	}

	public JButton getButtonName(int i) {
		/**
		 * Получаем кнопку ButtonName[i]
		 */
		return ButtonName[i];
	}

	public JFrame getframe() {
		/**
		 * Получаем frame
		 */
		return frame;
	}
}