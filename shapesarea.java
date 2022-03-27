import java.util.*;
abstract class shapes {
    double dim1, dim2;

    shapes(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    abstract double printArea();
}

    class rectangle extends shapes {
        rectangle(double a, double b) {
            super(a, b);
        }

        double printArea() {
            return dim1 * dim2;
        }
    }

    class triangle extends shapes {
        triangle(double a, double b) {
            super(a, b);
        }

        double printArea() {
            return 0.5 * dim1 * dim2;
        }
    }

    class circle extends shapes {
        circle(double a, double b) {
            super(a, b);
        }

      
        double printArea() {
            return dim1 * dim2 * dim2;
        }
    }
class shapesarea {
    public static void main(String[] args) {
        //shapes s1;
        rectangle r =new rectangle(20,30);
        triangle t =new triangle(10,15);
        circle c =new circle(3.14,4);
        //s1=r;
        System.out.println("Area of Rectangle: "+r.printArea());
        //s1=t;
        System.out.println("Area of Triangle: "+t.printArea());
        //s1=c;
        System.out.println("Area of Circle: "+c.printArea());
    }
}