package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {
		int countSum = 0;
		String name = "";
		int price = 0;
		int count = 0;
		String str = "";
		Scanner sc = new Scanner(System.in);
		List<Goods> gArray = new ArrayList<Goods>();
		
		System.out.println("상품을 입력해주세요(종료 q)");
		while (true) {
			try {
				str = sc.nextLine();
				
				if (str.equals("q")) {
					for (int i = 0; i < gArray.size(); i++) {
						countSum += gArray.get(i).getCount();
						gArray.get(i).draw();
					}
					System.out.println("모든 상품의 개수는" + countSum + "개 입니다");
					break;
				}
				
				String[] sArray = str.split(",");
				name = sArray[0];
				price = Integer.parseInt(sArray[1]);
				count = Integer.parseInt(sArray[2]);
				Goods goods = new Goods(name, price, count);
				gArray.add(goods);
				
			} catch (Exception e) {// 오타가 나올경우
				System.out.println("잘못입력하셨습니다.");
				System.out.println("다시 입력해주세요");
				continue;
			}
		}
	}

}
