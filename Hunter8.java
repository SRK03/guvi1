import java.util.Scanner;
public class Hunter8 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        for(int i = 0; i < n-2; i++)
        {
            for(int j = i+1; j < n; j++)
            {
                for(int k =i+2; j < n; j++)
                {
                    if(a[i]+a[j]==a[k])
                    {
                    System.out.println(i+" "+j+" "+" "+k);
                    System.exit(0);
                    }
                }
            }
        }
    }
}
