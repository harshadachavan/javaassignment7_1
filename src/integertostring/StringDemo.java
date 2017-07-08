package integertostring;
/*
 * Strings, which are widely used in Java programming, are a sequence of characters. 
 * In Java programming language, strings are treated as objects.
 * The Java platform provides the String class to create and manipulate strings.
 * */
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String class has a static method valueOf() which takes int as argument and converts into string.    
	    int c = 12;
	    String str1 = String.valueOf(c);
	    System.out.println("String str1 = " + str1);
	    
	    //if its a signed integer the negative is preserved
	    int d = -12;
	    String str2 = String.valueOf(d);
	    System.out.println("String str2 = " + str2);
	    
	    
	}

}
