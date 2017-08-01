package com.wangyj.learn.javadesign.decorator;

import org.junit.Test;

public class TestDecorator {

	@Test
	public void testMonkey() {
		TheGreatestSage monkey = new Monkey();
		TheGreatestSage fish = new Fish(monkey);
		TheGreatestSage bird = new Bird(fish);
		bird.move();
		
	}
	
	public static void main(String[] args) {
		
		TheGreatestSage monkey = new Monkey();
		TheGreatestSage fish = new Fish(monkey);
		TheGreatestSage bird = new Bird(fish);
		bird.move();
	}
}
