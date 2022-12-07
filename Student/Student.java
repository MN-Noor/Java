import java.util.Scanner;
class Student
{ String sname;
    String regno;
    String address;
    String fname;
    String cnic;
    int fee;
    Subject sbj[];
    Student()
    {
        sname="null";
        regno="null";
        address="null";
        fname="null";
        cnic="null";
        fee=1;
        Subject sbj[];

    }
    Student(String n,String rgn,String ad,String fn,String cn,int f,Subject sb[])
    {
        sname=n;
        regno=rgn;
        address=ad;
        fname=fn;
        cnic=cn;
        fee=f;
        sbj=new Subject[sb.length];
        sbj=sb;
        
    }
    void set()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the following information\n name:");
       sname=sc.nextLine();
       System.out.println("Reg no:");
       regno=sc.next();
       System.out.println("Address:");
       address=sc.nextLine(); 
       System.out.println("Fname:");
       fname=sc.nextLine();
        System.out.println("CNIC:");
       cnic=sc.next();
        System.out.println("Fee:");
       fee=sc.nextInt();
       for(int i=0;i<sbj.length;i++)
       {
        sbj[i].Set();
       }
    }
    String Get()
    {
       String g;
       g="Name:"+sname +"\nREGNO:"+regno+"Address:"+address+"Father Name:"+fname;
       return g;
    }
    int calculate()
    {
        
    }


}