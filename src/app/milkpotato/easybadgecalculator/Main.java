package app.milkpotato.easybadgecalculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		while (true) {

			Scanner scanner = new Scanner(System.in);
			System.out.printf("최종 클리어 스테이지 : ");
			int clrStage = scanner.nextInt();
			int[] stage = new int[clrStage];

			for (clrStage = 0; clrStage < stage.length; clrStage++) {
				stage[clrStage] = clrStage + 1;
				System.out.println(stage[clrStage]);
			}
		}

	}

}
