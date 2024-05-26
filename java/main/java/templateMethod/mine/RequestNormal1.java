package templateMethod.mine;

/**
 * @author : s.ohira
 * @since : 2024-05-16
 */
public class RequestNormal1 extends Request{

  private final String name;

  private final int age;

  public  RequestNormal1(String name, int age){
    this.name = name;
    this.age = age;
  }

  @Override
  boolean CheckName() {
    return this.name.length() > 1;
  }

  @Override
  boolean CheckAge() {
    return this.age > 10;
  }
}
