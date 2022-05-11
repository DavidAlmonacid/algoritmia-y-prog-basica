import java.io.*;

public class Prog5
{
    public static void main(String args[])
    {
        int n, s;
        n = 0;
        s = 0;

        do
        {
            n++;
            s += n;
            System.out.println(n);
        } while (n < 100);

        System.out.println("\n" + s);
        System.out.println("\nProg5");
    }
}
