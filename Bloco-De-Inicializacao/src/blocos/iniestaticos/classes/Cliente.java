package blocos.iniestaticos.classes;

public class Cliente {

    /* 0 - Bloco de inicialização estatico é executado quando a VM carregar a classe (é executado apenas 1 vez)
     *  1 - alocado espaco na memoria para o objeto criado
     *  2 - Cada atributo de classe é criado e inicializado com seus valores default ou explicitos
     *  3 - Bloco de inicialização é executado {datos}
     *  4 - Construtor é executado
     * */

    private static final int[] parcelas;

    static {
        parcelas = new int[100];
        System.out.println("Dentro do bloco de inicialização");
        for (int i = 1; i <= parcelas.length; i++) {
            parcelas[i - 1] = i;
        }
    }

    public Cliente() {
    }

    public static int[] getParcelas() {
        return parcelas;
    }
}
