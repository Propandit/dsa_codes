public class merge_2_sorted {

        public static void main(String[] args) {
            int[] arr1 = {1, 3, 5, 7};
            int[] arr2 = {2, 4};
    
            int[] mergedArray = mergeSorted(arr1, arr2);
    
            for (int i = 0; i < mergedArray.length; i++) {
                System.out.print(mergedArray[i] + " ");
            }
        }
    
        public static int[] mergeSorted(int[] arr1, int[] arr2) {
            int[] mergedArray = new int[arr1.length + arr2.length];
    
            int i = 0, j = 0, k = 0;
    
            while (i < arr1.length && j < arr2.length) {
                if (arr1[i] <= arr2[j]) {
                    mergedArray[k] = arr1[i];
                    i++;
                } else {
                    mergedArray[k] = arr2[j];
                    j++;
                }
                k++;
            }
    
            while (i < arr1.length) {
                mergedArray[k] = arr1[i];
                i++;
                k++;
            }
    
            while (j < arr2.length) {
                mergedArray[k] = arr2[j];
                j++;
                k++;
            }
    
            return mergedArray;
        }
    }