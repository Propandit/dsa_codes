public class mergesort {
   
        public static void main(String[] args) {
            int[] arr = {5, 3, 8, 4, 9, 1, 6, 2, 7};
    
            mergeSort(arr, 0, arr.length - 1);
    
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    
        public static void mergeSort(int[] arr, int left, int right) {
            if (left < right) {
                int mid = (left + right) / 2;
    
                mergeSort(arr, left, mid);
                mergeSort(arr, mid + 1, right);
    
                merge(arr, left, mid, right);
            }
        }
    
        public static void merge(int[] arr, int left, int mid, int right) {
            int n1 = mid - left + 1;
            int n2 = right - mid;
    
            int[] leftArray = new int[n1];
            int[] rightArray = new int[n2];
    
            for (int i = 0; i < n1; i++) {
                leftArray[i] = arr[left + i];
            }
    
            for (int i = 0; i < n2; i++) {
                rightArray[i] = arr[mid + i + 1];
            }
    
            int i = 0, j = 0, k = left;
    
            while (i < n1 && j < n2) {
                if (leftArray[i] <= rightArray[j]) {
                    arr[k] = leftArray[i];
                    i++;
                } else {
                    arr[k] = rightArray[j];
                    j++;
                }
                k++;
            }
    
            while (i < n1) {
                arr[k] = leftArray[i];
                i++;
                k++;
            }
    
            while (j < n2) {
                arr[k] = rightArray[j];
                j++;
                k++;
            }
        }
    }