package app.milkpotato.easybadgecalculator;

import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.printf("클리어한 최종 스테이지 : ");
			int clrStage = scanner.nextInt();
			int[] stage = new int[clrStage];

			if (clrStage > 100 || clrStage < 0) {
				System.out.println("입력값을 다시 확인해주세요.");

			} else if (clrStage == 0) {
				System.out.println("획득한 보상이 없습니다.");
			
			} else {
				int sumBadge = 0;
				for (clrStage = 0; clrStage < stage.length; clrStage++) {
					stage[clrStage] = clrStage + 1;

					int getBadge = stage[clrStage];
					System.out.printf("스테이지 클리어 : %d / 획득 베지 : %d%n", stage[clrStage], getBadge);
					sumBadge = sumBadge + getBadge;
				}
				System.out.println("획득 가능한 총 베지 수 : " + sumBadge);
			}

		}

	}

}
