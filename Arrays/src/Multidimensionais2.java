public class Multidimensionais2 {

    public static void main(String[] args) {
        int[] arrInt = {1, 2, 3};
        int[] arrInt2 = new int[3];
        int[] arrInt3 = new int[]{1, 2, 3};

        /*
        int[][] dias = new int[3][];
        dias[0] = new int[2];
        dias[1] = new int[]{1, 2, 3};
        dias[2] = new int[4];*/
        //-------------
        int[][ ] dias = {{0,0},{1,2,3},{0,0,0,0}};

        for (int[] arr : dias) {
            for (int num : arr) {
                System.out.println(num); //saída: 00 123 0000
            }
        }



    }
}