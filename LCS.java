package dynamicprogramming;

public class LCS {

    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        char[] X=s1.toCharArray();
        char[] Y=s2.toCharArray();
        int m = X.length;
        int n = Y.length;

        System.out.println(LCSlength(X,Y,m,n));
    }

    public static int LCSlength(char[] a, char[] b, int m, int n){

        int[][] c = new int[m+1][n+1];

        for(int i = 0; i<= m; i++){
            for(int j = 0; j<= n; j++){
                if(i == 0 || j == 0){
                    c[i][j] = 0;
                }else if(a[i-1] == b[j-1]){
                    c[i][j] = c[i-1][j-1] + 1;
                }else {
                    c[i][j] = max(c[i-1][j], c[i][j-1]);
                }
            }
        }
        return c[m][n];
    }

    private static int max(int i, int i1) {
        return Math.max(i, i1);
    }

}
