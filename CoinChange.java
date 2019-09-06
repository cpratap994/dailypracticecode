package dynamicprogramming;

public class CoinChange {

    public static void main(String[] args) {
        System.out.println("Ans is " + noOfWaysToDrawTheGame(6));
    }
    static int noOfWaysToDrawTheGame(int totalScore) {
        int[] inputNumbers = {2,4,6};
        int[][] resultTable = new int[inputNumbers.length][totalScore+1];

        for(int i = 0; i<inputNumbers.length; i++){
            resultTable[i][0] = 1;
        }

        for(int j = 0; j<totalScore+1; j++){
            resultTable[0][j] = 1;
        }

        for(int i = 1; i < inputNumbers.length; i++){
            for(int j = 1; j < totalScore+1; j++){
                if(j%2 != 0){
                    continue;
                }
                if(j >= inputNumbers[i]){
                    resultTable[i][j] = resultTable[i][j-inputNumbers[i]+2] + resultTable[i-1][j];
                }else{
                    resultTable[i][j] = resultTable[i-1][j];
                }
            }
        }
        printTable(resultTable,3,totalScore+1);
        return resultTable[2][totalScore];


    }

    private static void printTable(int[][] table, int m, int n) {
        System.out.println();
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                System.out.print(table[i][j] +" ");
            }
            System.out.println();
        }
    }
}
