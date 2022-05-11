import java.io.*;

public class Prog4
{
    public static void main(String args[])
    {
        int n, s;
        n = 0;
        s = 0;

        while (n < 100)
        {
            n++;
            s += n;
            System.out.println(n);
        }

        System.out.println("\n" + s);
        System.out.println("\nProg4");
    }
}
