package dynamicprogramming;

public class SubsetSumtoK {


    public static void main(String[] args) {
        int k = 11;
        int[] inputSet = {2,3,7,8,10};
        setContainingSum(inputSet,k);
    }
    private static void printTable(boolean[][] table, int m, int n) {
        System.out.println();
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                System.out.print(table[i][j] +" ");
            }
            System.out.println();
        }
    }

    private static void setContainingSum(int[] inputSet, int k) {
        boolean table[][] = new boolean[inputSet.length][k+1];
        for(int i = 0; i<inputSet.length; i++){
            table[i][0] = true;
        }

        for(int i = 1; i<k+1; i++){
            int j = 0;
                if(inputSet[j] == i){
                    table[j][i] = true;
                }else {
                    table[j][i] = false;
                }
        }

        for(int i = 1; i<inputSet.length; i++){
            for(int j =1; j<k+1; j++){
                if(j < inputSet[i]){
                    table[i][j] = table[i-1][j];
                }
                if(j == inputSet[i]){
                    table[i][j] = true;
                }
                if(j > inputSet[i]){
                    if(table[i - 1][j]){
                        table[i][j] = true;
                    }else {
                        table[i][j] = table[i-1][j-inputSet[i]];
                    }
                }
            }
        }
        printTable(table,inputSet.length,k+1);
    }


}
