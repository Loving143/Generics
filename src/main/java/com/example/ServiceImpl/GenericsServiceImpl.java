package com.example.ServiceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.service.GenericsService;

@Service
public class GenericsServiceImpl implements GenericsService<Object,Object>{

	@Override
	public void genericsUsingInterface(String text) { 
		System.out.println("The text I am using is"+text); 
	}

	@Override
	public void genericsUsingInterface(Object t, Object u) {
		System.out.println(t);
//		U tt=u;
		System.out.println(u);
	}

	@Override
	public void genericsUsingInterface(Object text) {
		
	}}
