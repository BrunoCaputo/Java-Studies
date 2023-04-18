package fundamentals;

/**
 * Primitive Types:
 * Numerics:
 * Byte -> -128 to +127 (1 Byte)
 * Short -> -32768 to +32767 (2 Bytes)
 * Int -> -2147483648 to 2147483647 (4 Bytes)
 * Long -> -9223372036854775808 to 9223372036854775807 (8 Bytes)
 * Float -> 1.40239846e-45f to 3.40282347e+38f (4 Bytes)
 * Double -> 4.94065645841246544e-324 to 1.79769313486231570e+308 (8 Bytes)
 * Alpha:
 * Char -> Any alphanumeric value
 * Boolean -> true or false
 */
public class PrimitiveTypes {

    public static void main(String[] args) {
        // Numeric types
        byte years = 15;
        short flyCounts = 500;
        int id = 541_512;
        long points = 5_123_546_454L;   // Can separate with "_"

        float salary = 7_500.60F;
        double sellingPrice = 2_991_797_103.05;

        // Boolean
        boolean vacation = false;

        // Alpha Type
        char status = 'A'; // Active

        System.out.println("Days: " + (years * 365));
        System.out.println("Flies: " + (flyCounts / 2));
        System.out.println("Point by BRL: " + (points / sellingPrice));
        System.out.println("Employee with id " + id + " has a salary of " + salary);
        System.out.println(vacation ? "Is on vacation" : "Is at work");
        System.out.println("Status: " + (status == 'A' ? "Active" : "Not active"));
    }
}
