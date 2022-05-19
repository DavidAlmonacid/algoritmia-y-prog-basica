import java.io.*;

public class Prog28
{
    public static void main(String args[]) throws IOException
    {
        int number, remainder;
        number = 0;
        remainder = 0;
        String value;
        BufferedReader UserInput = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Write a number: ");
        value = UserInput.readLine();
        number = Integer.parseInt(value);
        remainder = number % 2;
        
        if (remainder == 0)
            System.out.println("The number is even.");
        else
            System.out.println("The number is odd.");
        
        System.out.println("\nProg28");
    }
}
