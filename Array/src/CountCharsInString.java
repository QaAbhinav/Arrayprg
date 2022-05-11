
public class CountCharsInString {
    public static void main(String[] args) {

        String example = "This is just a sample string";

        int stringLength = example.length();

        System.out.println("String length: " + stringLength);

        int stringLengthWithoutSpaces = example.replace(" ", "").length();
        
        System.out.println("String length without counting whitespaces: " + stringLengthWithoutSpaces);
    }
}