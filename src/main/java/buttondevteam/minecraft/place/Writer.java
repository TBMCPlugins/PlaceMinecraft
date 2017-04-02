package buttondevteam.minecraft.place;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;

public class Writer {
	final int maxSize = 20;
	public Cuboid cube;
	
	public class Cuboid{
		private int size;
		public int xlen;
		public int ylen; 
		public int zlen;
		
		public Cuboid(){
			size = 4;
			xlen = size;
			ylen = size;
			zlen = size;
		}
		public Cuboid(int cubeSize){
			size = cubeSize;
			xlen = size;
			ylen = size;
			zlen = size;
		}
		public int size(){
			return size;
		}
		public int size(int newSize){
			this.size = newSize;
			xlen = size;
			ylen = size;
			zlen = size;
			return size;
		}
	}

	public Writer(){
		this.cube = new Cuboid();
	}
	public Writer(int cubeSize){
		this.cube = new Cuboid(cubeSize);
	}
	public void hardWrite(Location location, Material material){
		writeCuboid(
				location.getBlockX() - (location.getBlockX() % cube.xlen),
				location.getBlockY(),
				location.getBlockZ() - (location.getBlockZ() % cube.zlen),
				location.getWorld(),
				material);
		
				
	}
	public void writeCuboid(int x, int y, int z, World world, Material material){
		for(int i = 0; i < cube.xlen; i++){
			for (int j = 0; j < cube.ylen; j++){
				for(int k = 0; k < cube.zlen; k++){
					world.getBlockAt(x + i, y + j, z + k).setType(material);
				}
			}
		}
	}

}
