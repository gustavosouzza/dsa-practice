public class shellsort {
    public static void main(String[] args) {
        int[] vet = {45, 35, -15, 7, 55, 1, -22};

        for (int gap = vet.length / 2; gap > 0 ; gap /= 2) {
            for (int i = gap ; i < vet.length ; i++) {
                int newElement = vet[i];
                int j = i;

                while (j >= gap && vet[j - gap] > newElement ){
                    vet[j] = vet[j- gap];
                    j -=gap;
                }
                vet[j] = newElement;
            }

        }
        for (int i = 0; i < vet.length ; i++) {
            System.out.println(vet[i]);
        }
    }
}