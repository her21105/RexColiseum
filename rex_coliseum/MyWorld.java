import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    private counter score;
    private counter level;
    
    private int velocidad_coche;
    private int num_adelantamientos;
    private int num_adelantamientos_nivel;
    private int num_rivales;
    private Velociraptor raptor;
    public Bullet derecha = new Bullet();
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        
        score = new counter("Score: ");
        raptor = new Velociraptor();
        addObject(raptor, 270,275);
        addObject(score, 300, 20);
        
        
        
        
    }
    public void act(){
        aniadir_rivales();
    }
    public int getRandomNumber(int start, int end){
        int normal = Greenfoot.getRandomNumber(end-start+1);
        return normal+start;
    }
    public void aumentar_puntuacion(int valor){
        score.add(valor);
    }
    public void disminuir_num_rivales(){
        num_rivales--;
    }
    public void aniadir_rivales(){
        if(num_rivales == 0){
            int lado = getRandomNumber(0,4);
            if (lado == 0){
                int numero = getRandomNumber(0,3);
                if(numero == 0){
                    addObject(new Bullet(), 30,35);
                    addObject(new Bullet(), 30,95);
                    addObject(new Bullet(), 30,155);
                    addObject(new Bullet(), 30,215);
                    addObject(new Bullet(), 30,275);
                }
                else if(numero == 1){
                    addObject(new Bullet(), 30,35);
                    addObject(new Bullet(), 30,155);
                    addObject(new Bullet(), 30,275);
                    addObject(new Bullet(), 30,395);
                    addObject(new Bullet(), 30,515);
                }
                else{
                    addObject(new Bullet(), 30,335);
                    addObject(new Bullet(), 30,395);
                    addObject(new Bullet(), 30,455);
                    addObject(new Bullet(), 30,515);
                    addObject(new Bullet(), 30,575); 
                }
            }
            else if(lado == 1){
                int numero = getRandomNumber(0,3);
                if(numero == 0){
                    addObject(new Bullet2(), 30,35);
                    addObject(new Bullet2(), 90,35);
                    addObject(new Bullet2(), 150,35);
                    addObject(new Bullet2(), 210,35);
                    addObject(new Bullet2(), 270,35);
                }
                else if(numero == 1){
                    addObject(new Bullet2(), 30,35);
                    addObject(new Bullet2(), 150,35);
                    addObject(new Bullet2(), 270,35);
                    addObject(new Bullet2(), 390,35);
                    addObject(new Bullet2(), 510,35);
                }
                else{
                    addObject(new Bullet2(), 330,35);
                    addObject(new Bullet2(), 390,35);
                    addObject(new Bullet2(), 450,35);
                    addObject(new Bullet2(), 510,35);
                    addObject(new Bullet2(), 570,35); 
                }
            }
            else if(lado == 2){
                int numero = getRandomNumber(0,3);
                if(numero == 0){
                    addObject(new Bullet3(), 570,35);
                    addObject(new Bullet3(), 570,95);
                    addObject(new Bullet3(), 570,155);
                    addObject(new Bullet3(), 570,215);
                    addObject(new Bullet3(), 570,275);
                }
                else if(numero == 1){
                    addObject(new Bullet3(), 570,35);
                    addObject(new Bullet3(), 570,155);
                    addObject(new Bullet3(), 570,275);
                    addObject(new Bullet3(), 570,395);
                    addObject(new Bullet3(), 570,515);
                }
                else{
                    addObject(new Bullet3(), 570,335);
                    addObject(new Bullet3(), 570,395);
                    addObject(new Bullet3(), 570,455);
                    addObject(new Bullet3(), 570,515);
                    addObject(new Bullet3(), 570,575); 
                }
            }
            else{
                int numero = getRandomNumber(0,3);
                if(numero == 0){
                    addObject(new Bullet4(), 30,575);
                    addObject(new Bullet4(), 90,575);
                    addObject(new Bullet4(), 150,575);
                    addObject(new Bullet4(), 210,575);
                    addObject(new Bullet4(), 270,575);
                }
                else if(numero == 1){
                    addObject(new Bullet4(), 30,575);
                    addObject(new Bullet4(), 150,575);
                    addObject(new Bullet4(), 270,575);
                    addObject(new Bullet4(), 390,575);
                    addObject(new Bullet4(), 510,575);
                }
                else{
                    addObject(new Bullet4(), 330,575);
                    addObject(new Bullet4(), 390,575);
                    addObject(new Bullet4(), 450,575);
                    addObject(new Bullet4(), 510,575);
                    addObject(new Bullet4(), 570,575); 
                }
                
            }
            
        }
        num_rivales = 5;
        
    }
    public Bullet getright()
    {
        return derecha;
    }
}
