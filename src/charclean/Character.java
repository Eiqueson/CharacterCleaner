package charclean;


import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Character implements CharacterEntity{
	
	public static final int CHARACTER_WIDTH = 48;
	public static final int CHARACTER_HEIGHT = 48;
	private float x;
	private float y;
	private Image image;
	private float speed;
	private char imgname;
	
	public Character(float x, float y, char imgname, float speed) throws SlickException {
		this.x = x;
		this.y = y;
		this.speed = speed;
		this.imgname = imgname;
		image = new Image("res/"+imgname+".png");
	}

	public void render() {
		image.draw(x - CHARACTER_WIDTH/2, y - CHARACTER_HEIGHT/2);
		
	}

	public void update() {
		if (Main.isStarted == false)
		{
			y += 0;
		}
		else
		{
			y += speed;
		}
		
	}
	
	public boolean isCharPressed() {
	    if (imgname == 'A')
	    	{return Main.isAPress;}
	    else if (imgname == 'B')
	    	{return Main.isBPress;}
	    else if (imgname == 'C')
	    	{return Main.isCPress;}
	    else if (imgname == 'D')
	    	{return Main.isDPress;}
	    else if (imgname == 'E')
	    	{return Main.isEPress;}
	    else if (imgname == 'F')
	    	{return Main.isFPress;}
	    else if (imgname == 'G')
	    	{return Main.isGPress;}
	    else if (imgname == 'H')
	    	{return Main.isHPress;}
	    else if (imgname == 'I')
	    	{return Main.isIPress;}
	    else if (imgname == 'J')
    		{return Main.isJPress;}
	    else if (imgname == 'K')
    		{return Main.isKPress;}
  	 	else if (imgname == 'L')
  	 		{return Main.isLPress;}
  	 	else if (imgname == 'M')
  	 		{return Main.isMPress;}
  	 	else if (imgname == 'N')
	 		{return Main.isNPress;}
  	 	else if (imgname == 'O')
  	 		{return Main.isOPress;}
  	 	else if (imgname == 'P')
  	 		{return Main.isPPress;}
  	 	else if (imgname == 'Q')
  	 		{return Main.isQPress;}
  	 	else if (imgname == 'R')
  	 		{return Main.isRPress;}
  	 	else if (imgname == 'S')
  	 		{return Main.isSPress;}
  	 	else if (imgname == 'T')
  	 		{return Main.isTPress;}
  	 	else if (imgname == 'U')
  	 		{return Main.isUPress;}
  	 	else if (imgname == 'V')
  	 		{return Main.isVPress;}
  	 	else if (imgname == 'W')
	 		{return Main.isWPress;}
  	 	else if (imgname == 'X')
	 		{return Main.isXPress;}
  	 	else if (imgname == 'Y')
	 		{return Main.isYPress;}
	    else
	    	{return Main.isZPress;}
	  }
	
	public char getName() {
		return imgname;
	}
	 
	public boolean isDeletable() {
	    return isCharPressed();
	}

	public boolean isInWindow() {
		return (y > 0 && y < Main.GAME_HEIGHT);
	}

	@Override
	public float YPosition() {
		return y;
	}

	@Override
	public float XPosition() {
		return x;
	}

}