public class mergesort {
    public static void main(String[] args) {
        int[] array = {20 , 35, -15, 7,55 ,1 ,-22};
        mergesort(array, 0 , array.length);

        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }
    }

    public static void mergesort(int[] input , int start , int end){
        if (end - start < 2) {
            return;
        }
        int mid = (start + end) /2;
        mergesort(input, start, mid);
        mergesort(input, mid ,end);
        merge(input,start , mid , end);
    }

    //  {30, 15 ,-20, 40 , 50, 40, 50};
    public static void merge(int[] input, int start, int mid , int end){
        int i = start ;
        int j = mid;
        int tempindex = 0;
        int[] temp = new int [end - start];
        while (i < mid && j < end) {
            temp[tempindex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        while (i < mid) {
            temp[tempindex++] = input[i++];
        }

        while (j < end) {
            temp[tempindex++] = input[j++];
        }

        System.arraycopy(temp, 0, input, start, tempindex);
    }
}

