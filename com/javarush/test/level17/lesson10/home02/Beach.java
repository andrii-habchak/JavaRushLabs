package com.javarush.test.level17.lesson10.home02;

/* Comparable
Реализуйте интерфейс Comparable<Beach> в классе Beach, который будет использоваться нитями.
*/

public class Beach implements Comparable<Beach> {
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    /**
     * В условии задачи не указано в каком формате необходимо
     * возвращать результат.
     * Правильным форматом результата я вляются 3 цыфры.
     * Например, 000
     * Первая -> Name, вторая -> Distance, третья -> Quality
     * */

    /**
     * Для примитивов лучше использовать уже реализованные методы compare.
     * Почему тут https://habrahabr.ru/post/247015/
     * */

    @Override
    public synchronized int compareTo(Beach o) {
        int nameResult = this.name.compareTo(o.getName());
        int distanceResult = Float.compare(this.distance, o.getDistance());
        int qualityResult = Integer.compare(this.quality, o.getQuality());
        return 1000 * nameResult + 100 * distanceResult + qualityResult;
    }


    /**
      Вариант с хабра не побходит, так не указывает какие именно параметры разняться.
        @Override
        public synchronized int compareTo(Beach o) {
            int result = this.name.compareTo(o.getName());
            if (result != 0) return result;
            result = Float.compare(this.distance, o.getDistance());
            if (result != 0) return result;
            result = Integer.compare(this.quality, o.getQuality());
            return result;
    }*/
}
