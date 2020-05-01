import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;


public class GUI_front
{

 JFrame jf = new JFrame("Welcome to The Multiple Choice Quiz System");

 ImageIcon Front = new ImageIcon("Front.png");
 JButton next = new JButton(Front);
 //JButton next = new JButton("NEXT");
 JLabel go = new JLabel("Please Press The Button to Continue");

 JPanel jp = new JPanel();

  public GUI_front()
  {

  jf.setSize(1000,300);
  jf.setVisible(true);
  jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
  jp.add(next);
  jf.add(jp);
  jp.add(go);
  next.addActionListener(new Handler());

} 

class Handler implements ActionListener
{

 public void actionPerformed(ActionEvent e)
 {
   if(e.getSource() == next)
   {
    jf.dispose();
    GUI Page1 = new GUI();
  }
}

}

}
