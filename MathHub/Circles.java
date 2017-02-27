import javax.swing.JOptionPane;
public class Circles{ 
    public static void method(){
        Run runObject = new Run();
        String[] options = {"mm", "cm", "m", "km", "main menu"};
        int a = JOptionPane.showOptionDialog(null, "Select a unit of measurement",
                "Choose a unit of measurement",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        String unit = options[a];
        if (unit.equals("mm")){
            String unit2 = "mm2";
            working(unit, unit2);
        }
        else if (unit.equals("cm")){
            String unit2 = "cm2";
            working(unit, unit2);
        }
        else if (unit.equals("m")){
            String unit2 = "m2";
            working(unit, unit2);
        }
        else if (unit.equals("km")){
            String unit2 = "km2";
            working(unit, unit2);
        }
        else{
            runObject.run();
            return;
        }
    }
    
    public static void working(String unit, String unit2){
        Run runObject = new Run();
        String input = JOptionPane.showInputDialog(null,"Please Enter Radius(" + unit + "):");
        double radius = Double.parseDouble(input);
        double diameter = radius * 2;
        double modulus = diameter % 1;
        double circumference = Math.PI * diameter;
        double calc1= radius * radius;
        double area = Math.PI * calc1; 
        if (modulus == 0){
            int diameterInt = (int)diameter;
            JOptionPane.showMessageDialog(null, "The diameter of your circle is " + diameterInt + unit +
                "\nThe circumference of your circle is " + circumference + unit +
                "\nThe area of your circle is " + area + unit2);
            runObject.run();
        }
        else {
            JOptionPane.showMessageDialog(null, "The diameter of your circle is " + diameter + unit +
                "\nThe circumference of your circle is " + circumference + unit +
                "\nThe area of your circle is " + area + unit2);
            runObject.run();
            
        }
    }
}
