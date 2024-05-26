package adapter.mineAdapter;

/**
 * @author : s.ohira
 * @since : 2024-05-15
 */

public class Main {
  public static void main(String[] args) {
    Engine japamengine = new Japamengine("engin1",9);
    Car car1 = new Car("アクア", japamengine);
    car1.drive();

    Americaengine americaengine = new Americaengine("engin1",9);
    Engine americaadapterengine = new Americaadapterengine(americaengine);
    Car car2 = new Car("スポーツカー",americaadapterengine);
    car2.drive();
  }
}
