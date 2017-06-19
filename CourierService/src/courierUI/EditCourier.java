package courierUI;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EditCourier extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public EditCourier() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Edit Courier");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(176, 13, 148, 61);
		add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(43, 115, 56, 16);
		add(lblName);
		
		JLabel lblNewLabel_1 = new JLabel("Courier no:");
		lblNewLabel_1.setBounds(43, 192, 94, 16);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("phone no:");
		lblNewLabel_2.setBounds(43, 287, 74, 16);
		add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(176, 112, 232, 22);
		add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("-------");
		label.setBounds(176, 192, 56, 16);
		add(label);
		
		textField_1 = new JTextField();
		textField_1.setBounds(177, 284, 195, 22);
		add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(92, 390, 97, 25);
		add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(297, 390, 97, 25);
		add(btnCancel);

	}

}
