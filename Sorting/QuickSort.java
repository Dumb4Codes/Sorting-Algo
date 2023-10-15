public class QuickSort {
    public static void main(String[] args) {

        //quick sort = moves smaller elements to left of a pivot.
        //             recursively divide array in 2 partiitons

        //run-time complexity = Best Case O(n log(n))
        //                      Average Case O(n log(n))
        //                      Worst Case O(n²) if already sorted
        
        int[] array = {3, 1, 5, 7, 8, 4, 6, 9, 2};

        quickSort(array, 0, array.length-1);

        for(int i : array){
            System.out.print(i+" ");
        }
    }

    private static void quickSort(int[] array, int start, int end) {
    
        if(start >= end) return; //base case

        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1); //don't want to include our pivot
        quickSort(array, pivot + 1, end);
    }
    private static int partition(int[] array, int start, int end){
       
        int pivot = array[end];
        int i = start - 1;

        for(int j = start; j <= end - 1; j++){
            if(array[j] < pivot){ //any no. less than our pivot should be on the left side of our pivot
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
    }
}
