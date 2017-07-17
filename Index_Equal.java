import java.util.*;
class Index_Equal
{
    public static void main(String []args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            if(a[j]==j)
            {
                System.out.println(a[j]);
            }
        }
    }
}
