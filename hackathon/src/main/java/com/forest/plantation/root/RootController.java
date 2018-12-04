package com.forest.plantation.root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {
	
	@Autowired
	RootService RootService;

	@RequestMapping(method = RequestMethod.GET, value = "/")
	public String rootPage() {
		return RootService.getRootPage();
	}
}
