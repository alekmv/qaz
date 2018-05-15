/**
 * ������������� �������������� ������ � ������
 */
package com.sanifrey.test1;
/**
 * ��������� ���������� ��� ������ � ������������ ���������
 */
import java.awt.EventQueue;
/**
 * ���������� ����� �������
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * ���������� ���������� ��� ������ � ����������� �����������
 */
import javax.swing.JFrame;

import javax.swing.JButton;
/**
 * ��������� ����� � ������������� public
 */
public class MainMenu {
	/**
	 * ��� �������� ��������� ���������� ��� ���������� ���������� ��������� JFrame
	 */
	private JFrame frame;

	/**
	 * ������ ����������
	 */
	public static void main(String[] args) {
		/**
		 * ���������, ��� ��� ���������� ��������� � ������� ������
		 */
		EventQueue.invokeLater(new Runnable() {
			/**
			 * ����� run
			 */
			public void run() {
				/**
				 * ��������� ������������ ����� ����, ��� ����� ��������� ������, ��� ������
				 * ���������� try
				 */
				try {
					/**
					 * ������ ������ window
					 */
					MainMenu window = new MainMenu();
					/**
					 * ���������� ����
					 */
					window.frame.setVisible(true);
					/**
					 * ���������� catch
					 */
				} catch (Exception e) {
					/**
					 * ������������ ���������� ���� Exception e
					 */
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * �������� �����������
	 */
	public MainMenu() {
		/**
		 * �������� ����� initialize ��� ������������� ��������� ������
		 */
		initialize();
	}
	/**
	 * ������� ��������� ������ eHandler � ���������� ������ �� ����� ��������� ������
	 */
	private eHandler handler = new eHandler();
	/**
	 * ��������� ������.
	 * button_Planirov - ������ ��� �������� ���� "�����������".
	 * button_Otdelochnik - ������ ��� �������� ���� "����������".
	 */
	private JButton button_Planirov;
	private JButton button_Otdelochnik;
	
	/**
	 * ��������� ��������� ����������
	 */
	private ComponentsCreator cc;
	/**
	 * ������� ������������ ��� �������� ������ � ��������, ��������� � ������������ � �������� ����������.
	 */
	private int Counter;
	/**
	 * ��������� ������ ButtonName ��� �������� ��������������� JButton.
	 */
	private JButton ButtonName[]= {button_Planirov,button_Otdelochnik};
	/**
	 * ��������� ������ Button_keys_label ��� �������� �������� ������.
	 */
	private String Button_keys_label[] = {"�����������","����������"};
	/**
	 * ��������� ������ Button_Bounds ��� �������� ��������� ������������ ������ � � ��������.
	 */
	private int Button_Bounds[] = {11, 0, 150, 271,300, 0, 150, 270};
	/**
	 * �������������� ���������� ������
	 */
	private void initialize() {
		/**
		 * ������ ������
		 */
		frame = new JFrame();
		/**
		 * ������� ��������� ������ PanelCreator
		 */
		PanelCreator pc = new PanelCreator();
		/**
		 * �������� ����� ��� ������� ���������� ����
		 */
		pc.PCreatePanel(frame, true, "������� ����");
		/**
		 * ������� ��������� ������ ComponentsCreator
		 */
		cc = new ComponentsCreator(frame);
		/**
		 * �������� �������
		 */
		Counter = 0;
		for(int i=0;i<ButtonName.length;i++) {
			/**
			 * ������� ��������� ������
			 */
        	ButtonName[i] = new JButton();
    		/**
    		 * ��� ������ ������ PJButtonSettings ������ ��������� ��� ������.
    		 * 1-�� �������� - ��� ������ button'� �������� ��������� ���������.
    		 * 2-�� �������� - ��� ����� �������� � ���� ������.
    		 * 3-�� �������� - ���������� ���������� �� ��� X.
    		 * 4-�� �������� - ���������� ���������� �� ��� Y.
    		 * 5-�� �������� - ������.
    		 * 6-�� �������� - �����.
    		 */
            cc.PJButtonSettings(ButtonName[i],Button_keys_label[i], Button_Bounds[Counter+i], Button_Bounds[Counter+i+1], Button_Bounds[Counter+i+2], Button_Bounds[Counter+i+3]);
			/**
			 * ���������� ���������
			 */
            ButtonName[i].addActionListener(handler);
       		/**
    		 * � "k" ���������� "3" ��� ����, ����� ��������� �������� ������ �� ������� Button_Bounds � ����������� � ����������� � �������� ����� �����.
    		 */
            Counter+=3;
		}
		
	}
	/**
	 * ������ ����� ����� � ��������� ���������.
	 * implements ��� �������� �����, ��������������� ��� ���������� ���������� (interface).
	 */
	private class eHandler implements ActionListener {
		/**
		 * ������� ��������� ������ Otdel
		 */
		Otdel ot = new Otdel();
		/**
		 * ������� ��������� ������ Planir
		 */
		Planir mp = new Planir();
		/**
		 * ��������� ActionListener ������� ������ ���������� ������ ������ �
		 * actionPerformed.
		 * 
		 * ActionEvent - �������
		 */
		public void actionPerformed(ActionEvent e) {
			/**
			 * �������� ������� �� ������ ButtonName[0](button_AddObject)
			 */
				if (e.getSource() == ButtonName[0]) {
					/**
					 * ������ ������� ���� "�����������"
					 */
					mp.Visiable(true);
				}
				/**
				 * �������� ������� �� ������ ButtonName[1](button_CountFreeArea)
				 */
				else if(e.getSource() == ButtonName[1]){
					/**
					 * ������ ������� ���� "����������"
					 */
					ot.Visiable(true);
				}
		}

	}
}