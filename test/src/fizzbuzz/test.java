package fizzbuzz;

import java.util.ArrayList;
import java.util.Collections;

public class test {

	private static final int loopMax = 10;			// 試行回数
	private static final int fizbuzMax = 10000;	// fizzbuzz最大値

	public static void main(String[] args) {
		ArrayList<Double> execSTimeList = new ArrayList<Double>();

		FizzBuzz fz = new FizzBuzz();
		for (int i = 0; i < loopMax; i++) {
			// 時間計測
			double start = System.nanoTime();

			// FizzBuzzクラスを呼び出して、実行するためのソース
			fz.exec(fizbuzMax);

			execSTimeList.add((System.nanoTime() - start) / 1000000000.0);
		}

		System.out.println("=========================");

		/*
		 * ・平均処理時間
		 * ・最短処理時間
		 * ・最長処理時間
		 * の表示
		 */
		double averageTime = 0.0;
		for (double time : execSTimeList) {
			averageTime += time;
		}
		averageTime /= execSTimeList.size();
		System.out.println("平均処理時間：" + averageTime + "秒");

		Collections.sort(execSTimeList);
		System.out.println("最短処理時間：" + execSTimeList.get(0) + "秒");
		System.out.println("最長処理時間：" + execSTimeList.get(execSTimeList.size() - 1) + "秒");

		System.out.println("=========================");
	}

}
