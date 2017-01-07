
                                                                           //Tanvir Hossain lab-11C
/*
 * Date212 will be the objects we are working with. we store the Date212 in the lists or in the map
 */
public class Date212 {
	private int month ;
	private int day,year;
	
	public Date212 (String d){       // Date212 is created by passing a string
		this(Integer.parseInt(d.substring(4,6)),Integer.parseInt(d.substring(6,8)) ,Integer.parseInt(d.substring(0,4)) );
	}//date212 
	
    public Date212 (int m, int d, int y){                          //after converting the strings in integer we finally check 
    	if (m<0 || m>12)throw  new IllegalDate212Exception("Month is not Valid");     // if the dates are realistic
    	if (d<0 || d>31) throw  new IllegalDate212Exception("Day is not Valid");
    	if (y<0 || y>2016)throw  new IllegalDate212Exception("Year is not Valid");
    	day= d;
    	month = m;
    	year = y;
    }//date212
    
    public String toString (){                          // its the manner we are printing the Daate212s 
    	String K = month+"/"+day+"/"+year; ;
    	return K;
    	
}// ToString
  public int compareTo(Date212 W){                         // we need to know which Date212 objects are bigger or smaller 
	   if  (this.year > W.year){return 1;  }     
	   if  (this.year==W.year && this.month < W.month){return 1;  }                        // so we use this compare to method
	   if  (this.year==W.year && this.month == W.month && this.day < W.day){return 1;  }  
	if (this.year== W.year && this.month ==W.month && this.day == W.day) {return 0;}
	   else {
	   return (-1);}
  }//compare 
 

}//class
