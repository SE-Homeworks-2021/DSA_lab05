import java.util.Scanner;


public class Ex3_LOOP {

    public static void main(String[] args) {
	// write your code here

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter number: ");
        int number = keyboard.nextInt();

        System.out.print("Fibonacci result is ");
        System.out.println(FibonacciLoop(number));


    }

    public static int FibonacciLoop(int count)
    {
        int f1 = 0, f2 = 1, fn = 0;

        if (count < 0)
        {
            return 0;
        }

        else if(count == 1)
        {
            return 1;
        }

        else
        {
            for (int i = 2; i <= count; i++) {
                fn = f1 + f2;

                f1 = f2;
                f2 = fn;
            }

            return fn;
        }
    }

}   // end of class
