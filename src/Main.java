/*
Написать класс Vehicle описывающий транспортное средство и состоящий из различных деталей.

Каждая деталь имеет свои особенности: стоимость, масса.

Написать классы наследники Mazda, Ford, Mercedes - эти марки авто
должны быть унаследованы от Vehicle и в дополнение иметь свои особенные детали.

В функции Main() - создать экземпляры классов Mazda, Ford, Mercedes - вывести их стоимости и вес.

 */

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Mazda();
        Vehicle v2 = new Ford();
        Vehicle v3 = new Mercedes();

        System.out.println("Автомобиль MAZDA с весом " + v1.getWeight() + " кг и стомостью " + v1.getPrice() + " USD");
        System.out.println("Автомобиль FORD с весом " + v2.getWeight() + " кг и стомостью " + v2.getPrice() + " USD");
        System.out.println("Автомобиль MERCEDES с весом " + v3.getWeight() + " кг и стомостью " + v3.getPrice() + " USD");

    }
}