import java.util.Scanner;
import java.util.Random;
class P4
{
    public static void main(String args[])
    {
        Scanner inp=new Scanner(System.in);
        Random rand=new Random();
        int guess_no=rand.nextInt(25);
        int User_guess;
        boolean guess_match=false;
        do{
        System.out.print("Enter the no to Guess number");
        User_guess=inp.nextInt();
        if(User_guess>guess_no)
        {
            System.out.println("Too High");
        }
        else if(User_guess<guess_no)
        {
            System.out.println("Too Low");
        }
        else
        {
            System.out.println("Good! You Got it");
            guess_match=true;
        }
        }while(guess_match==false);
    }
}