import java.util.Hashtable;

public class ChessFactory {

	private static ChessFactory instance = new ChessFactory();

	private Hashtable<String, DChess> chesses;

	private ChessFactory() {
		chesses = new Hashtable<>();
		chesses.put("w", new WhiteChess());
		chesses.put("b", new BlackChess());
	}

	public static ChessFactory getInstance() {
		return instance;
	}

	public DChess getChess(String color) {
		return chesses.get(color);
	}
}
