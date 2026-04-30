/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題8 閉店作業を行う
 *
 * 閉店時間となったため、閉店メッセージを表示し
 * 売上の割合を確認します。
 * 以下の実行例を参考に処理を追記、改変してください。
 * （%の表示は小数第一位切り捨てで行います。）
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 */

package lesson01.challenge08;

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

		System.out.print("\n閉店時間となりました。\n");
		System.out.println("またのお越しをお待ちしております。");

		System.out.print("\n売り上げの割合\n");
		System.out.println("売り上げの合計   " + "\\" + (int) sum);

		double citronSales = citron * 250;
		double chocolatSales = chocolat * 280;
		double pistacheSales = pistache * 320;

		double totalSales = citronSales + chocolatSales + pistacheSales;

		int citronRate = (int) ((citronSales / totalSales) * 100);
		int chocolatRate = (int) ((chocolatSales / totalSales) * 100);
		int pistacheRate = (int) ((pistacheSales / totalSales) * 100);

		System.out.print("\n内訳\n");
		System.out.println("シトロン      " + "\\" + (int) citronSales + "…" + citronRate + "%");
		System.out.println("ショコラ      " + "\\" + (int) chocolatSales + "…" + chocolatRate + "%");
		System.out.println("ピスターシュ  " + "\\" + (int) pistacheSales + "…" + pistacheRate + "%");
	}

}
