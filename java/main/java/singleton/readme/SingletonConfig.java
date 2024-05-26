package singleton.readme;

/**
 * @author : s.ohira
 * @since : 2024-05-21
 */
public class SingletonConfig {

  private static SingletonConfig singletonConfig = new SingletonConfig();

  private SingletonConfig(){
    System.out.println("SingletonConfigクラスを作成しました");
  }

  public static SingletonConfig getInstance(){
    return singletonConfig;
  }

}
