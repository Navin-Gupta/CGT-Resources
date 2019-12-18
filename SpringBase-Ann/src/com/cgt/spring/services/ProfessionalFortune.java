package com.cgt.spring.services;

import com.cgt.spring.facade.IFortuneService;

public class ProfessionalFortune implements IFortuneService{

	@Override
	public String dailyFortune() {
		// TODO Auto-generated method stub
		return "Boss is on leave today!!!";
	}

}
