package Session5;


public class Main {
    public static void main(String[] args) {

        Circle circle1 = new Circle(10);
        Circle circle2 = new Circle(3);

        Rectangle rect1 = new Rectangle(8, 5,8,5);
        Rectangle rect2 = new Rectangle(6, 6,6,6);

        Triangle tri1 = new Triangle(3, 3, 3);
        Triangle tri2 = new Triangle(3, 4, 5);

        circle1.draw();
        rect1.draw();
        tri1.draw();
        System.out.println(tri1.isEquilateral());
        System.out.println(rect2.isSquare());
        System.out.println(rect1.equals(rect2));
//        Paint paint = new Paint();
//        paint.addCircle(circle1);
//        paint.addCircle(circle2);
//        paint.addRectangle(rect1);
//        paint.addRectangle(rect2);
//        paint.addTriangle(tri1);
//        paint.addTriangle(tri2);
//        paint.drawAll();
    }
}