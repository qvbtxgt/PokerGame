package com.imooc.poker;

import java.util.ArrayList;
import java.util.List;

public class demo_poker {
/*
 * 	扑克游戏
一、创建扑克牌
	四种花色；
    13个数字，不包括大小王；
二、创建两名玩家
	玩家有ID、姓名、手牌等属性，手牌为扑克牌的集合；
三、洗牌
	将之前创建的“一副扑克牌”打乱顺序；
四、发牌
	将洗牌之后的扑克牌集合，从第一张开始，发给两名玩家，按照一人一张的方式，第人发两张；
五、游戏 
	比较两名玩家手中的扑克牌，规则为：取两人各自手中点数最大的牌进行比较，点数大的赢；若两人各自的点数最大的牌相等，则再按花色比较。
 */
	public static void main(String[] args) {
		poker pk=new poker();//创建扑克牌
		List<String> order=new ArrayList<String>();//扑克牌的大小顺序 
		System.out.println("---------------扑克牌创建----------------");
		pk.print();//将创建好的扑克牌打印出来
		for (String string : pk.poker) {
			order.add(string);
		}
		System.out.println("--------------扑克牌创建成功---------------");
		//创建两个玩家
		System.out.println("-----------------创建玩家-----------------");
		player player1=new player();
		player player2=new player();
		System.out.println("----------------创建玩家成功-----------------");
		System.out.println("玩家一："+player1.getId()+":"+player1.getName());
		System.out.println("玩家二："+player2.getId()+":"+player2.getName());
		//洗牌
		System.out.println("----------------洗牌成功----------------");
		pk.change(pk.poker);
		System.out.println("-----------------发 牌----------------");
		pk.deliver(pk.poker, player1, player2);
		System.out.println("-----------------游 戏----------------");
		pk.compareGame(order, player1, player2);
	}
	
	
}
