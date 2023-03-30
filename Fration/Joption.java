import java.util.InputMismatchException;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.*;
public class Joption extends JFrame implements ActionListener
{
	JTextField tf1,tf2;
	JButton plus,minus,multiply,divide,clear;
	JTextArea ta;
	FractionGui()
	{
		JFrame jf=new JFrame("Fraction Calculator");
		jf.setBounds(200, 100, 1000, 600);
		
		tf1=new JTextField();
		tf1.setBounds(110,25,100,40);
		JLabel jl1=new JLabel("Enter Fraction 1");
		jl1.setBounds(15,30,90,40);
		jf.add(jl1);
		jf.add(tf1);
		tf2=new JTextField();
		tf2.setBounds(110,90,100,40);
		JLabel jl2=new JLabel("Enter Fraction 2");
		jl2.setBounds(15,90,90,40);
		jf.add(jl2);
		jf.add(tf2);
		plus=new JButton("+");
		plus.setBounds(20, 170, 50, 40);
		jf.add(plus);
		minus=new JButton("-");
		minus.setBounds(80, 170, 50, 40);
		jf.add(minus);
		multiply=new JButton("*");
		multiply.setBounds(140, 170, 50, 40);
		jf.add(multiply);
		divide=new JButton("/");
		divide.setBounds(200, 170, 50, 40);
		jf.add(divide);
		clear=new JButton("clear");
		clear.setBounds(260, 170, 70, 40);
		jf.add(clear);	
		plus.addActionListener(this);
		minus.addActionListener(this);
		multiply.addActionListener(this);
		divide.addActionListener(this);
		clear.addActionListener(this);
		ta=new JTextArea();
		ta.setBounds(700,45,200,100);
		jf.add(ta);
		JLabel jl3=new JLabel("Result:");
		jl3.setBounds(650,30,90,40);
		jf.add(jl3);		
		jf.setLayout(null);
		jf.setVisible(true);
	}
		public void actionPerformed(ActionEvent e)
		{
			String s1=tf1.getText();
			String s2=tf2.getText();
			if(s1.isBlank()||s1.isEmpty()||s2.isBlank()||s2.isEmpty())
            {
            	JOptionPane.showMessageDialog(this, "Enter both the fractions first");
            }
			else
            {
            try
            {
			Fraction f1=new Fraction(s1);
			Fraction f2=new Fraction(s2);
			Fraction result=new Fraction(1,1);
			if(e.getSource()==plus)
			{
				result=f1.addFraction(f2);
			
				ta.setText(result.get());
			}
			else if(e.getSource()==minus)
			{
				result=f1.subtractFraction(f2);
				ta.setText(result.get());
			}
			else if(e.getSource()==multiply)
			{
				result=f1.multiplyFraction(f2);
				
				ta.setText(result.get());
			}
			else if(e.getSource()==divide)
			{
				result=f1.divideFraction(f2);
				ta.setText(result.get());
			}
			else if(e.getSource()==clear)
			{
				tf1.setText(" ");
				tf2.setText(" ");
				ta.setText(" ");	
			}}
			catch(FractionExceptions zde)
            {
            	JOptionPane.showMessageDialog(this, "Invalid Fraction,"+zde.reason);
            	tf1.setText("");
            	tf2.setText("");
            	ta.setText("");
            	

            }
            catch(NumberFormatException ime)
            {
            	JOptionPane.showMessageDialog(this, "Invalid Fraction, Enter again");	
            	tf1.setText("");
            	tf2.setText("");
            	ta.setText("");
            }
            }
		}
	public static void main(String args[])
	{
		
		new FractionGui();
	}
}


