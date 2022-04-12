package com.jjang051.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jjang051.model.BoardDto;
import com.jjang051.model.DataDto02;

@Configuration
public class RootAppContext {
	
	// Scan 사용하지 않고 직접 등록하는 방법
	
	@Bean
	public DataDto02 dataDto02() {
		return new DataDto02();
	}
	
	@Bean
	public BoardDto boardDto() {
		return new BoardDto();
	}
}
