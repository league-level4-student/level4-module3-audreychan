package _02_gotta_catchem_all;

public class ExceptionMethods {
	
	double divide(double a, double b) throws IllegalArgumentException{
		if(b == 0) throw new IllegalArgumentException();
		return a/b;
	}
	
	String reverseString(String str) throws IllegalStateException{
		String fin = "";
		if(str.length() == 0) throw new IllegalStateException();
		
		for(int i = str.length()-1; i >= 0; i--) {
			fin += str.charAt(i);
		}
		return fin;
	}
}
