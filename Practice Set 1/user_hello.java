import javax.annotation.processing.SupportedOptions;

// package Practice Set 1;
import java.util.*;

public class user_hello {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.print("PLEASE ENTER YOUR NAME: ");
        name = sc.nextLine();
        System.out.println("Hello "+name+ "! "+"Have a Good Day!");

        sc.close();
    }
}
