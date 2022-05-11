import java.io.*;

public class Prog8
{
    public static void main(String args[])
    {
        int num, product;
        num = 0;
        product = 0;

        do
        {
            num++;
            product = num * num;
            System.out.println(num + " squared is: " + product);
        } while (num < 1000);

        System.out.println("\nProg8");
    }
}
