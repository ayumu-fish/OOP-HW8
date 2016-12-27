package fcu.iecs.oop.pokemon;

public abstract class Pokemon implements Fightable{
	public String nickname;
	public final PokemonType type;
	public int cp;
	
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	public PokemonType getType() {
		return type;
	}
	public Pokemon(String nickname, PokemonType type, int cp) {
		this.nickname = nickname;
		this.type = type;
		this.cp = cp;
	}
}
