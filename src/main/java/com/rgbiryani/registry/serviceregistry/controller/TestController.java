package com.rgbiryani.registry.serviceregistry.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rgbiryani.registry.serviceregistry.feign.JsonPlaceHolderClient;
import com.rgbiryani.registry.serviceregistry.feign.Post;

@RestController
public class TestController {
	
	@Autowired
	private JsonPlaceHolderClient feignClient;

	@Value("${info.app.value}")
	private String val;
	
	@Value("${info.app.name}")
	private String name;
	
	
	@GetMapping("/app/value")
	public String getVal() {
		return val;
	}
	
	@GetMapping("/app/name")
	public String getName() {
		return name;
	}
	
	@GetMapping("/app/posts")
	public List<Post> getDataWithFeigh() {
		return feignClient.getPosts();
	}
}
