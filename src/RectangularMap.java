package agh.cs.lab2;

import java.util.LinkedList;

public class RectangularMap implements IWorldMap {
	public int width;
	public int height;
	public LinkedList<Car> carlist;
	
	public RectangularMap(int width, int height)
	{
		this.height = height;
		this.width = width;
		this.carlist = new LinkedList<>();
	}
	
	@Override
	public boolean canMoveTo(Position position) {
		if (position.larger(new Position(0,0)) && position.smaller(new Position(width,height)) && !this.isOccupied(position))
		return true;
		return false;
	}

	@Override
	public boolean add(Car car) {
		if(carlist.add(car))
		return true;
		return false;
	}

	@Override
	public void run(MoveDirection[] directions) {
		for(int icars=0, idirs=0; idirs<directions.length;++icars,++idirs)
		{
			if(icars>=carlist.size())
			{
				icars=0;
			}
			carlist.get(icars).move(directions[idirs]);
		}
	}

	@Override
	public boolean isOccupied(Position position) {
		for(Car c : carlist)
		{
			if(position.equals(c.getPosition()))
				return true;
		}
		return false;
	}

	@Override
	public Object objectAt(Position position) {
		for(Car c : carlist)
		{
			if(c.getPosition().equals(position))
				return c;
		}
		return null;
	}
	
	public String toString()
	{
		return new MapVisualizer().dump(this, new Position(0,0), new Position(width,height));
	}

}
