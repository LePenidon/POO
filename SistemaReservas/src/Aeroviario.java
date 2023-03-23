public class Aeroviario extends Pessoa {
    private int codClasse;
    private String funcao;

    public Aeroviario(int CPF, String nome, int codClasse, String funcao) {
        super(CPF, nome);
        this.codClasse = codClasse;
        this.funcao = funcao;
    }

    public int getCodClasse() {
        return codClasse;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setCodClasse(int codClasse) {
        this.codClasse = codClasse;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

}
