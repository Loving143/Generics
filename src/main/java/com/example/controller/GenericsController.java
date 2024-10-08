package com.example.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.GenericsService;

@RestController
public class GenericsController {
	@Autowired
	private GenericsService service;
	
	@GetMapping("/test")
	public void test() {
		String text = "This is the first Text";
		service.genericsUsingInterface(text);
	}
	
	@GetMapping("test/add")
	public void testAdd() {
		List<Integer> list =new ArrayList<>();
		list.add(67);
		list.add(909);
		HashMap<Integer, List<Integer>> map =new HashMap<>();
		map.put(90, list);
		service.genericsUsingInterface(list,map);
		
		
	}

}
