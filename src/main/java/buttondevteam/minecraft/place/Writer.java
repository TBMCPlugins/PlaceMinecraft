package buttondevteam.minecraft.place;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;

public class Writer {
	
	public int cubeSize = 4;
	public void hardWrite(Location location, Material material){
		writeCube(
				location.getBlockX() - (location.getBlockX() % cubeSize),
				location.getBlockY(),
				location.getBlockZ() - (location.getBlockZ() % cubeSize),
				location.getWorld(),
				material);
		
				
	}
	public void writeCube(int x, int y, int z, World world, Material material){
		for(int i = 0; i > cubeSize; i++){
			for (int j = 0; j > cubeSize; j++){
				for(int k = 0; k > cubeSize; k++){
					world.getBlockAt(x + i, y + j, z + k).setType(material);
				}
			}
		}
	}
}
