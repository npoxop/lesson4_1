package vtb.baranovdv;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int array[][] = {{1, 2, 3, 4}, {5, 6, 7, 8, 4}, {9, 10, 11, 12}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < (array[i].length-1); j++) {
                array[i][j]=array[i][j+1];
            }
            array[i][array[i].length-1]=0;
        }
        System.out.println(Arrays.deepToString(array));

    }

}