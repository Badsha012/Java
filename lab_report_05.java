/*Write a programmer to add two number for small and large integers */
import java.util.Scanner;
public class lab_report_05 {
    public static void main(String args[]){
    int x,y,sum;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter x and y value:");
    x=sc.nextInt();
    y=sc.nextInt();
    sum=x+y;
    System.out.println("The two add number :"+sum);
    sc.close();
    }
}
