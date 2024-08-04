import java.util.Locale;
import java.util.Scanner;

/* 
* Observações sobre o projeto:
* Para pegar nome composto é necessário utilizar nextLine(), entretanto ao pegar um nextInt() antes
* o ENTER produz um \n no buffer de entrada que não é consumido na instrução nextInt() e
* acaba sendo consumido pelo nextLine() fazendo com que a instrução seja "ignorada".
* Possibilidades de resolução:
* 1 - Criar uma outra instância de scanner (não utilizado na resolução deste projeto)
* 2 - Podemos ler todos com nextLine() e realizar uma conversão para o tipo de dado necessário (solução utilizada)
* Por fim, foi necessário utilizar String.valueOf() para exibição do resultado utilizando concat.
*/

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int numero = 0;
        String agencia = "";
        String nomeCliente = "";
        Double saldo = 0.0;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência!");
        numero = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite a Agência:");
        agencia = scanner.nextLine();

        System.out.println("Digite o nome do cliente:");
        nomeCliente = scanner.nextLine();

        System.out.println("Digite o valor a ser depositado:");
        saldo = Double.parseDouble(scanner.nextLine());

        System.out.println("Olá ".concat(nomeCliente).concat(" obrigado por criar uma conta em nosso banco, sua agência é ")
        .concat(agencia).concat(", conta ").concat(String.valueOf(numero)).concat(" e seu saldo ")
        .concat(String.valueOf(saldo)).concat(" já está disponível para saque."));

    }
}
