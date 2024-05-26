package factoryMethod;

/**
 * @author : s.ohira
 * @since : 2024-05-20
 */
public class SpecialRequest extends Product{

  private String name;

  private int age;

  private boolean happyFlg = true;

  SpecialRequest(String name,int age){
    System.out.println(name + "のリクエストを受付ました。");
    this.name = name;
    this.age = age;
  }

  @Override
  public void validation() {
    System.out.println("SpecialRequestクラスのバリデーションを実施");
  }
}
