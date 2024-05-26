package factoryMethod;

/**
 * @author : s.ohira
 * @since : 2024-05-20
 */
public class Main {
  public static void main(String[] args) {
    Factory request = new RequestFactory();
    Product request1 = request.create("Hiroshi Yuki",15);
    Product request2 = request.create("Tomura",20);
    request1.validation();
    request2.validation();
  }
}

