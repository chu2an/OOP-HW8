package fcu.iecs.oop.pokemon;

public abstract class Pokemon implements Fightable
{
	private String nickName;
	private final PokemonType  type;
	private int cp;
	public Pokemon(String nickName,PokemonType type,int cp)
	{
		super();
		this.nickName=nickName;
		this.type=type;
		this.cp=cp;
	}
	public void setnickName(String nickName) /*nickName Mutator*/
	{
		this.nickName=nickName;
	}
	public String getnickName() /*nickName Accessor*/
	{
		return nickName;
	}
	public PokemonType getType() /*type Accessor*/
	{
		return type;
	}
	public void setCp(int cp) /*cp Mutator*/
	{
		this.cp=cp;
	}
	public int getCp() /*cp Accessor*/
	{
		return cp;
	}
	public abstract void attack();
}
