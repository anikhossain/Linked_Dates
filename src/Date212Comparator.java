/*                                                                       // Tanvir Hossain Lab-11c
 * we need this class so it will help our tree map to sort our dates using the compare to method from the Date212 class
 */
import java.util.Comparator;


public  class Date212Comparator implements Comparator <Date212>  {
	   public int compare(Date212 num1, Date212 num2) {
		      return num1.compareTo(num2);
	   }
}
