import javax.swing.*;

public class ConvertToUpper {
// Written by: Mike Baldwin
// Converts a lower case letter to an uppercase letter

public static void main(String[] args) {
    String charInput;

    charInput = JOptionPane.showInputDialog(null,
            "Enter a letter", "Convert To Upper", JOptionPane.QUESTION_MESSAGE);

    if (Character.isLetter(charInput.charAt(0))) {
        JOptionPane.showMessageDialog(null,
                "The uppercase equivalent of " + charInput + " is " +
                        charInput.toUpperCase());
    } else
        JOptionPane.showMessageDialog(null, "Not a letter");
}
}
