import java.io.*;

public class Prog27
{
    public static void main(String args[])
    {
        int multiplier, multiplicand, product;
        multiplier = 0;
        multiplicand = 0;
        product = 0;
        
        for (multiplier = 4; multiplier < 7; multiplier++)
        {
            do
            {
                multiplicand++;
                product = multiplier * multiplicand;
                System.out.println(multiplier + " * " + multiplicand + " = " + product);
            } while (multiplicand < 10);
            
            multiplicand = 0;
            product = 0;
            System.out.println("");
        }
        
        System.out.println("Prog27");
    }
}
