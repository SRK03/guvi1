import java.util.Scanner;
public class alphaorother
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        char ch = scan.next().charAt(0);
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
        System.out.print("Alphabet");
        else
        System.out.print("not an Alphabet");
    }
}
