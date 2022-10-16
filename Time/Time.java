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
    Time t= new Time();
    boolean check=false;
do{
    t.get();

    if((t.hours<=24)&&(t.minutes<60)&&(t.seconds<60))
{
    check=true;
    hours=t.hours;
    minutes=t.minutes;
    seconds=t.seconds;
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
int Add_hours(int h)
{
   int hr=hours+h;
    if(hr>24)
    {
        hr=hr%24;
        if(hr==0)
        {
            hr=24;
        }
    }

return hr;
}
Time Add_min(int m)
{
    minutes=minutes+m;
    int h=minutes/60;
    int min=minutes%60;
    int hr=Add_hours(h);
return new Time(hr,min,seconds);
    
}
boolean equals(Time t1)
{
    if((t1.hours==hours)&&(t1.minutes==minutes)&&(t1.seconds==seconds))
    {
        return true;
    }
    return false;
}
void Show()
{
    System.out.println(hours+":"+minutes+":"+seconds);
}
void get()
{
    
    Scanner inp=new Scanner(System.in);
    System.out.println("Hours:");
    hours=inp.nextInt();
    System.out.println("Minutes");
    minutes=inp.nextInt();
    System.out.println("Seconds");
    seconds=inp.nextInt();
}
}