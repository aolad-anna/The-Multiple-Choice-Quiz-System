import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;


public class  Clocktype{
	 public JLabel jb;
		public int sec=59;
		public int min=9;
		JFrame jf;
		public Clocktype(JFrame jf1)
		{
			jf = jf1;
			jb = new JLabel(min+":"+sec);
			 
			Seconds R1 = new Seconds( );
		      R1.start();
		     Minutes R2 = new Minutes();
		      R2.start();    
		}
		public String zero(int num)
	    {
	      String number=( num < 10) ? ("0"+num) : (""+num);
	      return number;                                    //Add leading zero if needed
	      
	    }

		class Seconds implements Runnable 
		{
			   private Thread t;
			   private String threadName;
			 
			   
			   Seconds( )
			   {
			       threadName = "Second";
			   }
			  
			   public void run() 
			   {
			      try {
			    	     while(true)
			    	     {
			                 for(int i = 59; i>=0; i--) 
			                 {
			        	            sec=i;
			        	            jb.setFont(new Font("Arial",21,24));
			        	            jb.setForeground(Color.blue);
			                        jb.setText(zero(min)+":"+zero(sec));
			                      if(min ==0 && sec==0)
			        	          {
			                    	  
			                    	  jf.setEnabled(false);
			                    	  jf.setVisible(false);
			                    	  return;
			                    	 
			        		           
			        	          }
			                        Thread.sleep(1000);
			                  }
			               }
			          }
			      catch (InterruptedException e) 
			      {
			         System.out.println("Thread " +  threadName + " interrupted.");
			      }
			   }
			   
			   public void start ()
			   {
			      if (t == null)
			      {
			         t = new Thread (this, threadName);
			         t.start ();
			      }
			   }

			}
		
		class Minutes implements Runnable {
			   private Thread t;
			   private String threadName;
			   
			   
			   Minutes( )
			   {threadName = "Minute";}
			   
			   public void run() 
			   {
			      try {
			    	     while(true)
			    	     {
			                   for(int i =9; i>=0; i--) 
			                   {
			        	            min=i;
			                        Thread.sleep(60000);
			                   }
			              }
			          }
			      catch (InterruptedException e) 
			      {
						System.out.println("Thread " +  threadName + " interrupted.");
					}
			   }
			   
			   public void start ()
			   {
			      if (t == null)
			      {
			         t = new Thread (this, threadName);
			         t.start ();
			      }
			   }

			}
	}
			
