import java.util.Scanner;
class Student
{ String sname;
    String regno;
    String address;
    String fname;
    String cnic;
    int fee;
    Student()
    {
        sname="null";
        regno="null";
        address="null";
        fname="null";
        cnic="null";
        fee=1;

    }
    Student(String n,String rn,String ad,String fn;String cn,int f)
    {
        sname=n;
        regno=rn;
        address=ad;
        fname=fn;
        cnic=cn;
        fee=f;
    }
    String set()
    {
        Scanner sc=Scanner(System.in);
        System.out.println("Enter the following information\n name:");
       sname=sc.nextLine();
       System.out.println("Reg no:")
       regno=sc.next();
       System.out.println("Address:")
       address=sc.nextLine(); 
       System.out.println("Fname:")
       fname=sc.nextLine();
        System.out.println("CNIC:")
       cnic=sc.next();
        System.out.println("Fee:")
       fee=sc.nextInt();
    }
    String Get()
    {
       String g;
       g="Name:"+sname +"\nREGNO:"+regno+"Address:"+address+"Father Name:"+fname
    }


}