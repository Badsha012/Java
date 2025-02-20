import java.util.Scanner;

public class array2 {
    public static void main(String [] args)
    {
        int i,n;
        int [] a=new int[5];
        Scanner sc =new Scanner(System.in);
        System.out.println("enter array length:");
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            System.out.println("enter a["+i+"]:");

        }
        for(i=0;i<n;i++)
        System .out.println(a[i]);
        sc. close();
    

    }
    
}
