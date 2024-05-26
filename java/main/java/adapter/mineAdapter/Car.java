package adapter.mineAdapter;

/**
 * @author : s.ohira
 * @since : 2024-05-15
 */
public class Car {
  private String name;

  private Engine engine;

  public Car(String name,Engine engine){
    this.name = name;
    this.engine = engine;
  }

  public void drive(){
    final var engineFlg = engine.move();
    if(engineFlg){
      System.out.println(this.name  + " : " + "出発");
    } else {
      System.out.println(this.name  + " : " + "エンジントラブルにより出発できません");
    }
  }

}
