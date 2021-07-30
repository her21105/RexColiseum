import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet2 extends Actor
{
    public Bullet2()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight();
        int myNewWidth = (int)myImage.getWidth();
        myImage.scale(myNewWidth,myNewHeight);
        turn(90);
    }
    /**
     * Act - do whatever the Bullet2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int nuevo = 0;
    public void act()
    {
        mover_abajo();
        //comer();
        if( getY() >= getWorld().getHeight() - 1 ){
            MyWorld juego = (MyWorld) getWorld();
            juego.removeObject(this);
            juego.aumentar_puntuacion(10);
            juego.disminuir_num_rivales();
            nuevo++;
            if(nuevo >= 19){
                nuevo = 19;
            }
        }
        // Add your action code here.
    }
    private int pause=20;
    public void mover_abajo(){
        if(pause>0){
               pause--;
           }else{
               move(60);
               pause = 20-nuevo;
           }
    }
    public void comer(){
        Actor Velociraptor = getOneObjectAtOffset(0,0,Velociraptor.class);
        if(Velociraptor != null)
        {
            World world;
            world = getWorld();
            world.removeObject(Velociraptor);
        }
    }
    public boolean hitsShip(Velociraptor ship){
        return getObjectsInRange(getImage().getWidth()/2, Velociraptor.class).contains(ship);
    }
}
