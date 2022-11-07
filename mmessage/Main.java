public class Main {
 public static void main(String[] args) {
    Mmessage[] msgdata;
    msgdata=new Mmessage[5];
msgdata[0]=new Mmessage("aymen","ayesha","Good Morning","2_7_2221");
msgdata[1]=new Mmessage("ahmed","zoha","Good night","2_7_2221");
msgdata[2]=new Mmessage("raza","sibgha","how are you","2_7_2221");
msgdata[3]=new Mmessage("maryam","ibtasam","how do you do","2_7_2221");
msgdata[4]=new Mmessage("fairy","imbisat","I'm Good","2_7_2221");

String mesg ="Good";

for (int i=0;i<5;i++)
{
if(msgdata[i].message.contains(mesg))
{
System.out.println(msgdata[i].Get());
}
}
String Sender="maryam";
for (int i=0;i<5;i++)
{
if(msgdata[i].sender==Sender)
{
System.out.println(msgdata[i].Get());
}
}
String rec="zoha";
for (int i=0;i<5;i++)
{
if(msgdata[i].sendto==rec)
{
System.out.println(msgdata[i].Get());
}
}
System.out.println(rec.length());
 
for (int i=0;i<rec.length();i++)
{

System.out.println(rec.charAt(i));

}
}  
 


}
