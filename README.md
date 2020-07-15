# dev-test
Zadania rekrutacyjne - Logisfera Nova

Zadania wykonane w Java 8

## Task1
W nawiasie asList() mo¿na przekazaæ dowoln¹ tablicê elementów do sprawdzenia
```
elementsList.addAll(Arrays.asList(1, 10, 20, 20, 2, 5));
```

Odkomentowuj¹c:
```
//int listLength = 20;
//ListGenerator.fillRandomList(elementsList, listLength);
```
oraz zakomentowuj¹c:
```
elementsList.addAll(Arrays.asList(1, 10, 20, 20, 2, 5));
```
mo¿na przekazaæ do listLength iloœæ wylosowanych elementów w celu sprawdzenia wydajnoœci.

## Task2
Do tablicy:
```
int[] arr = new int[] {1, 2, 10, 7, 5, 3, 6, 6, 13, 0};
```
mo¿na przekazaæ elementy do sprawdzenia.

## Task3
W zmiennej n podajemy iloœæ krawêdzi, nastêpnie uzupe³niamy tablicê dwuwymiarow¹ po¿¹danymi elementami.
```
int n = 3;
int[][] arr = new int[n][2];
		
arr[0][0] = 1; arr[0][1] = 2;
arr[1][0] = 2; arr[1][1] = 3;
arr[2][0] = 5; arr[2][1] = 6;
```