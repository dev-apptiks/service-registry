package com.rgbiryani.registry.serviceregistry;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Endpoint(id="rg-services")
@Component
public class SREndpoint {
	
	@ReadOperation
	public String service() {
		return "LOCATION, PAYMENT, ORDER";
	}

}
