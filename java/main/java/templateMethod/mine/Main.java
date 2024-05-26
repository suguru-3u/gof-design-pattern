package templateMethod.mine;

/**
 * @author : s.ohira
 * @since : 2024-05-16
 */
public class Main {
  public static void main(String[] args) {
    // 'H'を持ったCharDisplayのインスタンスを1個作る
    Request d1 = new RequestNormal1("Test1",10);

    // "Hello, world."を持ったStringDisplayのインスタンスを1個作る
    Request d2 = new RequestNormal2("Test2",10);

    // d1,d2とも、すべて同じAbstractDisplayのサブクラスのインスタンスだから
    // 継承したdisplayメソッドを呼び出すことができる
    // 実際の動作は個々のクラスCharDisplayやStringDisplayで定まる
    final var res1 = d1.validation();
    if(res1) {
      System.out.println("Request1が成功しました");
    } else {
      System.out.println("Request1が失敗しました");
    }

    final var res2 = d2.validation();
    if(res2) {
      System.out.println("Request2が成功しました");
    } else {
      System.out.println("Request2が失敗しました");
    }
  }
}
