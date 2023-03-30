import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.*;
class Car extends JFrame
{
   String name,color;
   String reg_no;
   Time t;
   JTextField tf1,tf2,tf3,tf4;
	JLabel jl,jl1,jl2,jl3,jl4;
	JFrame jf;
	JButton jb1,jb2;
	ImageIcon carImage;
	JLabel backgroundLabel;
	Car()
	{
	reg_no="null";
	 name="null";
	 color="null";
	 
	}
   
   Car(String regno,String nm,String clr)
   {
	reg_no=regno;
    name=nm;
    color=clr;
    
    t=new Time();
   }
   void EmptyCar()
   {
    name="null";
    color="null";
    reg_no="null";
    
   }
  
 void set()
 {
   //frame
		jf=new JFrame("CAR'S INFO");
		jf.setBounds(0,0,1500,1400);
		carImage = new ImageIcon("background.jpg");
		backgroundLabel = new JLabel(carImage);
		jf.setContentPane(backgroundLabel);
		//title
		jl=new JLabel("CAR'S DETAILS");
		jl.setFont(new Font("Cooper Black", Font.PLAIN, 34));
		jl.setForeground(new Color( 231, 84, 128));
		jl.setBounds(520,30,400,120);
		jf.add(jl);
		//1
		jl1=new JLabel("Enter Plate#");
		jl1.setFont(new Font("Cooper Black", Font.PLAIN, 30));
		jl1.setForeground(new Color( 231, 84, 128));
		jl1.setBounds(400,200,200,50);
		jf.add(jl1);
		tf1=new JTextField();
		tf1.setFont(new Font("Cooper Black", Font.PLAIN, 24));
		tf1.setBounds(600,200,300,60);
		jf.add(tf1);
		//2
		jl2=new JLabel("Enter Name");
		jl2.setFont(new Font("Cooper Black", Font.PLAIN, 30));
		jl2.setForeground(new Color( 231, 84, 128));
		jl2.setBounds(400,320,200,50);
		jf.add(jl2);
		tf2=new JTextField();
		tf2.setFont(new Font("Cooper Black", Font.PLAIN, 24));
		
		tf2.setBounds(600,320,300,60);
		jf.add(tf2);
		//3
		jl3=new JLabel("Enter Color");
		jl3.setFont(new Font("Cooper Black", Font.PLAIN, 30));
		jl3.setForeground(new Color( 231, 84, 128));
		jl3.setBounds(400,440,200,50);
		jf.add(jl3);
		tf3=new JTextField();
		tf3.setFont(new Font("Cooper Black", Font.PLAIN, 24));
		tf3.setBounds(600,440,300,60);
		jf.add(tf3);
		
		//buttons
		jb1=new JButton("OK");
		jb1.setFont(new Font("Cooper Black", Font.PLAIN, 12));
		jb1.setBounds(500,550,80,60);
		jb1.setBackground(new Color( 231, 84, 128));
		jf.add(jb1);
		jb2=new JButton("CLEAR");
		jb2.setFont(new Font("Cooper Black", Font.PLAIN, 12));
		jb2.setBackground(new Color( 231, 84, 128));
		jb2.setBounds(700,550,80,60);
		
		jf.add(jb2);
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				reg_no=tf1.getText();
				name=tf2.getText();
				color=tf3.getText();
				t=new Time();
				
				jf.dispose();
		}});
		jb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				tf1.setText(" ");
				tf2.setText(" ");
				tf3.setText(" ");
			}
		
		});
		
		jf.setLayout(null);
		jf.setVisible(true);
		
 }
 
 void Reciept()
 {
System.out.println(reg_no);
jf=new JFrame("Reciept");
 jf.setBounds(0,0,1500,1400);
 carImage = new ImageIcon("background.jpg");
 backgroundLabel = new JLabel(carImage);
 jf.setContentPane(backgroundLabel);

 jl=new JLabel("Reciept");
 jl.setFont(new Font("Cooper Black", Font.PLAIN, 34));
 jl.setForeground(new Color( 231, 84, 128));
 jl.setBounds(520,30,400,120);
 jf.add(jl);
 jl1=new JLabel("Car_reg_no#");
 jl1.setFont(new Font("Cooper Black", Font.PLAIN, 30));
 jl1.setForeground(new Color( 231, 84, 128));
 jl1.setBounds(400,130,200,50);
 jf.add(jl1);
 
 tf1=new JTextField(reg_no);
 tf1.setFont(new Font("Cooper Black", Font.PLAIN, 24));
 tf1.setBounds(600,130,300,60);
 jf.add(tf1);
 //2
 jl2=new JLabel("Arrival Time");
 jl2.setFont(new Font("Cooper Black", Font.PLAIN, 30));
 jl2.setForeground(new Color( 231, 84, 128));
 jl2.setBounds(400,220,200,50);
 jf.add(jl2);
 
 tf2=new JTextField(t.Show());
 tf2.setFont(new Font("Cooper Black", Font.PLAIN, 24));
 
 tf2.setBounds(600,220,300,60);
 jf.add(tf2);
 //3
 jl3=new JLabel("Departure Time");
 jl3.setFont(new Font("Cooper Black", Font.PLAIN, 30));
 jl3.setForeground(new Color( 231, 84, 128));
 jl3.setBounds(350,340,300,50);
 jf.add(jl3);
//   Time t1=new Time();
  Time t1=new Time();
 tf3=new JTextField(t1.Show());
 tf3.setFont(new Font("Cooper Black", Font.PLAIN, 24));
 tf3.setBounds(600,340,300,60);
 jf.add(tf3);
 // String bill=t.totalPrice(t1);
 jl4=new JLabel("bill");
 jl4.setFont(new Font("Cooper Black", Font.PLAIN, 30));
 jl4.setForeground(new Color( 231, 84, 128));
 jl4.setBounds(500,460,200,50);
 jf.add(jl4);
 String bill=t.totalPrice(t1);
 tf4=new JTextField(bill);
 tf4.setFont(new Font("Cooper Black", Font.PLAIN, 24));
 tf4.setBounds(600,460,300,60);
 jf.add(tf4);
 
 //buttons
 jb1=new JButton("Print");
 jb1.setFont(new Font("Cooper Black", Font.PLAIN, 20));
 jb1.setBackground(new Color( 231, 84, 128));
 jb1.setForeground(Color.WHITE);
 jb1.setBounds(500,580,100,60);
 
 jf.add(jb1);
 jb1.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
		EmptyCar();
		jf.dispose();

	}

});
 jf.setLayout(null);
 jf.setVisible(true); 
    
 }
 
 

   
}
