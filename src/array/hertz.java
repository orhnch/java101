package array;

import java.util.Arrays;

public class hertz {
    public static void main(String[] args) {
        int p = 0;
        int[] list = {3, 7, 3, 3, 2, 9, 4, 10, 21, 1, 33, 9, 1, 2, 4};
        Arrays.sort(list);
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (list[i] == list[j]) {
                    p++;
                }
            }
            System.out.println(list[i]+" sayisi "+p+" kez tekrarlandi.");
            i=i+p-1;
            p=0;
        }

    }
}
