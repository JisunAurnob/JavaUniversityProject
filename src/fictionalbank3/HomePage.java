package fictionalbank3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Rectangle;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class HomePage extends JFrame {
	
	public static Color white = new Color(255, 255, 255);
    public static Color background = new Color(36, 0, 46);
    public static Color purple2 = new Color(52, 0, 66);
    public static Color purple3 = new Color(91, 0, 116);
    public static Color purpleHover = new Color(78, 3, 99);
    public static Color ambientPurple = new Color(54, 2, 68);
    public static Color lightPurple = new Color(117, 69, 130);
    public static Color lightBrown = new Color(194, 189, 170);

	private JPanel contentPane;
	private JTextField username;
	private JTextField password;
	
	JLabel credentialCheckText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 414, 666);
		setBackground(background);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBounds(new Rectangle(0, 0, 414, 667));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(background);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Close = new JLabel("New label");
		Close.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		Close.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Close.setIcon(new ImageIcon(HomePage.class.getResource("/resources/clossIcon.png")));
		Close.setBounds(376, 10, 28, 30);
		contentPane.add(Close);
		
		JLabel MainLogo = new JLabel("");
		MainLogo.setIcon(new ImageIcon(HomePage.class.getResource("/resources/mainLogo.png")));
		MainLogo.setBounds(122, 5, 169, 169);
		contentPane.add(MainLogo);
		
		JPanel username_Container = new JPanel();
		username_Container.setBackground(Color.WHITE);
		username_Container.setBounds(48, 205, 317, 43);
		contentPane.add(username_Container);
		username_Container.setLayout(null);
		
		username = new JTextField();
		username.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(username.getText() == "username/email") {
					username.setText("");
				}
			}
		});
		username.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(username.getText() == "username/email") {
					username.setText("");
				}
			}
		});
		username.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		username.setBounds(25, 12, 282, 19);
		username.setBorder(null);
		username.setText("username/email");
		username_Container.add(username);
		username.setColumns(10);
		
		JPanel password_Container = new JPanel();
		password_Container.setBackground(Color.WHITE);
		password_Container.setLayout(null);
		password_Container.setBounds(48, 249, 317, 43);
		contentPane.add(password_Container);
		
		password = new JTextField();
		password.setText("password");
		password.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		password.setColumns(10);
		password.setBorder(null);
		password.setBounds(25, 12, 282, 19);
		password_Container.add(password);
		
		JPanel LoginButton = new JPanel();
		LoginButton.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.HAND_CURSOR));
		LoginButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Session session = new Session();
				boolean check = session.checkAuthentication(username.getText(), password.getText());
				if(check == true) {
					System.out.println(session.index);
					Dashbaord dashboard = new Dashbaord();
					dashboard.setVisible(true);
					setVisible(false);
				} else {
					credentialCheckText.setVisible(true);
					
				}
				
				
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				LoginButton.setBackground(purpleHover);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				LoginButton.setBackground(purple2);
			}
		});
		LoginButton.setBounds(48, 306, 317, 56);
		LoginButton.setBackground(purple2);
		contentPane.add(LoginButton);
		LoginButton.setLayout(null);
		
		JLabel LoginButtonText = new JLabel("Login");
		LoginButtonText.setForeground(Color.WHITE);
		LoginButtonText.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		LoginButtonText.setBounds(138, 18, 42, 20);
		LoginButton.add(LoginButtonText);
		
		JPanel dividerOne = new JPanel();
		dividerOne.setBounds(48, 385, 114, 3);
		contentPane.add(dividerOne);
		
		JPanel dividerTwo = new JPanel();
		dividerTwo.setBounds(251, 385, 114, 3);
		contentPane.add(dividerTwo);
		
		JLabel Create_Text = new JLabel("Create");
		Create_Text.setForeground(Color.WHITE);
		Create_Text.setFont(new Font("Segoe UI", Font.PLAIN, 19));
		Create_Text.setBounds(180, 371, 56, 26);
		contentPane.add(Create_Text);
		
		JPanel DebitAccountButton = new JPanel();
		DebitAccountButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		DebitAccountButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Registration reg = new Registration(0);
				reg.setVisible(true);
				setVisible(false);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				DebitAccountButton.setBackground(purpleHover);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				DebitAccountButton.setBackground(lightPurple);
			}
		});
		DebitAccountButton.setBounds(48, 418, 317, 56);
		DebitAccountButton.setBackground(lightPurple);
		contentPane.add(DebitAccountButton);
		DebitAccountButton.setLayout(null);
		
		JLabel DebitAccountIcon = new JLabel("New label");
		DebitAccountIcon.setIcon(new ImageIcon(HomePage.class.getResource("/resources/DebitAccount.png")));
		DebitAccountIcon.setBounds(33, 10, 36, 36);
		DebitAccountButton.add(DebitAccountIcon);
		
		JLabel DebitAccountButtonText = new JLabel("Debit Account");
		DebitAccountButtonText.setFont(new Font("Segoe UI", Font.BOLD, 18));
		DebitAccountButtonText.setForeground(Color.WHITE);
		DebitAccountButtonText.setBounds(111, 16, 130, 24);
		DebitAccountButton.add(DebitAccountButtonText);
		
		JPanel CreditAccountButton = new JPanel();
		CreditAccountButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		CreditAccountButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Registration reg = new Registration(1);
				reg.setVisible(true);
				setVisible(false);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				CreditAccountButton.setBackground(purpleHover);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				CreditAccountButton.setBackground(lightPurple);
			}
		});
		CreditAccountButton.setLayout(null);
		CreditAccountButton.setBackground(new Color(117, 69, 130));
		CreditAccountButton.setBounds(48, 482, 317, 56);
		contentPane.add(CreditAccountButton);
		
		JLabel CreditAccountIcon = new JLabel("");
		CreditAccountIcon.setIcon(new ImageIcon(HomePage.class.getResource("/resources/CreditAccount.png")));
		CreditAccountIcon.setBounds(33, 10, 36, 36);
		CreditAccountButton.add(CreditAccountIcon);
		
		JLabel CreditAccountButtonText = new JLabel("Credit Account");
		CreditAccountButtonText.setForeground(Color.WHITE);
		CreditAccountButtonText.setFont(new Font("Segoe UI", Font.BOLD, 18));
		CreditAccountButtonText.setBounds(111, 16, 130, 24);
		CreditAccountButton.add(CreditAccountButtonText);
		
		JPanel SavingsAccountButton = new JPanel();
		SavingsAccountButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		SavingsAccountButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Registration reg = new Registration(2);
				reg.setVisible(true);
				setVisible(false);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				SavingsAccountButton.setBackground(purpleHover);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				SavingsAccountButton.setBackground(lightPurple);
			}
		});
		SavingsAccountButton.setLayout(null);
		SavingsAccountButton.setBackground(new Color(117, 69, 130));
		SavingsAccountButton.setBounds(48, 548, 317, 56);
		contentPane.add(SavingsAccountButton);
		
		JLabel SavingsAccountIcon = new JLabel("");
		SavingsAccountIcon.setIcon(new ImageIcon(HomePage.class.getResource("/resources/savingsAccount.png")));
		SavingsAccountIcon.setBounds(33, 10, 36, 36);
		SavingsAccountButton.add(SavingsAccountIcon);
		
		JLabel SavingsAccountButtonText = new JLabel("Savings Account");
		SavingsAccountButtonText.setForeground(Color.WHITE);
		SavingsAccountButtonText.setFont(new Font("Segoe UI", Font.BOLD, 18));
		SavingsAccountButtonText.setBounds(111, 16, 147, 24);
		SavingsAccountButton.add(SavingsAccountButtonText);
		
		JLabel footer = new JLabel("\u00A9 Abtahi Tajwar");
		footer.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		footer.setForeground(Color.WHITE);
		footer.setBounds(154, 641, 124, 20);
		contentPane.add(footer);
		
		credentialCheckText = new JLabel("Please enter correct cridentials");
		credentialCheckText.setVisible(false);
		credentialCheckText.setFont(new Font("Segoe UI", Font.PLAIN, 10));
		credentialCheckText.setForeground(Color.WHITE);
		credentialCheckText.setBounds(132, 184, 158, 13);
		contentPane.add(credentialCheckText);
	}
}
