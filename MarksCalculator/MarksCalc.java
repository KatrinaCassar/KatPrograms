import javax.swing.JOptionPane;
import java.util.Arrays;
import java.lang.StringBuilder;
import java.util.ArrayList;
public class MarksCalc{
    public static void method(){
        amount();
    }

    public static void amount(){
        String input = JOptionPane.showInputDialog("Enter the amount of exams taken:");
        double amountDouble = Double.parseDouble(input);
        double modulus = amountDouble % 1;
        if (modulus == 0){
            int amount = (int)amountDouble;
            String[] subjects = new String[amount];
            for(int i = 0; i < amount; i++){
                subjects[i] = JOptionPane.showInputDialog("Enter name of subject " + ++i);
                i--;
            }
            marks(amount, subjects);
        }
        else{
            JOptionPane.showMessageDialog(null,
                    "You can't have " + amountDouble + " subjects!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
                return;
        }
    }

    public static void marks(int amount, String[] subjects){
        String[] marksString = new String[amount];
        double[] marksDouble = new double[amount];
        int[] marks = new int[amount];
        double modulus = 0;
        for(int i = 0; i < amount; i++){
            marksString[i] = JOptionPane.showInputDialog("Enter mark of " + subjects[i]);
            marksDouble[i] = Double.parseDouble(marksString[i]);
            modulus = marksDouble[i] % 1;
            if (modulus != 0){
                JOptionPane.showMessageDialog(null,
                    "Only integer numbers are accepted",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
                return;
            }
            else if (marksDouble[i] < 0){
                JOptionPane.showMessageDialog(null,
                    "You cannot have a negative mark!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
                return;
            }
            else if (marksDouble[i] > 100){
                JOptionPane.showMessageDialog(null,
                    "You cannot have a mark higher than 100!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
                return;
            }
            marks[i] = (int)marksDouble[i];
        }
        average(amount, subjects, marks);
    }

    public static void average(int amount, String[] subjects, int[] marks){
        double total = 0;
        for (int i = 0; i < marks.length; i++){
            total = total + marks[i];
        }
        double averageDouble = total / marks.length;
        highestlowest(amount, subjects, marks, averageDouble);
    }

    public static void highestlowest(int amount, String[] subjects, int[] marks, double averageDouble){
        int lowest = marks[0];
        int highest = marks[0];
        for(int i= 1; i < marks.length; i++){
            if(marks[i] > highest)
                highest = marks[i];
            else if (marks[i] < lowest)
                lowest = marks[i];
        }
        higherThanAverage(amount, subjects, marks, averageDouble, lowest, highest);
    }

    public static void higherThanAverage(int amount, String[] subjects, int[] marks, double averageDouble, int lowest, int highest){
        String[] higherThanAverage = new String[amount];
        for (int i = 0; i < marks.length; i++){
            if (marks[i] > averageDouble){
                higherThanAverage[i] = subjects[i];
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < higherThanAverage.length; i++){
            if (higherThanAverage[i] != null){
                sb.append(higherThanAverage[i]);
                sb.append(" ");
            }
        }
        output(amount, subjects, marks, averageDouble, lowest, highest, sb);
    }

    public static void output(int amount, String[] subjects, int[] marks, double averageDouble, int lowest, int highest, StringBuilder sb){
        double modulus = averageDouble % 1;
        if (modulus == 0){
            int average = (int)averageDouble;
            JOptionPane.showMessageDialog(null, "Your average mark is " + average +
                "\n Your highest mark is " + highest +
                "\n Your lowest mark is " + lowest +
                "\n You got higher than average in the following subjects: " + sb);
        }
        else{
            JOptionPane.showMessageDialog(null, "Your average marks is " + averageDouble +
                "\nYour highest mark is " + highest +
                "\nYour lowest mark is " + lowest +
                "\nYou got higher than average in the following subjects: " + sb);
        }
    }
}

