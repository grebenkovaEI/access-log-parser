package ru.course.city;

public class Main {
    public static void main(String[] args) {
        //Используя разработанную сущность реализуйте схему, представленную на рисунке 1.
        City cityA = new City("A");
        City cityB = new City("B");
        City cityC = new City("C");
        City cityD = new City("D");
        City cityE = new City("E");
        City cityF = new City("F");
        cityA.addNewPath(cityB,5);
        cityA.addNewPath(cityF,1);
        cityA.addNewPath(cityD,6);
        cityB.addNewPath(cityA,5);
        cityB.addNewPath(cityC,3);
        cityC.addNewPath(cityB,3);
        cityC.addNewPath(cityD,4);
        cityD.addNewPath(cityC,4);
        cityD.addNewPath(cityE,2);
        cityD.addNewPath(cityA,6);
        cityE.addNewPath(cityF,2);
        cityE.addNewPath(cityD,2);
        cityF.addNewPath(cityB,1);
        //Далее необходимо методу путешествия объекта B передать некоторое число и вывести возвращенный город на экран:
        //Если передано число 1, результат должен быть либо A, либо С
        //Если передано число 2, результат должен быть либо B, либо D, либо F
        //Если передано число 3, результат может быть любом городом в зависимости от порядка следования путей в списках таковых у городов
        System.out.println("Если передано число 1, результат должен быть либо A, либо С. Результат: "
                + cityB.travelBy(1).name);
        System.out.println("Если передано число 2, результат должен быть либо B, либо D, либо F. Результат: "
                + cityB.travelBy(2).name);
        System.out.println("Если передано число 3, результат может быть любом городом в зависимости от порядка " +
                "следования путей в списках таковых у городов. Результат: " + cityB.travelBy(3).name);
        //Настройте объекты городов так, чтобы при передаче числа 3 последним городом оказался город A
        System.out.println("Задание: Настройте объекты городов так, чтобы при передаче числа 3 последним городом оказался город A");
        System.out.println("Ответ: Настройка не требуется, т.к. объекты уже настроены таким образом.");
    }
}

