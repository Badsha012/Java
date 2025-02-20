/*write a java programmer to calculate the factrial value of small
 and a large number  */
import java.util.Scanner;
public class lab_report_08 {
    public static void main(String args[])
    {
        int x,fact=1;
        Scanner sc =new Scanner (System .in);
        System .out.println("Enter the number:");
        x=sc.nextInt();
        for(int i=1;i<=x;i++)
        {
            fact=fact*i;
        }
         System.out.println("Factorial number is:"+fact);
        sc.close();

    }
    
}
