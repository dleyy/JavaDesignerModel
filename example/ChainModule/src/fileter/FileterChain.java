package fileter;

import java.util.ArrayList;
import java.util.List;

/**
 * ÔğÈÎÁ´
 */
public class FileterChain implements Filter {

	private List<Filter> filters = new ArrayList<Filter>();

	private Response resultResponse;

	public FileterChain addFilter(Filter filter) {
		filters.add(filter);
		return this;
	}

	@Override
	public Response doFilter(Request request, Response response, FileterChain chain) {
		resultResponse = response;
		for (int i = 0; i < filters.size(); i++) {
			resultResponse = filters.get(i).doFilter(request, resultResponse, chain);
		}
		System.out.println(resultResponse.getResponseStr());
		return resultResponse;
	}

}
