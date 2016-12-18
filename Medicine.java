import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Medicine {

	
	private boolean a=false;
	
	
	
	public boolean isA() {
		return a;
	}



	public void setA(boolean a) {
		this.a = a;
	}


	
	public Medicine()
	{
		
	}

	public Medicine(int a)
	{
		
		
		JFrame frm=new JFrame("药师登录");
		frm.setLayout(new BorderLayout());
		
			
		JPanel top=new JPanel();
		frm.getContentPane().add(top, BorderLayout.NORTH);
		
		JLabel jl=new JLabel("欢迎来到药师系统/n请填写登录信息");
		top.add(jl);
		
		JPanel contentPane=new JPanel();  
		
		
	 
		frm.setContentPane(contentPane);  
		  JPanel pane1=new JPanel();  
	        contentPane.add(pane1);  
	        JPanel pane2=new JPanel();  
	        contentPane.add(pane2);  
	        JLabel label1=new JLabel("用户名：");  
	          
	        JTextField textField1=new JTextField();  
	        textField1.setColumns(10);  
	        pane1.add(label1);  
	        pane1.add(textField1);  
	        JLabel label2=new JLabel("密码：");  
	        JTextField textField2=new JTextField();  
	        textField2.setColumns(10);  
	        pane2.add(label2);  
	        pane2.add(textField2);  
		JButton button=new JButton("登录");
        ButtonHandler btnHandler=new ButtonHandler();
		button.addActionListener(btnHandler);
		frm.add(button);
		
		frm.setVisible(true);
		frm.setBounds(500, 300, 500,300);
		
		
		
	
		
	}
	
	
			
}

class ButtonHandler implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Connection con=null;
		Statement stmt=null;
		String strTemp=" ";
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
		strTemp="select * from  MLogin ";
		ResultSet rs = null;
		try {
			rs = stmt.executeQuery(strTemp);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while(rs.next())
				{
				  JLabel textField1;
				JLabel textField2;
				if(rs.getString("Mid").equals(textField1.getText()))
			      if(rs.getString("Mpwd").equals(textField2.getText()))
			          
			           System.out.print("登录成功");
				}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Medicine medicine =new Medicine();
		System.out.print(medicine.isA());
	
			 System.out.print("登录失败");
		
		
		
		
		
		   
	}
}




