package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	@GetMapping("hello")
	public String hello(Model model) {
		model.addAttribute("data", "spring!!");
		return "hello"; // resources/templates 의 hello.html으로 접근 (Thymeleaf 템플릿 엔진이 처리)
	}
}
