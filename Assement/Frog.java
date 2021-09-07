import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class defines a frog. Frog live on land and river.
 * 
 * @Kishan Thapa 22867601
 * @V1.00 6/8/2017
 */
public class Frog extends Actor
{
    private int spidersEaten;
    public Frog()
    {
        spidersEaten=0;
    }
    /**
     * Act - do whatever the Frog wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move (5);
        checkKeyPress();
        lookForSpider();
        
    }    
public void checkKeyPress()
{
/*This help the frog to move to left side by pressing "A". 
 * Right side by pressing "D".
 * Goes in upward direction by pressing "up"key
 * Goes in downward direction by pressing "down"key
 */
if (Greenfoot.isKeyDown("a"))
 {
       turn (-4);
    }

if (Greenfoot.isKeyDown("d"))
{
    turn (4);
}
if (Greenfoot.isKeyDown("down"))
{
    setLocation(getX(),getY()+5);
}
if (Greenfoot.isKeyDown("up"))
{
    setLocation(getX(),getY()-5);
}
}
public void lookForSpider()
{
    /* Frogs moves on the riverbank and eats spider.
    *When the Frog touches 10 spiders then the game stops.
     */
    if(isTouching(Spider.class))
    {
        removeTouching(Spider.class);
        Greenfoot.playSound("gecko.wav");
        
        spidersEaten=spidersEaten+1;
        if(spidersEaten==10)
        {
            Greenfoot.playSound("fanfare.wav");
            Greenfoot.stop();
        }
            
}
}
}
