import java.io.*;

public class Prog25
{
    public static void main(String args[])
    {
        int multiplier, multiplicand, product;
        multiplier = 0;
        multiplicand = 0;
        product = 0;
        
        for (multiplier = 4; multiplier < 7; multiplier++)
        {
            for (multiplicand = 1; multiplicand <= 10; multiplicand++)
            {
                product = multiplier * multiplicand;
                System.out.println(multiplier + " * " + multiplicand + " = " + product);
            }
            
            product = 0;
            System.out.println("");
        }
        
        System.out.println("Prog25");
    }
}
