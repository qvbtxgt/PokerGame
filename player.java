package com.imooc.poker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class player {                   //�����
	private String id;
	private String name;
	private List<String> mypoker;
	public player(){
		this.mypoker=new ArrayList<String>();
		Scanner scanner=new Scanner(System.in);
		System.out.println("���ID��");
		id=scanner.next();
		System.out.println("���������");
		name=scanner.next();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getMypoker() {
		return mypoker;
	}
	public void setMypoker(List<String> mypoker) {
		this.mypoker = mypoker;
	}
	
}
