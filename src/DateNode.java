

//Tanvir Hossain lab-11C
/*  DateNode will be an object and its going to be the elements of the lists
*   every DateNode will contain  one data and one pointer to the next data
*/

public class DateNode {
 public   Date212 Y;
 public   DateNode next;
   
DateNode (Date212 D, DateNode n){
	   Y= D;
	   next = n;
}//DN1
public void setY (Date212 D) {                //to set and get the data in the Node
	   Y =D;
}//SY
public Date212 getY (){
	   return Y;
}//GY
public void setNext (DateNode n){              // to set and get the pointers to next data
	   next = n;
}//SN
public DateNode getNext (){
	   return next;
}//GN

}//class


