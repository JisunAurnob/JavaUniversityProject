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
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;

public class Registration extends JFrame {

	private JPanel contentPane;
	private JTextField fname;
	private JTextField lname;
	private JTextField email;
	private JTextField password;
	private JTextField cpassword;
	private JTextField phone;
	private JTextField nid;
	private JTextField age;
	private JTextField father;
	private JTextField mother;
	private JTextField address;
	
	private String sfname, slname, semail, spassword, scpassword, sphone, snid, sage, sfather, smother, saddress;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration frame = new Registration(0);
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
	public Registration(int pageID) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 414, 667);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(HomePage.background);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel.setIcon(new ImageIcon(Registration.class.getResource("/resources/clossIcon.png")));
		lblNewLabel.setBounds(378, 19, 21, 21);
		contentPane.add(lblNewLabel);
		
		JLabel Heading = new JLabel("Registration");
		Heading.setForeground(Color.WHITE);
		Heading.setFont(new Font("Segoe UI", Font.PLAIN, 37));
		Heading.setBounds(95, 60, 206, 49);
		contentPane.add(Heading);
		
		JPanel LastNameForm = new JPanel();
		LastNameForm.setLayout(null);
		LastNameForm.setBackground(Color.WHITE);
		LastNameForm.setBounds(208, 140, 174, 43);
		contentPane.add(LastNameForm);
		
		lname = new JTextField();
		lname.setText("Last Name");
		lname.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lname.setColumns(10);
		lname.setBorder(null);
		lname.setBounds(24, 14, 133, 15);
		LastNameForm.add(lname);
		
		JPanel FirsNameForm = new JPanel();
		FirsNameForm.setBackground(Color.WHITE);
		FirsNameForm.setBounds(34, 140, 167, 43);
		contentPane.add(FirsNameForm);
		FirsNameForm.setLayout(null);
		
		fname = new JTextField();
		fname.setText("First Name");
		fname.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		fname.setBounds(24, 14, 133, 15);
		fname.setBorder(null);
		FirsNameForm.add(fname);
		fname.setColumns(10);
		
		JPanel EmailForm = new JPanel();
		EmailForm.setLayout(null);
		EmailForm.setBackground(Color.WHITE);
		EmailForm.setBounds(34, 190, 348, 43);
		contentPane.add(EmailForm);
		
		email = new JTextField();
		email.setText("Email");
		email.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		email.setColumns(10);
		email.setBorder(null);
		email.setBounds(24, 14, 314, 15);
		EmailForm.add(email);
		
		JPanel PasswordFrom = new JPanel();
		PasswordFrom.setLayout(null);
		PasswordFrom.setBackground(Color.WHITE);
		PasswordFrom.setBounds(34, 240, 348, 43);
		contentPane.add(PasswordFrom);
		
		password = new JTextField();
		password.setText("Password");
		password.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		password.setColumns(10);
		password.setBorder(null);
		password.setBounds(24, 14, 314, 15);
		PasswordFrom.add(password);
		
		JPanel ConfirmPasswordFrom = new JPanel();
		ConfirmPasswordFrom.setLayout(null);
		ConfirmPasswordFrom.setBackground(Color.WHITE);
		ConfirmPasswordFrom.setBounds(34, 290, 348, 43);
		contentPane.add(ConfirmPasswordFrom);
		
		cpassword = new JTextField();
		cpassword.setText("Confirm Password");
		cpassword.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		cpassword.setColumns(10);
		cpassword.setBorder(null);
		cpassword.setBounds(24, 14, 314, 15);
		ConfirmPasswordFrom.add(cpassword);
		
		JPanel PhoneNumberTag = new JPanel();
		PhoneNumberTag.setBounds(34, 340, 57, 43);
		contentPane.add(PhoneNumberTag);
		PhoneNumberTag.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("+880");
		lblNewLabel_1.setBounds(16, 15, 27, 15);
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		PhoneNumberTag.add(lblNewLabel_1);
		
		JPanel PhoneNumberContainer = new JPanel();
		PhoneNumberContainer.setLayout(null);
		PhoneNumberContainer.setBackground(Color.WHITE);
		PhoneNumberContainer.setBounds(89, 340, 292, 43);
		contentPane.add(PhoneNumberContainer);
		
		phone = new JTextField();
		phone.setText("Phone Number");
		phone.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		phone.setColumns(10);
		phone.setBorder(null);
		phone.setBounds(24, 14, 258, 15);
		PhoneNumberContainer.add(phone);
		
		JPanel NIDNumber = new JPanel();
		NIDNumber.setLayout(null);
		NIDNumber.setBackground(Color.WHITE);
		NIDNumber.setBounds(34, 390, 167, 43);
		contentPane.add(NIDNumber);
		
		nid = new JTextField();
		nid.setText("NID Number");
		nid.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		nid.setColumns(10);
		nid.setBorder(null);
		nid.setBounds(24, 14, 133, 15);
		NIDNumber.add(nid);
		
		JPanel AgeForm = new JPanel();
		AgeForm.setLayout(null);
		AgeForm.setBackground(Color.WHITE);
		AgeForm.setBounds(208, 390, 174, 43);
		contentPane.add(AgeForm);
		
		age = new JTextField();
		age.setText("Age");
		age.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		age.setColumns(10);
		age.setBorder(null);
		age.setBounds(24, 14, 133, 15);
		AgeForm.add(age);
		
		JPanel FathersNameFrom = new JPanel();
		FathersNameFrom.setLayout(null);
		FathersNameFrom.setBackground(Color.WHITE);
		FathersNameFrom.setBounds(34, 440, 348, 43);
		contentPane.add(FathersNameFrom);
		
		father = new JTextField();
		father.setText("Father's Name");
		father.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		father.setColumns(10);
		father.setBorder(null);
		father.setBounds(24, 14, 314, 15);
		FathersNameFrom.add(father);
		
		JPanel MothersNameFrom = new JPanel();
		MothersNameFrom.setLayout(null);
		MothersNameFrom.setBackground(Color.WHITE);
		MothersNameFrom.setBounds(34, 490, 348, 43);
		contentPane.add(MothersNameFrom);
		
		mother = new JTextField();
		mother.setText("Mother's Name");
		mother.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		mother.setColumns(10);
		mother.setBorder(null);
		mother.setBounds(24, 14, 314, 15);
		MothersNameFrom.add(mother);
		
		JPanel AddressFrom = new JPanel();
		AddressFrom.setLayout(null);
		AddressFrom.setBackground(Color.WHITE);
		AddressFrom.setBounds(34, 539, 348, 43);
		contentPane.add(AddressFrom);
		
		address = new JTextField();
		address.setText("Address");
		address.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		address.setColumns(10);
		address.setBorder(null);
		address.setBounds(24, 14, 314, 15);
		AddressFrom.add(address);
		
		JPanel RegisterButton = new JPanel();
		RegisterButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		RegisterButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DatabaseManager database = new DatabaseManager();
				
				sfname = fname.getText();
				slname = lname.getText();
				semail = email.getText();
				spassword = password.getText();
				scpassword = cpassword.getText();
				sphone = phone.getText();
				snid = nid.getText();
				sage = age.getText();
				sfather = father.getText();
				smother = mother.getText();
				saddress = address.getText();
				
				database.RegisterUser(pageID, sfname, slname, semail, spassword, scpassword, sphone, snid, sage, sfather, smother, saddress);
				HomePage home = new HomePage();
				home.setVisible(true);
				setVisible(false);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				RegisterButton.setBackground(HomePage.purpleHover);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				RegisterButton.setBackground(HomePage.purple3);
			}
		});
		RegisterButton.setBounds(107, 605, 200, 35);
		RegisterButton.setBackground(HomePage.purple3);
		contentPane.add(RegisterButton);
		RegisterButton.setLayout(null);
		
		JLabel RegisterButtonText = new JLabel("Register");
		RegisterButtonText.setForeground(Color.WHITE);
		RegisterButtonText.setFont(new Font("Tahoma", Font.PLAIN, 11));
		RegisterButtonText.setBounds(79, 11, 45, 15);
		RegisterButton.add(RegisterButtonText);
		
		JLabel BackButton = new JLabel("");
		BackButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BackButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				HomePage page = new HomePage();
				page.setVisible(true);
				setVisible(false);
			}
		});
		BackButton.setIcon(new ImageIcon(Registration.class.getResource("/resources/back.png")));
		BackButton.setBounds(20, 17, 28, 23);
		contentPane.add(BackButton);
	}
}
