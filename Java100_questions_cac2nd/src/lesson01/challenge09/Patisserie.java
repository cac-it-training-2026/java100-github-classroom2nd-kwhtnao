/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

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

		double totalCount = citron + chocolat + pistache;
		System.out.println();
		System.out.println("合計個数" + totalCount + "個");

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

		System.out.println("\n明日の三色マカロンの配合率が決まりました！\n");

		System.out.println("シトロンの味     …" + citronRate + "%");
		System.out.println("ショコラの味     …" + chocolatRate + "%");
		System.out.println("ピスターシュの味 …" + pistacheRate + "%");

		System.out.println("が楽しめます！");

		int price = (int) (totalSales / totalCount);
		price = (price / 10) * 10;
		System.out.println("\n値段は\\" + price + "です。\n");

	}

}
