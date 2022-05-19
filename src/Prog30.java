import java.io.*;

public class Prog30
{
    public static void main(String args[]) throws IOException
    {
        int num1, num2, num3;
        num1 = 0;
        num2 = 0;
        num3 = 0;
        String value;
        BufferedReader UserInput = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Write a number: ");
        value = UserInput.readLine();
        num1 = Integer.parseInt(value);
        
        System.out.print("Write another number: ");
        value = UserInput.readLine();
        num2 = Integer.parseInt(value);
        
        System.out.print("Write another number: ");
        value = UserInput.readLine();
        num3 = Integer.parseInt(value);
        
        if (num1 > num2)
        {
            if (num1 > num3)
                System.out.println("The greatest number is " + num1);
            else
                System.out.println("The greatest number is " + num3);
        }
        else
        {
            if (num2 > num3)
                System.out.println("The greatest number is " + num2);
            else
                System.out.println("The greatest number is " + num3);
        }
        
        System.out.println("\nProg30");
    }
}
