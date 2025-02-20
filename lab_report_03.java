/*write a programmer to convert Fahrehite to celcius and celcius to Frahrehite */
import java.util.Scanner;

public class lab_report_03 {
    public static void main(String args[])
    {
        float celcius,frahrehite;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the celcius scale:");
        celcius=sc.nextFloat();
        celcius=((celcius-32)*5/9);
        System.out.println("The celcius scale:"+celcius);
        frahrehite=sc.nextFloat();
        System.out.println("Enter the fraherite scale:");
        frahrehite=((frahrehite+160)*9/5);
        System.out.println("Enter the Frahreite scale:"+frahrehite);
        sc.close();


    }

    
}
