package ExercicioJogador;

public class Main {
    public static void main (String[] args) {
        JogadorDeFutebol jogador1 = new JogadorDeFutebol("Ary", 100, 100, 0, 3);
        JogadorDeFutebol jogador2 = new JogadorDeFutebol("Jog", 5, 100, 0, 0);

        SessaoDeTreinamento treino = new SessaoDeTreinamento();

        treino.treinarA(jogador1);
        treino.treinarA(jogador2);
    }
}
