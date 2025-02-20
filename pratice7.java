import java.util.Scanner;

public class pratice7 {
    public static void main(String args[] )
    {
        int x,y;
        System.out.println("Enter x and y:");
        Scanner sc=new Scanner(System .in);
        x=sc.nextInt ();
        y=sc.nextInt ();
        System.out.println("Before swaping"+x +y);
        x=x + y;
        y=x - y;
        x=x - y;
        System .out.println("After swapping" +x +y);
        sc.close();
        


    }

    
}
