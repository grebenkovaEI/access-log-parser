package ru.course;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите соответствующую цифру:\n" + "1 - ДЗ по теме Классы и методы\n" +
                "2 - ДЗ по теме Условия\n" + "3 - ДЗ по теме Циклы\n" + "4 - Курсовой проект. Задание по теме Циклы\n" +
                "5 - ДЗ по теме Массивы");
        int menu = sc.nextInt();
        switch (menu) {
            case 1 -> dzClassesAndMethods();
            case 2 -> dzConditions();
            case 3 -> dzLoops();
            case 4 -> endlessLoop();
            case 5 -> dzArrays();
        }
    }
    public static void dzArrays(){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,2,2,5,-7};
        int[] arrPalindrom = {1,-2,-7,4,-7,-2,1};
        int[] arr1 = {1,2,3};
        int[] arr2 = {7,8,9};

        System.out.println("Массив: " + Arrays.toString(arr));
        System.out.println("1. Введите число x: ");
        int num1 = sc.nextInt();
        System.out.println("Индекс первого вхождения числа " + num1 + " в массив arr: " + Array.findFirst(arr,num1));

        System.out.println("Массив: " + Arrays.toString(arr));
        System.out.println("2. Введите число x: ");
        int num2 = sc.nextInt();
        System.out.println("Индекс последнего вхождения числа " + num2 + " в массив arr: " + Array.findLast(arr,num2));

        System.out.println("Массив: " + Arrays.toString(arr));
        System.out.println("3. Наибольшее по модулю значение массива arr: " + Array.maxAbs(arr));

        System.out.println("Массив: " + Arrays.toString(arr));
        System.out.println("4. Количество положительных элементов массива arr: " + Array.countPositive(arr));

        System.out.println("5. Массив " + Arrays.toString(arr) + " является палиндромом?\n" + Array.palindrom(arr));
        System.out.println("Массив " + Arrays.toString(arrPalindrom) + " является палиндромом?\n" + Array.palindrom(arrPalindrom));

        System.out.println("6. Массив:\n" + Arrays.toString(arr) + "\nРеверс массива:");
        Array.reverse(arr);

        System.out.println("7. Массив:\n" + Arrays.toString(arr) + "\nНовый массив:\n" + Arrays.toString(Array.reverseBack(arr)));

        System.out.println("8. Массив arr1:\n" + Arrays.toString(arr1) + "\nМассив arr2:\n"
                + Arrays.toString(arr2) + "\nОбъединенный массив:\n" + Arrays.toString(Array.concat(arr1,arr2)));

        System.out.println("9. Массив arr:\n" + Arrays.toString(arr));
        System.out.println("Введите число x: ");
        int num3 = sc.nextInt();
        System.out.println("Новый массив, в котором записаны индексы всех вхождений числа x в массив arr "
                + Arrays.toString(Array.findAll(arr, num3)));

        System.out.println("10. Массив:\n" + Arrays.toString(arrPalindrom) + "\nНовый массив:\n"
                + Arrays.toString(Array.deleteNegative(arrPalindrom)));

        System.out.println("11. Массив arr1:\n" + Arrays.toString(arr1));
        System.out.println("Введите число x: ");
        int num4 = sc.nextInt();
        System.out.println("Введите значение позиции pos: ");
        int num5 = sc.nextInt();
        System.out.println("Новый массив, который содержит все элементы массива arr1, в позицию pos вставлено значение x: "
                + Arrays.toString(Array.add(arr1, num4, num5)));

        System.out.println("12. Массив arr1:\n" + Arrays.toString(arr1));
        System.out.println("Массив arr2:\n" + Arrays.toString(arr2));
        System.out.println("Введите значение позиции pos: ");
        int num6 = sc.nextInt();
        System.out.println("Новый массив, который содержит все элементы массива arr1, в позицию pos вставлены значения массива arr2: "
                + Arrays.toString(Array.add(arr1, arr2, num6)));

    }
    public static void endlessLoop(){
        int count = 0;
        while (true){
            System.out.println("Введите путь к файлу: ");
            String path = new Scanner(System.in).nextLine();
            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();
            if (isDirectory) {
                System.out.println("Указанный путь является путём к папке, а не к файлу");
                continue;
            }
            if (!fileExists) {
                System.out.println("Указанный файл не существует");
            } else {
                count++;
                System.out.println("Путь указан верно\n" + "Это файл номер " + count);
            }
        }
    }
    public static void dzLoops(){
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Введите число (от 0 и выше): ");
        int num1 = sc.nextInt();
        System.out.println("Все числа от 0 до " + num1 + ":\n" + Loops.listNums(num1));

        System.out.println("2. Введите число (от 0 и выше): ");
        int num2 = sc.nextInt();
        System.out.println("Все числа от " + num2 + " до 0:\n" + Loops.reverseListNums(num2));

        System.out.println("3. Введите число: ");
        int num3 = sc.nextInt();
        System.out.println("Четные числа от 0 до " + num3 + ":\n" + Loops.chet(num3));

        System.out.println("4. Введите число x: ");
        int num4 = sc.nextInt();
        System.out.println("Введите число y: ");
        int num5 = sc.nextInt();
        System.out.println("Число " + num4 + " в степени " + num5 + " = " + Loops.pow(num4, num5));

        System.out.println("5. Введите число (от 0 и выше): ");
        int num6 = sc.nextInt();
        System.out.println("Количество знаков в числе " + num6 + ": " + Loops.numLen(num6));

        System.out.println("6. Введите число (от 0 и выше): ");
        int num7 = sc.nextInt();
        System.out.println("Все знаки числа одинаковы? Ответ: " + Loops.equalNum(num7));

        System.out.println("7. Введите число: ");
        int num8 = sc.nextInt();
        Loops.square(num8);

        System.out.println("8. Введите число: ");
        int num9 = sc.nextInt();
        Loops.leftTriangle(num9);

        System.out.println("9. Введите число: ");
        int num10 = sc.nextInt();
        Loops.rightTriangle(num10);

        System.out.println("10. Угадайка\n");
        Loops.guessGame();
    }

    public static void dzConditions(){
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Введите число: ");
        int num7 = sc.nextInt();
        System.out.println("Модуль числа " + num7 + " = " + Conditions.abs(num7));

        System.out.println("2. Введите число x: ");
        int num8 = sc.nextInt();
        System.out.println("Введите число y: ");
        int num9 = sc.nextInt();
        System.out.println("Результат деления x/y: " + Conditions.safeDiv(num8, num9));

        System.out.println("3. Введите число x: ");
        int num10 = sc.nextInt();
        System.out.println("Введите число y: ");
        int num11 = sc.nextInt();
        System.out.println("Максимальное значение: " + Conditions.max(num10, num11));

        System.out.println("4. Введите число x: ");
        int num12 = sc.nextInt();
        System.out.println("Введите число y: ");
        int num13 = sc.nextInt();
        System.out.println("Результат сравнения: " + Conditions.makeDecision(num12, num13));

        System.out.println("5. Введите число x: ");
        int num14 = sc.nextInt();
        System.out.println("Введите число y: ");
        int num15 = sc.nextInt();
        System.out.println("Введите число z: ");
        int num16 = sc.nextInt();
        System.out.println("Максимальное число: " + Conditions.max3(num14, num15, num16));

        System.out.println("6. Введите число x: ");
        int num17 = sc.nextInt();
        System.out.println("Введите число y: ");
        int num18 = sc.nextInt();
        System.out.println("Введите число z: ");
        int num19 = sc.nextInt();
        System.out.println("Два любых числа можно сложить так, чтобы получить третье?: " + Conditions.sum3(num17, num18, num19));

        System.out.println("7. Введите число x: ");
        int num20 = sc.nextInt();
        System.out.println("Введите число y: ");
        int num21 = sc.nextInt();
        System.out.println("Результат сложения: " + Conditions.sum2(num20, num21));

        System.out.println("8. Введите число x: ");
        int num22 = sc.nextInt();
        System.out.println("Проверка: число делится нацело на 3 или 5? Результат: " + Conditions.is35(num22));

        System.out.println("9. Введите число x: ");
        int num23 = sc.nextInt();
        System.out.println("Введите число y: ");
        int num24 = sc.nextInt();
        System.out.println("Проверка: x=6 или y=6 или x+y=6 или x-y=6. Результат: " + Conditions.magic6(num23, num24));

        System.out.println("10. Введите число x: ");
        int num25 = sc.nextInt();
        System.out.println("Число + год/года/лет. Результат: " + Conditions.age(num25));

        System.out.println("11. Введите число x: ");
        int num26 = sc.nextInt();
        System.out.println("Число + год/года/лет. Результат: " + Conditions.day(num26));

        System.out.println("12. Введите день недели: ");
        String str = sc.nextLine();
        Conditions.printDays(str);
    }

    public static void dzClassesAndMethods(){
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Введите число: ");
        double num1 = sc.nextDouble();
        System.out.println("Дробная часть числа: " + Math.round(ClassesAndMethods.fraction(num1) * 1000.0)/ 1000.0);

        System.out.println("2. Введите число (2 и более знаков): ");
        int num2 = sc.nextInt();
        System.out.println("Сумма двух последних знаков числа: " + ClassesAndMethods.sumLastNums(num2));

        System.out.println("3. Введите число от 0 до 9: ");
        char ch1 = sc.next().charAt(0);
        System.out.println("Результат преобразования символа в число: " + ClassesAndMethods.charToNum(ch1));

        System.out.println("4. Введите число: ");
        int num3 = sc.nextInt();
        System.out.println("Проверка: положительное - true, отрицательное - false. Результат: " + ClassesAndMethods.isPositive(num3));

        System.out.println("5. Введите положительное число: ");
        int num4 = sc.nextInt();
        System.out.println("Проверка: двузначное - true, недвузначное - false. Результат: " + ClassesAndMethods.is2Digits(num4));

        System.out.println("6. Введите символ: ");
        char ch2 = sc.next().charAt(0);
        System.out.println("Проверка: Это большая буква в диапазоне от ‘A’ до ‘Z’. Результат: " + ClassesAndMethods.isUpperCase(ch2));

        System.out.println("7. Введите первую границу диапазона: ");
        int a = sc.nextInt();
        System.out.println("Введите вторую границу диапазона: ");
        int b = sc.nextInt();
        System.out.println("Введите число для проверки принадлежности к диапазону: ");
        int num5 = sc.nextInt();
        System.out.println("Проверка: введенное число соответствует диапазону от " + a + " до " + b + ". Результат: " + ClassesAndMethods.isInRange(a,b,num5));

        System.out.println("8. Введите первое число: ");
        int a1 = sc.nextInt();
        System.out.println("Введите второе число: ");
        int b1 = sc.nextInt();
        System.out.println("Проверка: любое из принятых чисел делит другое нацело. Результат: " + ClassesAndMethods.isDivisor(a1,b1));

        System.out.println("9. Введите первое число: ");
        int a2 = sc.nextInt();
        System.out.println("Введите второе число: ");
        int b2 = sc.nextInt();
        System.out.println("Введите третье число: ");
        int c2 = sc.nextInt();
        System.out.println("Проверка: все три полученных методом числа равны. Результат: " + ClassesAndMethods.isEqual(a2,b2,c2));

        System.out.println("10. Последовательное сложение чисел: 5, 11, 123, 14, 1");
        int num6 = ClassesAndMethods.lastNumSum(1, ClassesAndMethods.lastNumSum(14, ClassesAndMethods.lastNumSum(123, (ClassesAndMethods.lastNumSum(5, 11)))));
        System.out.println("Итого: " + num6);
    }
}

