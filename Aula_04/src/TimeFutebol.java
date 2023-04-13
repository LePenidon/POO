import java.util.Random;

public class TimeFutebol implements Comparable {
    int vitorias;
    int derrotas;
    int empates;
    int gols_feitos;
    int gols_sofridos;
    int cart_amarelos;
    int cart_vermelhos;

    public TimeFutebol(int vitorias, int derrotas, int empates, int gols_feitos, int gols_sofridos, int cart_amarelos,
            int cart_vermelhos) {
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        this.gols_feitos = gols_feitos;
        this.gols_sofridos = gols_sofridos;
        this.cart_amarelos = cart_amarelos;
        this.cart_vermelhos = cart_vermelhos;
    }

    public int pontos() {
        return (3 * this.vitorias + this.empates);
    }

    public int compareTo(Object object) {
        TimeFutebol time2 = ((TimeFutebol) object);

        if (this.pontos() > time2.pontos()) {
            return 1;
        } else if (this.pontos() < time2.pontos()) {
            return -1;
        } else if (this.vitorias > time2.vitorias) {
            return 1;
        } else if (this.vitorias < time2.vitorias) {
            return -1;
        } else if (this.gols_feitos - this.gols_sofridos > time2.gols_feitos - time2.gols_sofridos) {
            return 1;
        } else if (this.gols_feitos - this.gols_sofridos < time2.gols_feitos - time2.gols_sofridos) {
            return -1;
        } else if (this.gols_feitos > time2.gols_feitos) {
            return 1;
        } else if (this.gols_feitos < time2.gols_feitos) {
            return -1;
        } else if (this.cart_vermelhos > time2.cart_vermelhos) {
            return 1;
        } else if (this.cart_vermelhos < time2.cart_vermelhos) {
            return -1;
        } else if (this.cart_amarelos > time2.cart_amarelos) {
            return 1;
        } else if (this.cart_amarelos < time2.cart_amarelos) {
            return -1;
        }

        Random random = new Random();
        return (random.nextInt(2));

    }

    public String toString() {
        return "" + this.pontos();
    }
}
