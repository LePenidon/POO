import java.util.logging.Level;
import java.util.logging.Logger;

public class Pessoa {
    String nome;
    int idade;
    Camiseta camiseta;
    Tenis tenis;

    Pessoa(String umNome, int umaIdade) {
        this.nome = umNome;
        this.idade = umaIdade;
        this.camiseta = new Camiseta('M', "Azul");
        try {
            this.camiseta.setTamanho('Y');
        } catch (Exception ex) {
            Logger.getLogger(Pessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void printDescricao() {
        System.out.println("Meu nome e " + this.nome + ", tenho " + this.idade + " anos.");
        System.out.println("Eu uso uma camiseta " + camiseta.printDescricao());
    }

    void vesteTenis(String umModelo, int umTamanho) {
        tenis = new Tenis(umTamanho, umModelo);
    }
}
