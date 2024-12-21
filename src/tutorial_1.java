public class tutorial_1 {
    public static void main(String[] args){

        // Integer data type
        int num1 = 998;
        byte b = 127;
        short sh = 776;
        long ln = 5674L;

        // float data type
        float f = 5.8f;
        double db = 5.667;

        // character
        char c = 'k';

        boolean bo = true;

        // binary format
        int num2 = 0b110;
        System.out.println(num2);

        // hexadecimal format
        int num3 = 0x7E;
        System.out.println(num3);

        //
        int num4 = 10_00_00_000;
        System.out.println(num4);

        // integer will convert into double automatically when you save it
        double num5 = 56;
        System.out.println(num5);

        double num6 = 12e10;
        System.out.println(num6);

        // literal---? will see its definition
        char ch = 'b';
        System.out.println(ch);
        ch++;
        System.out.println(ch);
    }
}
