
                                                                                                  //Tanvir Hossain lab-11C
/*         Its my very own Linked List.  DateList will be lists of objects. if we wants we can store strings, floats, integers
*           but in this program we are storing object called Date212.
*           as in array we need for loops every time it takes O(n) time. if it is double nested loop it takes O(n^2) time
*           to make program faster we r using the DateList object
*/
public abstract class DateList {
	   protected DateNode first; 
	   protected DateNode last; 
	   protected int length;
	
	   public String toString() {              // to print the lists we need to convert Date212 to strings
			DateNode p = first;                  // so we made this method
			String returnString = "";
			while (p != null) {
				returnString += p.Y + "\n";
				p = p.next;
			}
			return returnString;
		}
}//class
