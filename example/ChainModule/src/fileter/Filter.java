package fileter;

public interface Filter {
	Response doFilter(Request request, Response response, FileterChain chain);
}
