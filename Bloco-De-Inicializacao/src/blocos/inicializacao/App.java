package blocos.inicializacao;

public class App {

    private static final Cliente cliente = new Cliente();

    public static void main(String[] args) {

        for (int parcelas : cliente.getParcelas()){
        System.out.println("" + parcelas);
        }

    }
}
