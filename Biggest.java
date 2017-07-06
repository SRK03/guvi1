import java.util.*;
class Biggest
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
int c=scan.nextInt();
if(a>b && a>c)
System.out.print("a is biggest");
else if(b>a && b>c)
System.out.print("b is biggest");
else
System.out.print("c is biggest");
}
}
