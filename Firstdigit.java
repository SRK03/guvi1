import java.io.*;
import java.util.*;
import java.lang.*;
class Firstdigit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str[]=new String[n];
        int d[]=new int[1000];
        Arrays.fill(d,0);
        String str1[]=new String[n];
        String a="";
        String[] o=new String[30];
        for(int i=0;i<n;i++)
        {
            str[i]=sc.next();
            if(str[i].length()==3){
                str1[i]=str[i];}
            else if(str[i].length()==2){
                str1[i]=str[i]+9;
                d[Integer.parseInt(str1[i])]++;}
            else{
                str1[i]=str[i]+0+9;
                d[Integer.parseInt(str1[i])]++;
                d[Integer.parseInt(str1[i])]++;}
        }
        Arrays.sort(str1);
        for(int j=n-1;j>=0;j--)
        { 
            if(d[Integer.parseInt(str1[j])]==2){
                a+=(str1[j].charAt(0));}
            else if(d[Integer.parseInt(str1[j])]==1){
                a+=(str1[j].charAt(0));
                a+=(str1[j].charAt(1));}
            else{
                a+=(str1[j]);}
        }
        int g=a.length()%3;
        if(g==0)
        {
            for(int i=0;i<a.length();i++)
            {
                o[i]=a.substring(i,i+3);
                System.out.print(o[i]);
                i=i+2;
                if(i<a.length()-1){
                System.out.print(",");}
            }
        }
        else
        {
            for(int j=0;j<g;j++){
                char r=a.charAt(j);
                System.out.print(r);}
                 System.out.print(",");
            for(int i=g;i<a.length();i++)
            {
                o[i]=a.substring(i,i+3);
                System.out.print(o[i]);
                i=i+2;
                if(i<a.length()-1){
                System.out.print(",");}
            }   
        }
    }
}
