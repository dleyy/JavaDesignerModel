
public class Human {
	private String heard;
	private String body;
	private String foot;

	public String getHeard() {
		return heard;
	}

	public void setHeard(String heard) {
		this.heard = heard;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getFoot() {
		return foot;
	}

	public void setFoot(String foot) {
		this.foot = foot;
	}

	@Override
	public String toString() {
		return "Human [heard=" + heard + ", body=" + body + ", foot=" + foot + "]";
	}

}
