import java.util.Scanner;
class P3
{
    public static void main(String args[])
    {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the number ");
        int nterm=inp.nextInt();
        int n1=0;
        int n2=1;
        int result;
        
        for(int i=0;i<7;i++)
        {
            if((i==0)||(i==1))
            {
             result=i;
            } 
            else
            {
            
            result=n1+n2;
            n1=n2; 
            n2=result;
            }
           
            System.out.println(result);
           
                                                                                                               
            
        }
    }
}