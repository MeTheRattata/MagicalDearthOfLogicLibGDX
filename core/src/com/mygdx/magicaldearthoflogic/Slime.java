package com.mygdx.magicaldearthoflogic;

public class Slime extends Entity
{
	int size;
	
	public Slime()
	{
		super("slimeSmall");
		size = (int)(Math.random()*3) + 1;
		updateImage("slime" + getSizeString(size));
		attackPower = size * -5;
	}
	/**
	 * Returns a string based on the slime's size
	 * @return: size
	 */
	public static String getSizeString(int newSize)
	{
		if(newSize == 1)
			return "Small";
		else if(newSize == 2)
			return "Medium";
		else if(newSize == 3)
			return "Large";
		return "";
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