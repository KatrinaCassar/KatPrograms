import javax.swing.JFrame;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
public class Run{
    static int stage = 0;
    public static void main(String[] args)throws IOException{        
        BufferedReader br = new BufferedReader(new FileReader("Words.txt"));
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        int num = (int)(Math.random() * (854)) + 1;
        String word;

        for(int i = 1; i<num; i++){
            word = br.readLine();         
        }  

        word = br.readLine();

        for(int i = 0; i<word.length(); i++){
            sb2.append(word.charAt(i));
            sb2.append(" ");
        }

        for(int i = 1; i<=word.length(); i++){
            sb.append("_ ");
        }
        
        for(;;){
            String input = JOptionPane.showInputDialog(sb + "\nEnter letter:");
            char letter = input.charAt(0);
            check(letter, word, sb);
            if(sb.toString().equals(sb2.toString())){
                win(word);
                return;
            }
            else if (stage == 10){
                lose(word);
                return;
            }
        }
    }
    
    public static void check(char letter, String word, StringBuilder sb){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        int counter = word.length();
            for(int i = 0; i<word.length(); i++){
                int j = (int)(i+0.5) * 2;
                if(word.charAt(i) == letter){
                    sb.setCharAt(j, letter);
                }
                else{
                    counter++;
                }
            }
            if (counter == word.length()*2){
                stage++;
                Game game = new Game(stage);
                frame.add(game);
                frame.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null, sb);
            }
    }

    public static void win(String word){
        JOptionPane.showMessageDialog(null, "You win\nThe word was " +word); 
    }

    public static void lose(String word){
        JOptionPane.showMessageDialog(null, "You lose\nThe word was " +word); 
    }
}
