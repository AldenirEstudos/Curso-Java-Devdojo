public class Multidimensionais1 {

    public static void main(String[] args) {
        int[][] dias = new int[2][2];
        dias[0][0] = 30;
        dias[0][1] = 31;
        dias[1][0] = 28;
        dias[1][1] = 29;

        for (int i = 0; i < dias.length; i++) {
            System.out.println(dias[i]); //->imprime os endereços na memória
            for (int j = 0; i < dias[i].length; i++) {
                System.out.println(dias[i][j]); //-> imprime os dados dentro de cada endereco
            }
        }

        System.out.println("===============================");
        for (int[] ref : dias) {
            System.out.println(dias); //->imprime os endereços na memória
            for (int dia : ref) {
                System.out.println(dia); //-> imprime os dados dentro de cada endereco
            }
        }
    }
}
