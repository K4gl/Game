import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Snake is there to eat frog.
 * 
 * @Kishan Thapa 22867601    
 * @V1.00 6/8/2017
 */
public class Snake extends Actor
{
    /**
     * Act - do whatever the Snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move (8);
        lookForFrog();
        turnAtEdge();
        randomTurn();
    }    
/** Snake eats the frog. When snake touches the frog the game is over
 * 
 */public void lookForFrog()
{
    if(isTouching(Frog.class))
    {
        removeTouching(Frog.class);
        Greenfoot.playSound("gameover.wav");
        Greenfoot.stop();
    }
}
public void turnAtEdge()
{
    /*if the Snake is at the edge it turns*/
    if (isAtEdge())
        {
            turn(35);
        }
    }
public void randomTurn()
{
        /*Random turns for snake to move around*/
        if (Greenfoot.getRandomNumber(100)<20)
        {
            turn(Greenfoot.getRandomNumber(90)-45);
        }
    }
}
