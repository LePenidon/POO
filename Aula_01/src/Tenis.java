public class Tenis {
    int tamanho;
    String fabricante;

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Tenis(int tamanho, String fabricante) {
        this.tamanho = tamanho;
        this.fabricante = fabricante;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public String getFabricante() {
        return this.fabricante;
    }
}
