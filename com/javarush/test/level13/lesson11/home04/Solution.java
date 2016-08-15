package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        Solution solution = new Solution();

        String fileName = solution.enteredFileName();
        ArrayList<String> wordsList = solution.writeWords();
        solution.writeInTheFile(fileName, wordsList);
    }

    private String enteredFileName() {
        try {
            String fileName = reader.readLine();
            return fileName;
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private ArrayList<String> writeWords() {
        ArrayList<String> wordsList = new ArrayList<>();
        while (true) {
            try {
                String word = reader.readLine();
                if (word.equals("exit")) {
                    reader.close();
                    return wordsList;
                }
                wordsList.add(word);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    private void writeInTheFile(String fileName, ArrayList<String> words) {
        try {
            FileWriter fileWriter = new FileWriter(fileName, false);
            String lineSeparator = System.lineSeparator();

            for (int i = 0; i < words.size(); i++) {
                fileWriter.write(words.get(i));
                fileWriter.write(lineSeparator);
                fileWriter.flush();
            }
            fileWriter.write("exit");
            fileWriter.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
