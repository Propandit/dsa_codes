class BinarySearch {
    int binarySearch(int arr[], int l, int r, int x) {
        while (l <= r) {
            int mid = l + (r - l) / 2;

            // Check if x is present at the mid index
            if (arr[mid] == x)
                return mid;

            // If x is greater, ignore the left half
            if (arr[mid] < x)
                l = mid + 1;

            // If x is smaller, ignore the right half
            else
                r = mid - 1;
        }

        // If we reach here, then the element was not present
        return -1;
    }

    public static void main(String args[]) {
        BinarySearch ob = new BinarySearch();
        int arr[] = {2, 3, 4, 10, 40};
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present in the array");
        else
            System.out.println("Element found at index " + result);
    }
}
