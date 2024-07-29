package static1;

public class DataCountMain2 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Data2 data2 = new Data2("rudgh99",counter);
        Data2 data3 = new Data2("dons",counter);

        System.out.println(counter.count);
    }
}
