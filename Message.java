import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Window.Type;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Message {

	private JFrame frame;
/*
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Message window = new Message();
		             window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	*/
	
	public Message() {
		
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setTitle("\u6B22\u8FCE\u60A8\u767B\u9646\u836F\u5E08\u7CFB\u7EDF");
		frame.setBounds(100, 100, 450, 365);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("                     \u767B\u5F55\u6210\u529F");
		label.setFont(new Font("ËÎÌו", Font.PLAIN, 16));
		label.setVerticalAlignment(SwingConstants.TOP);
		frame.getContentPane().add(label, BorderLayout.NORTH);
	}

}
