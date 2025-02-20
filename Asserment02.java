 class Circle {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getArea() {
    return Math.PI * radius * radius;
  }

  public double getCircumference() {
    return 2 * Math.PI * radius;
  }
}
public class Asserment02 {
    public static void main(String[] args) {
        int r = 5;
        Circle circle = new Circle(r);
        System.out.println("Radius of the circle is " + r);
        System.out.println("The area of the circle is " + circle.getArea());
        System.out.println("The circumference of the circle is " + circle.getCircumference());
        r = 8;
        circle.setRadius(r);
        System.out.println("\nRadius of the circle is " + r);
        System.out.println("The area of the circle is now " + circle.getArea());
        System.out.println("The circumference of the circle is now " + circle.getCircumference());
      }
    }
    

