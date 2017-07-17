import java.util.*;
class Find_unique
{
    public static void main(String []args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=scan.nextInt();
        Arrays.sort(a);
        for(int i = 0; i < n; i++)
        {
            if(i<n-2)
            {
            if(a[i]!=a[i+1])
            {
                System.out.print(a[i]);
                break;
            }
            i++;
            }
            else
            System.out.print(a[n-1]);
        }
    }
}
