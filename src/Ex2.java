import java.util.Scanner;


public class Ex2 {

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);


        System.out.print("Enter BASE number: ");
        int base = keyboard.nextInt();

        System.out.print("Enter power number: ");
        int power = keyboard.nextInt();

        System.out.print("Power of "+base+" by "+power+" is ");
        System.out.println(PowerRecur(base,power));




    }
    public static int PowerRecur(int x, int n)
    {
        if(n == 0)
        {
            return 1;
        }

        else
        {
            return x*PowerRecur(x,n-1);
        }
    }
}
