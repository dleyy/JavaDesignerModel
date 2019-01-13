abstract class DChess {

	public abstract String getColor();

	public void display(ChessMan chess) {
		System.out.println(getColor() + "Æå×Ó,Î»ÓÚ" + chess.getX() + "," + chess.getY());
	}
}
