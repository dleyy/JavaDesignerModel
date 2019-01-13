package fileter;

public class BFilter implements Filter {

	@Override
	public Response doFilter(Request request, Response response, FileterChain chain) {
		Response newResponse = new Response();
		newResponse.setResponseStr(response.getResponseStr().replace("33", "55"));
		return newResponse;
	}

}
