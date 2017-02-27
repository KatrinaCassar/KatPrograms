import javax.swing.JOptionPane;
import java.lang.StringBuilder;
public class ShipNames{
    public static void enterNames(){
        String name1 = JOptionPane.showInputDialog("Enter first name:");
        String name2 = JOptionPane.showInputDialog("Enter second name:");
        ship(name1, name2);
    }
    
    public static void ship(String name1, String name2){
        StringBuilder sb = new StringBuilder();
        int name1Half = name1.length() / 2;
        int name2Length = name2.length();
        int name2Half = name2.length() / 2;
        int num = name2Length - name2Half;
            for(int i = 0; i<name1Half; i++){
                sb.append(name1.charAt(i));
            }
            
            for(int i = num; i<name2Length; i++){
                sb.append(name2.charAt(i));
            }
        JOptionPane.showMessageDialog(null, sb);
    }
}
