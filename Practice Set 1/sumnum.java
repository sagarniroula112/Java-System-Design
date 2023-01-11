// WAP to sum three numbers from the user::
import java.util.Scanner;

public class sumnum{
    public static void main(String[] args)
    {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int num[] = new int[3];
        for(int i=0;i<3;i++)
        {
            System.out.print("Enter the number: ");
            num[i] = sc.nextInt();
            sum += num[i];
        }
        System.out.println("SUM IS:: "+sum);
    }
    
}