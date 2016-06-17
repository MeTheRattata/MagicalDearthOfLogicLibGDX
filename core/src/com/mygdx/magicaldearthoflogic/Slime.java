package com.mygdx.magicaldearthoflogic;

public class Slime extends Entity
{
	int size;
	
	public Slime(int newSize)
	{
		super(getSizeString(newSize) + "Slime", (int) (Math.random() * 672), (int) (Math.random() * 480), assignHealth(newSize));
		size = newSize;
		attackPower = size * -5;
		maxHealth = assignHealth(size);
		health = maxHealth;
	}
	
	public Slime(int newSize, int x, int y)
	{
		super(getSizeString(newSize) + "Slime", x, y, assignHealth(newSize));
		setPosition(x,y);
		size = newSize;
		attackPower = size * -5;
		maxHealth = assignHealth(size);
		health = maxHealth;
	}
	/**
	 * Returns a string based on the slime's size
	 * @return: size
	 */
	public static String getSizeString(int newSize)
	{
		if(newSize == 1)
			return "small";
		else if(newSize == 2)
			return "medium";
		else if(newSize == 3)
			return "large";
		return "";
	}
	/**
	 * Assign max health based on size
	 * @param size: the size of the slime
	 * @return: max health
	 */
	private static int assignHealth(int size)
	{
		if(size == 1)
			return 50;
		else if(size == 2)
			return 75;
		else if(size == 3)
			return 100;
		return -1;
	}
	/**
	 * Decrements health based on the damage taken, then returns a boolean of whether the Entity has died or not
	 * @param damage: damage dealt to the Entity, negative if damage, positive if healing
	 * @return: true if dead, false if not dead
	 */
	public boolean takeDamage(int damage)
	{
		health += damage;
		if(health > maxHealth)
			health = maxHealth;
		//Changes sprite when slime takes damage
		textureRegionX = (int) (((double) health / (double) maxHealth) * 4);
		if(damage < 0) //If is damage taken and not healing
		{
			damageFrames += 30;
			textureRegionX++;
			
		}
		if(health <= 0)
			return true;
		else
			return false;
	}
}