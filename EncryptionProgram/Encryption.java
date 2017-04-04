import java.util.*;
import java.io.*;
import javax.swing.*;
public class Encryption{
    static String line;
    static String line2;
    static int counter = 0;
    static char ch, ch2;
    static boolean lineIsEmpty = false;
    public static void acceptInput() throws IOException{
        try{
            PrintWriter pw = new PrintWriter(new FileWriter("Input.txt"));
            pw.close();
            ProcessBuilder pb = new ProcessBuilder("Notepad.exe", "Input.txt");
            pb.start();
            String[] options = {"OK"};
            int a = JOptionPane.showOptionDialog(null, "Press 'OK' to encrypt message",
                    "Encrypt",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            String input = options[a];
            if(input.equals("OK")){
                encrypt();
            }
        }
        catch(Exception e){
            System.exit(0);
        }
    }   

    public static void encrypt() throws IOException{
        PrintWriter pw = new PrintWriter(new FileWriter("Output.txt"));
        BufferedReader br = new BufferedReader(new FileReader("Input.txt"));
        BufferedReader br2 = new BufferedReader(new FileReader("Code.txt"));
        BufferedReader br3 = new BufferedReader(new FileReader("Code.txt"));
        StringBuilder sb = new StringBuilder();

        boolean endReached = false;
        String data;
        while(!endReached){
            data = br2.readLine();
            counter++;
            if(data == null){
                endReached = true;
                counter--;
            }
        }

        String[] lines = new String[counter];
        for(int i = 0; i<lines.length; i++){
            lines[i] = br3.readLine();
        }

        line = br.readLine();
        if(line == null){
            lineIsEmpty = true;
        }
        while(!lineIsEmpty){
            for(int i = 0; i<line.length(); i++){
                for(int j = 0; line.charAt(i) != ch; j++){
                    if(j<lines.length){
                        ch = lines[j].charAt(0);
                        ch2 = lines[j].charAt(1);
                    }
                    else{
                        ch = line.charAt(i);
                        ch2 = ch;
                    }
                }
                sb.append(ch2);
            }
            pw.println(sb.toString());
            sb.setLength(0);
            line = br.readLine();
            if(line == null){
                lineIsEmpty = true;
            }
        }
        pw.close();
        try{
            ProcessBuilder pb = new ProcessBuilder("Notepad.exe", "Output.txt");
            pb.start();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: file 'Output.txt' not detected", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
