# Proměnné

Proměnné se používají k ukládání hodnot, jako jsou mezivýsledky, nebo prostě jen hodnoty využité na více místech.

## Datové typy

Ještě než se ale podíváme na syntaxi, povíme si něco o datových typech. Představ si proměnnou, jako krabičku do které se vejde jedna hodnota. Každá krabička má také svůj tvar (eg. čtverec). Obecně platí, že krabička má od vytvoření daný tvar, který se nemění, a do dané krabičky lze dát jenom hodnotu stejného tvaru (nelze dát např. šestiůhleníkovou hodnotu do čtvercové krabičky)\

"tvaru" proměnné se říká **datový typ** a tady jsou ty základní (primitivní):

| typ       | hodnota                                                             |
|-----------|---------------------------------------------------------------------|
| `byte`    | celé číslo (-128 - 127)                                             |
| `short`   | celé číslo (-32,768 - 32,767)                                       |
| `int`     | celé číslo (-2,147,483,648 - 2,147,483,647)                         |
| `long`    | celé číslo (-9,223,372,036,854,775,808 - 9,223,372,036,854,775,807) |
| `float`   | reálné číslo (6-7 des. míst)                                        |
| `double`  | reálné číslo (15-16 des. míst)                                      |
| `char`    | jeden textový charakter (ASCII hodnota)                             |
| `boolean` | hodnota true nebo false                                             |

V realitě se ale nejčastěji používají `int`, `float`, `boolean`, `String` a `char`. \
`String` se používá k uložení textu, ale není to primitivní datový typ (o tom co vlastně je, se dozvíš v dalších kapitolách)

## Syntaxe proměnných

```java
int promenna = hodnota;
```

Nejdříve píšeme datový typ, poté jméno proměnné a za `=` poté její hodnotu.

::: tutor
# Zápis hodnot
```java
int integer = 1; //jednoduše celé číslo (v rozsahu hodnot)

float realne = 3.14159f; // Desetinná místa oddělena tečkou za hodnotuou je f/F

char character = 'K';// Hodnota se zapisuje do apostrofů
String str = "string se zapisuje dvojitými uvozovkami";
```
:::

---

:::tip
Pomocí
```java
System.out.println();
```
můžeš vypisovat hodnoty do konzole. `.println()` vypíše hodnotu, kterou dáš do závorek a udělá nový řádek.
Pokud nechceš nový řádek po výpisu, použij:
```java
System.out.print();
```

Ve většině editorů můžeš napsat `sout` a autocomplete ti dá možnost vypsat `System.out.println()`.
:::