import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;


public class GUI_AfterLogin 
{
	JFrame jf2 = new JFrame("Choose Category");
	ImageIcon Ban_pic = new ImageIcon("Bangladesh.png");
	    JButton Bangladesh = new JButton(Ban_pic);
	ImageIcon Tech_pic = new ImageIcon("Tech.png");
	    JButton Technology = new JButton(Tech_pic);
	ImageIcon Sprt_pic = new ImageIcon("Sports.png");
	    JButton Sports = new JButton(Sprt_pic);
	ImageIcon gk_pic = new ImageIcon("gk.png");
	    JButton General_Knowledge = new JButton(gk_pic);
	
	GUI_AfterLogin()
	{
		 jf2.setSize(750,750);
    	 jf2.setVisible(true);
    	 jf2.setDefaultCloseOperation(jf2.EXIT_ON_CLOSE);
    	 //BoxLayout boxLayout = new BoxLayout(options, BoxLayout.Y_AXIS);
    	 jf2.setLayout(new GridLayout(2,2));
    	 jf2.setLocation(300,10);
    	// options.setLayout(boxLayout);
    	 jf2.add(Bangladesh);
    	 jf2.add(Technology);
    	 jf2.add(Sports);
    	 jf2.add(General_Knowledge);
    	 jf2.validate();

    	 General_Knowledge.addActionListener(new Handler());
    	 Bangladesh.addActionListener(new Handler());
    	 Technology.addActionListener(new Handler());
    	 Sports.addActionListener(new Handler());
	    
	}
	
	class Handler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
		    	if(e.getSource()==Bangladesh)
		    	{
		    		try 
					{
						GUI_Questions page5 = new GUI_Questions("Bangladesh","Bangladesh");
		    		    jf2.dispose();
					} 
		    		catch (SQLException e1)
					{
						e1.printStackTrace();
					}
		    	}
		    	else if(e.getSource()==Sports)
		    	{
		    		try 
					{
						GUI_Questions page5 = new GUI_Questions("Sports","Sports");
		    		    jf2.dispose();
					}
		    		catch (SQLException e1) 
					{
						e1.printStackTrace();
					}
		    	}
		    	else if(e.getSource()==Technology)
		    	{
		    		try
					{
						GUI_Questions page5 = new GUI_Questions("Technology","Technology");
		    		    jf2.dispose();
					}
		    		catch (SQLException e1) 
					{
						e1.printStackTrace();
					}
		    	}
		    	else if(e.getSource()==General_Knowledge)
		    	{
		    		try 
					{
						GUI_Questions page5 = new GUI_Questions("General_Knowledge","General_Knowledge");
		    		    jf2.dispose();
					} 
		    		catch (SQLException e1)
					 {
						 e1.printStackTrace();
					 }
		    	}
			
		}
	}
}