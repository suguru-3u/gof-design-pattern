package adapter.instanceAdapter;

/**
 * 継承のAdapterとはことなり、実際に動作するクラスについてクラスインスタンスを保持している
 */

public class PrintBanner extends Print {

    // クラスインスタンスを保持するようにしている
    private final Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
