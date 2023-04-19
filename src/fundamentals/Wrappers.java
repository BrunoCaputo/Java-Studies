package fundamentals;

/**
 * Wrappers are classes that improves primitives variables
 */
public class Wrappers {

    public static void main(String[] args) {
        // Byte
        Byte b = 100;
        System.out.println(b.byteValue());

        // Short
        Short s = 1000;
        System.out.println(s.shortValue());

        // Int
        Integer i = 10000;
        System.out.println(i.intValue());

        // Long
        Long l = 100000L;
        System.out.println(l.longValue());

        // Bool
        Boolean bool = true;
        System.out.println(bool.booleanValue());

        // Char -> Every char value is with '', "" are for Strings
        Character c = '#';
        System.out.println(c.charValue());

        // Float
        Float f = 123.45F;
        System.out.println(f.floatValue());

        // Double
        Double d = 1234.4567;
        System.out.println(d.doubleValue());
    }
}
