import java.util.Scanner;
public class GreatestNumber
{
    public static void main(String args[])
    {
        int a[]=new int[10];
        Scanner scanner = new Scanner(System.in);
      
       for(int i=0;i<10;i++)
       {
           a[i]=scanner.nextInt();
       }
        
       int greatest=a[0];
       for(int i=0;i<10;i++)
       {
           if(a[i]>greatest)
           {
               greatest=a[i];
           }
       }
       
        System.out.println(greatest);
    }
}
