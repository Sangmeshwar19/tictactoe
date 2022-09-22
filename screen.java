import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class screen extends JFrame {

	private JPanel contentPane;
    private int xcount = 0;
    private int ocount = 0;
    private String startgame = "X";
    private int b0=10;
    private int b1=10;
    private int b2=10;
    private int b3=10;
    private int b4=10;
    private int b5=10;
    private int b6=10;
    private int b7=10;
    private int b8=10;
    private int i=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					screen frame = new screen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private void winner() {
		if(b0==1 && b1==1 && b2==1) {
			JOptionPane.showMessageDialog(getParent(), "Player X wins");
		}
		else if(b3==1 && b4==1 && b5==1) {
			JOptionPane.showMessageDialog(getParent(), "Player X wins");
		}
		else if(b6==1 && b7==1 && b8==1) {
			JOptionPane.showMessageDialog(getParent(), "Player X wins");
		}
		else if(b0==1 && b3==1 && b6==1) {
			JOptionPane.showMessageDialog(getParent(), "Player X wins");
		}
		else if(b1==1 && b4==1 && b7==1) {
			JOptionPane.showMessageDialog(getParent(), "Player X wins");
		}
		else if(b2==1 && b5==1 && b8==1) {
			JOptionPane.showMessageDialog(getParent(), "Player X wins");
		}
		else if(b0==1 && b4==1 && b8==1) {
			JOptionPane.showMessageDialog(getParent(), "Player X wins");
		}
		else if(b2==1 && b4==1 && b6==1) {
			JOptionPane.showMessageDialog(getParent(), "Player X wins");
		}
		else if(b0==0 && b1==0 && b2==0) {
			JOptionPane.showMessageDialog(getParent(), "Player O wins");
		}
		else if(b3==0 && b4==0 && b5==0) {
			JOptionPane.showMessageDialog(getParent(), "Player O wins");
		}
		else if(b6==0 && b7==0 && b8==0) {
			JOptionPane.showMessageDialog(getParent(), "Player O wins");
		}
		else if(b0==0 && b3==0 && b6==0) {
			JOptionPane.showMessageDialog(getParent(), "Player O wins");
		}
		else if(b1==0 && b4==0 && b7==0) {
			JOptionPane.showMessageDialog(getParent(), "Player O wins");
		}
		else if(b2==0 && b5==0 && b8==0) {
			JOptionPane.showMessageDialog(getParent(), "Player O wins");
		}
		else if(b0==0 && b4==0 && b8==0) {
			JOptionPane.showMessageDialog(getParent(), "Player O wins");
		}
		else if(b2==0 && b4==0 && b6==0) {
			JOptionPane.showMessageDialog(getParent(), "Player O wins");
		}
		else if(i==9) {
			JOptionPane.showMessageDialog(getParent(), "Game drawn");
		}
		
	}
	private void checkturn () {
		if (startgame.equalsIgnoreCase("X")) {
			startgame = "O";
		}
		else {
			startgame = "X";
		}
	}

	/**
	 * Create the frame.
	 */
	public screen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 603, 545);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel headline = new JLabel("tic tac toe");
		headline.setHorizontalAlignment(SwingConstants.CENTER);
		headline.setFont(new Font("Arial Black", Font.BOLD, 30));
		headline.setForeground(Color.PINK);
		headline.setBackground(Color.ORANGE);
		headline.setBounds(176, 10, 233, 60);
		contentPane.add(headline);
		
		JButton btn0 = new JButton("");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn0.setText(startgame);
				if(startgame.equalsIgnoreCase("X")) {
					btn0.setForeground(Color.DARK_GRAY);
					b0=1;
					i++;
				}
				else {
					btn0.setForeground(Color.red);
					b0=0;
					i++;
				}
				checkturn();
				winner();
			}
		});
		btn0.setBackground(Color.GREEN);
		btn0.addMouseListener(new MouseAdapter() {
		});
		btn0.setFont(new Font("Arial Black", Font.PLAIN, 50));
		btn0.setBounds(35, 80, 144, 123);
		contentPane.add(btn0);
		
		JButton btn1 = new JButton("");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setText(startgame);
				if(startgame.equalsIgnoreCase("X")) {
					btn1.setForeground(Color.DARK_GRAY);
					b1=1;
					i++;
				}
				else {
					btn1.setForeground(Color.RED);
					b1=0;
					i++;
				}
				checkturn();
				winner();
			}
		});
		btn1.setBackground(Color.GREEN);
		btn1.setFont(new Font("Arial Black", Font.PLAIN, 50));
		btn1.setBounds(215, 80, 151, 123);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn2.setText(startgame);
				if(startgame.equalsIgnoreCase("X")) {
					btn2.setForeground(Color.DARK_GRAY);
					b2= 1;
					i++;
				}
				else {
					btn2.setForeground(Color.RED);
					b2=0;
					i++;
				}
				checkturn();
				winner();
			}
		});
		btn2.setBackground(Color.GREEN);
		btn2.setFont(new Font("Arial Black", Font.PLAIN, 50));
		btn2.setBounds(399, 80, 151, 123);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn3.setText(startgame);
				if(startgame.equalsIgnoreCase("X")) {
					btn3.setForeground(Color.DARK_GRAY);
					b3=1;
					i++;
				}
				else {
					btn3.setForeground(Color.RED);
					b3=0;
					i++;
				}
				checkturn();
				winner();
			}
		});
		btn3.setBackground(Color.GREEN);
		btn3.setFont(new Font("Arial Black", Font.PLAIN, 50));
		btn3.setBounds(35, 226, 144, 123);
		contentPane.add(btn3);
		
		JButton btn6 = new JButton("");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn6.setText(startgame);
				if(startgame.equalsIgnoreCase("X")) {
					btn6.setForeground(Color.DARK_GRAY);
					b6=1;
					i++;
				}
				else {
					btn6.setForeground(Color.RED);
					b6=0;
					i++;
				}
				checkturn();
				winner();
			}
			});
		btn6.setBackground(Color.GREEN);
		btn6.setFont(new Font("Arial Black", Font.PLAIN, 50));
		btn6.setBounds(35, 365, 144, 123);
		contentPane.add(btn6);
		
		JButton btn4 = new JButton("");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn4.setText(startgame);
				if(startgame.equalsIgnoreCase("X")) {
					btn4.setForeground(Color.DARK_GRAY);
					b4=1;
					i++;
				}
				else {
					btn4.setForeground(Color.RED);
					b4=0;
					i++;
				}
				checkturn();
				winner();
			}
		});
		btn4.setBackground(Color.GREEN);
		btn4.setFont(new Font("Arial Black", Font.PLAIN, 50));
		btn4.setBounds(215, 226, 151, 123);
		contentPane.add(btn4);
		
		JButton btn7 = new JButton("");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn7.setText(startgame);
				if(startgame.equalsIgnoreCase("X")) {
					btn7.setForeground(Color.DARK_GRAY);
					b7=1;
					i++;
				}
				else {
					btn7.setForeground(Color.RED);
					b7=0;
					i++;
				}
				checkturn();
				winner();
			}
		});
		btn7.setBackground(Color.GREEN);
		btn7.setFont(new Font("Arial Black", Font.PLAIN, 50));
		btn7.setBounds(215, 365, 151, 123);
		contentPane.add(btn7);
		
		JButton btn5 = new JButton("");
		btn5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				btn5.setText(startgame);
				if(startgame.equalsIgnoreCase("X")) {
					btn5.setForeground(Color.DARK_GRAY);
					b5=1;
					i++;
				}
				else {
					btn5.setForeground(Color.RED);
					b5=0;
					i++;
				}
				checkturn();
				winner();
			}
			});
		btn5.setBackground(Color.GREEN);
		btn5.setFont(new Font("Arial Black", Font.PLAIN, 50));
		btn5.setBounds(399, 226, 151, 123);
		contentPane.add(btn5);
		
		JButton btn8 = new JButton("");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn8.setText(startgame);
				if(startgame.equalsIgnoreCase("X")) {
					btn8.setForeground(Color.DARK_GRAY);
					b8=1;
					i++;
				}
				else {
					btn8.setForeground(Color.RED);
					b8=0;
					i++;
				}
				checkturn();
				winner();
			}
		});
		btn8.setBackground(Color.GREEN);
		btn8.setFont(new Font("Arial Black", Font.PLAIN, 50));
		btn8.setBounds(399, 365, 151, 123);
		contentPane.add(btn8);
		
		JButton btnNewButton = new JButton("reset");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn0.setText(null);
				btn1.setText(null);
				btn2.setText(null);
				btn3.setText(null);
				btn4.setText(null);
				btn5.setText(null);
				btn6.setText(null);
				btn7.setText(null);
				btn8.setText(null);
				b0=10;
			    b1=10;
			    b2=10;
			    b3=10;
			    b4=10;
			    b5=10;
			    b6=10;
			    b7=10;
			    b8=10;
			    i=0;
			}
		});
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 22));
		btnNewButton.setBounds(444, 10, 106, 47);
		contentPane.add(btnNewButton);
	}
}
