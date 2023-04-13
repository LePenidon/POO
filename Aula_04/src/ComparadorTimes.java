import java.util.Comparator;
import java.util.Random;

public class ComparadorTimes implements Comparator {

    public int compare(Object o1, Object o2) {
        TimeFutebol time1 = ((TimeFutebol) o1);
        TimeFutebol time2 = ((TimeFutebol) o2);

        if (time1.pontos() > time2.pontos()) {
            return 1;
        } else if (time1.pontos() < time2.pontos()) {
            return 0;
        }

        if (time1.vitorias > time2.vitorias) {
            return 1;
        } else if (time1.vitorias < time2.vitorias) {
            return 0;
        }

        if (time1.gols_feitos - time1.gols_sofridos > time2.gols_feitos - time2.gols_sofridos) {
            return 1;
        } else if (time1.gols_feitos - time1.gols_sofridos < time2.gols_feitos - time2.gols_sofridos) {
            return 0;
        }

        if (time1.gols_feitos > time2.gols_feitos) {
            return 1;
        } else if (time1.gols_feitos < time2.gols_feitos) {
            return 0;
        }

        if (time1.cart_vermelhos > time2.cart_vermelhos) {
            return 1;
        } else if (time1.cart_vermelhos < time2.cart_vermelhos) {
            return 0;
        }

        if (time1.cart_amarelos > time2.cart_amarelos) {
            return 1;
        } else if (time1.cart_amarelos < time2.cart_amarelos) {
            return 0;
        }

        Random random = new Random();

        return (random.nextInt(2));
    }

}
