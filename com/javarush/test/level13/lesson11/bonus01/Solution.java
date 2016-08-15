package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {
        // напишите тут ваш код
        Solution solution = new Solution();

        try {
            String fileName = solution.enterFileName();
            ArrayList<Integer> numbersFromFile = solution.readFromFile(fileName);
            solution.getEvenNumbers(numbersFromFile);
            solution.sortListAscending(numbersFromFile);
            solution.printArray(numbersFromFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private String enterFileName() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    private ArrayList<Integer> readFromFile(String fileName) throws IOException {
        ArrayList<Integer> numbersFromFile = new ArrayList<>();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        String numberFromFile;
        while ((numberFromFile = fileReader.readLine()) != null) {
            numbersFromFile.add(Integer.parseInt(numberFromFile));
        }
        return numbersFromFile;
    }

    private void printArray(ArrayList<Integer> numbersFromFile) {
        for (Integer integer : numbersFromFile) {
            System.out.println(integer);
        }
    }

    private void getEvenNumbers(ArrayList<Integer> numbersFromFile) {
        int numbersFromFileRealSize = numbersFromFile.size() - 1;
        for (int i = numbersFromFileRealSize; i >= 0; i--) {
            if (numbersFromFile.get(i) % 2 != 0) {
                numbersFromFile.remove(i);
            }
        }
    }

    private void sortListAscending(ArrayList<Integer> evenNumbersList) {
        int evenNumbersListLength = evenNumbersList.size() - 1;

        for (int i = evenNumbersListLength; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (evenNumbersList.get(j) > evenNumbersList.get(j+1)) {
                    Integer tempValue = evenNumbersList.get(j);
                    evenNumbersList.set(j, evenNumbersList.get(j + 1));
                    evenNumbersList.set(j + 1, tempValue);
                }
            }

        }
    }
}
