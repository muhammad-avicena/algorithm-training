package numberCombination;

public class numberCombination {

    public static void generateCombinations(int a, int b, int c, String current) {
        if (current.length() == 3) {
            System.out.print(current + " ");
            return;
        }

        generateCombinations(a, b, c, current + a);
        generateCombinations(a, b, c, current + b);
        generateCombinations(a, b, c, current + c);
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        generateCombinations(a, b, c, "");

    }

}
