package adapter.classAdapter;

/**
 * アダプタークラスでここで変換を行っている
 * ラップしたいクラスを継承し、必要なメソッドについてはインターフェイスから取得している。
 * 適合する側（Adapter）
 */
public class PrintBanner extends Banner implements Print {

    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
