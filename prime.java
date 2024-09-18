
import java.util.*;

public class prime {

    public static void main(String [] args)
    {
        boolean flag=true;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=2;i<n;i++)
        {
            if (n % i == 0) {
                flag = false;
                break;
            }

        }
        if (flag == true) {
            System.out.println("Its is not prime number");
        }
        else{
            System.out.println("It's a prime number");
        }

        
    }
    
}
