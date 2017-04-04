import javax.swing.JOptionPane;
import java.util.*;
import java.io.*;
public class Home{
    static String input;
    public static void main(String[] args) throws IOException{
        runHome();
    }
    
    public static void runHome() throws IOException{
        try{
            String options[] = {"Encrypt message", "Decrypt message"};
            int a = JOptionPane.showOptionDialog(null, "Please select",
                    "Select",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            input = options[a];
        }
        catch(Exception e){
            System.exit(0);
        }
        
        if(input.equals("Encrypt message")){
            Encryption.acceptInput();
        }
        else if(input.equals("Decrypt message")){
            Decryption.acceptInput();
        }
    }
}
