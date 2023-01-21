import java.util.Arrays;
import java.util.Random;

public class homework1 {
    public static void main(String[] args) {
        Random number = new Random();
        int valueOf_i = number.nextInt(2000);
        System.out.printf("Наше случайное число i = %d\n", valueOf_i);
        String binary = Integer.toBinaryString(valueOf_i);
        System.out.println("В двоичной системе это число = " + binary);

        int valueOf_n = 0;
        for (int j = 0; j < binary.length(); j++) {
            ++valueOf_n;
        }
        valueOf_n -= 1;
        System.out.println("Номер старшего значащего бита n = " + valueOf_n);

        System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE);
        System.out.println("Short.MIN_VALUE = " + Short.MIN_VALUE);

        int[] m1 = new int[Short.MAX_VALUE];
        int[] m2 = new int[Short.MAX_VALUE];

        for (int i = valueOf_i; i < Short.MAX_VALUE; i++) {
            if (i % valueOf_n == 0) {
                m1[i] = i;
            }
        }
        //System.out.println(Arrays.toString(m1));

        for (int i = Short.MIN_VALUE; i < valueOf_i; i++) {
            if (i % valueOf_n == 0) {
                m2[i] = i;
            }
        }
        System.out.println(Arrays.toString(m2));
    }
}
