
import java.awt.event.*;
import javax.swing.*;
public class ParkingLot extends JFrame{
    Slot sl[][]=new Slot[4][6];
    ImageIcon carImage;
    JLabel backgroundLabel;
ParkingLot()
{    

int x=450;
int y=100;
    JFrame frame = new JFrame();    
    frame.setTitle("Add Image");
    frame.setLayout(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    frame.setBounds(0,0, 1500,1400);
    carImage = new ImageIcon("background.jpg");
     backgroundLabel = new JLabel(carImage);
    frame.setContentPane(backgroundLabel);
    JButton jl[][]=new JButton[4][6];
    for(int i=0;i<4;i++)
    {
        for(int j=0;j<6;j++)
     {
        final int xi=i;
        final int xj=j;   
     jl[i][j] = new JButton();
     sl[i][j]=new Slot();
     if(sl[xi][xj].isavailable==true)
        {
            jl[i][j].setIcon(new ImageIcon("nove.jpg"));
        }
     else
        {
            jl[i][j].setIcon(new ImageIcon("pcar.jpg"));
        }
     
     jl[i][j].setBounds(x, y, 64, 117); 
     jl[i][j].addActionListener(new ActionListener(){
    @Override
        public void actionPerformed(ActionEvent e)
    {
        if(sl[xi][xj].isavailable==true)
        {sl[xi][xj].showInfo();
        jl[xi][xj].setIcon(new ImageIcon("pcar.jpg"));}
        else{
        sl[xi][xj].showInfo();
        jl[xi][xj].setIcon(new ImageIcon("nove.jpg"));
        }
    }
    });
     x=x+67;
     frame.add(jl[i][j]);
    }
    y=y+119;
    x=450;
}
    frame.setVisible(true);
}
public static void main(String[] args)
{
ParkingLot mygui=new ParkingLot();
mygui.setVisible(true);

}

    
}

