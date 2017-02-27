import javax.swing.JOptionPane;
public class SquareRoot{
    public static void method(){
        Run runObject = new Run();
        String input = JOptionPane.showInputDialog("Enter your number:");
        double number = Double.parseDouble(input);
        double squareRoot = Math.sqrt(number);
        double modulus = squareRoot % 1;
        double modulus2 = number % 1;
            if (modulus == 0 && modulus2 == 0){
                int squareRootInt = (int)squareRoot;
                int numberInt = (int)number;
                JOptionPane.showMessageDialog(null, "The square root of " + numberInt + " is " + squareRootInt);
                runObject.run();
            }
            else if (modulus == 0 && modulus2 != 0){
                int squareRootInt = (int)squareRoot;
                JOptionPane.showMessageDialog(null, "The square root of " + number + " is " + squareRootInt);
                runObject.run();
            }
            else if (modulus != 0 && modulus2 == 0){
                int numberInt = (int)number;
                JOptionPane.showMessageDialog(null, "The square root of " + numberInt + " is " + squareRoot);
                runObject.run();
            }
            else {
                JOptionPane.showMessageDialog(null, "The square root of " + number + " is " + squareRoot);
                runObject.run();
            }
    }
}