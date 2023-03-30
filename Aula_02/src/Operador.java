import java.util.Random;

public class Operador extends Pessoa {
    private int codDaEmpresa;

    public Operador(int CPF, String nome, int codDaEmpresa) {
        super(CPF, nome);
        this.codDaEmpresa = codDaEmpresa;
    }

    public void setCodDaEmpresa(int codDaEmpresa) {
        this.codDaEmpresa = codDaEmpresa;
    }

    public int getCodDaEmpresa() {
        return codDaEmpresa;
    }

    public Reserva criaReserva(Passageiro p, Voo v) {
        Random rand = new Random();

        int codTemp = rand.nextInt(1000);
        Reserva r = new Reserva(codTemp, v, p);

        return r;
    }

}
