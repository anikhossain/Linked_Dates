/*
 * this will be the GUI that we will show our unsorted and sorted dates                      // Tanvir Hossain lab-11C
 */
import java.io.FileReader;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;
/*
 *    we need  a GUI to display , so we create DateGui displaying object and make a printing 
 *    method to print the date lists in the GUI
 */
import java.awt.BorderLayout;
import java.awt.Container;  
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.text.html.HTMLDocument.Iterator;
      

public class DateGUI extends JFrame {
//private static final long serialVersionUID = 1L;
public DateGUI (String K, int h, int w ){                             // this constructor takes the parameters and designs the 
    // GUI as it was declared
           setTitle(K );
           setSize(250,250);
           setLocation(300,300);

           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // closes the program by clicking the close button

           setVisible(true);                                  // to show the GUI
}  
	
	public DateGUI (String title ){                             // this constructor takes the parameters and designs the 
		                                                     // GUI as it was declared
		setTitle(title );
		setSize(250,250);
		setLocation(300,300);
		createFileMenu();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // closes the program by clicking the close button
		
		setVisible(true);                                  // to show the GUI
	}
	
	private void createFileMenu() {                              // this method shows to choose the files
		JMenuItem item;
		JMenuBar menuBar = new JMenuBar();
		
		// ---File---
		JMenu fileMenu = new JMenu("File");
		FileMenuHandler fmh = new FileMenuHandler(this);

		item = new JMenuItem("Open"); // Open...
		item.addActionListener(fmh);
		fileMenu.add(item);

		fileMenu.addSeparator(); // add a horizontal separator line

		item = new JMenuItem("Quit"); // Quit
		item.addActionListener(fmh);
		fileMenu.add(item);
		
		
		JMenu editMenu = new JMenu("Edit");
		FileMenuHandler emh = new FileMenuHandler(this);
		
		item = new JMenuItem("Find");
		item.addActionListener(emh);
		editMenu.add(item);
		
		editMenu.addSeparator();
		
		item = new JMenuItem("Replace");
		item.addActionListener(emh);
		editMenu.add(item);
		
		setJMenuBar(menuBar);
		menuBar.add(fileMenu);
		menuBar.add(editMenu);

	} // createMenu
	public  void printGui( DateList unSorted, TreeMap french) {
		
		Container myContainPane = this.getContentPane();                  // finally this function
														               // takes the two array
		TextArea myTextArea = new TextArea();                        // and prints those in the GuI
		TextArea mySubscript = new TextArea();
		myContainPane.add(myTextArea, BorderLayout.WEST);
		myContainPane.add(mySubscript, BorderLayout.EAST);
		myTextArea.append("UNSORTED :"+ "\n");                       //printing the DateLists in the text area.
		mySubscript.append("SORTED :" + "\n");
	    myTextArea.append(unSorted.toString() + "\n");
	    Set set = french.entrySet();
	   java.util.Iterator  i =  set.iterator();
	    Map.Entry <Date212, Date212> me;
	    while (i.hasNext ()){
	    	me =(Map.Entry)i.next();
	    mySubscript.append(me.getKey() + "\n");
	    }

	}// printGui


}
