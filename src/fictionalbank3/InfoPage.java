package fictionalbank3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class InfoPage extends JFrame {

	Session session;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InfoPage frame = new InfoPage();
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
	public InfoPage() {
		session = new Session();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 414, 667);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(HomePage.background);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel CloseIcon = new JLabel("");
		CloseIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		CloseIcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		CloseIcon.setIcon(new ImageIcon(InfoPage.class.getResource("/resources/clossIcon.png")));
		CloseIcon.setBounds(374, 19, 21, 21);
		contentPane.add(CloseIcon);
		
		JLabel BackButton = new JLabel("");
		BackButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Dashbaord board = new Dashbaord();
				board.setVisible(true);
				setVisible(false);
			}
		});
		BackButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BackButton.setIcon(new ImageIcon(InfoPage.class.getResource("/resources/back.png")));
		BackButton.setBounds(24, 17, 28, 23);
		contentPane.add(BackButton);
		
		JLabel Name = new JLabel("Abtahi Tajwar");
		Name.setForeground(Color.WHITE);
		Name.setFont(new Font("Segoe UI", Font.BOLD, 41));
		Name.setBounds(34, 115, 361, 54);
		Name.setText(Session.fname+" "+Session.lname);
		contentPane.add(Name);
		
		JLabel Email = new JLabel("abtahitajwar@gmail.com");
		Email.setForeground(Color.WHITE);
		Email.setFont(new Font("Segoe UI", Font.PLAIN, 10));
		Email.setBounds(35, 168, 360, 13);
		Email.setText(Session.email);
		contentPane.add(Email);
		
		JLabel Father = new JLabel("Father's Name: Maksud Ahmed");
		Father.setForeground(Color.WHITE);
		Father.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		Father.setBounds(38, 207, 366, 21);
		Father.setText(Session.father);
		contentPane.add(Father);
		
		JLabel Mother = new JLabel("Mother's Name: Nasima Khanam");
		Mother.setForeground(Color.WHITE);
		Mother.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		Mother.setBounds(38, 234, 366, 21);
		Mother.setText(Session.mother);
		contentPane.add(Mother);
		
		JLabel Age = new JLabel("Age: 32");
		Age.setForeground(Color.WHITE);
		Age.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		Age.setBounds(38, 261, 366, 21);
		Age.setText(Session.age);
		contentPane.add(Age);
		
		JLabel NID = new JLabel("NID: XXXXXXXXX");
		NID.setForeground(Color.WHITE);
		NID.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		NID.setBounds(38, 290, 366, 21);
		NID.setText(Session.nid);
		contentPane.add(NID);
		
		JLabel Address = new JLabel("Address: Chawkbazar Post Office, Chawbazar");
		Address.setForeground(Color.WHITE);
		Address.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		Address.setBounds(38, 321, 366, 21);
		Address.setText(Session.address);
		contentPane.add(Address);
		
		JLabel label = new JLabel("New label");
		label.setBounds(0, 0, 45, 13);
		contentPane.add(label);
	}
}
