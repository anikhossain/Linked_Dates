/*
 * this is our own exception. When month ,day or year will be unvalid it will throw our exception                                                      //// Tanvir Hossain lab-11C
 */
public class IllegalDate212Exception extends IllegalArgumentException {
	public IllegalDate212Exception(String message) {  // This method is to throw our Date212 exception
	      super (message);
	   }

}
