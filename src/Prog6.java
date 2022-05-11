import java.io.*;

public class Prog6
{
    public static void main(String args[])
    {
        int num, sum;
        num = 0;
        sum = 0;

        for (num = 1; num <= 100; num++)
        {
            sum += num;
            System.out.println(num);
        }

        System.out.println("\n" + sum);
        System.out.println("\nProg6");
    }
}
