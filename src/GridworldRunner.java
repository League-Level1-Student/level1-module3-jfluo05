import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridworldRunner {
	
	public static void main(String[] args) {
		World world= new World();
		Bug bug= new Bug();
		Location location= new Location(0, 0);
		bug.setColor(Color.BLUE);
		world.add(location, bug);
		world.add(location, bug);
		bug.turn();
		bug.turn();
		for(int i=0;i<100; i++) {
			Flower flower= new Flower();
			world.add(location, flower);
		}
		world.show();
		
	}
}
