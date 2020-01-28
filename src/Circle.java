//creating the blueprint of an object
public class Circle {
    //properties (data members)
    double radius;
    double area;
    double circumference;
    
    //operations (methods)
    public void computeArea(){
        area=3.14*radius*radius;
        System.out.println("Area of Circle  : "+area);
    }
    public void computeCircumference(){
        circumference=2*3.14*radius;
        System.out.println("Circumference of Circle : "+circumference);
    }
}
