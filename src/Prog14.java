import java.io.*;

public class Prog14
{
    public static void main(String args[])
    {
        int x, y;
        x = 0;
        y = 0;

        do
        {
            y = (x*x*x) + (x*x) - 5;
            System.out.println("When X is: " + x + ", Y is: " + y);
            x++;
        } while (x <= 10);

        System.out.println("\nProg14");
    }
}
