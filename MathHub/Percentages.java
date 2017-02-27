import javax.swing.JOptionPane;
public class Percentages{
    public static void method(){
        Run runObject = new Run();
        String input = JOptionPane.showInputDialog("Enter your percentage(DO NOT USE % SIGN):");
        double percentage = Double.parseDouble(input);
        double modulus = percentage % 1;
        int percentage2 = (int)percentage;
        String input2 = JOptionPane.showInputDialog("Enter your quantity:");
        double quantity = Double.parseDouble(input2);
        double calc1 = percentage / 100;
        double answer = calc1 * quantity;
        double modulus2 = answer % 1;
        double modulus3 = quantity % 1;
        if (modulus == 0) {
            if (modulus2 == 0 && modulus3 == 0){
                int answerInt = (int)answer;
                int quantityInt = (int)quantity;
                JOptionPane.showMessageDialog(null, percentage2 + "% of " + quantityInt + " is " + answerInt);
                runObject.run();
            }
            else if (modulus2 == 0 && modulus3 != 0){
                int answerInt = (int)answer;
                JOptionPane.showMessageDialog(null, percentage2 + "% of " + quantity + " is " + answerInt);
                runObject.run();
            }
            else if (modulus2 != 0 && modulus3 == 0){
                int quantityInt = (int)quantity;
                JOptionPane.showMessageDialog(null, percentage2 + "% of " + quantityInt + " is " + answer);
                runObject.run();
            }
            else {
                JOptionPane.showMessageDialog(null, percentage2 + "% of " + quantity + " is " + answer);
                runObject.run();
            }
        }
        else {
            if (modulus2 == 0 && modulus3 == 0){
                int answerInt = (int)answer;
                int quantityInt = (int)quantity;
                JOptionPane.showMessageDialog(null, percentage + "% of " + quantityInt + " is " + answerInt);
                runObject.run();
            }
            else if (modulus2 == 0 && modulus3 != 0){
                int answerInt = (int)answer;
                JOptionPane.showMessageDialog(null, percentage + "% of " + quantity + " is " + answerInt);
                runObject.run();
            }
            else if (modulus2 != 0 && modulus3 == 0){
                int quantityInt = (int)quantity;
                JOptionPane.showMessageDialog(null, percentage + "% of " + quantityInt + " is " + answer);
                runObject.run();
            }
            else {
                JOptionPane.showMessageDialog(null, percentage + "% of " + quantity + " is " + answer);
                runObject.run();
            }

        }
    }
}
