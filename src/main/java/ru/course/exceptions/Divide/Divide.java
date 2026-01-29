package ru.course.exceptions.Divide;

import ru.course.exceptions.OperationAttemptException.OperationAttemptException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Divide {
    public static int divide(String fileName) throws OperationAttemptException {
        File f = new File(fileName);
        try (Scanner sc = new Scanner(f)) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            return num1 / num2;
        } catch (InputMismatchException ex) {
            throw new OperationAttemptException("Вместо чисел в файле содержатся строки", ex);
        } catch (FileNotFoundException ex) {
            throw new OperationAttemptException("Файл не найден", ex);
        } catch (NoSuchElementException ex) {
            throw new OperationAttemptException("В файле менее двух чисел", ex);
        }  catch (ArithmeticException ex) {
            throw new OperationAttemptException("Второе число - это ноль", ex);
        }
    }
}
