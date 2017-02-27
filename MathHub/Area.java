import javax.swing.JOptionPane;
public class Area{ 
    public static void method(){
        Run runObject = new Run();
        String[] options = {"mm2", "cm2", "m2", "km2", "main menu"};
        int a = JOptionPane.showOptionDialog(null, "Select a unit of measurement",
                "Choose a unit of measurement",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        String unit = options[a];
        if (unit.equals("mm2")){
            String unit2 = "mm";
            shapes(unit, unit2);
        }
        else if (unit.equals("cm2")){
            String unit2 = "cm";
            shapes(unit, unit2);
        }
        else if (unit.equals("m2")){
            String unit2 = "m";
            shapes(unit, unit2);
        }
        else if (unit.equals("km2")){
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
        String[] options = {"square", "rectangle", "triangle", "circle", "oval", "parallelogram", "rhombus", "trapezium", "kite", "main menu"};
        int a = JOptionPane.showOptionDialog(null, "Select a shape",
                "Choose a shape",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        String shape = options[a];        
        if (shape.equals("square")) square(unit, unit2);
        else if (shape.equals("rectangle")) rectangle(unit, unit2);
        else if (shape.equals("triangle")) triangle(unit, unit2);
        else if (shape.equals("circle")) circle(unit, unit2);
        else if (shape.equals("oval"))oval(unit, unit2);
        else if (shape.equals("parallelogram"))parallelogram(unit, unit2);
        else if (shape.equals("rhombus")) rhombus(unit, unit2);
        else if (shape.equals("trapezium")) trapezium(unit, unit2);
        else if (shape.equals("kite")) kite(unit, unit2);     
        else runObject.run();
    }

    public static void kite(String unit, String unit2)   {
        Run runObject = new Run();
        String input = JOptionPane.showInputDialog("Enter the length of diagonal A of your kite(" + unit2 + "):");
        double kiteDiagonalA = Double.parseDouble(input);
        String input2 = JOptionPane.showInputDialog("Enter the length of diagonal B of your kite(" + unit2 + "):");
        double kiteDiagonalB = Double.parseDouble(input2);
        double calc1 = kiteDiagonalA * kiteDiagonalB;
        double area = calc1 / 2;
        double modulus = area % 1;
        if (modulus == 0) {
            int areaInt = (int)area;
            JOptionPane.showMessageDialog(null, "Area = product of diagonals / 2\n" +
                "The area of your kite is " + areaInt + unit);
            runObject.run();
        }
        else {
            JOptionPane.showMessageDialog(null, "Area = product of diagonals / 2\n" +
                "The area of your kite is " + area + unit);
            runObject.run();
        }
    }   

    public static void trapezium(String unit, String unit2) {
        Run runObject = new Run();
        String input = JOptionPane.showInputDialog("Enter your trapezium's height(" + unit2 + "):");
        double trapeziumHeight = Double.parseDouble(input);
        String input2 = JOptionPane.showInputDialog("Enter side A of your trapezium(" + unit2 + "):");
        double trapeziumSideA = Double.parseDouble(input2);
        String input3 = JOptionPane.showInputDialog("Enter side B of your trapezium(" + unit2 + "):");
        double trapeziumSideB = Double.parseDouble(input3);
        double calc1 = trapeziumHeight / 2;
        double calc2 = trapeziumSideA + trapeziumSideB;
        double area = calc1 * calc2;
        double modulus = area % 0;
        if (modulus == 0){
            int areaInt = (int)area;
            JOptionPane.showMessageDialog(null, "Area = height / 2 * (side a + side b)\n" +
                "The area of your trapezium is " + areaInt + unit);
            runObject.run();
        }
        else {
            JOptionPane.showMessageDialog(null, "Area = height / 2 * (side a + side b)\n" +
                "The area of your trapezium is " + area + unit);
            runObject.run();
        }
    }

    public static void circle(String unit, String unit2) {
        Run runObject = new Run();
        String input = JOptionPane.showInputDialog("Enter your circle's radius(" + unit2 + "):");
        double circleRadius = Double.parseDouble(input);
        double calc1 = Math.PI * circleRadius;
        double area = calc1 * calc1;
        JOptionPane.showMessageDialog(null, "Area = pi * radius^2\n" +
            "The area of your circle is " + area + unit);
        runObject.run();
    }

    public static void oval(String unit, String unit2) {
        Run runObject = new Run();
        String input = JOptionPane.showInputDialog("Enter your oval's radius(" + unit2 + "):");
        double ovalRadius = Double.parseDouble(input);
        double calc1 = Math.PI * ovalRadius;
        double area = calc1 * calc1;
        JOptionPane.showMessageDialog(null, "Area = pi * radius^2\n" +
            "The area of your oval is " + area + unit);
        runObject.run();
    }

    public static void triangle(String unit, String unit2) {
        Run runObject = new Run();
        String input = JOptionPane.showInputDialog("Enter your triangle's base(" + unit2 + "):");
        double triangleBase = Double.parseDouble(input);
        String input2 = JOptionPane.showInputDialog("Enter your triangle's height(:" + unit2 + "):");
        double triangleHeight = Double.parseDouble(input2);
        double calc1 = triangleBase * triangleHeight;
        double area = calc1 / 2;
        double modulus = area % 1;
        if (modulus == 0){
            int areaInt = (int)area;
            JOptionPane.showMessageDialog(null, "Area = (Base * Height) / 2\n" +
                "The area of your triangle is " + areaInt + unit);
            runObject.run();
        }
        else {
            JOptionPane.showMessageDialog(null, "Area = (Base * Height) / 2\n" +
                "The area of your triangle is " + area + unit);
            runObject.run();
        }
    }

    public static void parallelogram(String unit, String unit2) {
        Run runObject = new Run();
        String input = JOptionPane.showInputDialog("Enter your parallelogram's base(" + unit2 + "):");
        double paralellogramBase = Double.parseDouble(input);
        String input2 = JOptionPane.showInputDialog("Enter your parallelogram's height(" + unit2 + "):");
        double parallelogramHeight = Double.parseDouble(input2);
        double area = paralellogramBase * parallelogramHeight;
        double modulus = area % 1;
        if (modulus == 0){
            int areaInt = (int)area;
            JOptionPane.showMessageDialog(null, "Area = Base * Height\n" +
                "The area of your parallelogram is " + areaInt + unit);
            runObject.run();
        }
        else {
            JOptionPane.showMessageDialog(null, "Area = Base * Height\n" +
                "The area of your parallelogram is " + area + unit);
            runObject.run();
        }
    }

    public static void rectangle(String unit, String unit2){
        Run runObject = new Run();
        String input = JOptionPane.showInputDialog("Enter your rectangle's length(" + unit2 + "):");
        double rectangleLength = Double.parseDouble(input);
        String input2 = JOptionPane.showInputDialog("Enter your rectangle's breadth(" + unit2 + "):");
        double rectangleBreadth = Double.parseDouble(input2);
        double area = rectangleLength * rectangleBreadth;
        double modulus = area % 1;
        if (modulus == 0){
            int areaInt = (int)area;
            JOptionPane.showMessageDialog(null, "Area = length * breadth\n" +
                "The area of your rectangle is " + areaInt + unit);
            runObject.run();
        }
        else {
            JOptionPane.showMessageDialog(null, "Area = length * breadth\n" +
                "The area of your rectangle is " + area + unit);
            runObject.run();
        }
    }

    public static void square(String unit, String unit2) {
        Run runObject = new Run();
        String input = JOptionPane.showInputDialog("Enter your square's length(" + unit2 + "):");
        double squareLength = Double.parseDouble(input);
        double area = squareLength * squareLength;
        double modulus = area % 1;
        if (modulus == 0) {
            int areaInt = (int)area;
            JOptionPane.showMessageDialog(null, "Area = length * breadth\n" +
                "The area of your square is " + areaInt + unit);
            runObject.run();
        }
        else {
            JOptionPane.showMessageDialog(null, "Area = length * breadth\n" +
                "The area of your square is " + area + unit);
            runObject.run();
        }
    }

    public static void rhombus(String unit, String unit2) {
        Run runObject = new Run();
        String options[] = {"base", "diagonals"};
        int a = JOptionPane.showOptionDialog(null, "The area of a rhombus can be calculated two ways.\n" +
                "You can either enter the base of the rhombus or the diagonals.\n" +
                "Choose one",
                "Base or diagonals",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        String bd = options[a];
        if (bd.equals("base")){

        }
        else {

        }
    }
} 
