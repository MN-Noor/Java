import java.util.Scanner;
class Mmessage
{
    String sendto;
    String sender;
    String message;
    String date;
    Mmessage()
    {
    sendto="Null";
    sender="Null";
    message="Null";
    date="Null";
    }
    Mmessage(String st,String sr,String msg,String d)
    {
        sendto=st;
        sender=sr;
        message=msg;
        date=d;
    }
    String Get()
    {
        String str;
        str="Reciever:"+sendto+"\nSender:"+sender+"\nMessage:"+message+"\nDate:"+date;
        return str;

    }
    String sender()
    {
        return sender;
    }
    String Sento()
    {
        return sendto;
    }
    String message()
    {
        return message;

    }
    void Set()
    {
        Scanner inp=new Scanner(System.in);
        System.out.println("Reciever");
        sendto=inp.nextLine();
        System.out.println("Sender");
        sender=inp.nextLine();
        System.out.println("message");
        message=inp.nextLine();
        System.out.println("Date");
        date=inp.next();
    }

}