package courierUI;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class CourierList extends JPanel {

	/**
	 * Create the panel.
	 */
	public CourierList() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Courier List");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(217, 25, 205, 43);
		add(lblNewLabel);
		
		JLabel lblSelectCourier = new JLabel("Select Courier:");
		lblSelectCourier.setBounds(30, 98, 105, 16);
		add(lblSelectCourier);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(130, 141, 292, 219);
		add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setBounds(82, 426, 97, 25);
		add(btnEdit);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(245, 426, 97, 25);
		add(btnAdd);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(397, 426, 97, 25);
		add(btnDelete);

	}
}
