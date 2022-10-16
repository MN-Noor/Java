import java.util.Scanner;
class Main {
    public static void main(String[] args)
    {
        char ch;    
        Scanner inp=new Scanner(System.in);
        Time t=new Time();
        do{
        System.out.println("Enter\n1:To Set Time\n2:To See Time in 12 Hours Format\n3:To See ^Time in 24 hours format\n4:To Add Hours in existing time\n5:To add minutes in existing time\n6:To guess the time\n7:Exit");
        ch=inp.next().charAt(0);
        switch(ch)
        {
            case'1':
            System.out.println( "Enter time to set");
            t.SetTime();
            t.Show();
            break;
            case'2':
            t.formatTime1();
            break;
            case '3':
            t.formatTime2();
            break;
            case '4':
            System.out.println("Enter hours to add");
            int h=inp.nextInt();
            System.out.println(t.Add_hours(h)+":"+t.minutes+":"+t.seconds);
            
            break;
            case '5':
            System.out.println("Enter minutes to add");
            int m=inp.nextInt();
            Time t2=new Time();
            t2=t.Add_min(m);
            t2.Show();
            break;
            case '6':
             Time t1=new Time();
             boolean guess;
             System.out.println("Enter Time to guess");
             t1.get();
             guess=t.equals(t1);
             if(guess==true)
             {
                System.out.println("Your Guess is Correct");  
             }
             else
            {
                System.out.println("Your Guess is not Correct");     
            }
             break;
             case '7':
             System.out.println("Exiting...");


        }
        }while(ch!='7');

    }

    
}
