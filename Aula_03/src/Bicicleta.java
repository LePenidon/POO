
public class Bicicleta extends Veiculo {
    int nMarchas;
    int tamanhos;

    public Bicicleta() {
        super();
    }

    void engraxarCorrente() {
        return;
    }

    @Override
    public void listaVerificacoes() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listaVerificacoes'");
    }

    @Override
    public void ajustar() {
        System.out.println("Bicicleta Ajustada");
    }

    @Override
    public void limpar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'limpar'");
    }

    @Override
    public void setlVerificacoes() {
        this.lVerificacoes[0] = "Esticador ajustado";
        this.lVerificacoes[1] = "Pneu calibrado";
        this.lVerificacoes[2] = "Cambio regulado";
    }
}
