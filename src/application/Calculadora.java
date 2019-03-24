package application;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Locale;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculadora extends JFrame implements ActionListener {

	JTextField T1, T2;
	JButton B1, B2, B3, B4, B5, B6, B7, B8, B9, B0, soma, sub, mult, div, raiz, porc, result, decimal, limpar, pos_neg;
	JLabel l1, l2, l3;
	char op;
	double n1, n2;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		JFrame Janela = new Calculadora();
		Janela.show();
		WindowListener x = new WindowAdapter() {
			public void WindowsClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		Janela.addWindowListener(x);

	}

	Calculadora() {
		setTitle("Calculadora");
		setSize(275, 455);
		setLocation(20, 20);
		getContentPane().setBackground(Color.DARK_GRAY);
		getContentPane().setLayout(null);

		T1 = new JTextField();
		T1.setBounds(15, 55, 230, 50);
		T1.setBackground(Color.GRAY);
		T1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		T1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		T1.setFont(new Font("Courier New", Font.BOLD, 30));
		T1.setEnabled(true);
		T1.setEditable(true);
		T1.setHorizontalAlignment(T1.RIGHT);
		T1.addActionListener(this);

		T2 = new JTextField();
		T2.setBounds(15, 15, 230, 30);
		T2.setBackground(Color.GRAY);
		T2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		T2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		T2.setFont(new Font("Courier New", Font.BOLD, 20));
		T2.setEnabled(true);
		T2.setEditable(false);
		T2.setHorizontalAlignment(T2.RIGHT);
		T2.addActionListener(this);

		limpar = new JButton();
		limpar.setText("C");
		limpar.setBounds(15, 115, 50, 50);
		limpar.setBackground(Color.GRAY);
		limpar.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		limpar.setFont(new Font("Courier New", Font.BOLD, 30));
		limpar.addActionListener(this);

		raiz = new JButton();
		raiz.setText("R");
		raiz.setBounds(75, 115, 50, 50);
		raiz.setBackground(Color.GRAY);
		raiz.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		raiz.setFont(new Font("Courier New", Font.BOLD, 30));
		raiz.addActionListener(this);

		porc = new JButton();
		porc.setText("%");
		porc.setBounds(135, 115, 50, 50);
		porc.setBackground(Color.GRAY);
		porc.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		porc.setFont(new Font("Courier New", Font.BOLD, 30));
		porc.addActionListener(this);

		mult = new JButton();
		mult.setText("*");
		mult.setBounds(195, 115, 50, 50);
		mult.setBackground(Color.GRAY);
		mult.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		mult.setFont(new Font("Courier New", Font.BOLD, 30));
		mult.addActionListener(this);

		B7 = new JButton();
		B7.setText("7");
		B7.setBounds(15, 175, 50, 50);
		B7.setBackground(Color.GRAY);
		B7.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		B7.setFont(new Font("Courier New", Font.BOLD, 30));
		B7.addActionListener(this);

		B8 = new JButton();
		B8.setText("8");
		B8.setBounds(75, 175, 50, 50);
		B8.setBackground(Color.GRAY);
		B8.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		B8.setFont(new Font("Courier New", Font.BOLD, 30));
		B8.addActionListener(this);

		B9 = new JButton();
		B9.setText("9");
		B9.setBounds(135, 175, 50, 50);
		B9.setBackground(Color.GRAY);
		B9.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		B9.setFont(new Font("Courier New", Font.BOLD, 30));
		B9.addActionListener(this);

		div = new JButton();
		div.setText("/");
		div.setBounds(195, 175, 50, 50);
		div.setBackground(Color.GRAY);
		div.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		div.setFont(new Font("Courier New", Font.BOLD, 30));
		div.addActionListener(this);

		B4 = new JButton();
		B4.setText("4");
		B4.setBounds(15, 235, 50, 50);
		B4.setBackground(Color.GRAY);
		B4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		B4.setFont(new Font("Courier New", Font.BOLD, 30));
		B4.addActionListener(this);

		B5 = new JButton();
		B5.setText("5");
		B5.setBounds(75, 235, 50, 50);
		B5.setBackground(Color.GRAY);
		B5.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		B5.setFont(new Font("Courier New", Font.BOLD, 30));
		B5.addActionListener(this);

		B6 = new JButton();
		B6.setText("6");
		B6.setBounds(135, 235, 50, 50);
		B6.setBackground(Color.GRAY);
		B6.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		B6.setFont(new Font("Courier New", Font.BOLD, 30));
		B6.addActionListener(this);

		sub = new JButton();
		sub.setText("-");
		sub.setBounds(195, 235, 50, 50);
		sub.setBackground(Color.GRAY);
		sub.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		sub.setFont(new Font("Courier New", Font.BOLD, 30));
		sub.addActionListener(this);

		B1 = new JButton();
		B1.setText("1");
		B1.setBounds(15, 295, 50, 50);
		B1.setBackground(Color.GRAY);
		B1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		B1.setFont(new Font("Courier New", Font.BOLD, 30));
		B1.addActionListener(this);

		B2 = new JButton();
		B2.setText("2");
		B2.setBounds(75, 295, 50, 50);
		B2.setBackground(Color.GRAY);
		B2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		B2.setFont(new Font("Courier New", Font.BOLD, 30));
		B2.addActionListener(this);

		B3 = new JButton();
		B3.setText("3");
		B3.setBounds(135, 295, 50, 50);
		B3.setBackground(Color.GRAY);
		B3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		B3.setFont(new Font("Courier New", Font.BOLD, 30));
		B3.addActionListener(this);

		soma = new JButton();
		soma.setText("+");
		soma.setBounds(195, 295, 50, 50);
		soma.setBackground(Color.GRAY);
		soma.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		soma.setFont(new Font("Courier New", Font.BOLD, 30));
		soma.addActionListener(this);

		B0 = new JButton();
		B0.setText("0");
		B0.setBounds(15, 355, 50, 50);
		B0.setBackground(Color.GRAY);
		B0.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		B0.setFont(new Font("Courier New", Font.BOLD, 30));
		B0.addActionListener(this);

		decimal = new JButton();
		decimal.setText(".");
		decimal.setBounds(75, 355, 50, 50);
		decimal.setBackground(Color.GRAY);
		decimal.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		decimal.setFont(new Font("Courier New", Font.BOLD, 30));
		decimal.addActionListener(this);
		
		pos_neg = new JButton();
		pos_neg.setText("+/-");
		pos_neg.setBounds(135, 355, 50, 50);
		pos_neg.setBackground(Color.GRAY);
		pos_neg.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		pos_neg.setFont(new Font("Courier New", Font.BOLD, 20));
		pos_neg.addActionListener(this);

		result = new JButton();
		result.setText("=");
		result.setBounds(195, 355, 50, 50);
		result.setBackground(Color.GRAY);
		result.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		result.setFont(new Font("Courier New", Font.BOLD, 30));
		result.addActionListener(this);

		add(T2);
		add(T1);
		add(limpar);
		add(raiz);
		add(porc);
		add(mult);
		add(B7);
		add(B8);
		add(B9);
		add(div);
		add(B4);
		add(B5);
		add(B6);
		add(sub);
		add(B1);
		add(B2);
		add(B3);
		add(soma);
		add(decimal);
		add(B0);
		add(pos_neg);
		add(result);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == B0) {
			//if (T1.getText().)
			T1.setText(T1.getText() + "0");
		}

		if (e.getSource() == B1) {
			T1.setText(T1.getText() + "1");
		}

		if (e.getSource() == B2) {
			T1.setText(T1.getText() + "2");
		}

		if (e.getSource() == B3) {
			T1.setText(T1.getText() + "3");
		}

		if (e.getSource() == B4) {
			T1.setText(T1.getText() + "4");
		}

		if (e.getSource() == B5) {
			T1.setText(T1.getText() + "5");
		}

		if (e.getSource() == B6) {
			T1.setText(T1.getText() + "6");
		}

		if (e.getSource() == B7) {
			T1.setText(T1.getText() + "7");
		}

		if (e.getSource() == B8) {
			T1.setText(T1.getText() + "8");
		}

		if (e.getSource() == B9) {
			T1.setText(T1.getText() + "9");
		}

		if (e.getSource() == decimal) {
			if (T1.getText().equals("")) {
				T1.setText(T1.getText() + "0.");
			} else {
				T1.setText(T1.getText() + ".");
			}
		}
		
		if (e.getSource() == pos_neg) {
			if (T1.getText().isEmpty()) {
				T1.setText("-" + T1.getText());
			}
			else if (T1.getText().charAt(0) == '+') {
				T1.setText(T1.getText().replace('+', '-'));
			}
			
			else if (T1.getText().charAt(0) == '-') {
				T1.setText(T1.getText().replace('-', '+'));
			}
			
			
		}

		if (e.getSource() == soma) {
			n1 = Double.parseDouble(T1.getText());
			T2.setText(T2.getText() + T1.getText() + " + ");
			T1.setText("");
			op = '+';
		}

		if (e.getSource() == sub) {
			n1 = Double.parseDouble(T1.getText());
			T2.setText(T2.getText() + T1.getText() + " - ");
			T1.setText("");
			op = '-';
		}

		if (e.getSource() == div) {
			n1 = Double.parseDouble(T1.getText());
			T2.setText(T2.getText() + T1.getText() + " / ");
			T1.setText("");
			op = '/';
		}

		if (e.getSource() == mult) {
			n1 = Double.parseDouble(T1.getText());
			T2.setText(T2.getText() + T1.getText() + " * ");
			T1.setText("");
			op = '*';
		}

		if (e.getSource() == raiz) {

			if (Double.parseDouble(T1.getText()) < 0) {
				T1.setFont(new Font("Courier New", Font.BOLD, 25));
				T1.setText("Valor inválido");
			} else {
				n1 = Double.parseDouble(T1.getText());
				T2.setText(T2.getText() + T1.getText() + "R ");
				
				if (Math.sqrt(n1) % 1.0f == 0.0f) {
					T1.setText(String.format("%.0f", Math.sqrt(n1)));
				}
				else {
					T1.setText(String.format("%.3f", Math.sqrt(n1)));
				}
				
			}
		}

		if (e.getSource() == porc) {
			if (Double.parseDouble(T1.getText()) < 0) {
				T1.setFont(new Font("Courier New", Font.BOLD, 25));
				T1.setText("Valor inválido");
			} else {
				n1 = Double.parseDouble(T1.getText());
				T2.setText(T2.getText() + T1.getText() + " % ");
				op = '%';
			}
		}
		
		if (e.getSource() == result) {
			if (op == '+') {
				n2 = Double.parseDouble(T1.getText());
				T2.setText(T2.getText() + T1.getText() + " =");
				
				if ((n1 + n2) % 1.0f == 0.0f) {
					T1.setText(String.format("%.0f", n1+n2));
				}
				else {
					T1.setText(String.format("%.3f", n1+n2));
				}
			}
			
			if (op == '-') {
				n2 = Double.parseDouble(T1.getText());
				T2.setText(T2.getText() + T1.getText() + " =");
				T1.setText(String.valueOf(n1 - n2));
				
				if ((n1 - n2) % 1.0f == 0.0f) {
					T1.setText(String.format("%.0f", n1-n2));
				}
				else {
					T1.setText(String.format("%.3f", n1-n2));
				}
			}
			
			if (op == '/') {
				n2 = Double.parseDouble(T1.getText());
				T2.setText(T2.getText() + T1.getText() + " =");
				T1.setText(String.valueOf(n1 / n2));
				
				if ((n1 / n2) % 1.0f == 0.0f) {
					T1.setText(String.format("%.0f", n1/n2));
				}
				else {
					T1.setText(String.format("%.3f", n1/n2));
				}
			}
			
			if (op == '*') {
				n2 = Double.parseDouble(T1.getText());
				T2.setText(T2.getText() + T1.getText() + " =");
				T1.setText(String.valueOf(n1 * n2));
				
				if ((n1 * n2) % 1.0f == 0.0f) {
					T1.setText(String.format("%.0f", n1*n2));
				}
				else {
					T1.setText(String.format("%.3f", n1*n2));
				}
			}
		}

		if (e.getSource() == limpar) {
			T1.setText("");
			T2.setText("");
		}

	}

}
