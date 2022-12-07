import java.util.Scanner;
public class Dayscholars extends Student {
    String busno;
    int transpotfee;
    Dayscholars(String n,String rgn,String ad,String fn,String cn,int f,Subject sb[],String bn,int tf)
    {
        super(n,rgn,ad,fn,cn,f,sb);
        busno=bn;
        transpotfee=tf;
    }
    String Get()
    {
        String r;
        r=super.Get()+"Bus no:"+busno+"\nTransport fee:"+transpotfee;
        return r;
    }
    void Set()
    {
        super.set();
        Scanner sc=new Scanner(System.in);
        System.out.print("Bus No:");
        busno=sc.next();
        System.out.print("Transport Fee:");
        transpotfee=sc.nextInt();
        
    }
    @Override
    int calculate()
    {
        return super.fee+transpotfee;
    }

    
}
