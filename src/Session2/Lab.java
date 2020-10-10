package Session2;

public class Lab {
    private Student[] students;
    private int avg;
    private String day;
    private int capacity;
    private int currentSize;

    public Lab(String day, int capacity) {
        this.day = day;
        this.capacity = capacity;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int getAvg() {
        return avg;
    }

    public void calculateAvg() {
        int sum = 0;
        for (int i = 0; i < students.length; i++) {
            sum += students[i].getGrade();
        }
        avg = sum / students.length;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void enrollStudent(Student std) {
        if (currentSize < capacity) {
            students[currentSize] = std;
            currentSize++;
        } else {
            System.out.println("Lab is full!!!");
        }
    }

    public void print() {

        for (int i = 0; i < students.length; i++) {
            System.out.println("std fname: " + students[i].getFirstName()
                    + " std id:" + students[i].getId()
                    + " std grade:" + students[i].getGrade());
        }
        System.out.println("Lab AVG:" + getAvg());
    }
}
