package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2,3,4,5,6,7,8,9};
        Scanner input = new Scanner(System.in);
        int searchNum = input.nextInt();
        boolean flag = false;

        for(int i : numbers){
            if(i == searchNum){
                System.out.println("Array contains input, " + searchNum);
                flag = true;
            }
        }
        if(!flag)
            System.out.println("Array don't contain input, " + searchNum);
    }
}