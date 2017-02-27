import javax.swing.JOptionPane;
public class Volume{
    public static void method(){ 
        Run runObject = new Run();
        String options[] = {"mm3", "cm3", "m3", "km3", "main menu"};
        int a = JOptionPane.showOptionDialog(null, "Select a unit of measurement",
                "Choose a unit of measurement",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        String unit = options[a];

        if (unit.equals("mm3")){
            String unit2 = "mm";
            shapes(unit, unit2);
        }
        else if (unit.equals("cm3")){
            String unit2 = "cm2";
            shapes(unit, unit2);
        }
        else if (unit.equals("m3")){
            String unit2 = "m";
            shapes(unit, unit2);
        }
        else if (unit.equals("km3")){
            String unit2 = "km";
            shapes(unit, unit2);
        }
        else{
            runObject.run();
            return;
        }       
    }

    public static void shapes(String unit, String unit2){
        Run runObject = new Run();
        String options[] = {"cube", "cylinder", "cuboid", "sphere", "cone", "pyramid", "main menu"};
        int a = JOptionPane.showOptionDialog(null, "Select a shape",
                "Choose a chape", 
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        String shape = options[a];

        if (shape.equals("cube")) cube(unit, unit2);
        else if (shape.equals("cylinder")) cylinder(unit, unit2);
        else if (shape.equals("cuboid")) cuboid(unit, unit2);
        else if (shape.equals("sphere")) sphere(unit, unit2);
        else if (shape.equals("cone"))cone(unit, unit2);
        else if (shape.equals("pyramid")) pyramid(unit, unit2);
        else runObject.run();
    }

    public static void cube(String unit, String unit2){
        Run runObject = new Run();
        String input = JOptionPane.showInputDialog("Enter the length of one side of your cube(" + unit2 + "):");
        double cubeLength = Double.parseDouble(input);
        double answer = cubeLength * cubeLength * cubeLength;
        double modulus = answer % 1;
        if (modulus == 0){
            int answerInt = (int)answer;
            JOptionPane.showMessageDialog(null, "Volume = Length * Length * Length\n" +
                "The volume of your cube is " + answerInt + unit);
            runObject.run();
        }
        else {
            JOptionPane.showMessageDialog(null, "Volume = Length * Length * Length\n" +
                "The volume of your cube is " + answer + unit);
            runObject.run();
        }
    }

    public static void cylinder(String unit, String unit2){
        Run runObject = new Run();
        String input = JOptionPane.showInputDialog("Enter the radius of your cylinder(" + unit2 + "):");
        double cylinderRadius = Double.parseDouble(input);
        String input2 = JOptionPane.showInputDialog("Enter the height of your cylinder(" + unit2 + "):");
        double cylinderHeight = Double.parseDouble(input2);
        double calc1 = cylinderRadius * cylinderRadius;
        double calc2 = Math.PI * calc1;
        double answer = calc2 * cylinderHeight;
        JOptionPane.showMessageDialog(null, "Volume = pi * radius^2 * height\n" +
            "The volume of your cylinder is " + answer + unit);
        runObject.run();
    }

    public static void cuboid(String unit, String unit2){
        Run runObject = new Run();
        String input = JOptionPane.showInputDialog("Enter the length of your cuboid(" + unit2 + "):");
        double cuboidLength = Double.parseDouble(input);
        double answer = cuboidLength * cuboidLength * cuboidLength;
        double modulus = answer % 1;
        if (modulus == 0){
            int answerInt = (int)answer;
            JOptionPane.showMessageDialog(null, "Volume = Length * Breadth * Height\n" +
                "The volume of your cuboid is " + answerInt + unit);
            runObject.run();
        }
        else {
            JOptionPane.showMessageDialog(null, "Volume = Length * Breadth * Height\n" +
                "The volume of your cuboid is " + answer + unit);
            runObject.run();
        }
    }

    public static void sphere(String unit, String unit2){
        Run runObject = new Run();
        String input = JOptionPane.showInputDialog("Enter the radius of your sphere(" + unit2 + "):");
        double sphereRadius = Double.parseDouble(input);
        double calc1 = sphereRadius * sphereRadius * sphereRadius;
        double calc2 = 4 * Math.PI * calc1;
        double answer = calc2 / 3;
        JOptionPane.showMessageDialog(null, "Volume = (4 * pi * radius^3)/3\n" +
            "The volume of your cuboid is " + answer + unit);
        runObject.run();
    }

    public static void cone(String unit, String unit2){
        Run runObject = new Run();
        String input = JOptionPane.showInputDialog("Enter the radius of your cone(" + unit2 + "):");
        double coneRadius = Double.parseDouble(input);
        String input2 = JOptionPane.showInputDialog("Enter the height of your cone(" + unit2 + "):");
        double coneHeight = Double.parseDouble(input2);
        double calc1 = coneRadius * coneRadius;
        double calc2 = Math.PI * calc1 * coneHeight;
        double answer = calc2 / 3;
        JOptionPane.showMessageDialog(null, "Volume = (pi × radius^2 × h)/3\n" +
            "The volume of your cone is " + answer + unit);
        runObject.run();
    }

    public static void pyramid(String unit, String unit2){
        Run runObject = new Run();
        String input = JOptionPane.showInputDialog("Enter the base of your pyramid(" + unit2 + "):");
        double pyramidBase = Double.parseDouble(input);
        String input2 = JOptionPane.showInputDialog("Enter the height of your pyramid(" + unit2 + "):");
        double pyramidHeight = Double.parseDouble(input2);
        double calc1 = pyramidBase * pyramidHeight;
        double answer = calc1 / 3;
        double modulus = answer % 1;
        if (modulus == 0){
            int answerInt = (int)answer;
            JOptionPane.showMessageDialog(null, "Volume = (base * height)/3\n" +
                "The volume of your pyramid is " + answerInt + unit);
            runObject.run();
        }
        else {
            JOptionPane.showMessageDialog(null, "Volume = (base * height)/3\n" +
                "The volume of your pyramid is " + answer + unit);
            runObject.run();
        }
    }
}
