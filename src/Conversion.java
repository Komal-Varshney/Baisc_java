public class Conversion  {
    public static void main(String[] args){
        byte b = 127;
        int a = 257;

        // casting
        b = (byte)a;
        System.out.println(b);

        int p = 12;
        byte q = 127;

        q = (byte)p;
        System.out.println(q);

        float f = 5.6f;
        int t = (int)f;

        System.out.println(t);

        // type promotion
        byte u = 10;
        byte v = 30;
        int result = v*u;
        System.out.println(result);

//        a = b;
//        System.out.println(a);
    }
}
