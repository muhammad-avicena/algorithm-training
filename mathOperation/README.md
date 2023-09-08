### Questions

Create a function that accepts 0-n parameters and adds them together (or multiplies)

```bash
Input: 5
Output: 15
```

Program :

```java
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

```

Output :

```java
15
```
