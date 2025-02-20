import java.util.Scanner;

public class pratice6 {
    //import java.util.Scanner;
    public static void main(String args[])
    {
        int a,b,temp;
        System.out.println("Enter a and b:");
        Scanner sc =new Scanner(System .in);
        a=sc.nextInt ();
        b=sc.nextInt ();
        System.out.println("Before Swapping "+a +b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("After Swappping" +a +b);
        sc. close ();

    }
    
}
