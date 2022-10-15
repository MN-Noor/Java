import java.util.Scanner;
class Prime
{public static void main(String[] args)
{
Scanner input= new Scanner(System.in);
System.out.print("Enter any positive integer: ");
int number=input.nextInt();
if(number<0)
{System.out.println("entered number is negative");}
else
{if(number%2!=0)
{
System.out.println("number is Prime");
}
else
{System.out.println("number is not Prime");}

}
}
}