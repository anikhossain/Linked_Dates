 /*
  * This class will show a window to choose the files in the computer                           // Tanvir Hossain lab-11C
  * and we will choose a text file form the text file we we will check if the dates are valid and 
  * append them in our own linked list and also will insert them into our tree map 
  */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.StringTokenizer;
import java.util.TreeMap;
public class FileMenuHandler implements ActionListener{            // This class is about showing the files and choosing between them
	 JFrame jframe;
	
	   public FileMenuHandler (JFrame jf) {
	      jframe = jf;
	   }
	   public void actionPerformed(ActionEvent event) {
	      String  menuName;
	      menuName = event.getActionCommand();
	      if (menuName.equals("Open"))
	         openFile( ); 
	      else if (menuName.equals("Quit"))
	         System.exit(0);
	   } //actionPerformed

	    private void openFile( ) {                                // this method is to open the chosen files
	       JFileChooser chooser;
	       int          status;
	       chooser = new JFileChooser( );
	       status = chooser.showOpenDialog(null);
	       if (status == JFileChooser.APPROVE_OPTION) 
	          readSource(chooser.getSelectedFile());
	       else 
	          JOptionPane.showMessageDialog(null, "Open File dialog canceled");
	    } //openFile
	  
	    private void readSource(File chosenFile) {                   // it reads the files and reads the valid or unvalid dates
	    	 TreeMap <Date212,Date212> treeMap = new TreeMap (new Date212Comparator());
	    UnsortedDateList L1 = new UnsortedDateList();
	    
		SortedDateList L2 = new SortedDateList();
	       String chosenFileName = chosenFile.getName();
	       TextFileInput reader = new TextFileInput(chosenFileName);
	       String f = reader.readLine();
			while (f != null) {
			StringTokenizer mytokens = new StringTokenizer(f, ","); // splits  the lines by comma
																
			while (mytokens.hasMoreTokens()) {
				String date = mytokens.nextToken();                     // date receives the tokens
				if (checkDate(date)==true) {
					Date212 G = new Date212(date);
					L1.append(G);
					//L2.InsertList(G);
					treeMap.put(G,null);
				}
				else
					System.out.println(date);                            // otherwise prints in the console
			}	
			f = reader.readLine();
		}
		reader.close();
		DateGUI frame = new DateGUI("Project 3",300,200);
		frame.printGui( L1 , treeMap);
	    frame.pack();	    
	    }
	    private static boolean checkDate(String F) {          // this function is needed to know if the string is a												        	// date or not
			if (F.length() != 8)
				return (false);                              // dates needs to be only 8 digits
			for (int s = 0; s < 8; s++) {
				if (!Character.isDigit(F.charAt(s)))
					return (false);
			} // for

			return (true);
		}// checkDAte 

}
