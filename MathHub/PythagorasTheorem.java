import javax.swing.JOptionPane;
public class PythagorasTheorem{
    public static void method(){
        Run runObject = new Run();
        String options[] = {"mm", "cm", "m", "km", "main menu"};
        int a = JOptionPane.showOptionDialog(null, "Select a unit of measurement",
                "Choose a unit of measurement", 
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        String unit = options[a];
        if (unit.equals("main menu")){
            runObject.run();
            return;
        }
        else {
            String input = JOptionPane.showInputDialog("Enter side A of your triangle(" + unit + "):");
            double sideA = Double.parseDouble(input);
            String input2 = JOptionPane.showInputDialog("Enter side B of your triangle(" + unit + "):");
            double sideB = Double.parseDouble(input2);
            double calc1 = sideA * sideA;
            double calc2 = sideB * sideB;
            double hypotenuse = calc1 + calc2;
            double modulus = hypotenuse % 1;
            if (modulus == 0){  
                int hypotenuseInt = (int)hypotenuse;
                JOptionPane.showMessageDialog(null, "Side a^2 + Side b^2 = Hypotenuse^2\n" +
                    "The height of your triangle's hypotenuse is " + hypotenuseInt + unit);
                runObject.run();
            }
            else {
                JOptionPane.showMessageDialog(null, "Side a^2 + Side b^2 = Hypotenuse^2\n" +
                    "The height of your triangle's hypotenuse is " + hypotenuse + unit);
                runObject.run();
            }
        }
    }
}