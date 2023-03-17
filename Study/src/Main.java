public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Pessoa p1 = new Pessoa("Bruno", 23);
        p1.printDescricao();

        Pessoa p2 = new Pessoa("Davi", 15);
        p2.printDescricao();
    }
}
