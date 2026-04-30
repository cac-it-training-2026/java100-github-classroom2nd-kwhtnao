/** * 第6章 宇宙飛行士のお仕事 
 * 問題11 Stringクラス③（indexOf） 
 * 宇宙船が次の目的地γ星に到着しました。
 * γ星は不思議な星です。γ星人たちは 
 * 名前に数字が入っているものを珍重しています。
 * 例えば、「アリナミン5」は大事にしていますが
 * 「アリナミンEX」は大事にしていません。 
 * 
 * γ星人クラスGammalianを新たに作成してください。
 * GammalianはString型フィールドitem、boolean型フィールドisGood
 * を持ち、メソッドsetItem()で登録します。setItem()は文字列中に
 * 数字が含まれていれば、isGoodをtrueにした後にitemに登録し、
 * 含まれていなければ、isGoodをfalseにした後に登録します。
 * 
 * * <実行例1> 
 * γ星人にアイテムを渡してください＞TanquerayNo.10 
 * 
 * γ星人： * こんな良いものをもらっていいガンマか！ 
 * 
 * ゆっくりしていくガンマ。 
 * 
 * * * <実行例2> * * 
 * γ星人にアイテムを渡してください＞orange 
 * 
 *  γ星人： 
 *  ...ありがとガンマ。
 * 
 * ぶぶ漬けでもいかがガンマか？ 
 * * */

package lesson06.challenge11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * γ星人クラス
 * ・アイテム（文字列）を受け取り
 * ・数字を含むかどうかで評価を決定する
 */
class Gammalian {

	private String item; // 受け取ったアイテム名
	private boolean isGood; // 数字を含むかどうかの判定結果

	public String getItem() {
		return item;
	}

	/**
	 * アイテムを登録し、数字の有無を判定するメソッド
	 * ・数字が含まれていれば isGood = true
	 * ・含まれていなければ isGood = false
	 */
	public void setItem(String item) {

		// 数字が含まれているかを判定するフラグ
		boolean isHit = false;

		// 0〜9までループして数字が含まれるかチェック
		for (int i = 0; i < 10; i++) {
			if (item.indexOf(Integer.toString(i)) != -1) {
				isHit = true;
				break; // 見つかった時点で終了
			}
		}

		// 判定結果をisGoodに反映
		if (isHit) {
			isGood = true; // 数字あり → 良いアイテム
		} else {
			isGood = false; // 数字なし → 普通扱い
		}

		// アイテムを保存
		this.item = item;
	}

	// 評価結果の取得
	public boolean isGood() {
		return isGood;
	}

	public void setGood(boolean isGood) {
		this.isGood = isGood;
	}
}

public class Astronaut {

	public static void main(String[] args) throws IOException {

		// ユーザー入力受付
		System.out.print("γ星人にアイテムを渡してください＞");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String present = br.readLine();

		// γ星人オブジェクト生成
		Gammalian g = new Gammalian();

		// 入力されたアイテムを登録（ここで数字判定も行われる）
		g.setItem(present);

		// 判定結果を取得
		boolean isGood = g.isGood();

		System.out.println("\nγ星人：");

		// 判定によって反応を変える
		if (isGood) {
			System.out.println("こんな良いものをもらっていいガンマか！");
			System.out.println("ゆっくりしていくガンマ。");
		} else {
			System.out.println("...ありがとガンマ。");
			System.out.println("ぶぶ漬けでもいかがガンマか？");
		}
	}
}