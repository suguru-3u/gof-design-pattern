package factoryMethod;

/**
 * @author : s.ohira
 * @since : 2024-05-20
 */

public class RequestFactory extends Factory {
  @Override
  protected Product createProduct(String name,int age) {
    if(age < 18) return new NormalRequest(name,age);
    return new SpecialRequest(name, age);
  }
}
