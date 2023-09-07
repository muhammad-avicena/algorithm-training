package numberRange;

public class numberRange {

    public static void printNumbersBetween(int a, int b) {
        for (int i = a + 1; i < b; i++) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 8;
        printNumbersBetween(a, b);
    }

}
