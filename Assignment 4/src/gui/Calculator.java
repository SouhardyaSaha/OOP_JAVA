package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Window.Type;
import java.awt.Point;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Calculator {

	private JFrame frmCalculaor;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmCalculaor.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	
	double num, ans;
	int calculation;
	
	public Calculator() {
		initialize();
	}
	
	public void arithmatic_operation() {
		switch (calculation) {
		
		case 1:///addition
			ans = num + Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
		
		case 2: ///subtraction
			ans = num - Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
			
		case 3:///multiplication
			ans = num * Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
			
		case 4: ///division
			ans = num / Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;

		default:
			break;
		}
		
	}
	
	

	/**
	 * Initialize the contents of the frame.
	 */
	
	JLabel lblNewLabel;
	
	public void initialize() {
		frmCalculaor = new JFrame();
		frmCalculaor.setLocation(new Point(500, 250));
		frmCalculaor.setType(Type.UTILITY);
		frmCalculaor.setTitle("Calculaor");
		frmCalculaor.setBounds(100, 100, 427, 538);
		frmCalculaor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculaor.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField.setBounds(12, 52, 380, 64);
		frmCalculaor.getContentPane().add(textField);
		textField.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("ON");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnNewRadioButton.setBounds(8, 137, 58, 25);
		frmCalculaor.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("OFF");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnNewRadioButton_1.setBounds(8, 167, 58, 25);
		frmCalculaor.getContentPane().add(rdbtnNewRadioButton_1);
		
		JButton btnNewButton = new JButton("<--");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int length = textField.getText().length();
				int number = textField.getText().length() - 1;
				String store;
				
				if(length > 0) {
					
					StringBuilder back = new StringBuilder(textField.getText());
					back.deleteCharAt(number);
					store = back.toString();
					textField.setText(store);
					
				}
				
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.PLAIN, 34));
		btnNewButton.setBounds(93, 138, 91, 35);
		frmCalculaor.getContentPane().add(btnNewButton);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnC.setFont(new Font("Dialog", Font.PLAIN, 34));
		btnC.setBounds(198, 129, 91, 54);
		frmCalculaor.getContentPane().add(btnC);
		
		JButton button = new JButton("+");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				calculation = 1;
				textField.setText("");
				lblNewLabel.setText(num + "+");
			}
		});
		
		button.setFont(new Font("Dialog", Font.PLAIN, 34));
		button.setBounds(319, 129, 73, 54);
		frmCalculaor.getContentPane().add(button);
		
		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "1");
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		button_1.setBounds(12, 357, 73, 54);
		frmCalculaor.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "2");
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		button_2.setBounds(111, 357, 73, 54);
		frmCalculaor.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 30));
		button_3.setBounds(216, 357, 73, 54);
		frmCalculaor.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("-");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				calculation = 2;
				textField.setText("");
				lblNewLabel.setText(num + "-");
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 30));
		button_4.setBounds(319, 202, 73, 54);
		frmCalculaor.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("/");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				calculation = 4;
				textField.setText("");
				lblNewLabel.setText(num + "/");
			}
		});
		button_5.setFont(new Font("Tahoma", Font.BOLD, 30));
		button_5.setBounds(319, 281, 73, 54);
		frmCalculaor.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
			}
		});
		button_6.setFont(new Font("Tahoma", Font.BOLD, 30));
		button_6.setBounds(216, 290, 73, 54);
		frmCalculaor.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("5");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
			}
		});
		button_7.setFont(new Font("Tahoma", Font.BOLD, 30));
		button_7.setBounds(111, 290, 73, 54);
		frmCalculaor.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("4");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
			}
		});
		button_8.setFont(new Font("Tahoma", Font.BOLD, 30));
		button_8.setBounds(12, 290, 73, 54);
		frmCalculaor.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("7");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "7");
			}
		});
		button_9.setFont(new Font("Tahoma", Font.BOLD, 30));
		button_9.setBounds(12, 214, 73, 54);
		frmCalculaor.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("8");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
			}
		});
		button_10.setFont(new Font("Tahoma", Font.BOLD, 30));
		button_10.setBounds(111, 214, 73, 54);
		frmCalculaor.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("9");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");
			}
		});
		button_11.setFont(new Font("Tahoma", Font.BOLD, 30));
		button_11.setBounds(216, 214, 73, 54);
		frmCalculaor.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("*");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				calculation = 3;
				textField.setText("");
				lblNewLabel.setText(num + "*");
			}
		});
		button_12.setFont(new Font("Tahoma", Font.BOLD, 30));
		button_12.setBounds(319, 357, 73, 54);
		frmCalculaor.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("=");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arithmatic_operation();
				lblNewLabel.setText("");
			}
		});
		button_13.setFont(new Font("Tahoma", Font.BOLD, 30));
		button_13.setBounds(216, 424, 176, 54);
		frmCalculaor.getContentPane().add(button_13);
		
		JButton button_15 = new JButton(".");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + ".");
			}
		});
		button_15.setFont(new Font("Tahoma", Font.BOLD, 30));
		button_15.setBounds(111, 424, 73, 54);
		frmCalculaor.getContentPane().add(button_15);
		
		JButton button_16 = new JButton("0");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "0");
			}
		});
		button_16.setFont(new Font("Tahoma", Font.BOLD, 30));
		button_16.setBounds(12, 424, 73, 54);
		frmCalculaor.getContentPane().add(button_16);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(290, 13, 102, 26);
		frmCalculaor.getContentPane().add(lblNewLabel);
	}
	
}
