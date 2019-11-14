package com.my.demo;

public class AlarmDoor extends Door implements Alarm {

	@Override
	public void alarm() {
		// TODO Auto-generated method stub
		System.out.println("警报门有告警功能。");
		
	}

	@Override
	public void open() {
		System.out.println("警报门用钥匙、指纹、密码都可以开门。");
		
	}

}
