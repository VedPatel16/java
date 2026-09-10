// it explains abstraction

public class abstraction_26 {
    public static void main(String[] args) {
        circle c1=new circle(3);
        c1.area();   // abstract
        c1.display();  // concrete / normal

        triangle t1=new triangle(4,5);
        t1.area();  // abstract
        t1.display();  // concrete / normal

        rectangle r1=new rectangle(6,7);
        r1.area();  // abstract
        r1.display();  // concrete / normal

    }
}

abstract class shape{
    abstract void area();  // abstract method

    void display(){
        System.out.println("it is a shape.");    // concrete / normal method
    }
}

class circle extends shape{
    double radius;

    circle(double radius){
        this.radius=radius;
    }
    @Override
    void area(){
        System.out.println(Math.PI*radius*radius);
    }
}
class triangle extends shape{
    double base,height;

    triangle(double base,double height){
        this.base=base;
        this.height=height;
    }
    @Override
    void area(){
        System.out.println(0.5*base*height);
    }

}
class rectangle extends shape{
    double length,width;

    rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }

    @Override
    void area(){
        System.out.println(length*width);
    }
}

