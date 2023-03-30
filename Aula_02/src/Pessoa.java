public class Pessoa {
    private int CPF;
    private String nome;

    public Pessoa(int CPF, String nome) {
        this.CPF = CPF;
        this.nome = nome;
    }

    public int getCPF() {
        return CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
