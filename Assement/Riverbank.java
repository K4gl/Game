import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Riverbank has the size of 800x600 cells.
 * 
 * @Kishan Thapa 22867601
 * @V1.00
 */
public class Riverbank extends World
{

    /**
     * Constructor for objects of class Riverbank.
     * 
     */
    public Riverbank()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        location();
        prepare();
    }


    public void location ()
    {/* It will set the location for Frog, Spider and Snake in the River bank*/
        Frog frog = new Frog();
        addObject(frog, 231, 203);
        Spider spider = new Spider();
        addObject(spider, 445, 137);
        Spider spider2 = new Spider();
        addObject(spider2, 454, 369);
        Spider spider3 = new Spider();
        addObject(spider3, 368, 466);
        Spider spider4 = new Spider();
        addObject(spider4, 129, 488);
        Spider spider5 = new Spider();
        addObject(spider5, 254, 388);
        Spider spider6 = new Spider();
        addObject(spider6, 106, 334);
        Spider spider7 = new Spider();
        addObject(spider7, 338, 112);
        Spider spider8 = new Spider();
        addObject(spider8, 150, 94);
        Spider spider9 = new Spider();
        addObject(spider9, 373, 240);
        Spider spider10 = new Spider();
        addObject(spider10, 509, 55);
        Spider spider11 = new Spider();
        addObject(spider11, 609, 385);
        Spider spider12 = new Spider();
        addObject(spider12, 705, 455);
        Spider spider13 = new Spider();
        addObject(spider13, 705, 555);
        Spider spider14 = new Spider();
        addObject(spider14, 209,658);
        Spider spider15 = new Spider();
        addObject(spider15, 659, 559);
        Snake snake = new Snake();
        addObject(snake, 334, 65);
        Snake snake2 = new Snake();
        addObject(snake2, 481, 481);
        Snake snake3 = new Snake();
        addObject(snake3, 79, 270);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
