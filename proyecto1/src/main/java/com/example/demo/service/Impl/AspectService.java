package com.example.demo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AspectPoint;
import com.example.demo.model.Usuario;
import com.example.demo.repository.PointCut;

@Service
public class AspectService {
	
	@Autowired
	private PointCut pointCut;
	
	public AspectPoint findPointById(Long id) {
		
		return pointCut.findById(id).get();
		
	}
	
	public List<AspectPoint> listAllAspectPoint() {

		return pointCut.findAll();
	}

}
