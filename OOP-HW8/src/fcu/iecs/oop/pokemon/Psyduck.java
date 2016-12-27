package fcu.iecs.oop.pokemon;

public class Psyduck extends Pokemon{
	Psyduck(String nickname, PokemonType type,int cp)
	{
		super(nickname,type,cp);
	}

	public void attack()
	{
		System.out.println("\"Aqua Tail¡K\"");
	}
	

}
