// https://open.kattis.com/problems/sibice

import java.util.Scanner;

public class Sibice {
    static int height;
    static int width;
    static int c;

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int matches = in.nextInt();
        width = in.nextInt();
        height = in.nextInt();
        c = (int) calculateHypothenuse(height, width);

        for (int i = 0; i < matches; i++){
            System.out.println(matchFits(in.nextInt()));
        }
        in.close();
    }

    public Sibice(int height, int width){
        c = (int) calculateHypothenuse(height, width);
    }

    private static double calculateHypothenuse(int a, int b){
        return Math.sqrt(a*a + b*b);
    }

    public static String matchFits(int i) {
        if (i <= height || i < width){
            return "DA";
        } else if (i <= c){
            return "DA";
        }
        return "NE";
    }
}
