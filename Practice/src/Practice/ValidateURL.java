package Practice;

	import java.util.regex.Pattern;

	public class ValidateURL {
	    public static void main(String[] args) {
	        String url = "https://www.amazon.in"; // Example URL

	        // Regular expression for matching https://amazon.in and https://flipkart.com
	        String regex = "^https:\\/\\/(www\\.)?(amazon\\.in|flipkart\\.com)$";

	        // Validate the URL
	        boolean isValid = Pattern.matches(regex, url);

	        // Output the result
	        if (isValid) {
	            System.out.println(url + " is a valid URL.");
	        } else {
	            System.out.println(url + " is NOT a valid URL.");
	        }
	    }
	}

