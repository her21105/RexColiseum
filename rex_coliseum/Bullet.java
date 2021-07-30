import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    public Bullet()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight();
        int myNewWidth = (int)myImage.getWidth();
        myImage.scale(myNewWidth,myNewHeight);
    }
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int nuevo = 0;
    public void act()
    {
        
        
        //comer();
        Adelante_derecha();
        
        //eliminar al tocar la orilla
        if( getX() >= getWorld().getWidth() - 1 ){
            
            MyWorld juego = (MyWorld) getWorld();
            juego.removeObject(this);
            juego.aumentar_puntuacion(10);
            juego.disminuir_num_rivales();
            //juego.aumentar_num_adelantamientos();
            // sistema de aumento de velocidad
            nuevo++;
            
            if(nuevo >= 19){
                nuevo = 19;
            }
        }
    }
    private int pause = 20;
    public void Adelante_derecha(){
            //movimiento
           if(pause>0){
               pause--;
           }else{
               move(60);
               pause = 20-nuevo;
           }
           
        //setLocation(getX()+60,getY());
            
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
