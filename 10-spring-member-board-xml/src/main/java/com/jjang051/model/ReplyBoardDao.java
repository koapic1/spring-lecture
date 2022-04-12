package com.jjang051.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ReplyBoardDao implements ReplyBoardService {

	@Autowired
	SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public int insertBoard(ReplyBoardDto replyBoardDto) {
		return 0;
	}

	@Override
	public int insertReplyBoard(ReplyBoardDto replyBoardDto) {
		return 0;
	}

	@Override
	public int updateBoard(ReplyBoardDto replyBoardDto) {
		return 0;
	}

	@Override
	public int updateReLevel(ReplyBoardDto replyBoardDto) {
		return 0;
	}

	@Override
	public int getMaxRegroup() {
		return 0;
	}

	@Override
	public List<ReplyBoardDto> getAllList(int start, int end, String search_select, String search_word) {
		return null;
	}

	@Override
	public List<ReplyBoardDto> getSearchAllList(String search_select, String search_word) {
		return null;
	}

	@Override
	public ReplyBoardDto getSelectOne(int no) {
		return null;
	}

	@Override
	public ReplyBoardDto getPrevSelect(int num) {
		return null;
	}

	@Override
	public ReplyBoardDto getNextSelect(int num) {
		return null;
	}

	@Override
	public int updateHit(int no) {
		return 0;
	}

	@Override
	public int deleteBoard(ReplyBoardDto replyBoardDto) {
		return 0;
	}

	@Override
	public int getTotal(String search_select, String search_word) {
		return 0;
	}
	
}
