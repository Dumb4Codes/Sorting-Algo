public class RecursiveInsertionSort {
    public static void main(String[] args) {
        
        int[] array = {3, 6, 7, 2, 1, 4, 8, 9, 5};

        insertionSort(array, 1, array.length);

        for(int i : array){
            System.out.print(i+" ");
        }
    }

    private static void insertionSort(int[] array, int start, int n) {

        if(n <= start) return; // base case

        int temp = array[start];
        int j = start - 1;

        while(j >= 0 && array[j] > temp){
            array[j + 1] = array[j];
            j--;
        }
        array[j + 1] = temp;

        insertionSort(array, start + 1, n);
    } 
}
