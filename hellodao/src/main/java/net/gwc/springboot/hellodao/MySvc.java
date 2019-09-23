package net.gwc.springboot.hellodao;

import org.springframework.stereotype.Service;

@Service
public class MySvc {

	public int add(int a,int b)
	{
		return a+b;
	}
}
