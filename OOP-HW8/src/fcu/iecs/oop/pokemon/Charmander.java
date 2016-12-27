package fcu.iecs.oop.pokemon;

public class Charmander extends Pokemon{
	
	Charmander(String nickname, PokemonType type,int cp)
	{
		super(nickname,type,cp);
	}
	
	public void attack()
	{
		System.out.println("\"Ember¡K\"");
	}
	

}