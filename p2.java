import java.util.Scanner;
class P2
{ 
public static void main(String[] args)
{int p=0;
int n=0;
int z=0;
char ch;
Scanner input=new Scanner(System.in);
do
{
System.out.println("Enter n to enter number \nEnter e to exit");
ch =input.next().charAt(0);
if(ch=='n')
{System.out.println("Enter number");
int number=input.nextInt();
if(number<0)
{
n+=1;
}
else if(number==0)
{z+=1;
}
else if(number>0)
{p+=1;
}
}
}while(ch!='e');
{System.out.println("Exiting....");
System.out.println("No of zeros=" + z +"\nno of positive Integers=" + p + "\nno of negative Integer="+ n);
}
}
}