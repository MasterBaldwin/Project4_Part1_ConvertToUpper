import javax.swing.*;
import java.util.Scanner;

public class ConvertToUpper {
public static void main(String[] args) {
    //JOptionPane panel = new JOptionPanel()
    Scanner inputStream = new Scanner(System.in);
    String charInput;

    JOptionPane.showInputDialog("Enter a letter: ");

    System.out.print("Enter a letter: ");
    charInput = "";

    if(charInput.matches(".*\\d.*"))
    {
        System.out.println("Not a letter.");
    }
    else
    {
        System.out.println("The uppercase equivalent of " + charInput + " is " + charInput.toUpperCase());
    }
}
}
