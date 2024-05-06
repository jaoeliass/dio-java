import java.util.Scanner;
public class SimulandoContaBancaria {

    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome: ");
        String NomedoCliente = scanner.nextLine();

        System.out.println("Por favor, digite o numero da conta: ");
        int NumerodaConta = scanner.nextInt();
    
        System.out.println("Por favor, digite o numero da agencia: ");
        int NumerodaAgencia = scanner.nextInt();
    
        System.out.println("Por favor, digite o seu saldo: ");
        float SaldoemConta = scanner.nextFloat();

        System.out.println(NomedoCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+NumerodaAgencia+", conta "+NumerodaConta+" e seu saldo "+SaldoemConta+" já está disponível para saque");

    }
}
