public class SortingManual {

    public static int[] run(int[] arr){

        int max = -30; int pre; int i = 0; int tempfin;
        int pos = 0; int fin = arr.length-1; int inicio = 0;
        while (i!=arr.length){

            if (arr[pos] > arr[fin]){

                System.out.println("MAYOR ENCONTRADO");
                tempfin = arr[fin];
                arr[fin] = arr[pos];
                arr[pos] = tempfin;

                i++; pos++; fin--;

            } else {
                pos++;
            }


        }


        {0, -5, 20, 2, 24}

        return arr;


    }

}
