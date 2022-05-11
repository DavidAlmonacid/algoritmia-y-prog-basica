import java.io.*;

public class Prog17
{
    public static void main(String args[])
    {
        int multiplier, multiplicand, product;
        multiplier = 4;
        multiplicand = 0;
        product = 0;

        do
        {
            multiplicand++;
            product = multiplier * multiplicand;
            System.out.println(multiplier + " * " + multiplicand + " = " + product);
        } while (multiplicand < 10);

        System.out.println("\nProg17");
    }
}
