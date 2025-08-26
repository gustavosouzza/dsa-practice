public class selectsort {
    public static void main(String[] args) {
        int[] numeros = {64, 25, 12, 22, 11};
        int n = numeros.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (numeros[j] < numeros[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = numeros[minIndex];
            numeros[minIndex] = numeros[i];
            numeros[i] = temp;
        }

        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}
