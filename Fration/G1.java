import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.*;
public class G1
{
	JTextField tf;
	JButton button1;
	JLabel jl;
	G1()
	{
         JFrame frame = new JFrame("My First GUI");
         JPanel jp= new JPanel(new FlowLayout());
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setSize(300,300);
         jl=new JLabel("SIMPE GRAPHICAL USER INTERFACE");
         button1= new JButton("Click");
        tf= new JTextField("Enter your name here");
          jp.add(jl);
          jp.add(tf);     
        jp.add(button1);
        frame.add(jp);       
        frame.setVisible(true);
   }
	 	 public static void main(String args[]){
		 new G1();
		 
		 
}}