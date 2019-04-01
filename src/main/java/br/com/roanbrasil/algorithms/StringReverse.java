package br.com.roanbrasil.algorithms;

public class StringReverse {

    public static void main(String[] args) {
        char[] str = "Roan".toCharArray();
        StringReverse.printReverse(str);

    }

    public static void printReverse(char [] str) {
        reversal(0, str);
    }

    private static void reversal(int index, char [] str) {
        if (str == null || index >= str.length) {
            return;
        }
        System.out.print(str[index]);
        reversal(index + 1, str);
        System.out.print(str[index]);
    }

    public void reverseStringInPlace(char[] s) {
        helper(s, 0, s.length-1);
    }

    private static void helper(char [] arr, int start, int end) {
        char temp;
        if (start >= end)
            return;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        helper(arr, start+1, end-1);
    }
}
