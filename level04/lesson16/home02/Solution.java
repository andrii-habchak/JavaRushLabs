package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader number = new BufferedReader(new InputStreamReader(System.in));
        String sFirstNumber = number.readLine();
        String sSecondNumber = number.readLine();
        String sThirdNumber = number.readLine();

        int firstNumber = Integer.parseInt(sFirstNumber);
        int secondNumber = Integer.parseInt(sSecondNumber);
        int thirdNumber = Integer.parseInt(sThirdNumber);

        System.out.println(Middle(firstNumber, secondNumber, thirdNumber));

    }

    private static int Maximum (int e, int j, int i) {

        if ((e >= j) && (e >= j)) {
            return e;
        } else if ((j >= e) && (j >= i)) {
            return j;
        } else {
            return i;
        }
    }

    private static int Minumum (int e, int j, int i) {

        if ((e <= j) && (e <= j)) {
            return e;
        } else if ((j <= e) && (j <= i)) {
            return j;
        } else {
            return i;
        }
    }

    private static int Middle (int e, int j, int i) {

        if ((Maximum(e, j, i) == e) && (Minumum(e, j, i) == i) || (Maximum(e,j, i) == i) && (Minumum(e, j ,i) == e) ) {
            return j;
        } else if ((Maximum(e, j, i) == j) && (Minumum(e, j, i) == i) || (Maximum(e, j, i) == i) && (Minumum(e, j, i) == j)) {
            return e;
        } else {
            return i;
        }
    }
}
