import java.util.*;
class Time complexity
{
    public static void main(String args[])
    {
        Scanner inn=new Scanner(System.in);
        int n=inn.nextInt();
        int count=0;
        int ar[]=new int[n];
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=inn.nextInt();
        }
        for(int i=0;i<ar.length;i++)
        {
            for(int j=i+1;j<ar.length;j++)
            {
                if(ar[i]==ar[j])
                {
                    System.out.print(ar[i]+" ");
                    //count+=1; //this will store the number of repeated elements.
                }
            }
        }
        //System.out.println(count);//it prints count of repeated elements.
    }
}

