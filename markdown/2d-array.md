
# Kinosál

Jsi brigádník v kině a budeš vyvíjet pomůcku pro organizaci kinosálu.

## Nultý úkol
*(nepovinný)*

### Indexování dvourozměrného pole

::: tutor
 Do dvourozměrného pole se indexuje pomocí dvou hranatých závorek za sebou: `[][]`. Do první závorky se zadává číslo řádku, do druhé číslo prvku v řádku. (obě začínající nulou)
:::

Vytvoř dvourozměrné pole typu `int` a nastav mu hodnotu:
```java
{
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
}
```
Zkus napsat program, který z pole vypíše hodnoty: `3 7 6 1`

::: tutor

Pokud naindexuješ dvourozměrné pole pouze jedněmi závorkami, dostaneš přístup k danému řádku.\
Na příkladu předchozího pole:
```java
pole[0]    → { true, true, false, false, true }
pole[0][2] → false
```
Funguje to tak, že prvním indexem dostaneš řádek, a druhým indexuješ do něj
:::

### Projíždění pole cyklem
::: tutor
K projíždění pole se zpravidla využívají dva cykly `for` v sobě. První cyklus prochází řádky, druhý cyklus prochází prvky v jednotlivých řádcích. (viz. předchozí úkol)
:::

Zkus napsat program, který do konzole vypíše obsah pole z předchozího úkolu.

Očekávaný výstup:
```java
1 2 3 4 5 6 7 8 9
```

## První úkol

Vytvoř dvourozměrné pole typu `int`, které bude znázorňovat sedadla v sále. Vytvoř pole o velikosti `5x5`, a naplň pole čísly podle diagramu:
```java
 1  2  3  4  5
 6  7  8  9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
```

## Druhý úkol

Vytvoř druhé, stejně velké prázdné pole typu `boolean`, které bude ukazovat, zda je sedadlo obsazené. Označ jako obsazená všechna sedadla, jejichž číslo je dělitelné `3`.

::: tutor
Po vytvoření je prázdné pole typu `boolean` plné hodnot `false`
:::

## Třetí úkol

Ředitel kina chce vědět, jaká byla daný den obsazenost. Pro počítání obsazenosti použij následující pole:

```java
{
    { true,  true,  false, false, true  },
    { false, true,  true,  false, false },
    { true,  true,  false, false, false },
    { false, true,  false, true,  true  },
    { false, false, false, false, false }
}
```
Spočítej, kolik sedadel je obsazených.

## Čtvrtý úkol

V aplikaci pro rezervaci míst je potřeba zobrazit řadu sedadel, která je nejmémě obsazená. Najdi její index v poli z předchozího úkolu.

::: tip
K tomuto cvičení je modelové řešení. Pokus se ale nejdřív problémy vyřešit sám/a.\
Modelové řešení je k nalezení [zde](https://github.com/j0hner/Nauc-me-programovat/blob/main/model-solutions/2d-arrays.java)
:::