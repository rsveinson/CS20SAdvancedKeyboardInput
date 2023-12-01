import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.NumberFormat;

/* ****************************************
 * Name:        Sveinson
 * Class:       CS20S
 * 
 * Assignment:  Getting input with JOptionPane
 *              This will be a mixed type record
 *              i.e. several item of data of different types
 *              read all at once from the pop-up
 **********************************************/
public class CS20SGettingMixedTypeRecords{
    public static void main(String[] args){
    // **** Constants ****
    
        final String nl = System.lineSeparator();
    
    // **** variables ****
    
        String banner = "";         // output banner
        String prompt = "";         // prompt for input
        
        String delim = "[ ,:/]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records
        
        String strin = "";          // intput
        String strout = "";         // used for formatted output
        
        // simple variables to receive keyboard input
        
        int number = 0;              // an int for input
        double floatingPoint = 0.0;  // a double for input
        char ch = 'a';                // a char for input
        
        String name = "";               // a string variable for intput
    
    // **** Objects ****
        // create a Scanner object to read input from the keyboard
        //Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();
    
    // **** banner ****
    
        banner = "*****************************" + nl;
        banner += "Name:        Sveinson" + nl;
        banner += "Class:       CS20S" + nl;
        banner += "Assignment:  Getting mixed type records" + nl;
        banner += "******************************" + nl;
        
        // now print the banner to the terminal window
        System.out.println(banner);
    
    // **** input ****
    
        // set up the prompt for the input
        prompt = "Enter a string, int, double and char.";
        
        // read in the string from the pop-up
        strin = JOptionPane.showInputDialog(banner + prompt);
        
        // now strin is "bob 24    12.56 c"
        // i have to split this up into tokens
        tokens = strin.split(delim);
        
        // now it looks like this
        //"bob" "24" "12.56" "c"
        
        // now I parse each token
        name = tokens[0];       // put the first token into name
        
        // the second token is parsed as int and placed into number
        number = Integer.parseInt(tokens[1]);
        
        // third token parsed as double and put into floatinPoint
        floatingPoint = Double.parseDouble(tokens[2]);
        
        // fourth is a char so we parse it a bit differently
        ch = tokens[3].charAt(0);
        
        // now each variable has it's data value read from the
        // keyboard.
        
        // some output to test
        System.out.println(nl);
        System.out.println("-----------------------------");
        System.out.println("Name: " + name);
        System.out.println("Number: " + number);
        System.out.println("Double: " + floatingPoint);
        System.out.println("Char: " + ch);
        System.out.println("-----------------------------");
        System.out.println(nl);
        
        
    
                
    // **** processing ****
    
    // **** output ****
    
    // **** closing message ****
    
        System.out.println();
        System.out.println("end of program");
        
    }// end main

}// end class
