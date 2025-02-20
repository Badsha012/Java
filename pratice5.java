import java.util .Scanner;
public class pratice5 {
    public static void main(String args[])
    {
      float temperatue;
      Scanner sc =new Scanner(System .in);
      System.out.println("enter the fahrenheit:");
      temperatue=sc.nextInt();
      temperatue=((temperatue - 32) * 5)/9;
      System.out.println("Temerture in celsius ="+temperatue);
      sc.close();

    }
    
}
