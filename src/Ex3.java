import java.util.Scanner;


public class Ex3 {

    public static void main(String[] args) {
	// write your code here

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter number: ");
        int number = keyboard.nextInt();

        System.out.print("Fibonacci result is ");
        System.out.println(Fibonacci(number));


    }

    public static int Fibonacci(int fn)
    {
        if (fn < 1)
        {
            return 0;
        }

        else if(fn == 1)
        {
            return 1;
        }

        else
        {
            return Fibonacci(fn - 1) + Fibonacci(fn - 2);
        }

    }

}   // end of class
