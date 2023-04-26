package control;

public class SwitchWithoutBreak {

    public static void main(String[] args) {
        int age = 1;

        switch (age) {
            case 2:
                System.out.println("Can talk");
            case 1:
                System.out.println("Can walk");
            default:
                System.out.println("Can breath");
        }
    }
}
