package com.wangyj.learn.javadesign.decorator;

public abstract class Change extends TheGreatestSage{

	private TheGreatestSage sage;
	
	public Change(TheGreatestSage sage){
		this.sage = sage;
	}
	
	
}
