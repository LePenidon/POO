public class Camiseta {
    char tamanho;
    String cor;

    Camiseta(char umTamanho, String umaCor) {
        this.tamanho = umTamanho;
        this.cor = umaCor;
    }

    String printDescricao() {
        return ("Tamanho: " + this.tamanho + ", " + this.cor);
    }

    public void setTamanho(char umTamanho) throws Exception {
        if (umTamanho != 'P' && umTamanho != 'M' && umTamanho != 'G')
            throw new Exception("Tamanho invalido");
        else
            this.tamanho = umTamanho;
    }

    void setCor(String umaCor) {
        this.cor = umaCor;
    }
}
