public class Cliente {
    private String CPF;
    private String nome;

    public Cliente (String nome, String CPF) {
        this.nome = nome;
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
