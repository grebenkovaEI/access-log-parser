package ru.course.objects.city;

import java.util.ArrayList;
import java.util.List;

public class City {
    String name;
    List<Path> paths;

    public City(String name) {
        this.name = name;
        this.paths = new ArrayList<>();
    }
    public City(String name, List<Path> paths) {
        this.name = name;
        this.paths = paths;
    }
//Город может возвращать текстовое представление, в виде названия Города и списка связанных с ним Городов (в виде пары: “название: стоимость”)
        public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < paths.size(); i++) {
            sb.append(paths.get(i));
            if (i < paths.size() - 1) sb.append(", ");
        }
        return sb.toString();
    }
    //Городу в любой момент можно добавить новый путь в другой город, указав либо сам путь, либо пару Город-цена
    public void addNewPath(Path path){
        paths.add(path);
    }
    public  void addNewPath(City city, int cost){
        paths.add(new Path(city, cost));
    }
    //Город должен иметь метод путешествия (travelBy). Такой метод принимает число n, который обозначает количество
    // переходов. Проще говоря, в текущем списке путей берется первый город, из его списка путей так же берется первый
    // город, из списка путей которого в свою очередь берется город и так далее до тех пор, пока либо количество городов
    // не станет равным n, либо у текущего города не окажется путей. Метод возвращает последний Город пути или null если мы попали в тупик
    public City travelBy(int n){
        City city = this;
        int count = 0;
        while (count < n){
            List<Path> paths1 = city.paths;
            if (paths1.isEmpty()) return city;
            city = paths1.get(0).name;
            count++;
            if (count >= n) return city;
        }
        return city;
    }
}
