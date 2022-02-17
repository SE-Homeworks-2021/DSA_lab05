import java.util.Scanner;


public class Ex1 {

    public static void main(String[] args) {
        // write your code here

        Scanner keyboard = new Scanner(System.in);

        int num;
        System.out.print("Please enter number: ");

        num = keyboard.nextInt();

        SimRecur(num);


    }

    public static void SimRecur(int count) {

        count--;
        System.out.print("The value of the count is ");
        System.out.println(count);

        if (count > 0)
        {
            SimRecur(count);
        }

        System.out.println("Now, the count is \"" + count + "\"");


    }

}
