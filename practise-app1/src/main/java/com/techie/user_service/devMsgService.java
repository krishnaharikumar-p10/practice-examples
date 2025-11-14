package com.techie.user_service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("dev")
@Service
public class devMsgService implements MsgService{

	@Override
	public String show() {
		return "dev-service";
		
	}
	
	
	
}
