abstract class DChess {

	public abstract String getColor();

	public void display(ChessMan chess) {
		System.out.println(getColor() + "����,λ��" + chess.getX() + "," + chess.getY());
	}
}
