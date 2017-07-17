import java.util.*;
class Possible_convertion
{
    public static void main(String args[])
    {   int count=1;
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        String[] arr=new String[s1.length()];
        boolean[] arrr=new boolean[arr.length];
        for(int i=0;i<s1.length()-2;i++)
        {   
            arr[i]=s1.substring(i,i+2);
            if((Integer.parseInt(arr[i])<26)&&(Integer.parseInt(arr[i])>0))
            {count++;
             arrr[i]=true;
            }
        }
        for(int i=0;i<arrr.length-2;i++)
        {
            if(arrr[i]&&arrr[i+2])
            count++;
        }
        System.out.print(count);
    }
}
