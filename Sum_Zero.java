import java.util.Scanner;
public class Sum_Zero 
{
    public static void main(String[] args) 
    {
        int n, ith = 0, jth = 1, sum, out;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = s.nextInt();
        out=Math.abs(a[0] + a[1]);
        for(int i = 0; i < n; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                sum = Math.abs(a[i] + a[j]);
                if(sum < out)
                {
                    ith = i;
                    jth = j;
                    out = sum;
                }
            }
        }
        System.out.println(a[ith]+" "+a[jth]); 
    }
}
