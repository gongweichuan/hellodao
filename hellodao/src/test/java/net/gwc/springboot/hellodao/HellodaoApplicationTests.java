package net.gwc.springboot.hellodao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HellodaoApplicationTests {
	
	@Autowired
	MySvc mySvc;
	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void addTest()
	{
		int res=mySvc.add(100, 200);
		assert res==300;
	}
	
	@Test
	public void addTest2()
	{
		int res=mySvc.add(-1, 2);
		assert res==1;
		
	}

}
