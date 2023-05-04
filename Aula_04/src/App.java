import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        TimeFutebol[] times = new TimeFutebol[5];
        ArrayList ar = new ArrayList();

        times[0] = new TimeFutebol("01", 5, 4, 1, 10, 7, 80, 90);

        times[1] = new TimeFutebol("02", 4, 4, 5, 11, 2, 10, 20);

        times[2] = new TimeFutebol("03", 7, 1, 5, 11, 2, 10, 20);

        times[3] = new TimeFutebol("04", 9, 40, 5, 11, 2, 10, 20);

        times[4] = new TimeFutebol("05", 0, 6, 5, 11, 2, 10, 20);

        for (int i = 0; i < times.length; i++) {
            ar.add(times[i]);
        }

        Collections.sort(ar);

        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
    }
}
