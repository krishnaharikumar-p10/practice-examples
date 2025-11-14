package com.techie.user_service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service
public class prodMsgService implements MsgService {

	@Override
	public String show() {
		return "prod-service";
	}

}
