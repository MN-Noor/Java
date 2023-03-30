import java.util.*;
import java.util.InputMismatchException;
public class Fraction {
int deno,numer;
Scanner sc=new Scanner(System.in);
Fraction(int n,int d)
{
	numer=n;
	deno=d;
}
public Fraction(String s) throws FractionExceptions,NumberFormatException{
	String a[]=s.split("/");
	if(a.length!=2)
		throw new FractionExceptions("Format should be 1/2");
	numer=Integer.parseInt(a[0]);
	deno=Integer.parseInt(a[1]);
	if (deno==0)
		throw new FractionExceptions("Denominator can't be zero");
}
public String get()
{
	return numer+"/"+deno;
}
void reduceFraction()
{
	int gcd = 0;
	for(int i=1;i<=deno&&i<=numer;i++)
	{
		if(deno%i==0&&numer%i==0)
		{
			gcd=i;
		}
	}
	deno=deno/gcd;
	numer=numer/gcd;
}
Fraction multiplyFraction(Fraction f)
{
	Fraction f1=new Fraction(1,1);
	f1.numer=numer*f.numer;
	f1.deno=deno*f.deno;
	f1.reduceFraction();
	return f1;
}
Fraction divideFraction(Fraction f)
{
	Fraction f1=new Fraction(1,1);
	f1.numer=numer*f.deno;
	f1.deno=deno*f.numer;
	f1.reduceFraction();
	return f1;
}
Fraction addFraction(Fraction f)
{
	Fraction f1=new Fraction(1,1);
	f1.deno=deno*f.deno;
	f1.numer=(f1.deno/deno*numer)+(f1.deno/f.deno*f.numer);
	f1.reduceFraction();
	return f1;
}
Fraction subtractFraction(Fraction f)
{
	Fraction f3=new Fraction(1,1);
	f3.deno=deno*f.deno;
	f3.numer=(f3.deno/deno*numer)-(f3.deno/f.deno*f.numer);
	f3.reduceFraction();
	return f3;
}
}