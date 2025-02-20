/*Write a java program calculate the area of room by creating object and using accessing 
 * variables and accessing method
 */
 class lab_report_15 {
    int length,width;
    void getData(int x,int y){
        length=x;
        width=y;
    }
    int rectArea(){
        int area=length * width;
        return (area);
    }
}
public class  lab_report_15{
    public static void main(String args[])
    {
        int a,b;
        RectArea rect1 =new RectArea();
        RectArea rect2= new RectArea();
        rect1.length=15;
        rect1.width=10;
        area1=rect1.length * rect1.width;
        rect2=getData(20,12);
        area2=rect2.rectArea();
        System.out.println("Area1="+area1);
        System.out.println("Area2="+area2);

    }
}
