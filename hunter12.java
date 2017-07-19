import java.util.*;
import java.lang.*;
class hunter12
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int a[]=new int[50];
        int b[]=new int[50];
        for (int i=0;i<50;i++)
        {
            a[i]=scan.nextInt();
            b[i]=a[i];
        }
        Arrays.sort(b);
        int k=scan.nextInt();
        int l=b[50-4];
        int m=b[50-k];
        for(int i=0;i<50;i++)
        {
            if(l==a[i])
            {
                System.out.println("the 4th tallest person in class is roll no "+(i+1));
            }
             if(m==a[i])
            {
                System.out.println("the "+k+"th tallest person in class is roll no "+(i+1));
            }
        }
    }
}
