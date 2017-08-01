package com.wangyj.learn.javadesign.decorator;

public class Fish extends Change{

	public Fish(TheGreatestSage sage) {
		super(sage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		System.out.println(super.desc + "move fish");
		
	}

}
