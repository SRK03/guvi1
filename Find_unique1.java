import java.util.*;
public class Find_unique1
{
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        System.out.print(findSingle(a, n));
    }
    public static int findSingle(int a[], int size)
    {
     int res = a[0];
     for (int i=1; i < size; i++)
     res = res ^ a[i];
     return res;
    }
}
        
