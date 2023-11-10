package ru.mirea.kabo0222.task3;
import java.util.Scanner;public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);        int A = in.nextInt();        int B = in.nextInt();        if (A < B) {
            for (int i = A; i <= B; i++) {
                System.out.println(i);            }
        }
        if (A > B) {
            for (int i = A; i >= B; i--) {
                System.out.println(i);            }
        }
    }
}
