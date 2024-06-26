---
title: Functions Documentation
---
This file contains some helper functions to find out whether three numbers form a Pythagorean Triple or not.

<SwmSnippet path="/src/Functions.java" line="8">

---

This function takes in two numbers, computes the square of the two numbers and sums them together. The name of the function is <SwmToken path="/src/Functions.java" pos="8:7:7" line-data="    public static int sumOfSquares(int a, int b) {">`sumOfSquares`</SwmToken>

```java
    public static int sumOfSquares(int a, int b) {
        int aSquared = square(a);
        int bSquared = square(b);
        int sum = aSquared + bSquared;

        return sum;
    }
```

---

</SwmSnippet>

The following function <SwmToken path="/src/Functions.java" pos="16:7:7" line-data="    public static int cube(int n) {">`cube`</SwmToken> allows calculating the cube of a number passed on to the function.

<SwmSnippet path="/src/Functions.java" line="16">

---

It receives a single parameter n and returns the cube of the number.

```java
    public static int cube(int n) {

        return n*n*n;
    }
```

---

</SwmSnippet>

This third function <SwmToken path="/src/Functions.java" pos="26:7:7" line-data="    public static int average(int a, int b, int c) {">`average`</SwmToken> calculates the average of the three numbers passed into the method.

<SwmSnippet path="/src/Functions.java" line="26">

---

This snippet defines a method called <SwmToken path="/src/Functions.java" pos="26:7:7" line-data="    public static int average(int a, int b, int c) {">`average`</SwmToken> that takes three integer parameters and returns the average of the three numbers.

```java
    public static int average(int a, int b, int c) {

        return (a+b+c)/3;
    }
```

---

</SwmSnippet>

Finally, with the method <SwmToken path="/src/Functions.java" pos="31:7:7" line-data="    public static boolean isPythagoreanTriples(int a, int b, int c) {">`isPythagoreanTriples`</SwmToken> we can put everything together and determine if the three numbers form a Pythagorean Triple or not.

<SwmSnippet path="/src/Functions.java" line="31">

---

Takes three parameters as input and returns true if they form a Pythagorean Triple, false otherwise.

```java
    public static boolean isPythagoreanTriples(int a, int b, int c) {
        // TODO: Benutze in dieser Methode keine arithmetischen Operatoren (i.e. +, -, *, /, % etc.)!

        if(sumOfSquares(a,b)==square(c)){
            return true;
        }
        return false;
    }
```

---

</SwmSnippet>

```mermaid
graph TD
    A[ isPythagoreanTriple] --> |a| B( sumOfSquares)
    A --> |b| B
    A --> |c| C[ square]
    B --> D{Equal to}
    C --> D
    D --> |true| E(True)
    D --> |false| F(False)


    

%% Swimm:
%% graph TD
%%     A[ <SwmToken path="/src/Functions.java" pos="31:7:7" line-data="    public static boolean isPythagoreanTriple(int a, int b, int c) {">`isPythagoreanTriple`</SwmToken>] --> |a| B( <SwmToken path="/src/Functions.java" pos="8:7:7" line-data="    public static int sumOfSquares(int a, int b) {">`sumOfSquares`</SwmToken>)
%%     A --> |b| B
%%     A --> |c| C[ <SwmToken path="/src/Functions.java" pos="9:7:7" line-data="        int aSquared = square(a);">`square`</SwmToken>]
%%     B --> D{Equal to}
%%     C --> D
%%     D --> |true| E(True)
%%     D --> |false| F(False)
%% 
%% 
%% &nbsp;&nbsp;&nbsp;&nbsp;
```

Blablabla&nbsp;

<SwmSnippet path="/src/Functions.java" line="20">

---

My function <SwmToken path="/src/Functions.java" pos="16:7:7" line-data="    public static int cube(int n) {">`cube`</SwmToken>

```
    public static int sumOfCube(int a, int b) {
        int c = a + b;
        return cube(a) + cube(b);
    }
```

---

</SwmSnippet>

<SwmMeta version="3.0.0" repo-id="Z2l0aHViJTNBJTNBVGVzdF9Td2ltbSUzQSUzQWZlZGUtbQ==" repo-name="Test_Swimm"><sup>Powered by [Swimm](https://app.swimm.io/)</sup></SwmMeta>
