import java.io.*;

public class Prog10
{
    public static void main(String args[])
    {
        int num, factorial;
        num = 0;
        factorial = 1;

        while (num < 10)
        {
            num++;
            factorial *= num;
            System.out.println("The factorial of " + num + " is: " + factorial);
        }

        System.out.println("\nProg10");
    }
}
