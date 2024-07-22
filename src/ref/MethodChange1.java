package ref;
import static ref.MethodChange2.changeReference;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println(a);
        changePrimitive(a);
        System.out.println(a);

    }

    static void changePrimitive(int x) {
        x = 20;
    }
}
