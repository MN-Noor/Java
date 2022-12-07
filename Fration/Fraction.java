import javax.swing.JOptionPane;
import java.util.Scanner;
public class Fraction {
    int num;
    int den;
    Fraction()
    {
        num=1;
        den=1;
    }
    Fraction(int n,int d)
    {
        num=n;
        den=d;

    }
    Fraction get()
    {
        Fraction rf=new Fraction();
        String frac;
        JOptionPane.showMessageDialog(null,"Enter Fraction\nNumerator:");
        frac=JOptionPane.showInputDialog("Enter Numerator");
       
        System.out.println("Denominator:");
        rf.den=inp.nextInt();
        return rf;

    }
    Fraction Add(Fraction f)
    {
        Fraction f1=new Fraction();
        f1.den=den*f.den;
        System.out.println(f.num+"/"+num);
      f1.num=(num*(f1.den/den)+f.num*(f1.den/f.den));
      System.out.println(f1.num+"/"+f1.den);
      return  reduce(f1);
    }
    Fraction reduce(Fraction f)
    {
        int hcd=0;
        for(int i=2;((i<=f.num)||(i<=f.den));i++)
        {
            if((f.num%i==0)&&(f.den%i==0))
            {
                hcd=i;
               
            }
        }
        System.out.println(hcd);
        f.num/=hcd;
        f.den/=hcd;
        System.out.println(f.num+"/"+f.den);
return new Fraction(f.num,f.den);

    }
    Fraction strtofrac(String str)
    {
        String []strarr=new String[2];
     strarr=str.split("/",2);
     num=strarr[0];
     den=strarr[1];
     return ;
    }
}
