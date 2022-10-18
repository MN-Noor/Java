import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
class Account
{
    double bal;  
long accnum;  
String AccHoldersName;
String CNIC; 
Account()
{
    bal=0;
    accnum=0;
    AccHoldersName="Null";
    CNIC="Null";
}

Account(long a,String cn,String acname)//(Assigning accnum and making bal 0)
{
    accnum=a;
    CNIC=cn;
    AccHoldersName=acname;
    bal=0;
}
void CreateAccount()
{
Scanner inp=new Scanner(System.in);
System.out.println("Enter the Following Details to Create Account\nFull Name:");
AccHoldersName=inp.nextLine(); 
System.out.println("CNIC:");
CNIC=inp.next();   
accnum=ThreadLocalRandom.current().nextLong();

}
void deposit(double sum)
{
   bal+=sum;
}
void withdraw(double sum)
{
if(sum<=bal)
{
    bal-=sum;
}
else
{
    System.out.println("Your account has insufficient Money for this Withdrawl");
}
}
double getBalance()
{
    return bal;
}
long getAccountNumber()
{
return accnum;
}
void DisplayAccount()
{
    System.out.println("Your Account Information");
    System.out.println("Name:"+AccHoldersName);
    System.out.println("Account Number:"+accnum);
    System.out.println("CNIC:"+CNIC);
    System.out.println("Current Balance:"+bal);


}

}