package fr.devsncf.quest01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {
	
	@GetMapping("/Doctor/1")
	@ResponseBody
	public String index1() {
		return "William Hartnell";
	}
	
	@GetMapping("/Doctor/10")
	@ResponseBody
	public String index10() {
		return "David Tennant";
	}
	
	@GetMapping("/Doctor/13")
	@ResponseBody
	public String index13() {
		return "Jodie Whittaker";
	}
}
