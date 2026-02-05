# Operátory

Operátory se používají k provádění operací na hodnotách (nebo proměnných). Existuje několik druhů a tady si je všechny ukážeme.

## Arytmetické

|operátor   |jméno      |popisek                              |
|-----------|-----------|-------------------------------------|
| `+`       | součet    | sečte 2 čísla                       |
| `-`       | rozdíl    | odečte 2 čísla                      |
| `*`       | součin    | vynásobí 2 čísla                    |
| `/`       | podíl     | vydělí 2 čísla                      |
| `%`       | modulus   | vrátí zbytek po celočíselném dělení |
| `++`      | zvětšení  | zvýší hodnotu proměnné o 1          |
| `--`      | zmenšení  | sníží hodnotu proměnné o 1          |

## Porovnávací

Porovnávací operátory se používají (překvapivě) k porovnávání hodnot, a vrací hodnotu `boolean`

|operátor   |jméno      |popisek                               |
|-----------|-----------|--------------------------------------|
| `==`      | rovnost   | zda hodnoty se rovnají               |
| `!=`      | nerovnost | zda se hodnoty nerovnají             |
| `>`       | větší než | zda je první hodnota větší než druhá |
| `<`       | menší než | zda je první hodnota menší než druhá |

## Logické

Logické operátory pracují striktně s typem `boolean` a vrací hodnotu `boolean`

| operátor  | jméno             | popisek                                                 |
|-----------|-------------------|---------------------------------------------------------|
| `&&`      | logické and       | vrací `true` pokud jsou obě hodnoty `true`              |
| `||`      | logické or        | vrací `true` pokud je aspoň + hodnota `true`            |
| `!`       | logické větší než | převrací boolean hodnotu (z `false` na `true` a naopak) |

## Bitwise

Bitwise operátory pracují s binární reprezentací čísel, a porovnávají kařdý bit zvlášť, a produkují 3. binární číslo jako výsledek. Bitwise logické operátroy fungují tak, že porovnávají hodnoty bitů "nad sebou" na dané pozici.

|operátor  |jméno        |popisek                                   |
|----------|-------------|------------------------------------------|
| `&`      | bitwise and | dává `1` pouze pokud jsou oba bity `1`   |
| `|`      | bitwise or  | dává `1` pokud je alespoň 1 bit `1`      |
| `^`      | xor         | dává `1` pokud je právě jeden z bitů `1` |
| `~`      | bitwise not | převrací hodnoty všech bitů v čísle      |
| `<<`     | left shift  | posune bity v čísle o 1 pozici doprava   |
| `>>`     | right shift | posune bity v čísle o 1 pozici doleva    |

::: tutor
# Příklad
```java
10111000 & 01110001
```
se napíše jako:
```java
10111001
01110001
```
a pouze tam, kde jsou nad sebou `1` se do výsledku propíše `1`:
```java
00110001
```
Tato operace:
```java
10111000 >> 3
```
posune binární číslo o 3 místa doprava, dostáváme tedy:
```java
00010111
```
bity na pravo se smažou, a vlevo se přidají nové `0`
:::

## Nastavovací

Nastavovací operátory se používají k nastavování hodnot proměnným, a většina z nich je zjednodušením ostatních operací na dané proměnné.

|operátor  |příklad    |zjednodušuje |
|----------|-----------|-------------|
| `=`      | `x = 5`   | *nic*       |
| `+=`     | `x += 5`  | `x = x + 5` |
| `-=`     | `x -= 5`  | `x = x - 5` |
| `*=`     | `x *= 5`  | `x = x * 5` |
| `/=`     | `x /= 5`  | `x = x / 5` |
| `%=`     | `x %= 5`  | `x = x % 5` |
| `&=`     | `x &= 5`  | `x = x & 5` |
| `|=`     | `x |= 5`  | `x = x | 5` |
| `^=`     | `x ^= 5`  | `x = x ^ 5` |
| `>>=`    | `x >>= 5` | `x = x >> 5`|
| `<<=`    | `x <<= 5` | `x = x << 5`|