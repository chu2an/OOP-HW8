package fcu.iecs.oop.pokemon;

public class Main
{
	  public static void main(String[] args)
	  {
		  Pokemon pkm1 = new Bulbasaur("I am Bulbasaur", PokemonType.GRASS, 123);
		  Pokemon pkm2 = new Charmander("I am Charmander", PokemonType.FIRE, 456);
		  Pokemon pkm3 = new Psyduck("I am Psyduck", PokemonType.WATER, 89);
		  GYM gym = new GYM();
		  gym.fight(pkm1);
		  gym.fight(pkm2);
		  gym.fight(pkm3);
	  }
}
