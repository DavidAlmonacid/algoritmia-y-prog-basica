import java.io.*;

public class Prog15
{
    public static void main(String args[])
    {
        int x, y;
        x = 0;
        y = 0;

        for (x = 0; x <= 10; x++)
        {
            y = (x*x*x) + (x*x) - 5;
            System.out.println("When X is: " + x + ", Y is: " + y);
        }

        System.out.println("\nProg15");
    }
}
