package src.com.emansis.yume.worllineg.java.se.studuy.day04;

public class Factors {
    public static void main(String[] args) {
        byte begin = 1;
        byte end = 10;

        long sum = 0;
        int i = 0;
        for (i = begin; i < end; i++) {
            sum += Factor((byte)i);
        }

//        System.out.println(sum);
        System.out.println(Factor((byte)10));
    }

    private static long Factor(byte value) {
        long result = 1;

        int i = 0;
        for (i = 2; i <= value; i++) {
            result *= i;
        }

//        long sum = 1;
//        int i = 2;
//        for (i = 2; i <= 10; i++) {
//            sum *= i;
//        }
//        System.out.println(sum);

        return result;
    }
}
