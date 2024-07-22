package ref;

public class Method1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        printStudent(student1, "띨띨", 26, 90);
        printStudent(student2, "띨", 25, 89);
    }
    static void printStudent(Student student,String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
        System.out.println(student.name +":" +student.age + ":" + student.grade);
    }
}
