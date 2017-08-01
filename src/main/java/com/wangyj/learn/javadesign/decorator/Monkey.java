package com.wangyj.learn.javadesign.decorator;

public class Monkey extends TheGreatestSage{

	@Override
	public void move() {
		System.out.println(super.desc + "monkey move");
	}
	
	public String desc = "mokey, ";

}
