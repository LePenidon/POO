import java.util.Date;

public class Voo {
    private String cod;
    private Aeroporto origem;
    private Aeroporto destino;
    private int nAssentos;
    private Aeroviario tripulacao;
    private int tipo;
    private int nac;
    private Date horario;
    private Date data;

    public Voo(String cod, Aeroporto origem, Aeroporto destino, int nAssentos, Aeroviario tripulacao, int tipo, int nac,
            Date horario, Date data) {
        this.cod = cod;
        this.origem = origem;
        this.destino = destino;
        this.nAssentos = nAssentos;
        this.tripulacao = tripulacao;
        this.tipo = tipo;
        this.nac = nac;
        this.horario = horario;
        this.data = data;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public Aeroporto getOrigem() {
        return origem;
    }

    public void setOrigem(Aeroporto origem) {
        this.origem = origem;
    }

    public Aeroporto getDestino() {
        return destino;
    }

    public void setDestino(Aeroporto destino) {
        this.destino = destino;
    }

    public int getnAssentos() {
        return nAssentos;
    }

    public void setnAssentos(int nAssentos) {
        this.nAssentos = nAssentos;
    }

    public Aeroviario getTripulacao() {
        return tripulacao;
    }

    public void setTripulacao(Aeroviario tripulacao) {
        this.tripulacao = tripulacao;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getNac() {
        return nac;
    }

    public void setNac(int nac) {
        this.nac = nac;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

}
