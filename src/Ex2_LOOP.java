import java.util.Scanner;


public class Ex2_LOOP {

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);


        System.out.print("Enter BASE number: ");
        int base = keyboard.nextInt();

        System.out.print("Enter power number: ");
        int power = keyboard.nextInt();

        System.out.print("Power of "+base+" by "+power+" is ");
        System.out.println(PowerLOOP(base,power));




    }


    public static int PowerLOOP(int x , int n)
    {
        int resultLOOP = 1;

        for(int i = 1; i <= n; i++)
        {
            resultLOOP = resultLOOP*x;
        }

        return resultLOOP;
    }
}
