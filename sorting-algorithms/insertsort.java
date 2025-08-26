public class insertsort {
    public static void main(String[] args) {
        int[] numeros = {64, 25, 12, 22, 11};
        int n = numeros.length;

        for (int i = 1; i < n; i++) {
            int chave = numeros[i];
            int j = i - 1;

            while (j >= 0 && numeros[j] > chave) {
                numeros[j + 1] = numeros[j];
                j--;
            }
            numeros[j + 1] = chave;
        }

        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}
