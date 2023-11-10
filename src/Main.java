import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Main {



    public static void main(String[] args) {

/*
        System.out.println("Introduce el largo del array 1");
        int x = GetInput.getInt();
        System.out.println("Introduce el largo del array 2");
        int y = GetInput.getInt();

        int[] arr = new int[x];
        int[] arr2 = new int[y];

        */


        int[] arr = {3, 0, -5, 8, 1};


        System.out.println(Arrays.toString(SortingManual.run(arr)));



/*
        for (int i = 0; i <arr.length ; i++) {


            int rand = ThreadLocalRandom.current().nextInt(-10, 20);
            arr[i] = rand;


        }

*/







    }






}