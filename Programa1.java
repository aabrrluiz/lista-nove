package EXERCICIOUM;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
        System.out.println("informe o nome do primeiro aluno:");
        String nomeUm = scanner.next();
        System.out.println("informe a nota do primeiro aluno:");
        double notaUm = scanner.nextDouble();
        System.out.println("informe o nome do segundo aluno:");
        String nomeDois = scanner.next();
        System.out.println("informe a nota do segundo aluno:");
        double notaDois = scanner.nextDouble();
        System.out.println("informe o nome do terceiro aluno:");
        String nomeTres = scanner.next();
        System.out.println("informe a nota do terceiro aluno:");
        double notaTres = scanner.nextDouble();
        System.out.println("informe o nome do quarto aluno:");
        String nomeQuatro = scanner.next();
        System.out.println("informe a nota do quarto aluno:");
        double notaQuatro = scanner.nextDouble();
        System.out.println("informe o nome do quinto aluno:");
        String nomeCinco = scanner.next();
        System.out.println("informe a nota do quinto aluno:");
        double notaCinco = scanner.nextDouble();

        FileWriter arq = new FileWriter("C:\\Users\\pedro\\OneDrive\\Área de Trabalho\\EXERCICIOUM.txt");
      PrintWriter gravarArq = new PrintWriter(arq);

      gravarArq.write("Aluno Um = nome: " + nomeUm + ", nota: " + notaUm + "\nAluno Dois = nome:" + nomeDois + ", nota: " + notaDois + "\nAluno Tres = nome: " + nomeTres + ", nota: " + notaTres +  "\nAluno Quatro = nome: " + nomeQuatro + ", nota: " + notaQuatro + "\nAluno Cinco = nome: " + nomeCinco + ", nota: " + notaCinco );
      arq.close();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Arquivo criado com sucesso.");
        }
        scanner.close();
    }
}
