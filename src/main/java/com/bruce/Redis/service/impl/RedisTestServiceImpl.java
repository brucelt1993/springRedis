package com.bruce.Redis.service.impl;

import org.springframework.stereotype.Service;

import com.bruce.Redis.service.RedisTestService;
@Service
public class RedisTestServiceImpl implements RedisTestService{

	@Override
	public String getTimestamp(String param) {
		Long timestamp = System.currentTimeMillis();
        return timestamp.toString();
	}

}
