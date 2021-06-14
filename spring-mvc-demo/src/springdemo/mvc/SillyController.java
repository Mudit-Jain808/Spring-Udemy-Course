package springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class SillyController {
@RequestMapping("/showForm") //when we will run this, it will show error beacuse /showForm is already used in HelloFormController class
//To resolve this we will have to add Parent mapping using @RequestMapping below @Controller
public String displayTheForm() {
	return "silly";
}
}
