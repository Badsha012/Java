/*write a java program to evaluate the grade of student using
 * nested if else caluse */
import java.util.Scanner;
public class lab_report_07 {
    public static void main (String args [])
    {
        int mark,pass;
        char grade;
        pass =25;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the marks:");
        mark=sc.nextInt();
        if(mark>=pass){
            if(mark>80)
            grade= 'A';
            else if(mark>80)
            grade='B';
            else if(mark>60)
            grade= 'C';
            else if(mark>50)
            grade='D';
            else if(mark>45) 
            grade='E';
            else
            grade='F';
            System .out.println("You passing the grade:"+grade);
        }
            else{
                grade='F';
                System.out.println("You failed and your grade:"+grade);
            }
        
        sc.close();
    }
 }
        


    
    

