# 概要
このフォルダにはGOFのデザインパターン、FactoryMethodについて書かれています。

## FactoryMethodについて
Factory Methodは生成に関するデザインパターンの一つで、 具象クラスを指定することなく、オブジェクトを生成することを可能とします。
Factory Method では、オブジェクトの生成において、 直接のコンストラクター呼び出し （new 演算子） 代わりに使用すべきメソッドを定義します。 
サブクラスにおいてこのメソッドを上書きすることにより、 生成されるオブジェクトのクラスを変更します。

## メリット
似たような動作・変数を持っている場合に、FactoryMethodを使用することでクラスを作成する時の複雑な条件を呼び出し側で
実装する必要がなくなる。

## デメリット
プロダクトに共通のベースクラスまたはインターフェースがある場合にのみ、 このデザインパターンを使用すことができます。 
また、 ベースクラス内のファクトリー・メソッドの戻り値の型は、 このインタフェースとして宣言されている必要があります。

## 参考サイト
https://refactoring.guru/ja/design-patterns/factory-method/java/example