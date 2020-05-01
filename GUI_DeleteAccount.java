import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;


public class GUI_DeleteAccount 
{
	JFrame jf4 = new JFrame("Delete Your Account");
	JButton delete = new JButton("DELETE");
	JButton back = new JButton("BACK");
	JLabel id = new JLabel("ENTER YOUR ID");
	JTextField id_tf = new JTextField(20);
	JLabel password = new JLabel("PASSWORD");
	JTextField password_tf = new JTextField(20);
    
	JPanel jp1 = new JPanel();
	JPanel jp2 = new JPanel();
	JPanel jp3 = new JPanel();
	public GUI_DeleteAccount() 

    {
	   jf4.setSize(350,200);
 	   jf4.setVisible(true);
 	   jf4.setDefaultCloseOperation(jf4.EXIT_ON_CLOSE);
	   BoxLayout l = new BoxLayout(jf4.getContentPane(),BoxLayout.Y_AXIS);
	   jf4.setLayout(l);
	   jf4.setLocation(500,300);
	   
	   
	   jp1.add(id);
	   jp1.add(id_tf);
	   jp2.add(password);
	   jp2.add(password_tf);

	   jf4.add(jp1);
	   jf4.add(jp2);
	   jp3.add(delete);
	   jp3.add(back);
	   jf4.add(jp3);

	   delete.addActionListener(new Handler());
	   back.addActionListener(new Handler());
    }
    
    void DeleteAccount() throws SQLException
    {
   	 try
	    {
 	    Class.forName("com.mysql.jdbc.Driver");
 	    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Multiple_Choice_Quiz_System","root","");
 	    Statement stat = con.createStatement(); 
 	    int id = Integer.parseInt(id_tf.getText());
 	    stat.executeUpdate("delete from Student_Info where id = '"+id+"' ");
 	    
 	    
	    } 
        catch(ClassNotFoundException cnfe)
            { 
				cnfe.printStackTrace(); 
			}

    }

    class Handler implements ActionListener
    {
    	public void actionPerformed(ActionEvent e) 
    	{
    	   if(e.getSource() == delete)
    	   {
    		   try 
    		   {DeleteAccount();} 
    		   catch (SQLException e1) 
    		   {e1.printStackTrace();}
    		   jf4.dispose();
    		   GUI page1 = new GUI();
    	   }
    	   if(e.getSource()==back)
    	   {
    		   jf4.dispose();
    		   GUI page1 = new GUI();
    	   }
    	}
    }
}

