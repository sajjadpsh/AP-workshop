package Session5;


import java.util.ArrayList;
import java.util.Objects;

public class Rectangle {
    private ArrayList<Double> sides;

    /**
     * Create a new Rectangle with a given sides.
     *
     * @param a The first side of rectangle.
     * @param b The second side of rectangle.
     */
    public Rectangle(double a, double b) {
        sides = new ArrayList<>();
        sides.add(a);
        sides.add(b);
    }

    /**
     * Determine square condition of rectangle.
     * @return true if the rectangle is square, false otherwise.
     */
    public boolean isSquare() {
        if(sides.get(0).equals(sides.get(1))) {
            return true;
        }
        return false;
    }

    /**
     * get The sides collection.
     * @return sides field.
     */
    public ArrayList<Double> getSides() {
        return sides;
    }

    /**
     * calculate perimeter of shape.
     * @return perimeter
     */
    public double calculatePerimeter() {
        return (2*( sides.get(0) + sides.get(1)));
    }

    /**
     * calculate area of shape.
     * @return area
     */
    public double calculateArea() {
        return (sides.get(0) * sides.get(1));
    }

    /**
     * Print the Shape and Perimeter and Area to the output terminal.
     */
    public void draw() {
        System.out.println("Rectangle: Perimeter: " + calculatePerimeter() + " Area: " + calculateArea());
    }

    /**
     * Determine whether the given rectangle equals the rectangle.
     * @param o The rectangle to be checked.
     * @return true if the given rectangle is valid, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;

        Rectangle rectangle = (Rectangle) o;

        return getSides() != null ? getSides().equals(rectangle.getSides()) : rectangle.getSides() == null;
    }

    /**
     * Make a hashcode depends on sides.
     * @return code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getSides());
    }

    /**
     * get a String for rectangle and sides.
     * @return a String.
     */
    @Override
    public String toString() {
        return "Shape is Rectangle. sides are : " + sides;
    }
}
