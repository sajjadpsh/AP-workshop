package Session5.Part2;


public class Main {
    public static void main(String[] args) {

//        Shape tri = new Triangle(3,4,5);
//        Shape tri2 = new Triangle(3,3,4);
//        Triangle tri3 = new Triangle(3,3,3);
        Circle circ = new Circle(4);
        Triangle tri4 = new Triangle(3, 5, 4);
        Rectangle rect = new Rectangle(5, 6, 5, 6);
//        Rectangle rect3 = new Rectangle(6,6,6,6);
        Paint paint = new Paint();
//        paint.addShape(tri);
//        paint.addShape(tri2);
//        paint.addShape(tri3);
        paint.addShape(circ);
//        paint.addShape(rect);
//        paint.addShape(rect3);
        paint.addShape(tri4);
//        rect = rect3;
        paint.addShape(rect);
        paint.drawAll();
//        paint.printAll();
//        paint.describeEqualSides();
    }
}