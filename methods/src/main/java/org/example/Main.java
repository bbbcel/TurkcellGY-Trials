package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        findNum(3);
        findNum(14);
        findNum(23);
    }

    public static void findNum(int searchNum){
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean flag = false;

        for (int i : numbers) {
            if (i == searchNum) {
                printMessage("Array contains input, " + searchNum);
                flag = true;
            }
        }
        if (!flag)
            printMessage("Array don't contain input, " + searchNum);
    }

    public static void printMessage(String message){
        System.out.println(message);
    }
}