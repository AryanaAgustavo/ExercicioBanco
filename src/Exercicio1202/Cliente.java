package Exercicio1202;

public class Cliente {
    private String numeroCliente;
    private String sobrenome;
    private String RG;
    private String CPF;

    public Cliente(String numeroCliente, String sobrenome, String RG, String CPF) {
        this.numeroCliente = numeroCliente;
        this.sobrenome = sobrenome;
        this.RG = RG;
        this.CPF = CPF;
    }

    public String getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
