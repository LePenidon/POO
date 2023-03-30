import java.time.LocalDate;

public abstract class Veiculo {
    private LocalDate dataUltManutencao;
    protected String[] lVerificacoes;

    public Veiculo() {
        this.dataUltManutencao = null;
        this.lVerificacoes = new String[10];
    }

    public String[] getlVerificacoes() {
        return lVerificacoes;
    }

    public LocalDate getDataUltManutencao() {
        return dataUltManutencao;
    }

    public void setDataUltManutencao(LocalDate dataUltManutencao) {
        this.dataUltManutencao = dataUltManutencao;
    }

    public abstract void setlVerificacoes();

    public abstract void listaVerificacoes();

    public abstract void ajustar();

    public abstract void limpar();
}
