package adapter.classAdapter;


// Client役
public class Main {
    public static void main(String[] args) {

        // Printインターフェイスを使用してプログラミングをしている点が重要
        Print p = new PrintBanner("Hello");

        // 実際の動作するクラスのことは意識せずに実装することができている
        p.printWeak();
        p.printStrong();
    }
}
