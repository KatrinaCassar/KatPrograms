import javax.swing.JOptionPane;
public class Run{
    public static void main (String args[]){
        run();
    }
    
    public static void run (){
        Area areaObject = new Area();
        Circles circlesObject = new Circles();
        PythagorasTheorem pythagorasTheoremObject = new PythagorasTheorem();
        SquareRoot squareRootObject = new SquareRoot();
        Percentages percentagesObject = new Percentages();
        Averages averagesObject = new Averages();
        Volume volumeObject = new Volume();
        String[] options = {"Area", "Circles", "PythagorasTheorem", "SquareRoot", "Percentages", "Averages", "Volume"};
                int a = JOptionPane.showOptionDialog(null, "Select your function of choice",
                "Choose a function",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
                String input = options[a];
        if (input.equals("Area")){
            areaObject.method();
            run();
        }
        else if (input.equals("Circles")){
            circlesObject.method();
            run();
        }
        else if (input.equals("PythagorasTheorem")){
            pythagorasTheoremObject.method();
            run();
        }
        else if (input.equals("SquareRoot")){
            squareRootObject.method();
            run();
        }
        else if (input.equals("Percentages")){
            percentagesObject.method();
            run();
        }
        else if (input.equals("Averages")){
            averagesObject.method();
            run();
        }
        else if (input.equals("Volume")){
            volumeObject.method();
            run();
        }
        else {
            JOptionPane.showMessageDialog(null, "Invalid");
            run();
        }
    }
}

