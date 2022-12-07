import java.util.Scanner;
class Subject
{
    String Name;
    int CrHours;
    String courseCode;
Subject(String nm ,int cr,String cc)
{
Name=nm;
CrHours=cr;
courseCode=cc;
}
String get()
{
    String r;
    r="Subject Name:"+Name+"\nCr Hours:"+CrHours+"\nCourse Code:"+courseCode;
return r;
}
void Set()
{
    Scanner inp =new Scanner(System.in);
    System.out.print("Subject Name:");
    Name=inp.nextLine();
    System.out.print("Credit Hours:");
    CrHours=inp.nextInt();
    System.out.print("Course Code:");
    courseCode=inp.next();

}

}