/*write a program to print the ravers of a numbers */
public class lab_report_10 {
    public static void main(String args [])
    {
        int n=12345,reverse=0;
        while(n !=0)
        {
            reverse=reverse * 10;
            reverse= reverse + n%10;
            n=n/10;

        }
        System.out.println("Enter the reverse number ="+reverse);
        

    }
    
}
