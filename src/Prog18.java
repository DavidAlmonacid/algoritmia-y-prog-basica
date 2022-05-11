import java.io.*;

public class Prog18
{
    public static void main(String args[])
    {
        int multiplier, multiplicand, product;
        multiplier = 4;
        multiplicand = 0;
        product = 0;

        for (multiplicand = 1; multiplicand <= 10; multiplicand++)
        {
            product = multiplier * multiplicand;
            System.out.println(multiplier + " * " + multiplicand + " = " + product);
        }

        System.out.println("\nProg18");
    }
}
