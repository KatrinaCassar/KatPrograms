public class Test{
    public static void main (String[] args){
        method1();
    }

    public static void method1() {
        int value = 5 + method2(5);
        System.out.println(value);
    }

    public static int method2(int param) {
        return param + 5;
    }
}