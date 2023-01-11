import java.util.Scanner;

public class cbse_report {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double mark[] = new double[5];
        double total = 0.0;
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter marks:: ");
            mark[i] = sc.nextDouble();
            total += mark[i];
            System.out.println("HERE TOTAL: "+total);
        }
        double percent = (total/500)*100;
        System.out.println("THE PERCENT:: "+ percent);
        sc.close();
    }
    // double sci, math, acc, nep, eng;
    // int n;
    // System.out.println("Enter marks for Science, Math, Account, Nepali, English: ");
    // sci = sc.nextDouble();
    // math = sc.nextDouble();
    // acc = sc.nextDouble();
    // nep = sc.nextDouble();
    // eng = sc.nextDouble();
    
    // double percent;
    // percent = ((sci+math+acc+nep+eng)/500) * 100;
    // System.out.println("THE PERCENT:: "+percent);
}
