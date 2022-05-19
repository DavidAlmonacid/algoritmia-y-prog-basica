import java.io.*;

public class Prog29
{
    public static void main(String args[]) throws IOException
    {
        int number, count;
        number = 0;
        count = 3;
        String value;
        BufferedReader UserInput = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Write a number greater than or equal to 3: ");
        value = UserInput.readLine();
        number = Integer.parseInt(value);
        
        if (number > 2)
        {
            while (count <= number)
            {
                System.out.println(count);
                count += 3;
            }
        }
        else
            System.out.println("ERROR, the number must be greater than or equal to 3.");
        
        System.out.println("\nProg29");
    }
}
