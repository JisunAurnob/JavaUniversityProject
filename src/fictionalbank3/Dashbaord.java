package fictionalbank3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;

public class Dashbaord extends JFrame {

	private JPanel contentPane;
	private JTextField AmountTextField;
	JLabel Amount;
	JLabel Error;
	JLabel MethodName;

	Session session = new Session();
	HomePage home; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashbaord frame = new Dashbaord();
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
	public Dashbaord() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 414, 666);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(HomePage.background);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel CloseIcon = new JLabel("New label");
		CloseIcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		CloseIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		CloseIcon.setIcon(new ImageIcon(Dashbaord.class.getResource("/resources/clossIcon.png")));
		CloseIcon.setBounds(370, 17, 26, 30);
		contentPane.add(CloseIcon);
		
		JPanel USDButton = new JPanel();
		USDButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Amount.setText(session.amount + "$");
			}
		});
		USDButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		USDButton.setBounds(49, 55, 62, 23);
		USDButton.setBackground(HomePage.lightBrown);
		contentPane.add(USDButton);
		
		JLabel USDText = new JLabel("USD");
		USDText.setForeground(Color.WHITE);
		USDButton.add(USDText);
		
		JPanel TakaButton = new JPanel();
		TakaButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Amount.setText(session.amount*84.92 + "Tk");
			}
		});
		TakaButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		TakaButton.setBackground(new Color(194, 189, 170));
		TakaButton.setBounds(115, 55, 62, 23);
		contentPane.add(TakaButton);
		
		JLabel TakaText = new JLabel("Taka");
		TakaText.setForeground(Color.WHITE);
		TakaButton.add(TakaText);
		
		Amount = new JLabel("0$");
		Amount.setForeground(Color.WHITE);
		Amount.setFont(new Font("Segoe UI", Font.BOLD, 40));
		Amount.setBounds(49, 78, 347, 90);
		Amount.setText(session.amount + "$");
		contentPane.add(Amount);
		
		JLabel AccountNameText = new JLabel("Debit Accout");
		AccountNameText.setForeground(Color.WHITE);
		AccountNameText.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		AccountNameText.setBounds(49, 202, 200, 32);
		contentPane.add(AccountNameText);
		
		JPanel ViewAccountButton = new JPanel();
		ViewAccountButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				InfoPage info = new InfoPage();
				info.setVisible(true);
				setVisible(false);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				ViewAccountButton.setBackground(HomePage.purpleHover);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				ViewAccountButton.setBackground(HomePage.lightPurple);
			}
		});
		ViewAccountButton.setBounds(251, 211, 114, 23);
		ViewAccountButton.setBackground(HomePage.lightPurple);
		contentPane.add(ViewAccountButton);
		
		JLabel ViewAccountButtonText = new JLabel("View Account");
		ViewAccountButtonText.setForeground(Color.WHITE);
		ViewAccountButtonText.setFont(new Font("Segoe UI", Font.BOLD, 10));
		ViewAccountButton.add(ViewAccountButtonText);
		
		JPanel TransectionCriteriaOuterHolder = new JPanel();
		TransectionCriteriaOuterHolder.setBounds(49, 246, 316, 98);
		TransectionCriteriaOuterHolder.setBackground(HomePage.lightPurple);
		contentPane.add(TransectionCriteriaOuterHolder);
		TransectionCriteriaOuterHolder.setLayout(null);
		
		JPanel TransectionCriteriaHolder = new JPanel();
		TransectionCriteriaHolder.setBounds(3, 3, 310, 92);
		TransectionCriteriaHolder.setBackground(HomePage.ambientPurple);
		TransectionCriteriaOuterHolder.add(TransectionCriteriaHolder);
		TransectionCriteriaHolder.setLayout(null);
		
		JLabel TransectionCriteriaHeading = new JLabel("Transaction criterias");
		TransectionCriteriaHeading.setForeground(Color.WHITE);
		TransectionCriteriaHeading.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		TransectionCriteriaHeading.setBounds(12, 7, 288, 17);
		TransectionCriteriaHolder.add(TransectionCriteriaHeading);
		
		JLabel trConditionOne = new JLabel("- Minimum balance -100000tk");
		trConditionOne.setForeground(Color.WHITE);
		trConditionOne.setFont(new Font("Segoe UI", Font.PLAIN, 10));
		trConditionOne.setBounds(12, 28, 288, 17);
		TransectionCriteriaHolder.add(trConditionOne);
		
		JLabel trConditionTwo = new JLabel("- Withdraw limit 50%");
		trConditionTwo.setForeground(Color.WHITE);
		trConditionTwo.setFont(new Font("Segoe UI", Font.PLAIN, 10));
		trConditionTwo.setBounds(12, 42, 288, 17);
		TransectionCriteriaHolder.add(trConditionTwo);
		
		JLabel trConditionThree = new JLabel("- Single cash withdraw limit 20000tk");
		trConditionThree.setForeground(Color.WHITE);
		trConditionThree.setFont(new Font("Segoe UI", Font.PLAIN, 10));
		trConditionThree.setBounds(12, 56, 288, 17);
		TransectionCriteriaHolder.add(trConditionThree);
		
		JLabel trConditionFour = new JLabel("- Single cash withdraw limit 20000tk");
		trConditionFour.setForeground(Color.WHITE);
		trConditionFour.setFont(new Font("Segoe UI", Font.PLAIN, 10));
		trConditionFour.setBounds(12, 70, 288, 17);
		TransectionCriteriaHolder.add(trConditionFour);
		
		JPanel AmountInputBoxContainer = new JPanel();
		AmountInputBoxContainer.setBackground(Color.WHITE);
		AmountInputBoxContainer.setBounds(49, 356, 317, 43);
		contentPane.add(AmountInputBoxContainer);
		AmountInputBoxContainer.setLayout(null);
		
		AmountTextField = new JTextField();
		AmountTextField.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		AmountTextField.setText("Enter Amount");
		AmountTextField.setBounds(30, 13, 277, 15);
		AmountTextField.setBorder(null);
		AmountInputBoxContainer.add(AmountTextField);
		AmountTextField.setColumns(10);
		
		JPanel DepositeButton = new JPanel();
		DepositeButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		DepositeButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(session.type.equals("0")) {
					int money = Integer.valueOf(AmountTextField.getText().trim());
					if(session.amount + money > 100000) {
						Error.setVisible(true);
					}
					else {
						session.increateAmount(money);
						Amount.setText(session.amount + "$");
					}
				}
				else {
					int money = Integer.valueOf(AmountTextField.getText().trim());
					session.increateAmount(money);
					Amount.setText(session.amount + "$");
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				DepositeButton.setBackground(HomePage.purpleHover);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				DepositeButton.setBackground(HomePage.purple2);
			}
		});
		DepositeButton.setBounds(49, 416, 154, 56);
		DepositeButton.setBackground(HomePage.purple2);
		contentPane.add(DepositeButton);
		DepositeButton.setLayout(null);
		
		JLabel DepositeButtonText = new JLabel("Deposite");
		DepositeButtonText.setForeground(Color.WHITE);
		DepositeButtonText.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		DepositeButtonText.setBounds(48, 18, 64, 20);
		DepositeButton.add(DepositeButtonText);
		
		JPanel WithdrawButton = new JPanel();
		WithdrawButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(session.type.equals("1")) {
					int money = Integer.valueOf(AmountTextField.getText().trim());
					if(session.amount - money < -100000) {
						Error.setVisible(true);
					}
					else {
						session.decreaseAmount(money);
						Amount.setText(session.amount + "$");
					}
				}
				else {
					int money = Integer.valueOf(AmountTextField.getText().trim());
					
					if(session.amount - money < 0) {
						Error.setVisible(true);
					}
					else {
						session.decreaseAmount(money);
						Amount.setText(session.amount + "$");
					}
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				WithdrawButton.setBackground(HomePage.purpleHover);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				WithdrawButton.setBackground(HomePage.purple2);
			}
		});
		WithdrawButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		WithdrawButton.setLayout(null);
		WithdrawButton.setBackground(new Color(52, 0, 66));
		WithdrawButton.setBounds(213, 416, 154, 56);
		contentPane.add(WithdrawButton);
		
		JLabel WithdrawButtonText = new JLabel("Withdraw");
		WithdrawButtonText.setForeground(Color.WHITE);
		WithdrawButtonText.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		WithdrawButtonText.setBounds(45, 18, 76, 20);
		WithdrawButton.add(WithdrawButtonText);
		
		JLabel bKash = new JLabel("New label");
		bKash.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MethodName.setText("bKash");
			}
		});
		bKash.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bKash.setIcon(new ImageIcon(Dashbaord.class.getResource("/resources/bKash.png")));
		bKash.setBounds(62, 509, 60, 60);
		contentPane.add(bKash);
		
		MethodName = new JLabel("bKash");
		MethodName.setForeground(Color.WHITE);
		MethodName.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		MethodName.setBounds(187, 482, 154, 13);
		contentPane.add(MethodName);
		
		JLabel Rocket = new JLabel("New label");
		Rocket.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MethodName.setText("Rocket");
			}
		});
		Rocket.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Rocket.setIcon(new ImageIcon(Dashbaord.class.getResource("/resources/rocket.png")));
		Rocket.setBounds(187, 509, 60, 60);
		contentPane.add(Rocket);
		
		JLabel Nogod = new JLabel("New label");
		Nogod.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MethodName.setText("Nogod");
			}
		});
		Nogod.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Nogod.setIcon(new ImageIcon(Dashbaord.class.getResource("/resources/Nogod.png")));
		Nogod.setBounds(305, 509, 60, 60);
		contentPane.add(Nogod);
		
		Error = new JLabel("New label");
		Error.setVisible(false);
		Error.setIcon(new ImageIcon(Dashbaord.class.getResource("/resources/WarningCallout.png")));
		Error.setBounds(51, 587, 312, 26);
		contentPane.add(Error);
		
		JPanel Logout = new JPanel();
		Logout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Logout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				home = new HomePage();
				home.setVisible(true);
				session.resetSession();
				setVisible(false);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				Logout.setBackground(HomePage.purpleHover);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Logout.setBackground(HomePage.purple2);
			}
		});
		Logout.setBackground(new Color(194, 189, 170));
		Logout.setBounds(251, 55, 116, 23);
		Logout.setBackground(HomePage.purple2);
		contentPane.add(Logout);
		
		JLabel LogoutButtonText = new JLabel("Logout");
		LogoutButtonText.setForeground(Color.WHITE);
		Logout.add(LogoutButtonText);
	}
}
