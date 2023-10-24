import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Contando vitorias e derrotas
        int ganhou = 0;
        int perdeu = 0;

        // Boas vindas ao usuário
        System.out.println("Olá, você está jogando um ímpar ou par em um formato 'melhor de 3', boa sorte!");

        Scanner sc = new Scanner(System.in); // Criando o scanner

        for(int i = 0; i < 3; i++) { // Fazendo uma repetição de 3x, pois o jogo é uma MD3
            if (ganhou == 2 || perdeu == 2) { // Se garnhar ou perder 2x já finaliza, pois é MD3
                i++;
            } else {
                System.out.println("Rodada N°: " + (i + 1));
                System.out.println("Escolha (I)mpar ou (P)ar");
                char imparPar = sc.next().toUpperCase().charAt(0); // Pegando a resposta que o usuário digitou
                while (imparPar != 'I' && imparPar != 'P') { // Se responder diferente fica no loop
                    System.out.println("Digite apenas (I) ou (P)");
                    System.out.println("Escolha (I)mpar ou (P)ar");
                    imparPar = sc.next().toUpperCase().charAt(0); // Deixa o caractere maiusculo
                }
                System.out.println("Digite o número: ");
                int n = sc.nextInt(); //Pegando o número

                Random numAleatorio = new Random(); // Gerando um numero aleatorio
                int resposta = numAleatorio.nextInt() + n;
                System.out.println("Seu número: " + n);
                System.out.println("Número do adversário: " + (resposta - n));
                System.out.println("Número final : " + resposta);

                if (imparPar == 'I') {
                    System.out.println("Você escolheu IMPAR");
                } else {
                    System.out.println("Você escolheu PAR");
                }
                if (resposta % 2 == 0) {
                    System.out.println("O número final é PAR");
                } else {
                    System.out.println("O número final é IMPAR");
                }
                if (imparPar == 'P' && resposta % 2 == 0) {
                    System.out.println("Você ganhou essa rodada");
                    ganhou++;
                } else if (imparPar == 'I' && resposta % 2 != 0) {
                    System.out.println("Você ganhou essa rodada");
                    ganhou++;
                } else {
                    System.out.println("Você perdeu a rodada");
                    perdeu++;
                }
                System.out.println("--------------");
                System.out.println("Pontos do usuário: " + ganhou);
                System.out.println("Pontos do computador: " + perdeu);
                System.out.println("Rodada: " + (i + 1));
                System.out.println("Fim da rodada");
            }
        }
        System.out.println("--------------");
        System.out.println("Resultado: ");
        if(ganhou>perdeu){
            System.out.println("Usuário ganhou o jogo");
        }
        else if (perdeu>ganhou){
            System.out.println("Usuário perdeu o jogo");
        }
        else{
            System.out.println("Erro");
        }
        sc.close();
    }
}