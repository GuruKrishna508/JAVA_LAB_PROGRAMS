package Advanced java;
/*
 * key concepts of interface:
 * interface is  collection of undefined methods where any class can access it .
 * a class can use one or more interfaces
 * a class can use interface and can extend the class but sytatically extend comes first
 * a class actually wont extend the interface but it implements the interface
 * in java since multiclass inheritance is not possible it can be implemented by interface problem
 * the variables and methods in interface are final and static but public
 */
interface shape{
    void printArea();
}
class Rectangle implements shape{
    float len,bre;
    Rectangle(float len,float bre){
        this.len=len;
        this.bre=bre;
    }
    public void printArea(){
        System.out.println("The area of the rectangle is "+(len*bre));

    }
}
class Triangle implements shape{
    float base,height;
    Triangle(float base,float height){
        this.base=base;
        this.height=height;
    }
    public void printArea(){
        System.out.println("The area of the triangle is "+(0.5*base*height));
    }
}
class Circle implements shape{
    float radius;
    Circle(float radius){
        this.radius=radius;
    }
    public void printArea(){
        System.out.println("The area of the circle is "+(3.14*radius*radius));
    }
}

public class BP1 {
    public static void main(String [] args){
        Rectangle r=new Rectangle(2.2f,3.3f);
        r.printArea();
        Triangle t= new Triangle(8.6f,2.5f);
        t.printArea();;
        Circle c=new Circle(5.2f);
        c.printArea();


    }
    
}
/*
 * if you want to take the user input you should have to pass scanner object in each of the method
 */
