// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float output = 0;

        System.out.println("enter first number:");
        float input1 = scan.nextInt();
        System.out.println("enter second number:");
        float input2 = scan.nextInt();

        System.out.println("enter 1 for addition enter 2 for subtraction enter 3 for multiplication and enter 4 for division");
        float inout3 = scan.nextInt();

        if(inout3==1)
        {
            output = add(input1, input2);
        }

        else if (inout3==2) {
            output = subtract(input1, input2);

        }

        else if (inout3==3) {
            output = multiply(input1, input2);
        }

        else if (inout3==4) {
            output = divide(input1, input2);
        }

        System.out.println("Output : " + output);

    }
    public static float add(float a, float b) {
        return a + b;
    }
    public static float subtract(float a, float b) {
        return a - b;
    }
    public static float multiply(float a, float b) {
        return a * b;
    }
    public static float divide(float a, float b) {
        return a / b;
    }

}