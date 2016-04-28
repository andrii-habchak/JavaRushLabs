package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int firstNumber = Integer.parseInt(reader.readLine());
        int secondNumber = Integer.parseInt(reader.readLine());
        int smallerNumber = firstNumber;

        if (firstNumber >= secondNumber) {
            smallerNumber = secondNumber;
        }
        for (int i = smallerNumber; i > 0; i--) {
            if ((firstNumber % i == 0) && (secondNumber % i == 0)) {
                System.out.println(i);
                break;
            }
        }
    }
}
