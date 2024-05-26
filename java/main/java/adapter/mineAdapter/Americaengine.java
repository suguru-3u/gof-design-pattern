package adapter.mineAdapter;

/**
 * @author : s.ohira
 * @since : 2024-05-15
 */
public class Americaengine {
  private String name;

  private int durability;

  public Americaengine(String name, int durability){
    this.name = name;
    this.durability = durability;
  }

  public boolean go(){
    return  this.durability < 5;
  }

  public int getDurability() {
    return durability;
  }
}
