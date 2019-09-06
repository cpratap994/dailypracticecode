package dynamicprogramming;

public class CutRod {

    public static void main(String[] args) {
        int[] p = {0,1,5,8,9,10,17,17,20,24,30};
        System.out.println("Total Cost: " + cutRoadBottomsUp(p,9));
    }

    private static int cutRoadBottomsUp(int[] p, int n) {
        int[] r = new int[n+1];
        int[] s = new int[n+1];

        int q;
        r[0] = 0;

        for(int j = 1; j <= n; j++){
            q = Integer.MIN_VALUE;
            for(int i = 1; i<=j; i++){
                if(q < p[i]+r[j-i]){
                    q = p[i]+r[j-i];
                    s[j] = i;
                }
            }
            r[j] = q;
        }

        printSolution(s,n);
        return r[n];
    }

    private static void printSolution(int[] s, int n) {

        while (n > 0){
            System.out.print(s[n] + "   ");
            n = n -s[n];
        }
    }
}
