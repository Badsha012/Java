/*write a programmer how to print get using input scanner library */
import java.util.Scanner;
public class lab_report_02 {
    public static void main(String args [])
    {
        int a;
        float b;
        String t;
        double c;

        Scanner sc =new Scanner (System.in);
        System.out.println("Enter a string:");
        t=sc.nextLine();
        System.out.println("Enter a string:"+t);
        System.out.println("Enter a integer:");
        a=sc.nextInt();
        System.out.println("Enter a integer:"+a);
        System.out.println("Enter a float:");
        b=sc.nextFloat();
        System.out.println("Enter a float:"+b);
        System.out.println("Enter a double:");
        c=sc.nextDouble();
        System.out.println("Enter a double:"+c);

        sc.close();
    }
    
}
