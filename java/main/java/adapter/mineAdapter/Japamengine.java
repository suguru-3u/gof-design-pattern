package adapter.mineAdapter;

/**
 * @author : s.ohira
 * @since : 2024-05-15
 */
public class Japamengine implements Engine{

  private String name;

  private int durability;

  public Japamengine(String name, int durability){
    this.name = name;
    this.durability = durability;
  }

  @Override
  public boolean move() {
    return this.durability < 10;
  }
}
