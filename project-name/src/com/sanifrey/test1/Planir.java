/**
 * ������������� �������������� ������ � ������
 */
package com.sanifrey.test1;

/**
 * ���������� ���������� ��� ������ � ����������� �����������
 */
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
/**
 * ���������� ����� �������
 */
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Planir {
	/**
	 * ��������� ����������� JFrame
	 */
	private JFrame frame;
	/**
	 * ��������� ���� ����� JTextField. textField_AllArea - ���� ��� ����� ��������
	 * ���� ������� �������. textField_WidthObj - ���� ��� ����� �������� ������
	 * �������. textField_LengthObj - ���� ��� ����� �������� ����� �������.
	 * textField_FreeArea - ���� ��� ������ �������� ��������� ������� � �������.
	 * textField_AmountObj - ���� ��� ������ ���������� ��������.
	 */
	private JTextField textField_AllArea;
	private JTextField textField_WidthObj;
	private JTextField textField_LengthObj;
	private JTextField textField_FreeArea;
	private JTextField textField_AmountObj;
	/**
	 * ������� ��������� ������ eHandler � ���������� ������ �� ����� ���������
	 * ������
	 */
	private eHandler handler = new eHandler();
	/**
	 * ��������� �������� ��� ����������� ������. label_AllArea - ����������
	 * "������� ������� ���� �������". label_ParametersObj - ���������� "���������
	 * �������". label_WidthObj - ���������� "������". label_LengthObj - ����������
	 * "�����". label_AmountObj - ���������� "���������� ��������".
	 */
	private JLabel label_AllArea;
	private JLabel label_ParametersObj;
	private JLabel label_WidthObj;
	private JLabel label_LengthObj;
	private JLabel label_AmountObj;
	/**
	 * ��������� ������. button_AddObject - ������ ��� ���������� �������.
	 * button_CountFreeArea - ������ ��� ������ ������ �� �������� ��������� �������
	 * � �������. button_GoToMainMenu - ������ ��� ����������� � ������� ����.
	 * button_DeleteAllObjects - ������ ��� �������� ���� �������� �� ��������.
	 */
	private JButton button_AddObject;
	private JButton button_CountFreeArea;
	private JButton button_GoToMainMenu;
	private JButton button_DeleteAllObjects;
	/**
	 * ��������� ��������� ����������
	 */
	private ComponentsCreator cc;
	private PanelCreator pc;
	private Formula fl;
	/**
	 * ��������� ������ ButtonName ��� �������� ��������������� JButton.
	 */
	private JButton ButtonName[] = { button_AddObject, button_CountFreeArea, button_GoToMainMenu,
			button_DeleteAllObjects };
	/**
	 * ��������� ������ Button_keys_label ��� �������� �������� ������.
	 */
	private String Button_keys_label[] = { "�������� ������", "������ ��������� �������", "� ����",
			"������� ��� �������" };
	/**
	 * ��������� ������ Button_Bounds ��� �������� ��������� ������������ ������ �
	 * � ��������.
	 */
	private int Button_Bounds[] = { 10, 193, 150, 23, 10, 227, 230, 23, 361, 240, 93, 23, 170, 193, 164, 23 };
	/**
	 * ��������� ������ ButtonName ��� �������� ��������������� JTextField.
	 */
	private JTextField TextFieldName[] = { textField_AllArea, textField_WidthObj, textField_LengthObj,
			textField_FreeArea, textField_AmountObj };
	/**
	 * ��������� ������ TextField_Bounds ��� �������� ��������� ������������ ����
	 * ����� � � ��������.
	 */
	private int TextField_Bounds[] = { 10, 20, 86, 20, 10, 109, 86, 20, 10, 155, 86, 20, 248, 228, 86, 20, 308, 58, 44,
			20 };
	/**
	 * ��������� ������ TextField_Editable ��� �������� ���������� � �����������
	 * ������������� ���������� ����.
	 */
	private boolean TextField_Editable[] = { true, true, true, false, false };
	/**
	 * ��������� ������ ButtonName ��� �������� ��������������� JLabel.
	 */
	private JLabel JLabelName[] = { label_AllArea, label_ParametersObj, label_WidthObj, label_LengthObj,
			label_AmountObj };
	/**
	 * ��������� ������ JLabel_Bounds ��� �������� ��������� ������������ label'a �
	 * � ��������.
	 */
	private int JLabel_Bounds[] = { 10, 0, 434, 14, 10, 61, 123, 14, 10, 89, 69, 14, 10, 135, 69, 14, 168, 61, 130,
			14 };
	/**
	 * ��������� ������ JLabel_text ��� �������� ����������, ��� ����� �������� �
	 * label'e.
	 */
	private String JLabel_text[] = { "������� ������� ���� �������", "��������� �������", "������", "�����",
			"���������� ��������:" };
	/**
	 * ������� ������������ ��� �������� ������ � ��������, ��������� � ������������
	 * � �������� ����������.
	 */
	private int Counter;

	/**
	 * �������� �����������.
	 */
	public Planir() {
		/**
		 * �������� �����
		 */
		initialize();
	}

	/**
	 * �������������� ���������� ������
	 */
	private void initialize() {
		/**
		 * ������� ��������� ������ JFrame
		 */
		frame = new JFrame();
		/**
		 * ������� ��������� ������ Formula
		 */
		fl = new Formula();
		/**
		 * ������� ��������� ������ ComponentsCreator
		 */
		cc = new ComponentsCreator(frame);
		/**
		 * ������� ��������� ������ PanelCreator
		 */
		pc = new PanelCreator();
		Counter = 0;
		/**
		 * ������ ������� ���������� ������ JTextField
		 */
		for (int i = 0; i <TextFieldName.length; i++) {
			/**
			 * ������� ��������� ������ JTextField
			 */
			TextFieldName[i] = new JTextField();
			/**
			 * ��� ������ ������ PJTextFieldSettings ������ ��������� ��� textField-��. 1-��
			 * �������� - ��� ������ textField'� �������� ��������� ���������. 2-�� ��������
			 * - ��������� �� �������������. 3-�� �������� - ���������� ���������� �� ��� X.
			 * 4-�� �������� - ���������� ���������� �� ��� Y. 5-�� �������� - ������. 6-��
			 * �������� - �����.
			 */
			cc.PJTextFieldSettings(TextFieldName[i], TextField_Editable[i], TextField_Bounds[Counter + i],
					TextField_Bounds[Counter + i + 1], TextField_Bounds[Counter + i + 2],
					TextField_Bounds[Counter + i + 3]);
			/**
			 * � "Counter" ���������� "3" ��� ����, ����� ��������� �������� ������ ��
			 * ������� TextField_Bounds � ����������� � ����������� � �������� ����� �����.
			 */
			Counter += 3;
		}
		/**
		 * ��������� �������� ��� ������������� � ��������� �������
		 */
		Counter = 0;
		/**
		 * ������ ������� ���������� ������ JButton
		 */
		for (int i = 0; i<ButtonName.length; i++) {
			ButtonName[i] = new JButton();
			/**
			 * ��� ������ ������ PJButtonSettings ������ ��������� ��� ������. 1-�� ��������
			 * - ��� ������ button'� �������� ��������� ���������. 2-�� �������� - ��� �����
			 * �������� � ���� ������. 3-�� �������� - ���������� ���������� �� ��� X. 4-��
			 * �������� - ���������� ���������� �� ��� Y. 5-�� �������� - ������. 6-��
			 * �������� - �����.
			 */
			cc.PJButtonSettings(ButtonName[i], Button_keys_label[i], Button_Bounds[Counter + i],
					Button_Bounds[Counter + i + 1], Button_Bounds[Counter + i + 2], Button_Bounds[Counter + i + 3]);
			ButtonName[i].addActionListener(handler);
			Counter += 3;
		}
		/**
		 * ��������� �������� ��� ������������� � ��������� �������
		 */
		Counter = 0;
		/**
		 * ������ ������� ���������� ������ JLabel
		 */
		for (int i = 0; i <JLabelName.length; i++) {
			JLabelName[i] = new JLabel();
			/**
			 * ��� ������ ������ PJLabelSettings ������ ��������� ��� label-��. 1-��
			 * �������� - ��� ������ label'� �������� ��������� ���������. 2-�� �������� -
			 * ��� ����� �������� ���� label'��. 3-�� �������� - ���������� ���������� ��
			 * ��� X. 4-�� �������� - ���������� ���������� �� ��� Y. 5-�� �������� -
			 * ������. 6-�� �������� - �����.
			 */
			cc.PJLabelSettings(JLabelName[i], JLabel_text[i], JLabel_Bounds[Counter + i],
					JLabel_Bounds[Counter + i + 1], JLabel_Bounds[Counter + i + 2], JLabel_Bounds[Counter + i + 3]);
			Counter += 3;
		}
		/**
		 * ��� ������ ������ PCreatePanel ������ ����������� ��������� ��� frame
		 */
		pc.PCreatePanel(frame, false, "�����������");
		/**
		 * ��� ���������� ������ �������� �������� ����� FirstLoad ��� ����, �����
		 * ����������� ���� � ����������� � �������� ���������� ��������
		 */
		FirstLoad();
	}

	/**
	 * ������ ����� ����� � ��������� ���������. implements ��� �������� �����,
	 * ��������������� ��� ���������� ���������� (interface).
	 */
	private class eHandler implements ActionListener {
		/**
		 * ��������� ActionListener ������� ������ ���������� ������ ������ �
		 * actionPerformed.
		 * 
		 * ActionEvent - �������
		 */
		public void actionPerformed(ActionEvent e) {
			/**
			 * �������� ������� �� ������ button_AddObject
			 */
			if (e.getSource() == getButtonName(0)) {
				/**
				 * ��� ������ ������ setTextField ��������� ���� textField_AmountObj
				 */
				setTextField(4, fl.PublicAddObject(getTextFieldName(1), getTextFieldName(2)));
			}
			/**
			 * �������� ������� �� ������ button_CountFreeArea
			 */
			else if (e.getSource() == getButtonName(1)) {
				/**
				 * ��� ������ ������ setTextField ��������� ���� textField_FreeArea
				 */
				setTextField(3, fl.PFormula(getTextFieldName(0)));
			}
			/**
			 * �������� ������� �� ������ button_GoToMainMenu
			 */
			else if (e.getSource() == getButtonName(2)) {
				/**
				 * �������� ���� "�����������"
				 */
				frame.setVisible(false);
			}
			/**
			 * �������� ������� �� ������ DeleteAllObjects
			 */
			else if (e.getSource() == getButtonName(3)) {
				/**
				 * ��� ������ ������ setTextField ��������� ���� textField_AmountObj
				 */
				setTextField(4, fl.PublicDeleteObjects());
			}
		}
	}

	/**
	 * �������� ����� ��� ���������� �����(JTextField) ��������� ���� String
	 */
	public void setTextField(int i, String text) {
		/**
		 * ���������� � TextFieldName[i] �������� text
		 */
		this.TextFieldName[i].setText(text);
	}

	/**
	 * ��������, ������� ��������� ���� textField_AmountObj ��������� ���-��
	 * ��������� ��������.
	 */
	private void FirstLoad() {
		setTextField(4, String.valueOf(Formula.getAmount()));
	}

	/**
	 * ������ ��� ��������� �������� �� ���� textField_AllArea
	 */
	public String getTextFieldName(int i) {
		/**
		 * �������� �������� �� ���� ����� TextFieldName[i]
		 */
		return TextFieldName[i].getText();
	}

	/**
	 * ��������� ����� ��� �������� �������� ��� setVisiable � ���� "�����������"
	 */
	public void Visiable(boolean arg) {
		frame.setVisible(arg);
	}

	public JButton getButtonName(int i) {
		/**
		 * �������� ������ ButtonName[i]
		 */
		return ButtonName[i];
	}

	public JFrame getframe() {
		/**
		 * �������� frame
		 */
		return frame;
	}
}