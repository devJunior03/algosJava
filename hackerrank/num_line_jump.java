package hackerrank;

import java.util.Scanner;

public class num_line_jump {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();

        int count = 0;
        while (x1 != x2 && count < v1+v2+x1+x2) {
            count ++;
            x1 += v1; x2 += v2;
        }
        if (x1 == x2) System.out.println("YES");
        else System.out.println("NO");

    }
}
