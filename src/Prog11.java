import java.io.*;

public class Prog11
{
    public static void main(String args[])
    {
        int num, factorial;
        num = 0;
        factorial = 1;

        do
        {
            num++;
            factorial *= num;
            System.out.println("The factorial of " + num + " is: " + factorial);
        } while (num < 10);

        System.out.println("\nProg11");
    }
}
