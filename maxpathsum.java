public class maxpathsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns for the matrix:");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] mat=new int[r][c];
        System.out.println("\nEnter element of the matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j]=sc.nextInt();
                }
    }
}}
public class MaxPathSum {
    public static int getMaxPathSum([][] arr, int i, int j, int m, int n) {
        // Base case: if the current cell is out of bounds, return a negative value
        if (i < 0 || i >= n || j < 0 || j >= m) {
            return Integer.MIN_VALUE;
        }

        // Base case: if the current cell is the last row, return its value
        if (i == n - 1) {
            return arr[i][j];
        }

        // Recursive case: return the maximum of three possible paths:
        // 1. Going down from the current cell
        // 2. Going diagonally down-left from the current cell
        // 3. Going diagonally down-right from the current cell
        return Math.max(arr[i][j] + getMaxPathSum(arr, i + 1, j, m, n),
                        Math.max(arr[i][j] + getMaxPathSum(arr, i + 1, j - 1, m, n),
                                arr[i][j] + getMaxPathSum(arr, i + 1, j + 1, m, n)));
    }

    public static void main(String[] args) {
        int[][] arr = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        int m = arr[0].length;
        int n = arr.length;

        // Call the getMaxPathSum function with the first cell of the array
        int maxPathSum = getMaxPathSum(arr, 0, 0, m, n);

        System.out.println("Maximum path sum: " + maxPathSum);
    }
}