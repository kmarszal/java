package agh.cs.lab2;

public class OptionsParser {

	public MoveDirection[] parse(String Movesarr[]) {
		int arrsize = 0;
		for (int i = 0; i < Movesarr.length; ++i) {
			if (Movesarr[i].equals("f") || Movesarr[i].equals("forward") || Movesarr[i].equals("b") || Movesarr[i].equals("backward") || Movesarr[i].equals("r") || Movesarr[i].equals("right") || Movesarr[i].equals("l") || Movesarr[i].equals("left"))
			{
				++arrsize;
			}
		}
		MoveDirection[] moves = new MoveDirection[arrsize];
		arrsize = 0;
		for (int i = 0; i < Movesarr.length; ++i) {
			switch (Movesarr[i]) {
			case "f":
			case "forward":
			{
				moves[arrsize] = MoveDirection.Forward;
				++arrsize;
				break;
			}
			case "b":
			case "backward":
			{
				moves[arrsize] = MoveDirection.Backward;
				++arrsize;
				break;
			}
			case "r":
			case "right":
			{
				moves[arrsize] = MoveDirection.Right;
				++arrsize;
				break;
			}
			case "l":
			case "left":
			{
				moves[arrsize] = MoveDirection.Left;
				++arrsize;
				break;
			}
			default:
			}
		}
		return moves;
	}
}
