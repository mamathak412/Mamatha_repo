package com.web.blosom.ws.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.web.blosom.model.Flowers;
import com.web.blosom.rest.model.FlowersWs;
import com.web.blosom.service.FlowerServiceImpl;

@Path("/webflorist/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class FlowersRestServiceImpl {

	@Autowired
	private FlowerServiceImpl flowerService;

	@POST
	@Path("/add")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<FlowersWs> addFlower(FlowersWs flowerWs) {
		flowerService.addFlower(convertWsFlowerToDomain(flowerWs));
		return new ResponseEntity<FlowersWs>(flowerWs, HttpStatus.OK);
	}

	private Flowers convertWsFlowerToDomain(FlowersWs flowersWs) {
		Flowers flowers = new Flowers();
		flowers.setCostOfFlowers(flowersWs.getCostOfFlowers());
		flowers.setDiscount(flowersWs.getDiscount());
		flowers.setFlowerId(flowersWs.getFlowerId());
		flowers.setFlowerName(flowersWs.getFlowerName());
		flowers.setNoOfFlowers(flowersWs.getNoOfFlowers());
		flowers.setImagePath(flowersWs.getImage());
		return flowers;
	}

	@GET
	@Path("/list")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<List<FlowersWs>> listFlower() {
		List<Flowers> flowers = flowerService.listFlowers();
		return new ResponseEntity<List<FlowersWs>>(convertDomainToWsList(flowers), HttpStatus.OK);
	}

	private List<FlowersWs> convertDomainToWsList(List<Flowers> flowers) {
		List<FlowersWs> flowersWs = new ArrayList<FlowersWs>();

		for (Flowers flower : flowers) {
			FlowersWs wsflower = new FlowersWs();
			wsflower.setCostOfFlowers(flower.getCostOfFlowers());
			wsflower.setDiscount(flower.getDiscount());
			wsflower.setFlowerId(flower.getFlowerId());
			wsflower.setFlowerName(flower.getFlowerName());
			wsflower.setNoOfFlowers(flower.getNoOfFlowers());
			flowersWs.add(wsflower);
		}
		return flowersWs;
	}

}
