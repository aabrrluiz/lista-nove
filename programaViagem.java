package EX;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;
public class programaViagem {
    public static void main(String[] args) {
        try{
        int poltrona;
        FileWriter arq = new FileWriter("C:\\Users\\mathe\\OneDrive\\Área de Trabalho\\recibo_viagem.txt");
        PrintWriter gravarArq = new PrintWriter(arq);   
        Scanner scanner = new Scanner(System.in);
        Random assento = new Random();
        System.out.println("Por favor, informe o seu nome: ");
        String nome = scanner.next();
        System.out.println("Informe seu CPF: ");
        String cpf = scanner.next();
        System.out.println("Informe a sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("###### DESTINOS DISPINÍVEIS ######");
        System.out.println("Código  LOCAL       VALOR");
        System.out.println("  1     São Paulo   $250");
        System.out.println("  2     Nova York   $2400");
        System.out.println("  3     Berlim      $3800");
        System.out.println("Qual dos destinos disponíveis você deseja?");
        String opcao = scanner.next().toUpperCase();
        switch (opcao){
            case "1":
                poltrona = assento.nextInt(1,20);   
                gravarArq.write("Nome: " + nome + "\nCPF: " + cpf + "\nIdade: " + idade + "\nLocal escolhido: São Paulo" + "\nValor pago: $250" + "\nNúmero da sua poltrona: " + poltrona + "\nnObrigado pela compra e boa viagem!");
                arq.close();
                break;
            case "2":

                poltrona = assento.nextInt(1,20);        
                gravarArq.write("Nome: " + nome + "\nCPF: " + cpf + "\nIdade: " + idade + "\nLocal escolhido: Nova York" + "\nValor pago: $2400" + "\nNúmero da sua poltrona: " + poltrona + "\nnObrigado pela compra e boa viagem!");
                arq.close();
                break;
            case "3":
            
                poltrona = assento.nextInt(1,20);          
                gravarArq.write("Nome: " + nome + "\nCPF: " + cpf + "\nIdade: " + idade + "\nLocal escolhido: Berlim" + "\nValor pago: $3800" + "\nNúmero da sua poltrona: " + poltrona + "\nnObrigado pela compra e boa viagem!");
                arq.close();
                break;
            default:
            System.out.println("Digito inválido!"); 
            break;
            }          
            scanner.close();
            
            
        }  catch (Exception e) {
        System.out.println(e);
        }
}
}
