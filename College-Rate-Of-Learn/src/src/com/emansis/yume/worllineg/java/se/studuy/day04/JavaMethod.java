package src.com.emansis.yume.worllineg.java.se.studuy.day04;

public class JavaMethod {
    public static void main(String[] args) {

        System.out.println(Add(20, 30));
        System.out.println(Add(20.0f, 20.0f));
        System.out.println(Add(20.3d, 20.5d));

    }

    //重载返回值类型不能单独构成重载，参数不同方法名相同则可构成重载
    private static int Add(int a, int b) {
        return a + b;
    }
    private static float Add(float a, float b) {
        return a + b;
    }
    private static double Add(double a, double b) {
        return a + b;
    }
}
