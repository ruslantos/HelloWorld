package Arrays;

import java.util.Arrays;


public class ExToString {
    public static void main(String[] args) {
        int [] a = {1,2,3,5,6};
        int [] b = {1,2,3,5,6};
        System.out.println(Arrays.toString(a));

        //многомерный масссив
        int [][] c = {{1,2},{3,5,6}};
        int [][] d = {{1,2},{3,5,6}};
        System.out.println(Arrays.deepToString(d));
    }

}