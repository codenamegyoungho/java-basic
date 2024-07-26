package access.ex;

public class MaxCounter {
    private int count = 0;
    private int max;


    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if (isValueValid()) {
            count += 1;
        } else {
            System.out.println("최대값입니다. 더이상 증가x");
            return;
        }
    }

    public int getCount() {
        return count;
    }

    private boolean isValueValid() {
        return count < max;
    }

}
