package app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@GetMapping("/")
	public String index(){
		return "index";
	}

	@PostMapping("/")
	public String indexPost(@RequestParam Long prefix, @RequestParam String prosecution, @RequestParam Long suffix, Model model){
		Long data = 0L;

		switch (prosecution){
			case "+":
				data = prefix + suffix;
				break;

			case "-":
				data = prefix - suffix;
				break;

			case "*":
				data = prefix * suffix;
				break;

			case "/":
				data = prefix / suffix;
				break;
		}

		model.addAttribute("data", data);
		model.addAttribute("prefix", prefix);
		model.addAttribute("suffix", suffix);
		model.addAttribute("prosecution", prosecution);

		return "index";
	}
}
