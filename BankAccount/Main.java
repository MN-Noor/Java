import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner inp=new Scanner(System.in);
        char ch;
        Account ac=new Account();
        do{
        System.out.println("Enter\n1:Create an account\n2:To deposit money\n3:to withdraw money\n4:to check balance");
        ch=inp.next().charAt(0);
        switch(ch)
        {
            case '1':
           
            ac.CreateAccount();
            ac.DisplayAccount();
            break;
            case '2':
            System.out.println("Enter the amount you want to deposit");
            double am=inp.nextDouble();
            ac.deposit(am);
            System.out.println("your current balance now is:"+ac.bal);
            break;
            case '3':
            System.out.println("Enter the amount you want to withdraw");
            double an=inp.nextDouble();
            ac.withdraw(an);
            System.out.println("your current balance now is:"+ac.bal);
           
            break;
            case '4':
            System.out.println("your current Balance is:"+ac.getBalance());
            break;
            case '5':
            System.out.println("Exiting.....");
            break;
            default:
            System.out.println("Incrrect Entry");
        }
        }while(ch!=5);
        

        
    }
}
