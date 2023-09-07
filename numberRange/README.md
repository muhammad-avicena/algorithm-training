### Questions

Create a function that accepts 2 integers (a & b) and prints out all whole numbers between them including both endpoints but not including those numbers

```bash
Input: 3, 8
Output: [4, 5, 6, 7]
```

Program :

```java
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
```

Output :

```java
4 5 6 7
```
