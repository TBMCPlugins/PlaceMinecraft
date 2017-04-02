package buttondevteam.minecraft.place;

import java.util.HashMap;

import org.bukkit.Material;

public class Translator {
	
	
	public HashMap<Color, Material> dictionary(){
		HashMap<Color, Material> dictionary = new HashMap<Color, Material>();
		dictionary.put(new Color(255, 255, 255) , Material.BAKED_POTATO);//white
		dictionary.put(new Color(228, 228, 228) , Material.BAKED_POTATO);//lightgray
		dictionary.put(new Color(136, 136, 136) , Material.BAKED_POTATO);//gray
		dictionary.put(new Color( 34,  34,  34) , Material.BAKED_POTATO);//black
		dictionary.put(new Color(255, 167, 209) , Material.BAKED_POTATO);//pink
		dictionary.put(new Color(229,   0,   0) , Material.BAKED_POTATO);//red
		dictionary.put(new Color(229, 149,   0) , Material.BAKED_POTATO);//orange
		dictionary.put(new Color(160, 106,  66) , Material.BAKED_POTATO);//brown
		dictionary.put(new Color(229, 217,   0) , Material.BAKED_POTATO);//yellow
		dictionary.put(new Color(148, 224,  68) , Material.BAKED_POTATO);//lime
		dictionary.put(new Color(  2, 109,   1) , Material.BAKED_POTATO);//green
		dictionary.put(new Color(  0, 211, 221) , Material.BAKED_POTATO);//lightblue
		dictionary.put(new Color(  0, 131, 199) , Material.BAKED_POTATO);//cyan
		dictionary.put(new Color(  0,   0, 234) , Material.BAKED_POTATO);//blue
		dictionary.put(new Color(  0,   0, 227) , Material.BAKED_POTATO);//lightpurple
		dictionary.put(new Color(130,   0, 128) , Material.BAKED_POTATO);//purple
		
		
		return dictionary;
	}
	class Color{
	   int r;
	   int g;
	   int b;
	   public Color(int r, int g, int b){
		   this.r = r;
		   this.g = g;
		   this.b = b;
	   }
   }
}

