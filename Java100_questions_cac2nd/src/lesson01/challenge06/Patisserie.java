/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

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

		System.out.println("\n本日のおすすめ商品です。\n");

		System.out.println("シトロン \\250…残り" + (30 - citron) + "個");
		System.out.println("ショコラ  \\280…残り" + (30 - chocolat) + "個");
		System.out.println("ピスターシュ  \\320…残り" + (30 - pistache) + "個");

	}

}
