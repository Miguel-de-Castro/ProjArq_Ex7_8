package com.bcopstein;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HistoryController {
	public static int count = 0;
	@GetMapping("/History")
	public String isAlive() {
		count++;
		return "History is here: "+count;
	}
}
