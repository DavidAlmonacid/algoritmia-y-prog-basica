import java.io.*;

public class Prog13
{
    public static void main(String args[])
    {
        int x, y;
        x = 0;
        y = 0;

        while (x <= 10)
        {
            y = (x*x*x) + (x*x) - 5;
            System.out.println("When X is: " + x + ", Y is: " + y);
            x++;
        }

        System.out.println("\nProg13");
    }
}
