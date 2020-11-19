package SearchAlgorithms;

import java.util.Scanner;

public class LinSearchMethod {

    public static int linearSearch(char[] cArr, char let) {

        int pointer = -1;
        for (int i = 0; i < cArr.length; i++) {
            if (let == cArr[i]) {
                pointer = i;
                break;
            }
        }
        return pointer;
    }

    public static void main(String[] args) {
        char[] letters = {'a', 'f', 'e', 'd', 'r', 'w', 'b', 'q'};

        char value;

        System.out.print("Enter the letter you wish to find: ");
        Scanner sc = new Scanner(System.in);
        value = sc.next().charAt(0);

        int myPointer = linearSearch(letters, value);

        if (myPointer != -1) {
            System.out.println("value found at index " + myPointer);
        } else {
            System.out.println("value not found");
        }

    }

}
