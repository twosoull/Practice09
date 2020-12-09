package com.javaex.ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Friend> fArray = new ArrayList<Friend>();
		System.out.println("친구를 3명 등록해주세요");

		for (int i = 0; i < 3; i++) {
			try {
				String[] str = sc.nextLine().split(" ");
				Friend fr = new Friend(str[0], str[1], str[2]);
				fArray.add(fr);
			} catch (Exception e) {// 엔터를 실수로누르면 어레이 예외일어남
				i--;
				System.out.println("다시 입력해주세요");
				continue;
			}
		}

		for (int i = 0; i < fArray.size(); i++) {
			fArray.get(i).draw();
		}

	}

}
