import java.util.HashMap;
import java.util.Map;

public class ElementCount {
	    public static void main(String[] args) {
	        String example = "This is just a sample string";
	        int totalChar = 0;
	        char temp;
	        for (int i = 0; i < example.length(); i++) {
	            temp = example.charAt(i);
	            if (temp == 'T')
	                totalChar
	                ++;
	        }

	        System.out.println("T appears " + totalChar + " times in example")                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ;
	    }
	}