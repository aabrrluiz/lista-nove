package EXERCICIODOIS;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
        System.out.println("informe qual o primeiro produto:");
        String produtoUm = scanner.next();
        System.out.println("informe o valor do primeiro produto:");
        double valorUm = scanner.nextDouble();
        System.out.println("informe qual o segundo produto:");
        String produtoDois = scanner.next();
        System.out.println("informe o valor do segundo produto:");
        double valorDois = scanner.nextDouble();
        System.out.println("informe qual o terceiro produto:");
        String produtoTres = scanner.next();
        System.out.println("informe o valor do terceiro produto:");
        double valorTres = scanner.nextDouble();
        System.out.println("informe qual o quarto produto:");
        String produtoQuatro = scanner.next();
        System.out.println("informe o valor do quarto produto:");
        double valorQuatro = scanner.nextDouble();
        System.out.println("informe qual o quinto produto:");
        String produtoCinco = scanner.next();
        System.out.println("informe o valor do quinto produto:");
        double valorCinco = scanner.nextDouble();
        System.out.println("informe qual o sexto produto:");
        String produtoSeis = scanner.next();
        System.out.println("informe o valor do sexto produto:");
        double valorSeis = scanner.nextDouble();
        System.out.println("informe qual o setimo produto:");
        String produtoSete = scanner.next();
        System.out.println("informe o valor do setimo produto:");
        double valorSete = scanner.nextDouble();
        System.out.println("informe qual o oitavo produto:");
        String produtoOito = scanner.next();
        System.out.println("informe o valor do oitavo produto:");
        double valorOito = scanner.nextDouble();
        System.out.println("informe qual o nono produto:");
        String produtoNove = scanner.next();
        System.out.println("informe o valor do nono produto:");
        double valorNove = scanner.nextDouble();
        System.out.println("informe qual o decimo produto:");
        String produtoDez = scanner.next();
        System.out.println("informe o valor do decimo produto:");
        double valorDez = scanner.nextDouble();

        FileWriter arq = new FileWriter("C:\\Users\\pedro\\OneDrive\\Área de Trabalho\\EXERCICIODOIS.txt");
      PrintWriter gravarArq = new PrintWriter(arq);

      gravarArq.write("Produto Um: " + produtoUm + ", valor: $" + valorUm + "\nProduto Dois: " + produtoDois + ", valor: $" + valorDois + "\nProduto Tres: " + produtoTres + ", valor: $" + valorTres +  "\nProdruto Quatro: " + produtoQuatro + ", valor: $" + valorQuatro + "\nProduto Cinco: " + produtoCinco + ", valor: $" + valorCinco + "\nProduto Seis: " + produtoSeis + ", valor: $" + valorSeis + "\nProduto Sete: " + produtoSete + ", valor: $" + valorSete + "\nProduto Oito: " + produtoOito + ", valor: $" + valorOito + "\nProduto Nove: " + produtoNove + ", valor: $" + valorNove + "\nProduto Dez: " + produtoDez + ", valor: $" + valorDez );
      arq.close();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Arquivo criado com sucesso.");
        }
        scanner.close();
    }
}
