package day4;

public class GridPaths {
    static int M = 3, N = 3;

    public static void main(String[] args) {
        printPaths(0, 0, "");
    }

    static void printPaths(int row, int col, String path) {
        if (row == M - 1 && col == N - 1) {
            System.out.println(path);
            return;
        }
        
        if (row < M - 1)
            printPaths(row + 1, col, path + "D");
        
        if (col < N - 1)
            printPaths(row, col + 1, path + "R");
    }
}
