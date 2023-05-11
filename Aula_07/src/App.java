public class App {
    public static void main(String[] args) throws Exception {
        ClasseGenerica[] cg = new ClasseGenerica[5];

        cg[0] = new ClasseGenerica(-1);
        cg[1] = new ClasseGenerica(5);
        cg[2] = new ClasseGenerica(2);
        cg[3] = new ClasseGenerica(0);
        cg[4] = new ClasseGenerica(1);

        Sorting<ClasseGenerica> s = new Sorting<ClasseGenerica>();
        s.insertion_Sort(cg);

        for (int i = 0; i < cg.length; i++) {
            System.out.println(cg[i].getPontos());
        }
    }
}