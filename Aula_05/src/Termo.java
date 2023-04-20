public class Termo {
    double coeficiente;
    int potencia;

    public Termo(double coeficiente, int potencia) {
        this.coeficiente = coeficiente;
        this.potencia = potencia;
    }

    public double computa(double x) {
        return (double) ((Math.pow(x, this.potencia)) * this.coeficiente);
    }

    public void mergeCoefi(double coefi) {
        this.coeficiente += coefi;
    }
}
