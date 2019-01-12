package Arrays;

import java.util.Arrays;
import java.util.function.IntUnaryOperator;


public class Example {
    static int compute (int x,int y){
        return x+y;
    }
    public static void main(String[] args) {
        int [] a = {1,2,3,5,6};
        int [] b = {1,2,3,5,6};
        System.out.println(Arrays.binarySearch(a,6));

        int [] copy = Arrays.copyOf(a,10);
        System.out.println(Arrays.toString(copy));

        int  [] copyOfRange = Arrays.copyOfRange(a,1,3);
        System.out.println(Arrays.toString(copyOfRange));

        Arrays.fill(a,2,3,777);
        System.out.println(Arrays.toString(a));

        System.out.println("hashCode: "+ Arrays.hashCode(a));

        //parallelPrefix
        int[] c = {1, 2, 3, 5, 6};
        Arrays.parallelPrefix(c,(x,y)-> compute(x, y));
        //Arrays.stream(c).forEach(e ->System.out.print(e +"   "));
        System.out.println(Arrays.toString(c));

        //setAll
        int [] d = {1,2,3,5,6};
        IntUnaryOperator g = e->
        {
            if (e % 2 == 0)
                return e * e;
            else
                return e;
        };
        Arrays.setAll(d,g);
        System.out.println("setAll: "+ Arrays.toString(d));

        //spliterator
        int [] e = {1,2,3,5,6};
        Arrays.stream(e);
        System.out.println("stream: " + Arrays.toString(e));


        //многомерный масссивint[] d = {3, 6, 1, 5, 2};
        //        Arrays.parallelSort(d);
        //        System.out.println(Arrays.toString(d));
        /*int [][] c = {{1,2},{3,5,6}};
        int [][] d = {{1,2},{3,5,6}};
        System.out.println(Arrays.deepToString(d));*/
    }

}