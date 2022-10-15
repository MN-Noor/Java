import java.util.Scanner;
class Demo
{
    public static void main(String[] args)
    {
    //     double w,h,d;
    // Scanner inp= new Scanner(System.in);
    
    // System.out.println("Enter\nWidth:");
    // w=inp.nextDouble();
    // System.out.println("Enter\nHeight:");
    // h=inp.nextDouble();
    // System.out.println("Enter\nDepth:");
    // d=inp.nextDouble();
    
    Box mybox=new Box(4,6,7);
    Box mybox2=new Box(2,4,5);
    double volume=mybox.volume();
    System.out.println(volume);
if(mybox.isequal(mybox2))
{
    System.out.println("Volume are equal");
}
else
{
    System.out.println("Volume are not equal");
}
if(mybox.parameters_equal(mybox2))
{
    System.out.println("All Parameters Are Equal");
}
else
{
 System.out.println("All Parameters Are Not Equal");
}
    }
}