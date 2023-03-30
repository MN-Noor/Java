import java.util.Calendar;
import java.util.Scanner;
    class Time
    {
        int hours;
        int minutes;
        int seconds;
    Time()
    {
        hours=Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        minutes=(Calendar.getInstance().get(Calendar.MINUTE));
        seconds=(Calendar.getInstance().get(Calendar.SECOND));
    }
    Time(int h,int m)
    {
        hours=h;
        minutes=m;
    }
    
    String totalPrice(Time t1)
    {
     
        int min=((t1.hours*60)+t1.minutes)-((hours*60)+minutes);
        int p=min*10;
       int m= min%60;
       int h=min/60;
    
    String str=p+"$";
        return str;
    }
    
    String Show()
    {
        String str="Time="+hours+":"+minutes+":"+seconds;
       return str;
    }

    
    } 

    

