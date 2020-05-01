import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class Gui_Result 
{
	JFrame jf7 = new JFrame("Score");
	JButton correct = new JButton();
	JButton wrong = new JButton();
	JButton notattempted  = new JButton();
	JButton FinalScore  = new JButton();
	
	JLabel correct1 = new JLabel("Correct :");
	JLabel wrong1 = new JLabel("Wrong :");
	JLabel notattempted1 = new JLabel("Not Attempted :");
	JLabel FinalScore1 = new JLabel("Final Score :");
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	JPanel p4 = new JPanel();
    public Gui_Result(String c, String w ,String n,String f) 
    {
	    correct1.setFont(new Font("Buxton sketch", 2, 24));
	    wrong1.setFont(new Font("Buxton sketch", 2, 24));
	    notattempted1.setFont(new Font("Buxton sketch", 2, 24));
	    FinalScore1.setFont(new Font("Buxton sketch", 2, 24));
	    jf7.setVisible(true);
	    jf7.setDefaultCloseOperation(jf7.EXIT_ON_CLOSE);
	    jf7.setSize(700,700);
	    jf7.setLocation(400,00);
	    jf7.setLayout(new BoxLayout(jf7.getContentPane(),BoxLayout.Y_AXIS));
	    p1.add(correct1);
	    p2.add(wrong1);
	    p1.add(correct);
	    p2.add(wrong);
        p3.add(notattempted1);
	    p3.add(notattempted);
	    p4.add(FinalScore1);
	    p4.add(FinalScore);
	    Icon icon = new ImageIcon("congrats.png");
		   
		JLabel greet = new JLabel(icon);
	    jf7.add(greet);
	    jf7.add(p1);
	    jf7.add(p2);
	    jf7.add(p3);
	    jf7.add(p4);
	    correct.setText(c);
	    wrong.setText(w);
	    notattempted.setText(n);
	    FinalScore.setText(f);
	    FinalScore.addMouseListener(new MouseHandler());

    }
    
    public class MouseHandler implements MouseListener 
	{
		public void mouseReleased(MouseEvent e)
		{
			
		}
		public void mousePressed(MouseEvent e)
		{
			
		}
		public void mouseClicked(MouseEvent e)
		{
			
		}
		public void mouseExited(MouseEvent e)
		{
			
		}
		public void mouseEntered(MouseEvent e)
		{
			Random r = new Random();
			
			FinalScore.setBackground( new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));

		    notattempted.setBackground( new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));

			wrong.setBackground( new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));

			correct.setBackground( new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));

			jf7.setBackground( new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));
				
		}
		
	}
}


