package Session2;

/**
 * The Lab class represents a Lab in a Lab administration system.
 * It holds the Lab details relevant in our context.
 */

public class Lab {
    private Student[] students;
    private int avg;
    private String day;
    private int capacity;
    private int currentSize;

    /**
     * this method create a new student with a given name and ID number
     *
     * @param day      first name of student
     * @param capacity last name of student
     */

    public Lab(String day, int capacity) {
        this.day = day;
        this.capacity = capacity;
    }

    /**
     * get the student class objects as array
     *
     * @return student class list
     */
    public Student[] getStudents() {
        return students;
    }

    /**
     * @param students set a list of students
     */
    public void setStudents(Student[] students) {
        this.students = students;
    }

    /**
     * @return average of lab
     */
    public int getAvg() {
        return avg;
    }

    /**
     * calculate average of lab
     */
    public void calculateAvg() {
        int sum = 0;
        for (int i = 0; i < students.length; i++) {
            sum += students[i].getGrade();
        }
        avg = sum / students.length;
    }

    /**
     * @return day of lab
     */
    public String getDay() {
        return day;
    }

    /**
     * @param day set a day for lab
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * @return the capacity of lab
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @param capacity set a number as lab capacity
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * this method add a student to lab
     *
     * @param std refer to a student object
     */
    public void enrollStudent(Student std) {
        if (currentSize < capacity) {
            students[currentSize] = std;
            currentSize++;
        } else {
            System.out.println("Lab is full!!!");
        }
    }

    /**
     * print the student description and lab average
     */
    public void print() {
        for (int i = 0; i < students.length; i++) {
            System.out.println("std fname: " + students[i].getFirstName()
                    + " std id:" + students[i].getId()
                    + " std grade:" + students[i].getGrade());
        }
        calculateAvg();
        System.out.println("Lab AVG:" + getAvg());
    }
}
