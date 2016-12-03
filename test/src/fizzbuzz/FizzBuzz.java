package fizzbuzz;

/**
 * fizzbuzzルール
 * 1～fizbuzMaxまで数を以下のルールでカウントする
 * ・3の倍数の場合："fizz"
 * ・5の倍数の場合："buzz"
 * ・3と5の倍数の場合："fizzbuzz"
 * ・それ以外の場合：数値を出力
 */
public class FizzBuzz {
	private boolean isFizz = false;
	private boolean isBuzz = false;

	/**
	 * fizzbuzz実行関数
	 * @param fizbuzMax (int)fizzbuzz実行時の最大値
	 */
	public void exec (int fizbuzMax) {
		for (int i = 1; i <= fizbuzMax; i++) {
			isFizz = (i % 3 == 0);
			isBuzz = (i % 5 == 0);

			if (isFizz || isBuzz) {
				System.out.print((isFizz ? "fizz" : "") + (isBuzz ? "buzz" : "") + "\n");
			} else {
				System.out.print(String.valueOf(i) + "\n");
			}
		}
	}
}
