public class Main {
    public static void main(String[] args) {

        int[] array = {13,4,21,5,7,10};
        for (int j : array) {
            System.out.printf(j + " ");
        }
        System.out.print("\n");
        mergeSort(array);
        for (int j : array) {
            System.out.printf(j + " ");
        }


    }

    private static void mergeSort(int[] array) {
        int length = array.length;
        if (length<=1){
            return;
        }

        int middle = length/2;

        int[] leftArray = new int[middle];
        int[] rightArray = new int[length-middle];

        int i=0;
        int j=0;
        for (;i<length;i++){
            if (i<middle){
                leftArray[i] = array[i];
            }else {
                rightArray[j] = array[i];
                j++;
            }
        }

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(array, leftArray, rightArray);


    }

    private static void merge(int[] array, int[] leftArray, int[] rightArray) {

        int leftSize = array.length/2;
        int rightSize = array.length-leftSize;
        int i=0, j=0, k=0;
        while(j<leftSize && k<rightSize){
            if (leftArray[j]<rightArray[k]){
                array[i]=leftArray[j];
                j++;
                i++;
            }else {
                array[i]=rightArray[k];
                k++;
                i++;
            }
        }
        while(j<leftSize){
            array[i]=leftArray[j];
            i++;
            j++;
        }
        while(k<rightSize){
            array[i]=rightArray[k];
            k++;
            i++;
        }


    }
}