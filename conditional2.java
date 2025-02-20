public class conditional2 {
    public static void main(String args[])
    {
        int year=2024;
        if(year%400==0 && year %100 !=0 || year %400==0)
        {
            System.out.println("the year is leapyear");
        }
        
        else{
            System.out.println("the year is not leapyear");
        }
    }
    }
    

