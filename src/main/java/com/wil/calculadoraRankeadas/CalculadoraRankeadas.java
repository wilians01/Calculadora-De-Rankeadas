package main.java.com.wil.calculadoraRankeadas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraRankeadas {
    public static void main(String[] args) {

        vitoriasEDerrotas();

    }

    static String classificadorRanking(int renking){
        if (renking <= 10) {
            return "Ferro";
        } else if (renking <= 20) {
            return "Bronze";
        } else if (renking <= 50) {
            return "Prata";
        } else if (renking <= 80) {
            return "Ouro";
        } else if (renking <= 90) {
            return "Diamante";
        } else if (renking <= 100) {
            return "Lendário";
        } else{
            return "Imortal";
        }

    }
    static void vitoriasEDerrotas(){
        String nome;
        int vitorias;
        int derrotas;
        int ranking;
        String nivel;
        Scanner ler = new Scanner(System.in);

        try {
            System.out.println("Olá jogador, sejá bem-vindo !!");

            System.out.println("Qual é seu nome ?");
            nome = ler.nextLine();

            System.out.println("Atualmente qual é sua quantidade de vitórias ?");
            vitorias = ler.nextInt();

            System.out.println("Atualmente qual é sua quantidade de vitórias ?");
            derrotas = ler.nextInt();
            if (0 < vitorias && 0 < derrotas){
                ranking = vitorias - derrotas;
                nivel = classificadorRanking(ranking);
                System.out.printf("O Herói de nome "+nome+" está no nível de "+nivel);
            }else {
                System.out.println("As quantidades de vitória e derrotas não podem ser negativo. Tente novamente.");
            }

        }catch(InputMismatchException e) {
            System.out.println("Entrada inválida! Certifique-se de inserir um número inteiro válido para o XP.");
        } finally {

            ler.close();
        }

    }
}
