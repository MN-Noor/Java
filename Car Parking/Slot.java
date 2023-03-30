import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Slot extends JFrame {
    boolean isavailable;
    Car c;
    JLabel jl1,jl2,jl3,jl4;
    JFrame frame;
    JButton map;
    ImageIcon carImage;
    JLabel backgroundLabel;
    
    Slot()
    {
        isavailable=true;
        c=new Car();
       
    }
    Slot(String nm,String colr,String reg_no)
    {
    isavailable=false;
    c=new Car(nm,colr,reg_no);
    }
    
    void showInfo()
	{
        // Create the main window
        frame = new JFrame("Car Info");
        frame.setSize(1113, 534);;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the background image
         carImage = new ImageIcon("menu.png");
         backgroundLabel = new JLabel(carImage);
        frame.setContentPane(backgroundLabel);
        if(isavailable==true)
		{
            map = new JButton("Park Car");
            map.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    frame.dispose();
                    c.set();
                   isavailable=false;
                
                }
                });
		
		}
		else{
            map=new JButton("Checkout");
            map.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    frame.dispose();
                  
                    c.Reciept();
                   isavailable=true;
                }
                });
			
		}
      
        map.setBounds(400,250,250,80);
        map.setBackground(java.awt.Color.pink);
        map.setFont(new Font("Cooper Black", Font.BOLD, 30));
        map.setForeground(java.awt.Color.WHITE);
       
        //adding labels
        jl1=new JLabel("CAR'S DETAILS");
		jl1.setFont(new Font("Cooper Black", Font.PLAIN, 35));
		jl1.setForeground(new Color( 231, 84, 128));
		jl1.setBounds(350,30,400,100);
        jl2=new JLabel(c.reg_no);
		jl2.setFont(new Font("Cooper Black", Font.PLAIN, 28));
		jl2.setForeground(new Color( 231, 84, 128));
		jl2.setBounds(380,80,400,80);
        jl3=new JLabel(c.name);
		jl3.setFont(new Font("Cooper Black", Font.PLAIN, 28));
		jl3.setForeground(new Color( 231, 84, 128));
		jl3.setBounds(380,120,400,80);
        jl4=new JLabel(c.color);
		jl4.setFont(new Font("Cooper Black", Font.PLAIN, 28));
		jl4.setForeground(new Color( 231, 84, 128));
		jl4.setBounds(380,160,400,80);
        //Adding buttons to frame
       
        frame.add(map);
        frame.add(jl1);
        frame.add(jl2);
        frame.add(jl3);
        frame.add(jl4);

       
        frame.setVisible(true);

		
	}
    
}