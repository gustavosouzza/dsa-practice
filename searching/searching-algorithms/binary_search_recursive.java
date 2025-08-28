public class binary_search_recursive {
    public static void main(String[] args) {

        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
        }

        int alvo = 57;
        int indice = buscabinaria(array, 0, array.length - 1, alvo);
        if (indice != -1) {
            System.out.println("Elemento " + alvo + " encontrado no índice: " + indice);
        } else {
            System.out.println("Elemento " + alvo + " não encontrado.");
        }
    }

    public static int buscabinaria(int[]array ,int  menorindice , int maiorindice, int elemento ) {
        if (menorindice > maiorindice) {
            return -1;  // erro
        }
        int mid = (menorindice + maiorindice) / 2 ;
        int chute = array[mid];

        if (chute == elemento) {
            return mid;
        } else if (chute > elemento){
            return buscabinaria(array, menorindice, maiorindice -1   , elemento );
        } else
        {
            return buscabinaria(array ,  mid  + 1   , maiorindice , elemento  );
        }

    }
}