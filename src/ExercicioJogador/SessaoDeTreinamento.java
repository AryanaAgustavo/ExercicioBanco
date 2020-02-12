package ExercicioJogador;

public class SessaoDeTreinamento {
    public JogadorDeFutebol jogadorDeFutebol;
    public double experiencia;

    public SessaoDeTreinamento() {

    }
    public SessaoDeTreinamento (JogadorDeFutebol jogadorDeFutebol, double experiencia) {
        this.experiencia = experiencia;
        this.jogadorDeFutebol = jogadorDeFutebol;
    }

    public void treinarA (JogadorDeFutebol jogadorDeFutebol) {
        System.out.println("Experiencia inicial: " + jogadorDeFutebol.getExperiencia());
        this.experiencia = jogadorDeFutebol.getExperiencia();

        jogadorDeFutebol.correr();
        jogadorDeFutebol.fazerGols();
        jogadorDeFutebol.correr();

        this.experiencia++;
        jogadorDeFutebol.setExperiencia(this.experiencia);
        System.out.println("Experiencia final: " + jogadorDeFutebol.getExperiencia());
    }
}
