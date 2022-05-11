import java.io.*;

public class Prog16
{
    public static void main(String args[])
    {
        int multiplier, multiplicand, product;
        multiplier = 4;
        multiplicand = 0;
        product = 0;

        while (multiplicand < 10)
        {
            multiplicand++;
            product = multiplier * multiplicand;
            System.out.println(multiplier + " * " + multiplicand + " = " + product);
        }

        System.out.println("\nProg16");
    }
}
