import java.util.*;
import java.lang.*;
class hunter28
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        String str1[]=str.split("");
        Set <String> out=new LinkedHashSet<String>();
        for(int i=0;i<str1.length;i++)
        out.add(str1[i]);
        for(String d:out)
        System.out.print(d);
    }
}
