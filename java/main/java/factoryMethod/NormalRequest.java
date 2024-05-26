package factoryMethod;

/**
 * @author : s.ohira
 * @since : 2024-05-20
 */
public class NormalRequest extends Product{
  private String name;

  private int age;

  NormalRequest(String name,int age){
    System.out.println(name + "のリクエストを受付ました。");
    this.name = name;
    this.age = age;
  }

  @Override
  public void validation() {
      System.out.println("NormalRequestクラスのバリデーションを実施");
  }
}
