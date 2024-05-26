package templateMethod.mine;

/**
 * @author : s.ohira
 * @since : 2024-05-16
 */
public abstract class Request {
  private String name;

  private int age;

  public boolean validation(){
    return this.CheckName() && this.CheckAge();
  }

  abstract boolean CheckName();

  abstract boolean CheckAge();
}
