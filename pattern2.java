package pattern;

public class pattern2 {
    public static void main(String[] args) {
        int m = 5;
        for (int i = 1; i <= m; i++) {
            // Print spaces for each row
            for (int j = 1; j <= m - i; j++) {
                System.out.print(" ");
            }
            // Print asterisks for each row
            for (int j = 1; j <= m; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

