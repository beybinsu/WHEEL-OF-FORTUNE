
import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Window.Type;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JTextArea;
import javax.swing.JTextPane;



public class test extends JFrame {

	private JPanel contentPane;
	private JTextField txtWelcomeToThe;
	private JTextPane txtpnWannaSpiceUp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test frame = new test();
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public test() {
		setBackground(new Color(128, 0, 0));
		setBackground(new Color(128, 0, 0));


		getContentPane().setVisible(true);
		setTitle("Wheel of Destiny!");
		setForeground(new Color(139, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(100, 100, 645, 584);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(106, 90, 205));
		contentPane.setForeground(new Color(255, 235, 205));

		getContentPane().setVisible(true);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("Start");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MusicStuff musicObject = new MusicStuff ();

				MusicStuff.playMusic("C:\\\\Users\\\\Yagiz\\\\eclipse-workspace\\\\gameproject\\\\delfino-plaza-super-mario-sunshine-music-extended.wav");
				setVisible(false);
				new Game();
			}

		});
		btnNewButton.setBounds(249, 431, 124, 41);
		contentPane.add(btnNewButton);
		btnNewButton.setForeground(new Color(106, 90, 205));
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 16));






		txtWelcomeToThe = new JTextField();
		txtWelcomeToThe.setBackground(new Color(245, 255, 250));
		txtWelcomeToThe.setEditable(false);
		txtWelcomeToThe.setForeground(new Color(106, 90, 205));
		txtWelcomeToThe.setText("Welcome to the Wheel of Destiny ! ");
		txtWelcomeToThe.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		txtWelcomeToThe.setHorizontalAlignment(SwingConstants.CENTER);
		txtWelcomeToThe.setBounds(127, 70, 361, 41);
		contentPane.add(txtWelcomeToThe);
		txtWelcomeToThe.setColumns(10);

		txtpnWannaSpiceUp = new JTextPane();
		txtpnWannaSpiceUp.setForeground(new Color(255, 255, 255));
		txtpnWannaSpiceUp.setBackground(new Color(106, 90, 205));



		//txtpnWannaSpiceUp.setBackground(new Color(255, 192, 203));
		//txtpnWannaSpiceUp.setForeground(new Color(255, 255, 255));
		txtpnWannaSpiceUp.setFont(new Font("Segoe UI Semilight", Font.BOLD, 16));
		txtpnWannaSpiceUp.setEditable(false);
		txtpnWannaSpiceUp.setText("Wanna spice up your destiny? \r\nAnswer the questions our wheel has selected just for you, and earn points! \r\nThe easy truth questions are worth 5 points, \r\nmedium truth questions worth 10 points,\r\nhard/general knowledge truth questions worth 20 points. \r\nEach dare question is worth 15 points. \r\nYou have to type complete for the dare questions, and of course, you can pass \r\nThe one that get's 100 points first wins. \r\nDo not forget to play with camera on or side-by-side. ");
		txtpnWannaSpiceUp.setBounds(39, 144, 547, 248);
		contentPane.add(txtpnWannaSpiceUp);

	}
}