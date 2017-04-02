package buttondevteam.minecraft.place;

import java.util.HashMap;

import org.bukkit.DyeColor;
import org.bukkit.Material;

public class Translator {
	
	
	public HashMap<Color, Data> dictionary(){
		HashMap<Color, Data> dictionary = new HashMap<Color, Data>();
		dictionary.put(new Color(255, 255, 255) , new Data(Material.WOOL, DyeColor.WHITE));//white
		dictionary.put(new Color(228, 228, 228) , new Data(Material.WOOL, DyeColor.SILVER));//lightgray
		dictionary.put(new Color(136, 136, 136) , new Data(Material.WOOL, DyeColor.GRAY));//gray
		dictionary.put(new Color( 34,  34,  34) , new Data(Material.WOOL, DyeColor.BLACK));//black
		dictionary.put(new Color(255, 167, 209) , new Data(Material.WOOL, DyeColor.PINK));//pink
		dictionary.put(new Color(229,   0,   0) , new Data(Material.WOOL, DyeColor.RED));//red
		dictionary.put(new Color(229, 149,   0) , new Data(Material.WOOL, DyeColor.ORANGE));//orange
		dictionary.put(new Color(160, 106,  66) , new Data(Material.WOOL, DyeColor.BROWN));//brown
		dictionary.put(new Color(229, 217,   0) , new Data(Material.WOOL, DyeColor.YELLOW));//yellow
		dictionary.put(new Color(148, 224,  68) , new Data(Material.WOOL, DyeColor.LIME));//lime
		dictionary.put(new Color(  2, 109,   1) , new Data(Material.WOOL, DyeColor.GREEN));//green
		dictionary.put(new Color(  0, 211, 221) , new Data(Material.WOOL, DyeColor.LIGHT_BLUE));//lightblue
		dictionary.put(new Color(  0, 131, 199) , new Data(Material.WOOL, DyeColor.CYAN));//cyan
		dictionary.put(new Color(  0,   0, 234) , new Data(Material.WOOL, DyeColor.BLUE));//blue
		dictionary.put(new Color(  0,   0, 227) , new Data(Material.WOOL, DyeColor.MAGENTA));//lightpurple
		dictionary.put(new Color(130,   0, 128) , new Data(Material.WOOL, DyeColor.PURPLE));//purple
			
		
		return dictionary;
	}
	class Data{
		public Material material;
		public DyeColor dyeColor;
		public Data(Material material, DyeColor dyeColor){
			this.material = material;
			this.dyeColor = dyeColor;
		}
	}
	class Color{
		public int r;
		int g;
		int b;
		public Color(int r, int g, int b){
			this.r = r;
			this.g = g;
			this.b = b;
		}
	}
}

