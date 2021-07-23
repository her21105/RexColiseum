import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Velociraptor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Velociraptor extends Actor
{
    public Velociraptor()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight();
        int myNewWidth = (int)myImage.getWidth();
        myImage.scale(myNewWidth,myNewHeight);
    }
    /**
     * Act - do whatever the Velociraptor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        mover();
        morir();
    }
    public void mover(){
        
        if(Greenfoot.isKeyDown("s")){
            setLocation(getX(),getY()+60);
            Greenfoot.delay(50);
            
        }
        if(Greenfoot.isKeyDown("w")){
           setLocation(getX(),getY()-60); 
           Greenfoot.delay(50);
        }
        if(Greenfoot.isKeyDown("a")){
            setLocation(getX()-60,getY());
            Greenfoot.delay(50);
        }
        if(Greenfoot.isKeyDown("d")){
            setLocation(getX()+60,getY());
            Greenfoot.delay(50);
        }
    }
    public void morir(){
        Bullet bullet1 = (Bullet)getOneIntersectingObject(Bullet.class);
        Bullet2 bullet2 = (Bullet2)getOneIntersectingObject(Bullet2.class);
        Bullet3 bullet3 = (Bullet3)getOneIntersectingObject(Bullet3.class);
        Bullet4 bullet4 = (Bullet4)getOneIntersectingObject(Bullet4.class);
        if(bullet1 != null || bullet2 != null || bullet3 != null || bullet4 != null){
            getWorld().removeObject(this);
        }
        
    }
    
}
