/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題7 10分割して販売する
 *
 * マカロンが大きすぎて売上が芳しくないので
 * 1個のマカロンを10分割して0.1個から販売することにします。
 * (値段も0.1倍～)
 * ただし合計金額と在庫は小数を切り捨て、
 * 常に整数で表示します。
 *
 * 問題6の答えを改変し、以下の実行例を参考に処理を記述してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >5
 * ショコラ      >1.5
 * ピスターシュ  >2.5
 *
 * シトロン     5.0個
 * ショコラ     1.5個
 * ピスターシュ 2.5個
 *
 * 合計個数    9.0個
 * 合計金額   2470円
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 */

package lesson01.challenge07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {

		System.out.println("それぞれ何個ずつ買いますか？(最大30個まで)");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("シトロン >");
		double citron = Double.parseDouble(br.readLine());

		System.out.print("ショコラ >");
		double chocolat = Double.parseDouble(br.readLine());

		System.out.print("ピスターシュ >");
		double pistache = Double.parseDouble(br.readLine());

		System.out.println();

		System.out.println("シトロン" + citron + "個");
		System.out.println("ショコラ" + chocolat + "個");
		System.out.println("ピスターシュ" + pistache + "個");

		double totalcount = citron + chocolat + pistache;
		System.out.println();
		System.out.println("合計個数" + totalcount + "個");

		double sum = citron * 250 + chocolat * 280 + pistache * 320;
		System.out.println("合計金額" + (int) sum + "円");

		System.out.print("\nをお買い上げですね。\n");
		System.out.println("承りました。");

		System.out.println("\n本日のおすすめ商品です。\n");

		System.out.println("シトロン \\250…残り" + (int) (30 - citron) + "個");
		System.out.println("ショコラ  \\280…残り" + (int) (30 - chocolat) + "個");
		System.out.println("ピスターシュ  \\320…残り" + (int) (30 - pistache) + "個");

	}

}
