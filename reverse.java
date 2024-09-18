
import java.util.*;


public class reverse {
    public static void  main(String[] args) 
    {
        System.out.println("enter number to be reversed");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reverse = 0;
        while(n!=0)
        {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;

        }
        
        System.out.print("Reverse of the given number is: "+ reverse);


            
            
    }

        
}
