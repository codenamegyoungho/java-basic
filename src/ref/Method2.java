package ref;

public class Method2 {
    public static void main(String[] args) {
        Student student1 = createStudent("경호", 26, 90);
        System.out.println(student1.name);
    }

    static Student createStudent(String name, int age, int grade) {
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;
    }
}
