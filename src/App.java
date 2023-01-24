import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Account myAccount1 = new Account("Douglas", 1500);
        // System.out.printf("Conta de %s %n%nSaldo no valor de R$ %.2f%n%n", myAccount1.getName(), myAccount1.getBalance());

        // Account myAccount2 = new Account("Teste", 2000);
        // System.out.printf("Conta de %s %n%nSaldo no valor de R$ %.2f%n%n", myAccount2.getName(), myAccount2.getBalance());

        // Scanner input = new Scanner(System.in);
        // System.out.println("Valor de deposito: ");
        // myAccount1.depositValue(input.nextDouble());
        // System.out.printf("Valor da conta: %.2f%n%n", myAccount1.getBalance());

        // System.out.println("Valor de saque: ");
        // myAccount1.withdrawBalance(input.nextDouble());
        // System.out.printf("Valor da conta: %.2f%n%n", myAccount1.getBalance());
        // String test = "Hello There!";
        // System.out.printf("%d%n", test.length());

        // System.out.printf("%c%n", test.charAt(4));

        // double v1 = 0;
        // double v2 = 0;
        // double v3 = 0;
        // double tri = 0;

        // Scanner input = new Scanner(System.in);
        // System.out.println("Digite um valor: ");
        // v1 = input.nextDouble();

        // System.out.println("Digite outro numero: ");
        // v2 = input.nextDouble();

        // System.out.println("Digite outro valor: ");
        // v3 = input.nextDouble();

        // tri = v1 + v2;

        // if( tri > v3  ){
        //     System.out.println("Valores podem formar um triangulo");
        //     if( v1 == v2 && v2 == v3 ){
        //         System.out.println("Equilatero");
        //     }
            
        //     else if( v1 == v2 || v1 == v3 || v2 == v3){
        //         System.out.println("Isosceles");
        //     }
    
        //     else{
        //         System.out.println("Escaleno");
        //     }    
        // }
        // else{
        //     System.out.println("Valores não podem formar um triangulo");
        // }

        // int opcao = 0;

        // double preco = 100;

        // Scanner input = new Scanner(System.in);

        // System.out.println("Digite 1 para pagamento em dinheiro (10% de desconto)\nDigite 2 para pagamento em 1x no cartão (5% de desconto)\nDigite 3 para pagamento em 2x no cartão (preço original)\nDigite 4 para pagamento em 3x no cartão (juros de 5% sobre o valor original)");
        // opcao = input.nextInt();

        // switch(opcao){
        //     case 1:
        //         System.out.printf("\nValor a ser pago: %.2f", (preco - ((preco*10)/100)));
        //         break;
        //     case 2:
        //         System.out.printf("\nValor a ser pago: %.2f", (preco - ((preco*5)/100)));
        //         break;
        //     case 3:
        //         System.out.printf("\nValor a ser pago: %.2f", preco);
        //         break;
        //     case 4:
        //         System.out.printf("\nValor a ser pago: %.2f", (preco + ((preco*5)/100)));
        //         break;
        //     default:
        //         System.out.println("Opção inválida!");
        // }

        // double nota1 = 0;
        // double nota2 = 0;
        // int i = 1;
        // Scanner input = new Scanner(System.in);
        // while(i <= 2){
        //     System.out.println("\n\nDigite a primeira nota: ");
        //     nota1 = input.nextDouble();
        //     System.out.println("\n\nDigite a segunda nota: ");
        //     nota2 = input.nextDouble();
        //     System.out.printf("\n\nMedia: %.2f", (nota1+nota2)/2);
        //     i += 1;
        // }

        // int counter = 1;

        // do {
        //     System.out.printf("\n%d", counter);
        //     counter += 1;
        // } while (counter <= 10);

        // int quantidadeFuncionarios;

        // double somaSalario = 0;

        // int count = 0;

        // Scanner input = new Scanner(System.in);
        // System.out.println("Digite a quantidade de funcionarios: ");

        // quantidadeFuncionarios = input.nextInt();
        
        // count = quantidadeFuncionarios;


        // do{
        //     System.out.println("Digite o valor do salário: ");
        //     somaSalario = somaSalario + input.nextDouble();
        //     count -= 1;

        // } while(count > 0);

        // System.out.printf("\n\nSoma dos salarios: %.2f", somaSalario);

        // System.out.printf("\nMedia salarial: %.2f", somaSalario/quantidadeFuncionarios);

        // double investimento = 0;

        // double retorno = 0;

        // double juros = 0.2;

        // int tempo = 0;

        // Scanner input = new Scanner(System.in);

        // System.out.println("Digite o valor do investimento: ");

        // investimento = input.nextDouble();

        // System.out.println("Digite a quantidade de anos: ");

        // tempo = input.nextInt();

        // for(int i = 0; i < tempo; i++){
        //     investimento += investimento*juros;

        // }

        // System.out.printf("Quantidade final após %d anos: %.2f",tempo, investimento);

        
        
        // int quantidade;

        // Scanner input = new Scanner(System.in);
        
        // System.out.println("Digite a quantidade: ");
        // quantidade = input.nextInt();
        // int[] parimpar = new int[quantidade];

        // for(int i = 0; i < quantidade; i++){

        //     if(i % 2 == 0){
        //         parimpar[i] = 1;
        //     }
        //     else{
        //         parimpar[i] = 0;
        //     }
            
        // }

        // for(int x = 0; x < quantidade; x++){
        //     System.out.printf("\n%d", parimpar[x]);
        // }

        // System.out.println("Digite a quantidade de alunos da turma: ");

        // Scanner input = new Scanner(System.in);
        
        // double mediaGeral = 0;

        // int counter = 0;

        // double[] alunos = new double[input.nextInt()];

        

        // for(int i = 0; i < alunos.length; i++){
        //     System.out.println("Digite a nota do aluno: ");
        //     alunos[i] = input.nextDouble();
        // }

        // for(int x = 0; x < alunos.length; x++){
        //     mediaGeral += alunos[x];
        // }

        // mediaGeral = mediaGeral/alunos.length;

        // for(int j = 0; j < alunos.length; j++){
        //     if(alunos[j] >= mediaGeral){
        //         counter += 1;
        //     }
        // }

        // double[] alunosMedia = new double[counter];

        // for(int h = 0; h < alunos.length; h++){
        //     if(alunos[h] >= mediaGeral){
        //         alunosMedia[h] = alunos[h];
        //     }
        // }

        // for(int g = 0; g < alunosMedia.length; g++){
        //     System.out.printf("Notas acima da media: %.2f", alunosMedia[g]);
        // }

        // GradeBook cursoJava = new GradeBook();
        System.out.printf("%d", (int) 0.9);
        








    }

    
}
