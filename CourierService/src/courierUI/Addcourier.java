package courierUI;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Addcourier extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public Addcourier() {
		setLayout(null);
		
		JLabel lblAddCourier = new JLabel("Add Courier");
		lblAddCourier.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAddCourier.setBounds(198, 33, 196, 27);
		add(lblAddCourier);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(51, 133, 56, 16);
		add(lblName);
		
		JLabel lblCourierNo = new JLabel("Courier no:");
		lblCourierNo.setBounds(51, 225, 82, 16);
		add(lblCourierNo);
		
		JLabel lblPhoneNo = new JLabel("phone no:");
		lblPhoneNo.setBounds(51, 302, 82, 16);
		add(lblPhoneNo);
		
		textField = new JTextField();
		textField.setBounds(215, 130, 167, 22);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(212, 222, 182, 22);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(212, 299, 196, 22);
		add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.setBounds(90, 420, 97, 25);
		add(btnCreate);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(297, 420, 97, 25);
		add(btnCancel);

	}

}
