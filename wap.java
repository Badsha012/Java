import java.util.Scanner;
public class wap {
    public static void main(String args [])
    {
        int i,n;
        int [] a= new int [5];
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the array length:");
        n= sc.nextInt();
        for(i=0;i<n;i++)
        {
            System.out.println("enter a["+i+"]:");
            a[i]=sc.nextInt();

        }
    
        

        sc .close();
    }
    
}
