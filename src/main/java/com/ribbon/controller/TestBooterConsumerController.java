package com.ribbon.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/")
public class TestBooterConsumerController {
	private final Logger log = LoggerFactory.getLogger(TestBooterConsumerController.class);
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private LoadBalancerClient loadBalancerClient;
	
	@RequestMapping("/test")
	public String test() {
//		return restTemplate.getForObject("http://test-booter:5757/test", String.class);
		return restTemplate.getForObject("http://test-booter/testBooter/test", String.class);
	}
}
