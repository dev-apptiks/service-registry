package com.rgbiryani.registry.serviceregistry.feign;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import lombok.Data;

@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Post {
	private int id;
	private int userId;
	private String body;
	private String title;
}
