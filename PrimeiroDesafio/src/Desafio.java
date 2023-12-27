import java.util.Scanner;

public class Desafio{
    public static void main(String[] args) {
        String nome = "Tony Stark";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.println("************************************");
        System.out.println("Nome do Cliente:"+nome);
        System.out.println("Tipo da Conta"+tipoConta);
        System.out.println("Saldo Atual"+saldo);
        System.out.println("************************************");

        String menu = """
                **** Digite sua opção ****
                1 - Consultar Saldo
                2 - Transferir Valor
                3 - Receber Valor
                9 - Sair
                """;
        Scanner leitura = new Scanner(System.in);
        while (opcao != 9){
            System.out.println(menu);
            opcao = leitura.nextInt();
        }

    }

}
