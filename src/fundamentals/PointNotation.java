package fundamentals;

public class PointNotation {

    public static void main(String[] args) {
        String str = "Hello World";
        str = str.replace("World", "Bruno");
        str = str.toUpperCase();
        str = str.concat("!!!");
        System.out.println(str);

        // Same result, with one line
        String y = "Hello World"
                .replace("World", "Bruno")
                .toUpperCase()
                .concat("!!!");
        System.out.println(y);
    }
}
