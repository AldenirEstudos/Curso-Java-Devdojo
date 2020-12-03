
public class SomaArray {

    private static VarArgs varArgs = new VarArgs();

    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5};
        VarArgs.somaArray(numeros);

        //--------------------------
        VarArgs.somaArrayArgs("Argumantos ",2,3,4,5);
    }

}
