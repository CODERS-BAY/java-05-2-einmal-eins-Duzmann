
/*

# Java

## Wiederholungen

### Aufgabe 5.2 - Das kleine Einmal-Eins

Schreibe mit Hilfe von Schleifen das kleine 1 x 1 auf der Konsole aus. Deine Ausgabe sollte in etwa folgendermaßen aussehen:

```
1er Reihe:
1 * 1 = 1
2 * 1 = 2
...
10 * 1 = 10
2er Reihe:
1 * 2 = 2
…
9 * 10 = 90
10 * 10 = 100
```

----------------------------------------

# Java

## Repetitions

### Exercise 5.2 - Multiplications

Use loops to print the 1 x 1 to the console. Your result should look something like this:

```
times 1:
1 * 1 = 1
2 * 1 = 2
...
10 * 1 = 10
times 2:
1 * 2 = 2
…
9 * 10 = 90
10 * 10 = 100
```


 */


public class EinMalEins {
    public static void main(String[] args) {


        int i, j, x, y, z;

        for (i = 1; i < 11; i++) {
            x = i;
            System.out.println(x + "-er Reihe:");
            for (j = 1; j < 11; j++) {
                y = j;
                z = x * y;
                System.out.println(y + " * " + x + " = " + z);
            }
        }


    }
}
