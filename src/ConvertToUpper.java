import javax.swing.*;

public class ConvertToUpper {
// Written by: Mike Baldwin
// Computes the average of a set of values entered by the user, e.g. with
//     10.0 5.0 6.0 9.0 0.0
// The average is 7.5

public static void main(String[] args) {
    //JOptionPane panel = new JOptionPanel()
    //Scanner inputStream = new Scanner(System.in);
    String charInput;

    charInput = JOptionPane.showInputDialog("Enter a letter: ");

    //System.out.print("Enter a letter: ");

    if (charInput.matches(".*\\d.*")) {
        JOptionPane.showMessageDialog(null, "Not a letter");
        // System.out.println("Not a letter.");
    } else {
        JOptionPane.showMessageDialog(null, "The uppercase equivalent of " + charInput + " is " + charInput.toUpperCase());
        //System.out.println("The uppercase equivalent of " + charInput + " is " + charInput.toUpperCase());
    }
}
}
