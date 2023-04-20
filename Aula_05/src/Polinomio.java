public class Polinomio {
    Termo[] termos;
    int max;

    public Polinomio(int max) {
        this.termos = new Termo[max + 1];
        this.max = max + 1;

        for (int i = 0; i < termos.length; i++) {
            termos[i] = null;
        }
    }

    public double computa(double x) {
        double result = 0;

        for (int i = 0; i < termos.length; i++) {
            if (termos[i] != null) {
                result += termos[i].computa(x);
            }
        }

        return result;
    }

    private Termo encontraTermo(int potencia) {
        for (int i = 0; i < termos.length; i++) {
            if (termos[i] != null) {
                if (termos[i].potencia == potencia) {
                    return termos[i];
                }
            }
        }
        return null;
    }

    public boolean addTermo(double coefi, int potencia) {
        Termo termoDaPotencia = encontraTermo(potencia);

        if (termoDaPotencia == null) {
            termoDaPotencia = new Termo(coefi, potencia);
        } else {
            termoDaPotencia.mergeCoefi(coefi);
        }

        termos[potencia] = termoDaPotencia;
        return true;
    }

    void mostraPolinomio() {
        String pol_final = "";

        for (int i = 0; i < termos.length; i++) {
            if (termos[i] != null) {
                pol_final += termos[i].coeficiente + "x^" + termos[i].potencia + " ";
            }
        }

        System.out.println(pol_final);
    }
}
