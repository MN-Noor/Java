import java.util.Scanner;
class Time
{
    int hours;
    int minutes;
    int seconds;

Time(){
   hours=0;
   minutes=0;
   seconds=0;
}

Time(int h,int m,int s)
{
    hours=h;
    minutes=m;
    seconds=s;
}
void SetTime()
{
    int h,m,s;
    boolean check=false;
do{
    Scanner inp=new Scanner(System.in);
    System.out.println("Enter time to set\nHours:");
    h=inp.nextInt();

    System.out.println("Minutes");
    m=inp.nextInt();
    System.out.println("Seconds");
    s=inp.nextInt();

if((h<=24)&&(m<60)&&(s<60))
{
    check=true;
    hours=h;
    minutes=m;
    seconds=s;
}
else
{
    System.out.println("Invalid Time");
}
}while(check==false);
}
void formatTime1()
{
    if(hours>12)
    {
        System.out.println(hours-12+":"+minutes+":"+seconds+" pm");
    }
    else
    {
        System.out.println(hours+":"+minutes+":"+seconds+" am");
    }
}

void formatTime2()
{
    System.out.println(hours+":"+minutes+":"+seconds);
}
void Add_hours(int h)
{
    int num;
    hours=hours+h;
    num=hours%24;
    hours=hours+num;
    if(hours>24)
    {
         hours=hours-24;
    }

}
void Add_min(int m)
{
    int h=(minutes+m)/60;
    int min=(minutes+m)%60;
    hours+=h;

    
}
boolean equals(Time t1)
{
    if((t1.hours==hours)&&(t1.minutes==minutes)&&(t1.seconds==seconds))
    {
        return true;
    }
    return false;
}
}