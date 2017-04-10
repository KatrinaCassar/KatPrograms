import javax.swing.JOptionPane;
import java.lang.StringBuilder;
public class Validator{
    static int[] nums = new int[16];
    public static void main(String[] args){
        run();
    }

    public static void run(){
        StringBuilder sb = new StringBuilder();
        String s;

        String input = JOptionPane.showInputDialog("Enter credit card number:");
        try{
            for(int i = 0; i<input.length(); i++){
                if(input.charAt(i) != ' '){
                    sb.append(input.charAt(i));
                }
            }
        }
        catch(Exception e){
            System.exit(0);
        }
        String cardNum = sb.toString();

        if(cardNum.length() != 16){
            JOptionPane.showMessageDialog(null, "Credit card must consist of 16 numbers", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }

        boolean errorFound = false;
        int num;
        for(int i = 0; i<cardNum.length() && !errorFound; i++){
            try{
                s = Character.toString(cardNum.charAt(i));
                num = Integer.parseInt(s);
            }
            catch(Exception e){
                errorFound = true;
                JOptionPane.showMessageDialog(null, "Credit card must only include numbers", "Error", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
        }

        for(int i = 0; i<16; i++){
            s = Character.toString(cardNum.charAt(i));
            nums[i] = Integer.parseInt(s);
            if(i % 2 == 0){
                nums[i] = nums[i] * 2;
                if(nums[i] > 9){
                    s = Integer.toString(nums[i]);
                    nums[i] = (Integer.parseInt(Character.toString(s.charAt(0)))) + (Integer.parseInt(Character.toString(s.charAt(1))));
                }
            }
        }

        int total = 0;
        for(int i = 0; i<16; i++){
            total = total + nums[i];
        }

        if(total % 10 == 0){
            JOptionPane.showMessageDialog(null, input + "\nThis card number is valid");
        }
        else{
            JOptionPane.showMessageDialog(null, input + "\nThis card number is invalid");
        }
    }
}
