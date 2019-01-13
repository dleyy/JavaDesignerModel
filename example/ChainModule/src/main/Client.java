package main;

import fileter.AFilter;
import fileter.BFilter;
import fileter.FileterChain;
import fileter.Request;
import fileter.Response;

public class Client {
	public static void main(String[] args) {
		String responseStr = "444<>33";
		Response response = new Response();
		response.setResponseStr(responseStr);
		
		FileterChain fc = new FileterChain()
				.addFilter(new AFilter())
				.addFilter(new BFilter());
		fc.doFilter(new Request(), response, fc);
	}
}
