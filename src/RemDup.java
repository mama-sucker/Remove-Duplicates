// Module 7 Exercise 7.15
// By Addison Roy

import java.util.Arrays;
import java.util.Scanner;

public class RemDup {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("This program will remove duplicate numbers in a list you enter");
        System.out.println("Enter ten numbers separated by spaces: ");
        String input = scanner.nextLine();
        String[] inputNumbers = input.split(" ");
        
        int[] list = new int[inputNumbers.length];
        for (int i = 0; i < inputNumbers.length; i++) {
            list[i] = Integer.parseInt(inputNumbers[i]);
        }

        int[] result = eliminateDuplicates(list);

        System.out.print("Duplicates removed: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] eliminateDuplicates(int[] list) {
        int n = list.length;
        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int k = 0; k < j; k++) {
                if (list[i] == temp[k]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[j++] = list[i];
            }
        }

        return Arrays.copyOf(temp, j);
    }
}
