package Session2;

public class Test {
    public static void main(String[] args) {
        Student std1 = new Student("Ehsan", "Edalat", "9031066");
        Student std2 = new Student("Seyed", "Ahmadpanah", "9031806");
        Student std3 = new Student("Ahmad", "Asadi", "9031054");
//        std1.print();
        std1.setGrade(15);
//        std1.print();
//        std2.print();
        std2.setGrade(11);
//        std2.print();
//        std3.print();
        std3.setGrade(10);
        std3.setFirstName("HamidReza");
//        std3.print();

        int cap = 3;
        Lab ap = new Lab("sat",cap);
        Student[] stds = new Student[cap];
        ap.setStudents(stds);
        ap.enrollStudent(std1);
        ap.enrollStudent(std2);
        ap.enrollStudent(std3);
//        ap.enrollStudent(std3);
        ap.print();

    }
}
