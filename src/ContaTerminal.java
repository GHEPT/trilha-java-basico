import java.util.Scanner;

public class ContaTerminal {

    public static void main (String[] args) {
        //TODO: conhecer e importar a classe Scanner
        Scanner sc = new Scanner(System.in);
        //Exibir as mensagens para o novo usuário
        System.out.println("Olá! Seja bem-vindo(a) ao Banco Digital Dev!");
        System.out.println("Por favor, informe o seu nome completo: ");
        //Obter pela Scanner os valores digitados no terminal
        String nomeCliente = sc.next();
        System.out.println("Agora informe o número da conta: ");
        Integer numero = sc.nextInt();
        System.out.println("Informe, também, o número da agência (com o dígito - ex: 0123-4): ");
        String agencia = sc.next();
        System.out.println("Por último, informe o saldo da conta (ex: 299.56): ");
        Double saldo = sc.nextDouble();
        //Exibir a mensagem "conta criada"
        System.out.println("Olá, "
                           + nomeCliente
                           +"! Obrigado por criar uma conta em nosso banco. Sua agência é "
                           + agencia
                           + ", conta "
                           + numero + " e seu saldo "
                           + saldo + " já está disponível para saque!");
    }
}