import javax.swing.*;
import java.util.Scanner;

public class ConvertToUpper {
public static void main(String[] args) {
    //JOptionPane panel = new JOptionPanel()
    //Scanner inputStream = new Scanner(System.in);
    String charInput;

    charInput = JOptionPane.showInputDialog("Enter a letter: ");

    //System.out.print("Enter a letter: ");

    if(charInput.matches(".*\\d.*"))
    {
        JOptionPane.showMessageDialog(null, "Not a letter");
       // System.out.println("Not a letter.");
    }
    else
    {
        JOptionPane.showMessageDialog(null, "The uppercase equivalent of " + charInput + " is " + charInput.toUpperCase());
        //System.out.println("The uppercase equivalent of " + charInput + " is " + charInput.toUpperCase());
    }
}
}
