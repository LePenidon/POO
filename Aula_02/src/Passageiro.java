public class Passageiro extends Pessoa {
    private String endereco;

    public Passageiro(int CPF, String nome, String endereco) {
        super(CPF, nome);
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
