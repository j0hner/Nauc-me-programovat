# Podmínky

Podmínky se používají k rozvětvení toku programu. Tedy nabízí možnost nechat běžet daný kód, pouze pokud je splněna daná podmínka. Každý dobrý programovací jazyk má nějakou implementaci podmíněných operací a Java na tom není jinak. 

## Syntaxe

```java
if (podminka) {
    // Podmíněný kód
}
```
Tohle je nejjednodušší varianta `if` statementu. `podminka` je `boolean` hodnota, a když je `true`, podmíněný kód proběhne. Pokud je `false`, celý `if` statement se přeskočí.

---

```java
if (podminka) {
    // Podmíněný kód
}
else {
    // Else blok
}
```
V této variantě se `if` blok chová stejně, ale `else` blok poběží, pouze pokud `podminka` bude `false`.

---

```java
if (podminka) {
    // Podmíněný kód
}
else if (podminka2) {
    // 2. Podmíněný kód
}
else {
    // Else blok
}
```
V této variantě se podmínky kontrolují odzhora dolů, a jakmile je jedna `true` její blok se spustí, a všechny ostatní bloky se přeskočí. Pokud ani jedna podmínka není splněna, běží blok `else`. Bloky `else if` a `else` nejsou povinné a jediné pravidlo je, že `else` blok může být jen jeden, a musí být poslední.

---

::: tip
Začínající programátoři často chybují v tom, že do `if` statementů dávají:
```java
boolean podminka = true;
if (podminka == true) {
    // Kód
}
```
`== true` ale v podmínce není zapotřebí, jelikož hodnota již je typu `boolean`, a tak je toto:
```java
boolean podminka = true;
if (podminka) {
    // Kód
}
```
je tedy ekvivalentní (a lepší) implementace.
:::

::: tip
Není také dobré, dávat více `if` bloků do sebe, pakliže to není nezbytně nutné. Použij místo toho radši logické operátory. Uvidíš, že si v budoucnu poděkuješ :)
:::