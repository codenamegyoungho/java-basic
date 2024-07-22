package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentNames = new String[]{"학생1", "학생2", "학생3"};
        int[] studentAges = new int[]{15, 16, 17};
        int[] studentGrade = new int[]{90, 80, 70};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println(studentNames[i] + ":" + studentAges[i] + ":" + studentGrade[i]);
        }


    }
}
