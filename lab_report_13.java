/*write a java program using while loop with break and continue
 statement */
import java.util.Scanner;
public class lab_report_13 {
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner (System.in);
        while(true)
        {
            System.out.println("Input an integer:");
            n=sc.nextInt();
            if(n != 0){
                System.out.println("You entered:"+n);
                continue;
            }
            else{
                break;
            }
        }
        sc.close();
    }
    
}
