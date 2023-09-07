### Questions

Given two strings as arguments to your function return true if they are the same or false otherwise.

```bash
Input: kuda, KuDa
Output: true
```

Program :

```java
public class stringComparator {
    public static boolean isStringEqual(String str1, String str2) {
        String string1 = str1.toLowerCase();
        String string2 = str2.toLowerCase();

        if (string1.equals(string2)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String str1 = "kuda";
        String str2 = "kuDa";
        System.out.println(isStringEqual(str1, str2));
    }
}
```

Output :

```java
true
```
