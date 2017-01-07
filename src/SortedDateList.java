/*
 * This is a sub-class of Datelist. It saves the date by sorting. Tanvir Hossain lab-11C
 */
public class SortedDateList extends DateList{
	public void InsertList (Date212 S){            // this method makes the list by sorting Date212
		if (length ==0){
			DateNode newNode = new DateNode(S,null); 
			first =newNode;
			last =newNode;
			length ++;
			return;
		}
		DateNode previous = null;
		DateNode current =first;
	  while (current != null && current.getY().compareTo(S)== 1){
		 previous = current ;
			current = current.getNext();
			
		} //while 
		
		if (current == first){
			DateNode newNode11 = new DateNode(S,first); 
			first = newNode11;
			length++;
			return;
		}
		if (current == null){   
			DateNode newNode2 = new DateNode(S,null); 
			last.setNext(newNode2);
			last = newNode2;
			length++;
			return;
		} 
		DateNode newNode = new DateNode(S,null); 
		previous.setNext(newNode);
		newNode.setNext(current);
		length++;
		return;
	
	}//InsertListSorted   

}
