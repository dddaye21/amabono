package com.intensive.sk.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;


@Component
@Primary
@EnableAutoConfiguration
public class ApiController implements SwaggerResourcesProvider {

	@Override
	public List get() {
		
		
		List resources = new ArrayList<>();		
		resources.add(swaggerResource("amabono-member", "/member/v2/api-docs","2.0"));
		resources.add(swaggerResource("amabono-activity", "/activity/v2/api-docs","2.0"));
		resources.add(swaggerResource("amabono-activity-management", "/activity-management/v2/api-docs","2.0"));
		resources.add(swaggerResource("amabono-review", "/review/v2/api-docs","2.0"));
		return resources;
	}

	private SwaggerResource swaggerResource(String name, String location, String version) {
		    SwaggerResource swaggerResource = new SwaggerResource();
	        swaggerResource.setName(name);
	        swaggerResource.setLocation(location);
	        swaggerResource.setSwaggerVersion(version);
	        return swaggerResource;
	}
	
	
	

}
