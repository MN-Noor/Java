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
//contains functions

for (int i=0;i<5;i++)
{
if(msgdata[i].message.contains(mesg))
{
System.out.println(msgdata[i].Get());
}
}
//compare to 
String Sender="maryam";

for (int i=0;i<5;i++)
{
if(msgdata[i].sender.compareTo(Sender)==0)
{
System.out.println(msgdata[i].Get());
}
}
String rec="zoha";
for (int i=0;i<5;i++)
{
if(msgdata[i].sender.compareTo(rec)==0)
{
System.out.println(msgdata[i].Get());
}
}
//length function
System.out.println(rec.length());
 //charAt function
for (int i=0;i<rec.length();i++)
{

System.out.println(rec.charAt(i));

}
//substring
String sentence="My name is Aymen NoorH9wGqyec";
System.out.println(sentence.substring(11));

}  
 


}
