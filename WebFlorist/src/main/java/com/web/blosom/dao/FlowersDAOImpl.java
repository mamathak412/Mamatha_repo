package com.web.blosom.dao;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.web.blosom.entity.WBFLowers;
import com.web.blosom.model.Flowers;

@Component
public class FlowersDAOImpl {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void saveFlower(Flowers flowers){
		entityManager.persist(convertFlowerDomainToEntityModel(flowers));
	}

	@Transactional
	public List<Flowers> listFlower(){
		List<WBFLowers> wbFlowers = entityManager.createQuery("Select d from WBFLowers d", WBFLowers.class).getResultList();
		return convertEntityToDomain(wbFlowers);
	}
	
	private List<Flowers> convertEntityToDomain(List<WBFLowers> wbFlowers) {
		List<Flowers> flowers = new ArrayList<Flowers>();
		
		for(WBFLowers wbFlower : wbFlowers){
			Flowers flower= new Flowers();
			flower.setCostOfFlowers(wbFlower.getCostOfFlowers());
			flower.setDiscount(wbFlower.getDiscount());
			flower.setFlowerName(wbFlower.getFlowerName());
			flower.setNoOfFlowers(wbFlower.getNoOfFlowers());
			flowers.add(flower);
		}
		return flowers;
	}

	private WBFLowers convertFlowerDomainToEntityModel(Flowers flowers) {
		WBFLowers wbFlowers = new WBFLowers();
		wbFlowers.setCostOfFlowers(flowers.getCostOfFlowers());
		wbFlowers.setDiscount(flowers.getDiscount());
		wbFlowers.setFlowerName(flowers.getFlowerName());
		wbFlowers.setNoOfFlowers(flowers.getNoOfFlowers());
		
		File file = new File(flowers.getImagePath().getOriginalFilename());
		if(file.exists()){
			byte[] bFile = new byte[(int) file.length()]; 
			try{
				FileInputStream inputStream = new FileInputStream(file);
				inputStream.read(bFile);
				inputStream.close();
			}catch(Exception e){
				e.printStackTrace();
			}
			wbFlowers.setImage(bFile);
		}
		return wbFlowers;
	}

}
