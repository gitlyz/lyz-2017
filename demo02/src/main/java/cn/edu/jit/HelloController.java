package cn.edu.jit;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloController {
	
	//后台往前台传参
	@RequestMapping()
	public String hello(ModelMap model){
		model.addAttribute("msg","This is hello world!");
		return "hello";
	}
	
	//前台往后台传参，为了保证发布安全，加requestparam参数。
	@RequestMapping("/form")
	public String showForm(@RequestParam("name")String name,ModelMap model) {
		model.addAttribute("name",name);
		return "showForm";
	}
}
