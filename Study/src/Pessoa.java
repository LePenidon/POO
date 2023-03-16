public class Pessoa {
    String nome;
    int idade;
    Camiseta camiseta;

    Pessoa(String umNome, int umaIdade) {
        this.nome = umNome;
        this.idade = umaIdade;
        this.camiseta = new Camiseta('M', "Azul");

        try {
            this.camiseta = new Camiseta("M", "Verde");
        } catch (Exception e) {
            return;
        }
    }

    void printDescricao() {
        System.out.println("Meu nome e " + this.nome + ", tenho " + this.idade + " anos.");
        System.out.println("Eu uso uma camiseta " + camiseta.printDescricao());
    }
}
