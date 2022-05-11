import java.io.*;

public class Prog23
{
    public static void main(String args[])
    {
        int multiplier, multiplicand, product;
        multiplier = 4;
        multiplicand = 0;
        product = 0;
        
        do
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
        } while (multiplier < 7);

        System.out.println("Prog23");
    }
}
