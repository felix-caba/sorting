public class sorting {

    public static int[] run(int[] n_arr, int n) {

        while (n != 1) {

            for (int i = 0; i < n - 1; i++) {
                if (n_arr[i + 1] < n_arr[i]) {
                    int n_arr_temp = n_arr[i];
                    n_arr[i] = n_arr[i + 1];
                    n_arr[i + 1] = n_arr_temp;
                }
            }

            n--;

        }


        return n_arr;



    }
}





