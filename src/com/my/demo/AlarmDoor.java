package com.my.demo;

public class AlarmDoor extends Door implements Alarm {

	@Override
	public void alarm() {
		// TODO Auto-generated method stub
		System.out.println("�������и澯���ܡ�");
		
	}

	@Override
	public void open() {
		System.out.println("��������Կ�ס�ָ�ơ����붼���Կ��š�");
		
	}

}
