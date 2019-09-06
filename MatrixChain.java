package dynamicprogramming;

public class MatrixChain {


    void matrixChainOrder(int[] p){
        int n = p.length - 1;

        int[][] m = new int[n+1][n+1];
        int[][] s = new int[n][n+1];

        //Trivial case
        for(int i = 1; i<=n; i++){
            m[i][i] = 0;
        }

        //Non-Trivial case
        for(int l = 2; l <= n; l++){
            for(int i = 1; i<= n-l+1; i++){
                int j = i+l-1;
                m[i][j] = Integer.MAX_VALUE;
                for(int k = i; k <= j -1; k++){
                    int q = m[i][k] + m[k+1][j] + p[i-1]*p[k]*p[j];
                    if(q<m[i][j]){
                        m[i][j] = q;
                        s[i][j] = k;
                    }
                }
            }
        }

        System.out.println(m[n-1][n]);

    }
    public static void main(String[] args) {
        int[] p = {30,35,15,5,10,20,25};
        MatrixChain matrixChain = new MatrixChain();
        matrixChain.matrixChainOrder(p);
    }
}
