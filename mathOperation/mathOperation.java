package mathOperation;

public class mathOperation {
    public static int add(int... numbers) {
        int result = 0;
        for (int num : numbers) {
            result += num;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(add(1, 2, 3, 4, 5));
    }
}
