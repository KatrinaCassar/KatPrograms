import javax.swing.JOptionPane;
public class Averages{
    public static void method(){
        Run runObject = new Run();
        double total = 0;
        double number;
        double average;
        String input = JOptionPane.showInputDialog("Amount of numbers to be inputted:");
        double amount = Double.parseDouble(input);
        for (int counter = 1; counter<=amount; counter++){
            String input2 = JOptionPane.showInputDialog("Enter number:");
            number = Double.parseDouble(input2);
            total = total + number;
        }
        average = total/amount;
        double modulus = average % 1;
        if (modulus == 0){
            int averageInt = (int)average;
            JOptionPane.showMessageDialog(null, "Your average is " + averageInt);
            runObject.run();
        }
        else {
            JOptionPane.showMessageDialog(null, "Your average is " + average);
            runObject.run();
        }
    }
}
