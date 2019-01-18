package com.web.blosom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.web.blosom.dao.FlowersDAOImpl;
import com.web.blosom.model.Flowers;

@Component
public class FlowerServiceImpl {
	
	@Autowired
	private FlowersDAOImpl flowersDAOImpl;

	public void addFlower(Flowers flower){
		flowersDAOImpl.saveFlower(flower);
	}
	
	public List<Flowers> listFlowers(){
		return flowersDAOImpl.listFlower();
	}
}
