import java.util.*;
public class Find_unique1
{
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        int n = scan.nextInt();
        int ar[] = new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=scan.nextInt();
        }
        System.out.print(findSingle(ar, n));
    }
    public static int findSingle(int ar[], int ar_size)
    {
     int res = ar[0];
     for (int i=1; i < ar_size; i++)
     res = res ^ ar[i];
     return res;
    }
}
        
