//
// Using parse method
//

public class StringInt {
    public static void main(String[] args) {
        String stringValue = "100";
        int intValue;
        intValue = Integer.parseInt(stringValue);
        System.out.println(intValue);
    }
}

public class IntString {
    public static void main(String[] args) {
        int intValue = 110;
        String stringValue;
        stringValue = Integer.toString(intValue);
        System.out.println(stringValue);
    }
}