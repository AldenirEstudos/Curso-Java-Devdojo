public class VarArgs {


    public static void somaArray(int[] numeros) {
        for (int num : numeros){
            System.out.println("Argumentos "+num);
        }
    }

    public static void somaArrayArgs(String str, int... numeros) {
        for (int varvargs : numeros){
            System.out.println(str + varvargs);
        }

    }

}
