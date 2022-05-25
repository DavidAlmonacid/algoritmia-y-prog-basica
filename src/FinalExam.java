import javax.swing.JOptionPane;

public class FinalExam {
    public static void main(String[] args) {
        int value1 = Integer.parseInt(JOptionPane.showInputDialog("Write a first integer number"));
        System.out.println(value1);

        int value2 = Integer.parseInt(JOptionPane.showInputDialog("Write a second integer number"));
        System.out.println(value2);

        int value3 = Integer.parseInt(JOptionPane.showInputDialog("Write a third integer number"));
        System.out.println(value3);

        int value4 = Integer.parseInt(JOptionPane.showInputDialog("Write a fourth integer number"));
        System.out.println(value4 + "\n");

        int smallestValue;
        int greatestValue;

        if ((value1 > value2) && (value1 > value3) && (value1 > value4)) {
            greatestValue = value1;

            if ((value2 < value3) && (value2 < value4)) smallestValue = value2;
            else if ((value3 < value2) && (value3 < value4)) smallestValue = value3;
            else smallestValue = value4;
        }
        else if ((value2 > value1) && (value2 > value3) && (value2 > value4)) {
            greatestValue = value2;

            if ((value1 < value3) && (value1 < value4)) smallestValue = value1;
            else if ((value3 < value1) && (value3 < value4)) smallestValue = value3;
            else smallestValue = value4;
        }
        else if ((value3 > value1) && (value3 > value2) && (value3 > value4)) {
            greatestValue = value3;

            if ((value1 < value2) && (value1 < value4)) smallestValue = value1;
            else if ((value2 < value1) && (value2 < value4)) smallestValue = value2;
            else smallestValue = value4;
        }
        else {
            greatestValue = value4;

            if ((value1 < value2) && (value1 < value3)) smallestValue = value1;
            else if ((value2 < value1) && (value2 < value3)) smallestValue = value2;
            else smallestValue = value3;
        }

        long factorial = 1;
        for (int i = 1; i <= smallestValue; i++) factorial *= i;

        if (greatestValue % 2 == 0) System.out.println("The greatest number is " + greatestValue + ", and is even");
        else System.out.println("The greatest number is " + greatestValue + ", and is odd");

        if (smallestValue % 7 == 0) System.out.println("The smallest number is " + smallestValue + ", multiple of 7: YES, factorial: " + factorial);
        else System.out.println("The smallest number is " + smallestValue + ", multiple of 7: NO, factorial: " + factorial);
    }
}
