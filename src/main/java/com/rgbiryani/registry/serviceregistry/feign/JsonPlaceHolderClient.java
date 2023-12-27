package com.rgbiryani.registry.serviceregistry.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "feign-client",url = "https://jsonplaceholder.typicode.com/")
public interface JsonPlaceHolderClient {
	 @RequestMapping(method = RequestMethod.GET, value = "/posts", produces="application/json")
	 List<Post> getPosts();
}
