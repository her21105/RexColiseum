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
        //cambio de tamaño de imagen
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
    private int pause = 50;
    public void mover(){
        //movimiento con cordenadas
        if(Greenfoot.isKeyDown("s")){
            setLocation(getX(),getY()+60);
            //deterner todo el juego por 50
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
        //este codigo es para reconocer el cuadro de contacto de cada bala
        Bullet bullet1 = (Bullet)getOneIntersectingObject(Bullet.class);
        Bullet2 bullet2 = (Bullet2)getOneIntersectingObject(Bullet2.class);
        Bullet3 bullet3 = (Bullet3)getOneIntersectingObject(Bullet3.class);
        Bullet4 bullet4 = (Bullet4)getOneIntersectingObject(Bullet4.class);
        //si y solo si alguna de las balas hace contacto
        if(bullet1 != null || bullet2 != null || bullet3 != null || bullet4 != null){
            //eliminar de mundo
            
            World world = getWorld();
            world.addObject(new GameOver(), world.getWidth()/2, world.getHeight()/2);
            Greenfoot.playSound("ded2.mp3");
            getWorld().removeObject(this);
            Greenfoot.stop();
        }
        
    }
    
}
