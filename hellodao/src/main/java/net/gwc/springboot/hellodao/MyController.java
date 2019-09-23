package net.gwc.springboot.hellodao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class MyController {
	
	@Autowired
	MySvc mySvc;
	
	@RequestMapping("/add")
	public String add(int a,int b)
	{
		return mySvc.add(a, b)+"";	
	}
}
