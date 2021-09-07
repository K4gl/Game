import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Spider is the prey of Frog.
 * 
 * @Kishan Thapa 22867601
 * @V1.00 6/8/2017
 */
public class Spider extends Actor
{
    /**
     * Act - do whatever the Spider wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(5);
        turnAtEdge();
        randomTurn();
    }  
   public void turnAtEdge()
   {/* When the spiders touches the edge it turn at 35 angle*/
    if (isAtEdge())
    {
        turn(35);
    }
}
  public void randomTurn()
  {/* Spider does a random turn */
    if (Greenfoot.getRandomNumber(100)<=15)
    {
        turn(3);
    }
}
}
