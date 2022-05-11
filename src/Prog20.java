import java.io.*;

public class Prog20
{
    public static void main(String args[])
    {
        int multiplier, multiplicand, product;
        multiplier = 4;
        multiplicand = 0;
        product = 0;

        while (multiplier < 7)
        {
            do
            {
                multiplicand++;
                product = multiplier * multiplicand;
                System.out.println(multiplier + " * " + multiplicand + " = " + product);
            } while (multiplicand < 10);

            multiplier++;
            multiplicand = 0;
            product = 0;
            System.out.println("");
        }

        System.out.println("Prog20");
    }
}
