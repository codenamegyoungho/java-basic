package oop1;

public class ValueDataMain {
    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        valueData.add();
        valueData.add();
        valueData.add();
    }

    static void add(ValueData valueData) {
        valueData.value++;
        System.out.println(valueData.value);
    }
}
