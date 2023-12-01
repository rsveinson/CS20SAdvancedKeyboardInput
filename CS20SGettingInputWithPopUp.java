import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.NumberFormat;

/* ****************************************
 * Name:        Sveinson
 * Class:       CS20S
 * 
 * Assignment:  Getting input with JOptionPane
 **********************************************/
public class CS20SGettingInputWithPopUp{
    public static void main(String[] args){
    // **** Constants ****
    
        final String nl = System.lineSeparator();
    
    // **** variables ****
    
        String banner = "";         // output banner
        String prompt = "";         // prompt for input
        
        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records
        
        String strin = "";          // intput
        String strout = "";         // used for formatted output
        
        // simple variables to receive keyboard input
        
        int number = 0;              // an int for input
        double floatingPoint = 0.0;  // a double for input
        char ch = 'a';                // a char for input
    
    // **** Objects ****
        // create a Scanner object to read input from the keyboard
        //Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();
    
    // **** banner ****
    
        banner = "*****************************" + nl;
        banner += "Name:        Sveinson" + nl;
        banner += "Class:       CS20S" + nl;
        banner += "Assignment:  Getting input with JOptionPane" + nl;
        banner += "******************************" + nl;
        
        // now print the banner to the terminal window
        System.out.println(banner);
    
    // **** input ****
    
        // get a string from thne pop-up
        prompt = "Enter a string.";
        strin = JOptionPane.showInputDialog(banner + nl + prompt);
        JOptionPane.showMessageDialog(null,banner + nl + "You entered " + strin);
        
        // get an int from the pop-up
        prompt = "enter an integer.";
        //number = Integer.parseInt(JOptionPane.showInputDialog(nl + banner + prompt));
        
        strin = JOptionPane.showInputDialog(banner + nl + prompt);
        number = Integer.parseInt(strin);
        JOptionPane.showMessageDialog(null,banner +  nl + "You entered " + number);
        
        //get a double from the pop-up
        prompt = "enter a double.";
        floatingPoint = Double.parseDouble(JOptionPane.showInputDialog(banner + nl + prompt));
        JOptionPane.showMessageDialog(null,banner +  nl + "You entered " + floatingPoint);
        
    // **** processing ****
    
    // **** output ****
    
    // **** closing message ****
    
        System.out.println();
        System.out.println("end of program");
        
    }// end main

}// end class
