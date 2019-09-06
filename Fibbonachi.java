package dynamicprogramming;

public class Fibbonachi {

    public static void main(String[] args) {

        int n = 10;
        int last = 1;
        int secondLast = 0;
        System.out.print(secondLast + " ");
        System.out.print(last + " ");

        for(int i = 1; i<n; i++){
            int cur = last + secondLast;
            secondLast = last;
            last = cur;
            System.out.print(cur+ " ");
        }
    }
}
