import java.io.*;

public class Prog26
{
    public static void main(String args[])
    {
        int multiplier, multiplicand, product;
        multiplier = 0;
        multiplicand = 0;
        product = 0;
        
        for (multiplier = 4; multiplier < 7; multiplier++)
        {
            while (multiplicand < 10)
            {
                multiplicand++;
                product = multiplier * multiplicand;
                System.out.println(multiplier + " * " + multiplicand + " = " + product);
            }
            
            multiplicand = 0;
            product = 0;
            System.out.println("");
        }
        
        System.out.println("Prog26");
    }
}
