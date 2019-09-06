package dynamicprogramming;

public class OptimalBST {

    public static void main(String[] args) {
        int[] arr = {10,12,16,21};
        int[] searchFrequency = {4,2,6,3};

        getOptimalBST(arr,searchFrequency);
    }

    private static void getOptimalBST(int[] arr, int[] searchFrequency) {

        int table[][] = new int[arr.length][arr.length];

        //fill if single key was given
        for(int i = 0; i < arr.length; i++){
            table[i][i] = searchFrequency[i];
        }
       // printMatrix(table,arr.length,arr.length);

        for(int i = 1; i < arr.length; i++){
            int k = i;
            for(int j = 0; j < arr.length - i; j++){
                //System.out.println(j +" "+k);
                int curOptimalVal = getSum(j,k,searchFrequency);

                k++;
            }
        }
    }

    private static int getSum(int startIndex, int lastIndex, int[] searchFrequency) {
        int sum = 0;
        for(int i =0; i <= lastIndex; i++){
            sum = sum + searchFrequency[i];
        }

        return sum;
    }

    private static void printMatrix(int[][] table, int row, int col) {

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}
