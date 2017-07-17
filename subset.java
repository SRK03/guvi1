import java.util.Scanner;
public class subset 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int n1= s.nextInt();
        int a1[] = new int[n];
        int a2[] = new int[n1];
        int count=0;
        for(int i = 0; i < n; i++)
            a1[i] = s.nextInt();
        for(int j = 0; j < n1; j++)
            a2[j] = s.nextInt();
        for(int i = 0; i < n1; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(a2[i]==a1[j])
                {
                    count++;
                }
            }
        }
        if(count==n1)
        System.out.println("a2 is the subset of a1");
        else
        System.out.println("a2 is not subset of a1");
    }
}
