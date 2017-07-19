import java.util.*;
class hunter22
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int a[]=new int[n];
        int out[]=new int[n];
        Arrays.fill(out,1);
        for(int i=0;i<n;i++)
            a[i]=scan.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j!=i)
                out[i]*=a[j];
            }
            System.out.println(out[i]);
        }
        
    }
}
