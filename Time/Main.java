import java.util.Scanner;
class Main {
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        Time t=new Time();
        t.SetTime();
        System.out.println(t.hours+":"+t.minutes+":"+t.seconds);
        System.out.println("Enter hours to add");
        int h=inp.nextInt();
        t.Add_hours(h);
        System.out.println(t.hours+":"+t.minutes+":"+t.seconds);
    }

    
}
