package blocos.inicializacao;

public class Cliente {

    /*
    * 1 - alocado espaco na memoria para o objeto criado
    * 2 - Cada atributo de classe é criado e inicializado com seus valores default ou explicitos
    * 3 - Bloco de inicialização é executado {datos}
    * 4 - Construtor é executado
    * */

    private int [] parcelas;

    {
        parcelas = new int[100];
        System.out.println("Dentro do bloco de inicialização");
        for (int i = 1; i<=parcelas.length; i++){
            this.parcelas[i-1] = i;
        }
    }

    public Cliente() {
    }

    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }
}
