/** 
 * * 第6章 宇宙飛行士のお仕事 * 
 * 
 * * 問題12 StringBufferクラス（replace） 
 * 
 * 宇宙船が次の目的地Ω星に到着しました。 
 * Ω星は不思議な星です。Ω星では名前の
 * 末尾が数字が入っているものは英語表記に置き換える
 * というルールがあります。
 *
 ** 例えば、「apple2」は「appletwo」に 
 ** 「windows98」は「windows9eight」に変更されます。 
 ** 
 ** Ω星人クラスOmegalianを新たに作成してください。 
 ** OmegalianはString型フィールドitemを持ち、メソッドsetItem()で登録します。
 * * また、setItem()内で呼び出されるメソッドとして、 
 * * 受け取った数字を英語表記に変換して戻す
 *  * private String changeLastChar(char ch)を持ちます。
 *  
 */

package lesson06.challenge12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Ωオメガ星人クラス
 * ・文字列の末尾に数字がある場合
 * ・その数字を英語表記に変換する
 */
class Omegalian {

	private String item; // 変換後のアイテム

	public String getItem() {
		return item;
	}

	/**
	 * アイテムを登録し、末尾が数字なら英語に変換する
	 */
	public void setItem(String item) {

		// 文字列を編集するためStringBufferを使用
		StringBuffer sb = new StringBuffer(item);

		// 最後の1文字を取得
		char lastChar = item.charAt(item.length() - 1);

		// 最後が数字なら変換処理
		if (Character.isDigit(lastChar)) {
			String converted = changeLastChar(lastChar);

			// 末尾の数字を英語に置換
			sb.replace(item.length() - 1, item.length(), converted);
		}

		// 結果を保存
		this.item = sb.toString();
	}

	/**
	 * 数字を英語に変換するメソッド
	 * ※Ω星ルールに従う変換処理
	 */
	private String changeLastChar(char ch) {

		switch (ch) {
		case '0':
			return "zero";
		case '1':
			return "one";
		case '2':
			return "two";
		case '3':
			return "three";
		case '4':
			return "four";
		case '5':
			return "five";
		case '6':
			return "six";
		case '7':
			return "seven";
		case '8':
			return "eight";
		case '9':
			return "nine";
		default:
			return String.valueOf(ch);
		}
	}
}

public class Astronaut {

	public static void main(String[] args) throws IOException {

		// 入力受付
		System.out.print("Ω星人にアイテムを渡してください＞");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String present = br.readLine();

		// Ω星人オブジェクト生成
		Omegalian o = new Omegalian();

		// アイテム登録（ここで変換処理実行）
		o.setItem(present);

		// 変換後の値を取得
		String item = o.getItem();

		// 結果表示
		System.out.println("\nΩ星人：");
		System.out.println("えっ！" + item + "をくれるオメガか！");
		System.out.println("ありがとうオメガ。");
	}
}
