// package Practice Set 1;
import java.util.*;

//1km = 0.621mile
public class kilotomile {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double km, mile;
        System.out.println("------------------------");
        System.out.println("Enter the km: ");
        km = sc.nextFloat();
        mile = km * 0.621;
        System.out.println("THE DISTANCE IN MILE IS:: "+mile +" miles");
        // System.out.println("------------------------");
    }
}
