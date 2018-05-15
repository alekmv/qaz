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

/**
 * ��������� ����� � ������������� public
 */
public class Otdel {
	/**
	 * ��� �������� ��������� ���������� ��� ���������� ���������� ��������� JFrame
	 */
	private JFrame frame;
	/**
	 * ��������� ������. button_save - ������ ��� ���������� �����������.
	 * button_Menu - ������ �������� ���� "����������".
	 */
	private JButton button_save;
	private JButton button_Menu;
	/**
	 * ��������� ���� ����� JTextField. textField_AllArea - ���� ��� ������ ��������
	 * ���� ������� �������. textField_FreeArea - ���� ��� ������ �������� ���������
	 * �������.
	 */
	private JTextField textField_AllArea;
	private JTextField textField_FreeArea;
	/**
	 * ��������� �������� ��� ����������� ������. label_AllArea - ���������� "�����
	 * �������". label_FreeArea - ���������� "��������� �������".
	 */
	private JLabel label_AllArea;
	private JLabel label_FreeArea;
	/**
	 * �������������� ���������� �������
	 */
	private SaveFile sf;
	private ComponentsCreator cc;
	private PanelCreator pc;
	/**
	 * ��������� ������ ButtonName ��� �������� ��������������� JButton.
	 */
	private JButton ButtonName[] = { button_save, button_Menu };
	/**
	 * ��������� ������ Button_keys_label ��� �������� �������� ������.
	 */
	private String Button_keys_label[] = { "���������", "� ����" };
	/**
	 * ��������� ������ Button_Bounds ��� �������� ��������� ������������ ������ �
	 * � ��������.
	 */
	private int Button_Bounds[] = { 10, 180, 105, 23, 340, 227, 84, 23 };
	/**
	 * ��������� ������ ButtonName ��� �������� ��������������� JTextField.
	 */
	private JTextField TextFieldName[] = { textField_AllArea, textField_FreeArea };
	/**
	 * ��������� ������ TextField_Bounds ��� �������� ��������� ������������ ����
	 * ����� � � ��������.
	 */
	private int TextField_Bounds[] = { 10, 31, 86, 20, 10, 77, 86, 20 };
	/**
	 * ��������� ������ TextField_Editable ��� �������� ���������� � �����������
	 * ������������� ���������� ����.
	 */
	private boolean TextField_Editable[] = { false, false };
	/**
	 * ��������� ������ ButtonName ��� �������� ��������������� JLabel.
	 */
	private JLabel JLabelName[] = { label_AllArea, label_FreeArea };
	/**
	 * ��������� ������ JLabel_Bounds ��� �������� ��������� ������������ label'a �
	 * � ��������.
	 */
	private int JLabel_Bounds[] = { 10, 11, 137, 14, 10, 57, 137, 14 };
	/**
	 * ��������� ������ JLabel_text ��� �������� ����������, ��� ����� �������� �
	 * label'e.
	 */
	private String JLabel_text[] = { "����� �������", "��������� �������" };
	/**
	 * ������� ��������� ������ eHandler � ���������� ������ �� ����� ���������
	 * ������
	 */
	private eHandler handler = new eHandler();
	/**
	 * ������� ������������ ��� �������� ������ � ��������, ��������� � ������������
	 * � �������� ����������.
	 */
	private int Counter;

	/**
	 * �������� �����������
	 */
	public Otdel() {
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
		 * ������� ��������� ������ ComponentsCreator
		 */
		cc = new ComponentsCreator(frame);
		/**
		 * ������� ��������� ������ PanelCreator
		 */
		pc = new PanelCreator();
		/**
		 * ������ ������� ���������� ������ JButton
		 */
		for (int i = 0; i <= 1; i++) {
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
		 * ������ ������� ���������� ������ JTextField
		 */
		for (int i = 0; i <= 1; i++) {
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
		 * ������ ������� ���������� ������ JLabel
		 */
		for (int i = 0; i <= 1; i++) {
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
		 * ��������� ��������
		 */
		Counter = 0;
		/**
		 * ��� ������ ������ PCreatePanel ������ ����������� ��������� ��� frame
		 */
		pc.PCreatePanel(frame, false, "����������");
	}

	private class eHandler implements ActionListener {
		/**
		 * ��������� ActionListener ������� ������ ���������� ������ ������ �
		 * actionPerformed.
		 * 
		 * ActionEvent - �������
		 */
		public void actionPerformed(ActionEvent e) {
			/**
			 * �������� ������� �� ������ button_save
			 */
			if (e.getSource() == getButtonName(0)) {
				SaveInFile();
			}
			/**
			 * �������� ������� �� ������ button_Menu
			 */
			else if (e.getSource() == getButtonName(1)) {
				/**
				 * �������� ���� "�����������"
				 */
				frame.setVisible(false);
			}
		}
	}

	/**
	 * ����� ��� ���������� ��������� ����� ��� �������� ���� "����������"
	 */
	private void UpdateTextFields() {
		/**
		 * ��������� ���� textField_AllArea � ���� "����������" ������� �������� �����
		 * ������ getAllArea()
		 */
		setTextField(0, String.valueOf(Formula.getAllArea()));
		/**
		 * ��������� ���� textField_FreeArea � ���� "����������" ������� �������� �����
		 * ������ getFreeArea()
		 */
		setTextField(1, String.valueOf(Formula.getFreeArea()));
	}

	/**
	 * ����� ��� ���������� � ����
	 */
	private void SaveInFile() {
		/**
		 * ������� ��������� ������ SaveFile
		 */
		sf = new SaveFile();
		/**
		 * �������� ����� PSaveInFile
		 */
		sf.PSaveInFile();
	}

	public JButton getButtonName(int i) {
		/**
		 * �������� �������� �� ���� ����� ButtonName[i]
		 */
		return ButtonName[i];
	}

	public void setTextField(int i, String text) {
		/**
		 * ���������� � TextFieldName[i] �������� text
		 */
		this.TextFieldName[i].setText(text);
	}

	/**
	 * ��������� ����� ��� ��������� � ���� "�����������" �������� setVisible
	 */
	public void Visiable(boolean arg) {
		frame.setVisible(arg);
		/**
		 * ��������� ���� �����
		 */
		UpdateTextFields();
	}
}