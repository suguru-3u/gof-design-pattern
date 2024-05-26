package adapter.mineAdapter;

/**
 * @author : s.ohira
 * @since : 2024-05-15
 */
public class Americaadapterengine implements Engine{

  private final Americaengine americaengine;

  public Americaadapterengine(Americaengine americaengine){
    this.americaengine = americaengine;
  }

  @Override
  public boolean move() {
    final var americanEnginFlg = americaengine.go();
    return americanEnginFlg && americaengine.getDurability() < 10;
  }
}
