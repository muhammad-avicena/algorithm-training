### Questions

Create a function that accepts three parameters (a number, b number , c number) and prints out all combinations of those.

```bash
Input: 1, 2, 3
Ouput: [123, 132, 213, 231, 312, 321]
```

Program :

```java
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

        generateCombinations(a, b, c, "")
    }

}
```

Output :

```java
111 112 113 121 122 123 131 132 133 211 212 213 221 222 223 231 232 233 311 312 313 321 322 323 331 332 333
```
