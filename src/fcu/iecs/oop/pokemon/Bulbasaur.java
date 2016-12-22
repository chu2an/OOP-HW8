package fcu.iecs.oop.pokemon;

public class Bulbasaur extends Pokemon
{

	public Bulbasaur(String nickName, PokemonType type, int cp)
	{
		super(nickName, type, cp);
	}
	public void attack()
	{
		System.out.println("Tackle...");
	}
}
