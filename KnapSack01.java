package dynamicprogramming;

public class KnapSack01 {

    public static void main(String[] args) {
        int[] weight = {1,3,4,5};
        int[] value = {1,4,5,7};
        int maxWeight = 7;

        getMaxValue(weight,value,maxWeight);
    }

    private static void getMaxValue(int[] weight, int[] value, int maxWeight) {

        int[][] table = new int[weight.length][maxWeight+1];
        //filling if weight is 0
        for(int i = 0; i<weight.length; i++){
            table[i][0] = 0;
        }
        //filling first row
        for(int i = 1; i <weight.length+1; i++){
            if(i - weight[0] >= 0) {
                table[0][i] = value[0];
            }else {
                table[0][i] = 0;
            }
        }

        for(int i = 1; i<weight.length; i++){
            for(int j = 1; j<maxWeight+1; j++){
                if(j < weight[i]){
                    table[i][j] = table[i-1][j];
                }else {
                    int valueWithoutIncludingCurrentWeight = table[i-1][j];
                    int valueIncludingCurrentWeight = value[i] + table[i-1][j - weight[i]];
                    if(valueIncludingCurrentWeight - valueWithoutIncludingCurrentWeight >= 0){
                        table[i][j] = valueIncludingCurrentWeight;
                    }else {
                        table[i][j] = valueWithoutIncludingCurrentWeight;
                    }
                }
            }
        }

        System.out.println(table[weight.length-1][maxWeight]);
    }
}
