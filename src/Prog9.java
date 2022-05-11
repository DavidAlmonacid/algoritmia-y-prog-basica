import java.io.*;

public class Prog9
{
    public static void main(String args[])
    {
        int num, product;
        num = 0;
        product = 0;

        for (num = 1; num <= 1000; num++)
        {
            product = num * num;
            System.out.println(num + " squared is: " + product);
        }

        System.out.println("\nProg9");
    }
}
