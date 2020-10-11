package Session2;

public class Faculty {
    private Lab[] labs;
    private Student[] students;
    private Student master;
    private String name;
    private int labNum;

    public Faculty(String name, int labNum) {
        this.name = name;
        this.labNum = labNum;
    }

    public void setLabs(Lab[] labs) {
        this.labs = labs;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void setMaster(Student master) {
        this.master = master;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLabNum(int labNum) {
        this.labNum = labNum;
    }

    public Lab[] getLabs() {
        return labs;
    }

    public Student[] getStudents() {
        return students;
    }

    public Student getMaster() {
        return master;
    }

    public String getName() {
        return name;
    }

    public int getLabNum() {
        return labNum;
    }
}
