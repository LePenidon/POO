public class ClasseGenerica implements Comparable {
    int pontos;

    ClasseGenerica(int p) {
        this.pontos = p;
    }

    public int compareTo(Object o) {
        ClasseGenerica temp = (ClasseGenerica) o;

        if (this.pontos > temp.pontos)
            return +1;

        else if (this.pontos < temp.pontos)
            return -1;

        return 0;
    }

    public int getPontos() {
        return (this.pontos);
    }
}
