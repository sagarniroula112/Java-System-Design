//package Practice Set 1;
import java.util.Scanner;

public class cgpa {
    public static void main(String[] args)
    {
        float total = 0;
        Scanner sc = new Scanner(System.in);
        float mark[] = new float[3];
        for (int i=0;i<3;i++)
        {
            System.out.print("Enter the mark: ");
            mark[i] = sc.nextFloat();
            total += mark[i];
        }
        float res = (total/300) * 100;
        System.out.println("THE RESULT:: "+res);
    }
}

