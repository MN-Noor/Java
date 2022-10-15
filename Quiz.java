import java.util.Scanner;
class Quiz
{
    public static void main(String[] args)
    {
        char arr[]=new char[10];
        Scanner inp=new Scanner(System.in);
        for(int j=0;j<10;j++)
        {
            System.out.println("Enter the number ");
            arr[j]=inp.next().charAt(0);
        }
        for(int k=0;k<9;k++)
        {
            if(arr[k]==arr[k+1])
            {
                System.out.println("Consequitive elements are at"+k+"and"+(k+1));
            }
        }


    }}