package com.imooc.poker;
/*
 * һ�������˿���
	���ֻ�ɫ��
    13�����֣���������С����
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class poker {//���췽�������˿��ƣ����л�ɫ�ʹ�С֮��
	String[] pattern={"����","÷��","����","����"};
	String[] number={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
	List<String> poker=new ArrayList<String>();
	public poker() {
			for (int i = 0; i < number.length; i++) {
				for (int j = 0; j < pattern.length; j++) {
					poker.add(pattern[j]+number[i]);
				}
			}
		}
	//��ӡ�˿���
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
	//ϴ�ơ��������˿���
	public void change(List<String> poker) {
		Collections.shuffle(poker);
		print();
	}
	//���ơ���һ��һ����
	public void deliver(List<String> poker,player player1,player player2) {
		List<String> poker1=new ArrayList<String>();
		List<String> poker2=new ArrayList<String>();
		//ÿһ�˴�ϴ�õ��˿�������һ���ƣ�ϴ�õ��˿��Ƽ��Ͼͻ���һ�ţ��õ��Ǹ��˵����ƾͻ��һ��
		for (int i = 0; i < 4; i++) {
			if (i%2==0) {
				poker1.add(poker.get(0));
				poker.remove(0);
				System.out.println("���"+player1.getName()+"����:"+poker1.get(i/2));
			}else {
				poker2.add(poker.get(0));
				poker.remove(0);
				System.out.println("���"+player2.getName()+"����:"+poker2.get(i/2));
			}
		}
		player1.setMypoker(poker1);
		player2.setMypoker(poker2);
//		//��ӡ���������һ����֮����˿��Ƽ���
//		print();
	}
	
	//��Ϸ�����Ƚ�������ҵ�����
	public void compareGame(List<String> order,player player1,player player2) {
		String a=player1.getMypoker().get(0);
		int n1=order.indexOf(a);
		int n2=order.indexOf(player1.getMypoker().get(1));
		System.out.println(n1+":"+n2);
		if (n1<n2) {
			n1=n2;
		}
		System.out.println(player1.getName()+"���������ǣ�"+order.get(n1));
		int n3=order.indexOf(player2.getMypoker().get(0));
		int n4=order.indexOf(player2.getMypoker().get(1));
		System.out.println(n3+":"+n4);
		if (n3<n4) {
			n3=n4;
		}
		System.out.println(player2.getName()+"���������ǣ�"+order.get(n3));
		if (n1>n3) {
			System.out.println(player1.getName()+"��ʤ��");
		}else {
			System.out.println(player2.getName()+"��ʤ��");
		}
	}
}
