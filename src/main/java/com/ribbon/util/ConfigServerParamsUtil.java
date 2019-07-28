package com.ribbon.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("/config")
public class ConfigServerParamsUtil {
	
	@Value("${from}") 
	private String from;
	
	@Value("${us}") 
	private String us;
	
	@GetMapping("/getParams")
	@ResponseBody public String returnFromConfigParams() { 
		return from; 
	} 
	
	@GetMapping("/getParamsFromUs")
	@ResponseBody public String returnFromConfigParamsUs() { 
		return us; 
	}
}
