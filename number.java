
import java.util.*;

public class number {
    public static void main(String [] args)
    {
        System.out.println("Enter number to be printed");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("**********");
        int i = 0;
        while (i <= n) {
            System.out.println(i);
            i++;
        }
    }
    
}
