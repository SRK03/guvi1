import java.util.*;
class hunter24
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=scan.nextInt();
        int target=scan.nextInt();
        int sum;
        for(int i=0;i<n;i++)
        {
            sum=a[i];
            for(int j=0;j<n;j++)
            {
                sum+=a[j];
                if(sum==target)
                {
                    System.out.println(a[i]+" and "+a[j]);
                    System.exit(0);
                }
                else
                    sum-=a[j];
            }
        }
    }
}
