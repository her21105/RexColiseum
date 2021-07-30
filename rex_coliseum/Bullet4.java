import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet4 extends Actor
{
    public Bullet4()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight();
        int myNewWidth = (int)myImage.getWidth();
        myImage.scale(myNewWidth,myNewHeight);
        turn(270);
    }
    /**
     * Act - do whatever the Bullet4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int nuevo;
    public void act()
    {
        mover_arriba();
        //comer();
        if( getY() <=35 ){
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
    private int pause = 20;
    public void mover_arriba(){
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
}
