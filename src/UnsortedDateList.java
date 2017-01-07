/*
 * Its a sub-class od DateList . This class saves the Date without sorting          // Tanvir Hossain lab-11C
 */
public class UnsortedDateList extends DateList{   
	 public void append (Date212 S) {               // This method makes the list without sorting
		 if (length ==0){
				DateNode newNode = new DateNode(S,null); 
				first =newNode;
				last =newNode;
				length ++;
				return;
		 }
				else{   DateNode newNode = new DateNode(S,null); 
				last.setNext(newNode);	
				last= newNode;
				length++;
				
				return ;
				}
		   }//append 

}
