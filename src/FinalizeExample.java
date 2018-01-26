/**
 * @author Oh, Joon young
 * @since 2018-01-26
 **/
class Counter {
    private int no;

    public Counter(int no) {
        this.no = no;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}

public class FinalizeExample {
    public static void main(String[] args) {
        Counter counter = null;
        for (int i = 0; i < 50; i++) {
            counter = new Counter(i);
            counter = null;
            System.gc();
        }
    }
}
