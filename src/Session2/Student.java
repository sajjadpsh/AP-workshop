package Session2;

/**
 * The Student class represents a student in a student administration system.
 * It holds the student details relevant in our context.
 */

public class Student {
    private String firstName;
    private String lastName;
    private String id;
    private int grade;

    /**
     * this method create a new student with a given name and ID number
     *
     * @param firstName first name of student
     * @param lastName  last name of student
     * @param id        student ID
     */
    public Student(String firstName, String lastName, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.grade = 0;
    }
    /**
     * get the first name of student
     * @return firstName field
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     @param firstName set first name of a student
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /**
     * get the last name of student
     * @return lastName field
     */
    public String getLastName() {
        return lastName;
    }
    /**
     @param lastName set last name of a student
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**
     * get the student id of student
     * @return id field
     */
    public String getId() {
        return id;
    }
    /**
     @param id set student id of a student
     */
    public void setId(String id) {
        if (id.length() == 7)
            this.id = id;
        else
            System.out.println("Student number is invalid.");
    }
    /**
     * get the grade of student
     * @return grade field
     */
    public int getGrade() {
        return grade;
    }
    /**
     @param grade set grade of a student
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }
    /**
     * Print the student’s last name and ID number to the output terminal.
     */
    public void print() {
        System.out.println(lastName + ", student ID: " + id + ", grade: " + grade);
    }
}
