import java.util.Arrays;

public class sorting2 {

    public static int[] sorted(int [] arr){

        int[] arr_sorted = new int[arr.length];

      int lastPos = 0;

        for (int i = 0; i <arr.length ; i++) {

            boolean swap = true;  int max = 0;

            for (int j = 0; j <arr.length ; j++) {


                if ((max < arr[j]) && (arr[j]!=9999)) {


                    max = arr[j];
                    lastPos = j;
                    swap = true;

                } else {

                    swap = false;

                }

            }

            if (swap){
                arr[lastPos] = 9999;
                arr_sorted[i] = max;

            }



        }

        System.out.println(Arrays.toString(arr));
        return arr_sorted;

    }

}
