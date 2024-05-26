package iterator;

public interface Iterator<E> {

  // 繰り返し処理の際に後続処理がないか確認するメソッド
  public abstract boolean hasNext();

  // 繰り返し処理で後続を呼び出すメソッド
  public abstract E next();
}
