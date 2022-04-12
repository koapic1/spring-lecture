package com.jjang051.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jjang051.model.TodoDao;
import com.jjang051.model.TodoDto;

@Controller
public class TodoController {
	
	@Autowired
	TodoDao todoDao;
	
	@Autowired
	TodoDto todoDto;
	
	//json
	@RequestMapping("/Insert.do")
	@ResponseBody    //JSON으로 데이터 넘길때
	public Map<String,Object> insertTodo(@RequestBody TodoDto todoDto) {
		System.out.println("todoDto===="+todoDto);
		Map<String,Object> hashMap = new HashMap<>();
		List<TodoDto> todoList = null;
		String pickedDate = todoDto.getPickedDate();
		int result = todoDao.insertTodo(todoDto);
		if(result > 0) {
			todoList = todoDao.getAllList(pickedDate);
			hashMap.put("todoList", todoList);
		}
		return hashMap;
	}
	
	// 시르트로 JSON리턴 해주기...
	@RequestMapping("/InsertList.do")
	@ResponseBody    //JSON으로 데이터 넘길때
	public List<TodoDto> insertTodoList(@RequestBody TodoDto todoDto) {
		System.out.println("todoDto===="+todoDto);
		Map<String,Object> hashMap = new HashMap<>();
		List<TodoDto> todoList = null;
		String pickedDate = todoDto.getPickedDate();
		int result = todoDao.insertTodo(todoDto);
		if(result > 0) {
			todoList = todoDao.getAllList(pickedDate);
			hashMap.put("todoList", todoList);
		}
		return todoList;
	}
	
	// 날짜에 해당되는 데이터 받기...
	@RequestMapping("/List.do")
	@ResponseBody
	public Map<String,Object> getTodoList(@RequestBody TodoDto todoDto) {
		Map<String,Object> hashMap= new HashMap<>();
		String pickedDate = todoDto.getPickedDate();
		// 해당되는 날짜의 데이터를 뽑아서 던져주면 된다. 20220308
		List<TodoDto> todoList = todoDao.getAllList(pickedDate);
		hashMap.put("todoList", todoList);
		return hashMap;
	}
	
	
	// 삭제....
	@RequestMapping("/Delete.do")
	@ResponseBody
	public Map<String,Object> deleteTodo(@RequestBody TodoDto todoDto) {
		Map<String,Object> hashMap= new HashMap<>();
		int no = todoDto.getNo();
		int result = todoDao.deleteTodo(no);
		hashMap.put("result", result);  //{result:1}
		return hashMap;
	}
	
	@RequestMapping("/Update.do")
	@ResponseBody
	public Map<String,Object> updateTodo(@RequestBody TodoDto todoDto) {
		Map<String,Object> hashMap= new HashMap<>();
		//int no = todoDto.getNo();
		int result = todoDao.updateTodo(todoDto);
		hashMap.put("result", result);  //{result:1}
		return hashMap;
	}
}











