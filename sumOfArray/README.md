### Questions

Write a function that takes in an array of numbers and returns the sum.

```bash
Input: [1,2,3,4,5]
Output: 15
```

Program :

```java
public class sumOfArray {
  public static int sum(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++)
      sum += arr[i];
    return sum;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    System.out.println(sum(arr));
  }
}
```

Output :

```java
15
```
