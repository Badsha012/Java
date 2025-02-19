/*write a java programmer to print the pattern*/
import java.util.Scanner;
public class lab_report_09 {
    public static void main(String args[])
    {
        int i,j,n;
        Scanner sc= new Scanner(System.in);
        System .out.println("Enter the number:");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
      
        sc.close();
    }
    
}
