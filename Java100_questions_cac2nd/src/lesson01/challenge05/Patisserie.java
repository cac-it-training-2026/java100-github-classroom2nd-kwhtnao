/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題5 合計金額を求める
 *
 * 入力されたマカロンの個数から合計購入数、合計金額を求めます。
 * 合計購入数、合計金額を求める処理を追記した後で
 * [問題4]の表示を実行例を参考にして改変してください。
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * 合計個数    16個
 * 合計金額  4480円
 *
 * をお買いあげですね。
 * 承りました。
 *
 */

package lesson01.challenge05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {

		System.out.println("それぞれ何個ずつ買いますか？(最大30個まで)");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("シトロン >");
		int citron = Integer.parseInt(br.readLine());

		System.out.print("ショコラ >");
		int chocolat = Integer.parseInt(br.readLine());

		System.out.print("ピスターシュ >");
		int pistache = Integer.parseInt(br.readLine());

		System.out.println();

		System.out.println("シトロン" + citron + "個");
		System.out.println("ショコラ" + chocolat + "個");
		System.out.println("ピスターシュ" + pistache + "個");

		int totalcount = citron + chocolat + pistache;
		System.out.println();
		System.out.println("合計個数" + totalcount + "個");

		int sum = citron * 250 + chocolat * 280 + pistache * 320;
		System.out.println("合計金額" + sum + "円");

		System.out.print("\nをお買い上げですね。\n");
		System.out.println("承りました。");

	}

}
