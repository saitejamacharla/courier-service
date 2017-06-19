package courierUI;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DeliveryTicketConfirmed extends JPanel {

	/**
	 * Create the panel.
	 */
	public DeliveryTicketConfirmed() {
		setLayout(null);
		
		JLabel lblDeliveryTicketConfirmed = new JLabel("Delivery Ticket Confirmed");
		lblDeliveryTicketConfirmed.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDeliveryTicketConfirmed.setBounds(233, 30, 295, 46);
		add(lblDeliveryTicketConfirmed);
		
		JButton btnPrintDeliveryTicket = new JButton("Print Delivery Ticket");
		btnPrintDeliveryTicket.setBounds(542, 494, 154, 25);
		add(btnPrintDeliveryTicket);

	}

}
