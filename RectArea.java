 /* write a java program calculate the area of room by creating object 
 and using accessing variables and accessing method  */
  class Rectangle {
    int length,width;
    void getData(int x,int y)
    {
        length=x;
        width=y;
    }
        int RectArea (){
        int area =length * width;
        return (area);
    }
}
   public class RectArea {
    public static void main(String arg[])
    {
        int area1,area2;
        Rectangle rect1=new Rectangle();
        Rectangle rect2=new Rectangle();
        rect1.length=15;
        rect1.width=10;
        area1=rect1.length * rect1.width;
        rect2.getData (20,12);
        area2=rect2.RectArea();
        System.out.println("Area1="+area1);
        System.out.println("Area2="+area2);
    }
}



    

