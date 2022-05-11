import java.io.*;

public class Prog19
{
    public static void main(String args[])
    {
        int multiplier, multiplicand, product;
        multiplier = 4;
        multiplicand = 0;
        product = 0;

        while (multiplier < 7)
        {
            while (multiplicand < 10)
            {
                multiplicand++;
                product = multiplier * multiplicand;
                System.out.println(multiplier + " * " + multiplicand + " = " + product);
            }

            multiplier++;
            multiplicand = 0;
            product = 0;
            System.out.println("");
        }

        System.out.println("Prog19");
    }
}
