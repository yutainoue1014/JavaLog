package jp.techacademy.inoue.yuuta.javalog;

import android.util.Log;

class Dog {
    // 変数
    String name;      // 名前
    int age;    // 年齢

    // コンストラクタ
    public Dog() {
        name = "";
        age = 0;
    }

    public Dog(String ハチ, int i) {
    }

    // メソッド
    public void say() {
        Log.d("javatest", this.name + "(" + this.age + "歳)" + "「ワンワン」");
    }
}












