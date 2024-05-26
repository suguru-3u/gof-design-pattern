package factoryMethod;

/**
 * @author : s.ohira
 * @since : 2024-05-20
 */
public abstract class Factory {
  public final Product create(String name,int age){
    Product p = createProduct(name, age);
    return p;
  }

  protected abstract Product createProduct(String name,int age);
}
