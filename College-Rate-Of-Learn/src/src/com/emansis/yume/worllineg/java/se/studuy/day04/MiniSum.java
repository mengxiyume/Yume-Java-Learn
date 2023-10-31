package src.com.emansis.yume.worllineg.java.se.studuy.day04;

public class MiniSum {
    public static void main(String[] args) {

        double sum = 0d;
        int n = 100;

        int i = 1;
        for (i = 1; i <= n; i++)
        {
            sum += 1.0d / i;
        }
        System.out.println(sum);
    }
}
