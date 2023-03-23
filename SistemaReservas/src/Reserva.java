
public class Reserva {
    private int cod;
    private Voo voo;
    private Passageiro passageiro;

    public Reserva(int cod, Voo voo, Passageiro passageiro) {
        this.cod = cod;
        this.voo = voo;
        this.passageiro = passageiro;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

}
