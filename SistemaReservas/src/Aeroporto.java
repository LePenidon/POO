public class Aeroporto {
    private String cidade;
    private String pais;
    private String cod;
    private String nome;
    private int capacidade;

    public Aeroporto(String cidade, String pais, String cod, String nome, int capacidade) {
        this.cidade = cidade;
        this.pais = pais;
        this.cod = cod;
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public String getCidade() {
        return cidade;
    }

    public String getPais() {
        return pais;
    }

    public String getCod() {
        return cod;
    }

    public String getNome() {
        return nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

}
