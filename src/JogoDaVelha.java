import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {
        char[][] posicao = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        int empatevar = 0;
        boolean empate2 = false;
        int num=0;
        char player;
        Scanner scan = new Scanner(System.in);

        while (vitoria(posicao) != true && empate(num, empatevar) != true) {
            mostrarop();
            mostrartab(posicao);
            jogador(num);
            player = jogador(num);
            System.out.println("Selecione a posição do tabuleiro:");
            int escolha = scan.nextInt();
            switch (escolha) {
                case 1:
                    if (posicao[0][0] != ' ') {
                        num = num + 1;
                        System.out.println("Essa posição ja esta ocupada");
                        empatevar=empatevar+1;
                        empate2=true;
                        break;
                    }
                    posicao[0][0] = player;
                    break;
                case 2:
                    if (posicao[0][1] != ' ') {
                        num = num + 1;
                        System.out.println("Essa posição ja esta ocupada");
                        empatevar=empatevar+1;
                        empate2=true;
                        break;
                    }
                    posicao[0][1] = player;
                    break;
                case 3:
                    if (posicao[0][2] != ' ') {
                        num = num + 1;
                        System.out.println("Essa posição ja esta ocupada");
                        empatevar=empatevar+1;
                        empate2=true;
                        break;
                    }
                    posicao[0][2] = player;
                    break;
                case 4:
                    if (posicao[1][0] != ' ') {
                        num = num + 1;
                        System.out.println("Essa posição ja esta ocupada");
                        empatevar=empatevar+1;
                        empate2=true;
                        break;
                    }
                    posicao[1][0] = player;
                    break;
                case 5:
                    if (posicao[1][1] != ' ') {
                        num = num + 1;
                        System.out.println("Essa posição ja esta ocupada");
                        empatevar=empatevar+1;
                        empate2=true;
                        break;
                    }
                    posicao[1][1] = player;
                    break;
                case 6:
                    if (posicao[1][2] != ' ') {
                        num = num + 1;
                        System.out.println("Essa posição ja esta ocupada");
                        empatevar=empatevar+1;
                        empate2=true;
                        break;
                    }
                    posicao[1][2] = player;
                    break;
                case 7:
                    if (posicao[2][0] != ' ') {
                        num = num + 1;
                        System.out.println("Essa posição ja esta ocupada");
                        empatevar=empatevar+1;
                        empate2=true;
                        break;
                    }
                    posicao[2][0] = player;
                    break;
                case 8:
                    if (posicao[2][1] != ' ') {
                        num = num + 1;
                        System.out.println("Essa posição ja esta ocupada");
                        empatevar=empatevar+1;
                        empate2=true;
                        break;
                    }
                    posicao[2][1] = player;
                    break;
                case 9:
                    if (posicao[2][2] != ' ') {
                        num = num + 1;
                        System.out.println("Essa posição ja esta ocupada");
                        empatevar=empatevar+1;
                        empate2=true;
                        break;
                    }
                    posicao[2][2] = player;
                    break;
                default:
                    System.out.println("Digite uma opção valida");
            }
            if(empate2!=true)
                num = num + 1;
            player = jogador(num);
        }
        mostrartab(posicao);
        System.out.println("Fim de jogo!");
    }

    private static void mostrarop(){
        System.out.println("|1|2|3|");
        System.out.println("|4|5|6|");
        System.out.println("|7|8|9|");
    }
    private static void mostrartab ( char[][] posicao){
        int l;
        int c;
        for (l = 0; l < 3; l++) {
            System.out.println();
            System.out.print("|");
            for (c = 0; c < 3; c++)
                System.out.print(posicao[l][c]+"|");
        }
        System.out.println();
    }
    private static char jogador ( int num)
    {
        if (num % 2 == 0)
            return 'O';
        else
            return 'X';
    }
    private static boolean vitoria ( char[][] posicao){
        if (posicao[0][0] == posicao[1][1] && posicao[1][1] == posicao[2][2] && posicao[0][0] != ' ' && posicao[1][1] != ' ' && posicao[2][2] != ' ')
            return true;
        if (posicao[0][2] == posicao[1][1] && posicao[1][1] == posicao[2][0] && posicao[1][1] != ' ' && posicao[0][2] != ' ' && posicao[1][1] != ' ' && posicao[2][0] != ' ')
            return true;
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++)
                if (posicao[l][0] == posicao[l][1] && posicao[l][1] == posicao[l][2] && posicao[l][0] != ' ' && posicao[l][1] != ' ' && posicao[l][2] != ' ')
                    return true;
        }
        for (int c = 0; c < 3; c++) {
            for (int l = 0; l < 3; l++)
                if (posicao[0][c] == posicao[1][c] && posicao[1][c] == posicao[2][c] && posicao[0][c] != ' ' && posicao[1][c] != ' ' && posicao[2][c] != ' ')
                    return true;
        }

        return false;

    }
    private static boolean empate(int num, int empatevar){
        int x=0;
        x=num-empatevar;
        if(x==9)
            return true;
        return false;
    }

}
