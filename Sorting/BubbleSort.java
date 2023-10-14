public class BubbleSort {
    public static void main(String[] args) {
        
        int[] array = {8, 3, 5, 2, 7, 4, 9, 1, 6};

        bubbleSort(array);

        for(int i : array){
            System.out.print(i+" ");
        }

    }

    private static void bubbleSort(int[] array) {

        for(int i=0; i<array.length-1; i++){
            for(int j=0; j<array.length-i-1; j++){ 
                // The reason for j<array.length-1-i = is to avoid unnecessary comparisons. As the outer loop progresses,
                //the largest elements "bubble up" to the end of the array, so there's no need to compare them again in subsequent iterations.
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

}
