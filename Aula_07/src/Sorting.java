public class Sorting<TIPO extends Comparable> {

    Sorting() {

    }

    public void insertion_Sort(TIPO A[]) {
        for (int j = 1; j < A.length; j++) {
            TIPO temp = A[j];
            int i = j - 1;
            while ((i >= 0) && (A[i].compareTo(temp) > 0)) {
                A[i + 1] = A[i];
                i = i - 1;
            }
            A[i + 1] = temp;
        }
    }

    public int compareTo(Object object) {
        return 1;
    }

}
