public class App {
    public static void main(String[] args) throws Exception {
        Polinomio poli = new Polinomio(2);

        poli.addTermo(2, 0);
        poli.addTermo(3, 1);
        poli.addTermo(4, 2);

        System.out.println(poli.computa(1));
        // System.out.println(poli.computa(2));

        poli.mostraPolinomio();
    }
}
