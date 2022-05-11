import java.io.*;

public class Prog7
{
    public static void main(String args[])
    {
        int num, product;
        num = 0;
        product = 0;

        while (num < 1000)
        {
            num++;
            product = num * num;
            System.out.println(num + " squared is: " + product);
        }

        System.out.println("\nProg7");
    }
}
