public class binary_search {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 1; i <= 100; i++) {
            array[i - 1 ] = i;
        }
        System.out.println(buscabinaria(array, 57));
    }

    public static int buscabinaria(int[]array ,int elemento ){
        int indicemenor = 0;
        int maiorindice = array.length - 1 ;
        int meioindice;
        int chute;

        while (indicemenor <= maiorindice){
            meioindice = (indicemenor + maiorindice) / 2;
            chute = array[meioindice];
            if ( chute == elemento ) {
                return meioindice ;
            }
            else if (chute > elemento) {
                maiorindice = meioindice - 1;
            }
            else {
                indicemenor = meioindice + 1;
            }
        }
        return -1;
    }
}
