package src.com.emansis.yume.worllineg.java.se.studuy.day04;

public class JavaRecursion {
    public static void main(String[] args) {
        System.out.println("Recursion");
        
        FactorRecursion((byte)10);
    }
    private static long FactorRecursion(byte x) {

        System.out.println("进入 x = " + x);
        if (x == 1){
            System.out.println("退出 x = 1; ret = 1");
            return 1;
        }
        long ret = x * FactorRecursion((byte)(x - 1));
        System.out.println("退出 x = " + x + "; ret = " + ret);

        return ret;
    }
}
