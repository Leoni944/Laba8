package ru.mirea.kabo0222.task4;import java.util.*;import java.math.*;public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);        int k = in.nextInt();        int s = in.nextInt();        int b=0;        for (int i = (int) Math.pow(10,k-1);i<(int) Math.pow(10,k);i++){
            b=0;            int t =i;            while (t>0) {
                b = b + t % 10;                t = t / 10 ;            }
            if (b==s){
                System.out.println(i);            }
        }
    }
}