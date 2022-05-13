package com.texasmutual.tmobillpayds.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping(value="/test", produces = MediaType.APPLICATION_STREAM_JSON_VALUE )
	public String test(){
				return "<h1>Welcome to tmo-bill-pay-ds</h1>";
	}


}
