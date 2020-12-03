package blocos.iniestaticos.testes;


import blocos.iniestaticos.classes.Cliente;

public class ClienteTeste {

    public static void main(String[] args) {

        System.out.println("Exibindo quantidade de parcelas possíveis");
        System.out.println("tamanho: " + Cliente.getParcelas().length);

    }
}
