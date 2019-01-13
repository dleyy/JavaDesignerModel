
public class FlyClient {
	public static void main(String[] args) {

		WhiteChess whiteChess = (WhiteChess) ChessFactory.getInstance().getChess("w");
		WhiteChess whiteChess1 = (WhiteChess) ChessFactory.getInstance().getChess("w");

		BlackChess blackChess = (BlackChess) ChessFactory.getInstance().getChess("b");
		BlackChess blackChess1 = (BlackChess) ChessFactory.getInstance().getChess("b");

		System.out.println("whiteChess equals whiteChess1 ? " + whiteChess.equals(whiteChess1));
		System.out.println("blackChess equals blackChess1 ? " + blackChess.equals(blackChess1));

		whiteChess.display(new ChessMan(1, 1));
		blackChess.display(new ChessMan(2, 2));
		
	}
}
