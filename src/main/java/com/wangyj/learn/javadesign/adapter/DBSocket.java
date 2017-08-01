package com.wangyj.learn.javadesign.adapter;

/**
 * 适配器模式，分为国标三箱接口和db两箱接口
 * 将两箱接口转化为三箱接口
 * @author wangyj
 * 源(Adapee)角色：现在需要适配的接口
 *
 */
public class DBSocket implements DBSocketInterface {

	@Override
	public void powerWithTwoFlat() {
		System.out.println("使用两箱接口");
	}

}
