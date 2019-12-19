package com.cgt.spring.services;

import com.cgt.spring.facade.IFortuneService;

public class PersonalFortune implements IFortuneService{

	@Override
	public String dailyFortune() {
		// TODO Auto-generated method stub
		return "Today is your lucky day!!!";
	}

}
