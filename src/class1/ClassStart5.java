package class1;

public class ClassStart5 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 17;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생1";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = new Student[]{student1,student2};
        for (Student student : students) {
            System.out.println(student.name + ":" + student.age + ":" + student.grade);
        }
    }
}
