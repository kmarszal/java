package agh.cs.lab2;

public enum MapDirection {
	North,
	South,
	East,
	West;
	
	public String toString()
	{
		switch(this){
		case North: return "Polnoc";
		case South: return "Poludnie";
		case East: return "Wschod";
		default: return "Zachod";
		}
	}
	
	public MapDirection Next()
	{
		switch(this){
		case North: return East;
		case South: return West;
		case East: return South;
		default: return North;
		}
	}
	
	public MapDirection Previous()
	{
		switch(this){
		case North: return West;
		case South: return East;
		case East: return North;
		default: return South;
		}
	}
}
