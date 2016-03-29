package com.imooc.poker;
/*
 * 一、创建扑克牌
	四种花色；
    13个数字，不包括大小王；
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class poker {//构造方法创建扑克牌，牌有花色和大小之分
	String[] pattern={"方块","梅花","红桃","黑桃"};
	String[] number={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
	List<String> poker=new ArrayList<String>();
	public poker() {
			for (int i = 0; i < number.length; i++) {
				for (int j = 0; j < pattern.length; j++) {
					poker.add(pattern[j]+number[i]);
				}
			}
		}
	//打印扑克牌
	public void print() {
		int temp=0;
		for (String string : poker) {
			System.out.print(string+",");
			if (temp==3) {
				temp=0;
				System.out.println();
			}else {
				temp++;
			}
		}
	}
	//洗牌——打乱扑克牌
	public void change(List<String> poker) {
		Collections.shuffle(poker);
		print();
	}
	//发牌——一人一张牌
	public void deliver(List<String> poker,player player1,player player2) {
		List<String> poker1=new ArrayList<String>();
		List<String> poker2=new ArrayList<String>();
		//每一人从洗好的扑克牌中拿一张牌，洗好的扑克牌集合就会少一张，拿的那个人的手牌就会多一张
		for (int i = 0; i < 4; i++) {
			if (i%2==0) {
				poker1.add(poker.get(0));
				poker.remove(0);
				System.out.println("玩家"+player1.getName()+"拿牌:"+poker1.get(i/2));
			}else {
				poker2.add(poker.get(0));
				poker.remove(0);
				System.out.println("玩家"+player2.getName()+"拿牌:"+poker2.get(i/2));
			}
		}
		player1.setMypoker(poker1);
		player2.setMypoker(poker2);
//		//打印由玩家拿完一轮牌之后的扑克牌集合
//		print();
	}
	
	//游戏——比较两个玩家的手牌
	public void compareGame(List<String> order,player player1,player player2) {
		String a=player1.getMypoker().get(0);
		int n1=order.indexOf(a);
		int n2=order.indexOf(player1.getMypoker().get(1));
		System.out.println(n1+":"+n2);
		if (n1<n2) {
			n1=n2;
		}
		System.out.println(player1.getName()+"最大的手牌是："+order.get(n1));
		int n3=order.indexOf(player2.getMypoker().get(0));
		int n4=order.indexOf(player2.getMypoker().get(1));
		System.out.println(n3+":"+n4);
		if (n3<n4) {
			n3=n4;
		}
		System.out.println(player2.getName()+"最大的手牌是："+order.get(n3));
		if (n1>n3) {
			System.out.println(player1.getName()+"获胜。");
		}else {
			System.out.println(player2.getName()+"获胜。");
		}
	}
}
