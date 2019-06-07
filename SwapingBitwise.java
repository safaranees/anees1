import java.util.Scanner;
public class JavaExample 
{
    public static void main(String args[])
    {
        int num1, num2;
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        scanner.close();
        System.out.println(num1+" "+num2);
    }
}
