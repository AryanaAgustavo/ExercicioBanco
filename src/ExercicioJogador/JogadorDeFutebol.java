package ExercicioJogador;

public class JogadorDeFutebol {
    public String nome;
    public double energia;
    public  double alegria;
    public  int gols;
    public  double experiencia;

    // Criei o construtor:

    public JogadorDeFutebol (String nome, double energia, double alegria, int gols, double experiencia){
        this.nome = nome;
        this.energia = energia;
        this.alegria = alegria;
        this.gols = gols;
        this.experiencia = experiencia;
    }

    // Método fazerGols:

    //public String fazerGols (int golsFeitos) {
      //  for (int i=1; i<=golsFeitos; i++) {
        //    this.energia = energia - 5;
          //  this.alegria = alegria + 10;
        //} return ( "GOOOOL!" + " Energia = " + energia + " Alegria = " + alegria);
    //}

// Método corrigido:

    public void fazerGols (int gols) {
        if (this.energia >= 5) {
            this.energia = energia - 5;
            this.alegria = alegria + 10;
            System.out.println("GOOOOL!");
        } else {
            System.out.println("Sem energia");
        }
    }

    public void correr () {
        if (this.energia>=10) {
            this.energia = energia - 10;
            System.out.println("Cansei!");
        } else {
            System.out.println("Não pode correr");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getEnergia() {
        return energia;
    }

    public void setEnergia(double energia) {
        this.energia = energia;
    }

    public double getAlegria() {
        return alegria;
    }

    public void setAlegria(double alegria) {
        this.alegria = alegria;
    }

    public int getGols() {
        return gols;
    }

    public void setGols(int gols) {
        this.gols = gols;
    }

    public double getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(double experiencia) {
        this.experiencia = experiencia;
    }

    public void fazerGols() {
    }
}

