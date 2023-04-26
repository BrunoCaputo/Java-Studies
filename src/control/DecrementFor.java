package control;

public class DecrementFor {

    public static void main(String[] args) {
        for (int i = 10; i >= 0; i -= 2) {
            System.out.printf("Counter: %d\n", i);
        }
    }
}
