package dynamicprogramming;


import java.util.*;

public class PermString {

    static int permutationStr(String str){

        StringBuilder input = new StringBuilder(str);

        Stack<Character> mainStack = new Stack<>();

        int i = 0;
        while (input.length() - i != 2){
            mainStack.push(input.charAt(i));
            i++;
        }

        String lastTwoChars1 = input.substring(input.length() - 2);
        String lastTwoChars2 = reveStr(lastTwoChars1);
        int markerSize = 2;
        Queue<String> stringsQueue = new LinkedList<>();
        stringsQueue.add(lastTwoChars1);
        while (!mainStack.empty()) {
            char substituteChar = mainStack.pop();
            while (true) {
                String curString = stringsQueue.peek();
                if(curString.length() == markerSize+1){
                    markerSize++;
                    break;
                }
                getPermuteOFStringAndChar(curString, substituteChar,stringsQueue);
                stringsQueue.poll();
            }
        }
        System.out.println(stringsQueue.size());
        return 1;
    }

    private static void getPermuteOFStringAndChar(String inputString, char a, Queue<String> stringsQueue) {
        for(int i = 0; i < inputString.length(); i++){
            String intialPart = inputString.substring(0,i);
            String lastPart = inputString.substring(i);
            String finalString = intialPart+String.valueOf(a)+lastPart;
            stringsQueue.add(finalString);
        }
        stringsQueue.add(inputString+String.valueOf(a));
    }

    private static String reveStr(String lastTwoChars1) {
        Character char1 = lastTwoChars1.charAt(0);
        Character char2 = lastTwoChars1.charAt(1);
        StringBuilder str = new StringBuilder();
        str.append(char2);
        str.append(char1);

        return str.toString();
    }

    public static void main(String[] args) {
        String s = "ABCDEFGH";
        permutationStr(s);
    }
}
