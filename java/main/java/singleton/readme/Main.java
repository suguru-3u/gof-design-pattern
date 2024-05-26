package singleton.readme;

/**
 * @author : s.ohira
 * @since : 2024-05-21
 */

public class Main {
  public static void main(String[] args) {
    // 1回目の呼び出しの際にクラスが作成されている。
    SingletonConfig singletonConfig1 = SingletonConfig.getInstance();
    SingletonConfig singletonConfig2 = SingletonConfig.getInstance();

    if(singletonConfig1 == singletonConfig2){
      System.out.println("同じインスタンスです");
    }
    System.out.println("End");
  }
}
