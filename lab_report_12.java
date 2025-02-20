/*write a java program to find out the prime number among squre given 
interger */
import java .util.Scanner;
public class lab_report_12 {
    public static void main(String args[])
    {
        int n,sum;
        Scanner sc =new Scanner(System.in);
        System.out.println("Eneter number:");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            sum=i*i;
            System.out.println("squre number is="+sum);
        }
        sc.close();
        
    }
}
