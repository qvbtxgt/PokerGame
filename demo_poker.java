package com.imooc.poker;

import java.util.ArrayList;
import java.util.List;

public class demo_poker {
/*
 * 	�˿���Ϸ
һ�������˿���
	���ֻ�ɫ��
    13�����֣���������С����
���������������
	�����ID�����������Ƶ����ԣ�����Ϊ�˿��Ƶļ��ϣ�
����ϴ��
	��֮ǰ�����ġ�һ���˿��ơ�����˳��
�ġ�����
	��ϴ��֮����˿��Ƽ��ϣ��ӵ�һ�ſ�ʼ������������ң�����һ��һ�ŵķ�ʽ�����˷����ţ�
�塢��Ϸ 
	�Ƚ�����������е��˿��ƣ�����Ϊ��ȡ���˸������е��������ƽ��бȽϣ��������Ӯ�������˸��Եĵ�����������ȣ����ٰ���ɫ�Ƚϡ�
 */
	public static void main(String[] args) {
		poker pk=new poker();//�����˿���
		List<String> order=new ArrayList<String>();//�˿��ƵĴ�С˳�� 
		System.out.println("---------------�˿��ƴ���----------------");
		pk.print();//�������õ��˿��ƴ�ӡ����
		for (String string : pk.poker) {
			order.add(string);
		}
		System.out.println("--------------�˿��ƴ����ɹ�---------------");
		//�����������
		System.out.println("-----------------�������-----------------");
		player player1=new player();
		player player2=new player();
		System.out.println("----------------������ҳɹ�-----------------");
		System.out.println("���һ��"+player1.getId()+":"+player1.getName());
		System.out.println("��Ҷ���"+player2.getId()+":"+player2.getName());
		//ϴ��
		System.out.println("----------------ϴ�Ƴɹ�----------------");
		pk.change(pk.poker);
		System.out.println("-----------------�� ��----------------");
		pk.deliver(pk.poker, player1, player2);
		System.out.println("-----------------�� Ϸ----------------");
		pk.compareGame(order, player1, player2);
	}
	
	
}
