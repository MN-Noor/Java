import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        int index=0;
         int min=Integer.MAX_VALUE;
         int min2=Integer.MAX_VALUE;
         int index2=0;
        int arr[]=new int[10];
        Scanner inp=new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter the number ");
            arr[i]=inp.nextInt();
        }
        for(int j=0;j<10;j++)
        {
            if(arr[j]<min)
            {
                min=arr[j];
                index=j;

            }
        }
        System.out.println(index);
        for(int k=0;k<10;k++)
        {
            if(k!=index)
            {
                if(arr[k]<min2)
            {
                min2=arr[k];
                index2=k;

            }
               
               
            }

        }
        System.out.println(min2+":"+index2);
        
       

    }

    }

    

