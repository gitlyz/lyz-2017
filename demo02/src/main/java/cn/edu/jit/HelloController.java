package cn.edu.jit;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloController {
	
	//��̨��ǰ̨����
	@RequestMapping()
	public String hello(ModelMap model){
		model.addAttribute("msg","This is hello world!");
		return "hello";
	}
	
	//ǰ̨����̨���Σ�Ϊ�˱�֤������ȫ����requestparam������
	@RequestMapping("/form")
	public String showForm(@RequestParam("name")String name,ModelMap model) {
		model.addAttribute("name",name);
		return "showForm";
	}
}
