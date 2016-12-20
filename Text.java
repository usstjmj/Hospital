import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;

public class Text {

	private static final Vector Names = null;
	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Text window = new Text();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Text() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(331, 10, 93, 23);
		frame.getContentPane().add(btnNewButton);
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"病人id", "病人姓名", "药名", "数量", "发药"})
				
				
			
			Connection con=null;
			Statement stmt=null;
			String strTemp=" ";
			int row=0;
			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433; DatabaseName=hospital","sa","sa");
				stmt=con.createStatement();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			Statement st=null;
			if(con!=null)
				
				System.out.println("连接成功");
			strTemp="select count(*) from  Morders ";
			ResultSet rs = null;
			try {
				rs = stmt.executeQuery(strTemp);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				if( rs.next())
				{
				  
				  
				}
				
				row = rs.getRow();
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			     Vector data = new Vector();
			     Vector names = new Vector();
					names.addElement("病人id");	
					names.addElement("病人id");	
					names.addElement("病人id");	
					names.addElement("病人id");	
			 
				
				ResultSet rs1 = null;
				try {
					rs1 = stmt.executeQuery(strTemp);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					for(int i=0;rs.next();i++)
					{
						
						data.addElement(rs.getString("id"));
						data.addElement(rs.getString("name"));
						data.addElement(rs.getString("Mname"));
						data.addElement(rs.getString("num"));
							
						
					}
				} catch (SQLException e) {
					// TODO Auto-genrated catch block
					e.printStackTrace();
				}
				
				DefaultTableModel model = null;
				model.setDataVector( data, names); 
				
		);
		
		table.setBounds(10, 43, 414, 208);
		frame.getContentPane().add(table);
		
	}
}

		
