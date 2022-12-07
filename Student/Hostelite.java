import java.util.Scanner;
class Hostelite extends Student {
    String hostelno;
    int hostelfee;
    String roomno;
    Hostelite(String n,String rgn,String ad,String fn,String cn,int f,Subject sb[],String hn,int hf,String rn)
    {
    super(n,rgn,ad,fn,cn,f,sb);
    hostelno=hn;
    hostelfee=hf;
    roomno=rn;
    }
   String get()
    {
        String r;
        r=super.Get()+"Hostel no:"+hostelno+"\nHostel fee"+hostelfee+"\nRoom no"+roomno;
        return r;
    }
    void set()
    {
        super.set();
        Scanner sc=new Scanner(System.in);
        System.out.print("Hostel No:");
        hostelno=sc.next();
        System.out.print("Hostel Fee:");
        hostelfee=sc.nextInt();
        System.out.print("Room No:");
        roomno=sc.next();  
    }
    @Override
    int calculate()
    {
    return super.fee+hostelfee;
    }

}
