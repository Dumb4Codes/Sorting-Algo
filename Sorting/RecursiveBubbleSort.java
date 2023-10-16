public class RecursiveBubbleSort {
    public static void main(String[] args) {
        
        int[]  array = {3, 5, 1, 2, 6, 7, 9, 8, 4};

        bubbleSort(array, array.length);

        for(int i : array){
            System.out.print(i+" ");
        }
    }

    private static void bubbleSort(int[] array, int n) {

        if(n == 1) return; // base case

        for(int i=0; i<n-1; i++){ // inner loop just like in bubble sort
            if(array[i] > array[i+1]){
                int temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
            }
        }

        bubbleSort(array, n-1);
    }
}
