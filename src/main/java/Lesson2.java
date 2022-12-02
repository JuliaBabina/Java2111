import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Lesson2 {

    public static void main(String[] args) {
        int[] ar1 = new int[]{1,2,3,4};
        int[] ar2 = {1,2,3,4};
        int[] ar3 = new int[16];
        int[][] ar4 = new int[16][2];

        for (int i = 0; i < ar3.length; i++) {
            if (i>= ar3.length){
                int[] tmp = new int[ar3.length + ar3.length/2 + 1];
                // copy
                ar3 = tmp;
            }
            ar3[i] = new Random().nextInt(100);
        }
        Arrays.sort(ar3, 0, ar3.length/2);

        System.out.println(Arrays.toString(ar3));

//        for (int i = 0; i < ar3.length; i++) {
//            System.out.print(ar3[i]);
//        }

        for (int i = 0; i < ar4.length; i++) {
            ar4[i][0] = new Random().nextInt(100);
            ar4[i][1] = new Random().nextInt(100);
        }

        Arrays.sort(ar4, Comparator.comparingInt(a -> a[0]));
        System.out.println(Arrays.deepToString(ar4));

        String s = "Privet!" + "asd";
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.append("asd");
        stringBuilder.reverse();
        s = stringBuilder.toString();

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            s += Character.toString(i);
        }
        System.out.println(System.currentTimeMillis() - start);

        start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            stringBuilder.append(Character.toString(i));
        }
        System.out.println(System.nanoTime() - start);
    }


}
