package in.shubham.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController 
{
	@RequestMapping
	@ResponseBody
	public String test()
	{
		int a=20;
		int b=45;
		int c=89;
		return "this is just testing \n The Sum Of 3 Numbers is "+(a+b+c);
	}
}
