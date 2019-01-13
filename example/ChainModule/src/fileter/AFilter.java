package fileter;

public class AFilter implements Filter{

	@Override
	public Response doFilter(Request request, Response response, FileterChain chain) {
		Response newResponse = new Response();
		newResponse.setResponseStr(response.getResponseStr().replace("<>", ""));
		return newResponse;
	}

}
