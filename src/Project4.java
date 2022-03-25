import java.util.Arrays;
public class Project4 {
	 public static void main(String[ ] args) {
	        double value1 = 3.14;
	        System.out.println("The double before the method call: " + value1);
	        setToZero(value1);
	        System.out.println("The double after the method call:  " + value1);

	        double[ ] array1 = {2.5, 4.8, 9.07, 12.55, 55.7};
	        System.out.println("The array before the method call: " + 
	                           Arrays.toString(array1));
	        set2Zero(array1, 3);
	        System.out.println("The array after the method call:  " + 
	                           Arrays.toString(array1));
	    }

	    // This method fails to set value1 to zero.
	    public static void setToZero(double value2) {
	        value2 = 0;
	    }

	    // This method succeeds in changing array1.
	    public static void set2Zero(double[ ] array2, int index) {
	        array2[index] = 0;
	    }

}
