package test;

import java.util.Random;

public class KinematicWander {
   private Character character;
   private float maxSpeed;
   private float maxRotation;
   private KinematicOutput steering;

    public KinematicWander() {
    }

    public KinematicWander(Character character, float maxSpeed, float maxRotation) {
        this.character = character;
        this.maxSpeed = maxSpeed;
        this.maxRotation = maxRotation;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public float getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(float maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public float getMaxRotation() {
        return maxRotation;
    }

    public void setMaxRotation(float maxRotation) {
        this.maxRotation = maxRotation;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "KinematicWander{" + "character=" + character + ", maxSpeed=" + maxSpeed + ", maxRotation=" + maxRotation + ", steering=" + steering + '}';
    }
     
    public static float randomBinomial(){
        Random r = new Random();
        return r.nextFloat() - r.nextFloat();
    }
    
    public KinematicOutput generateKinematicSteeringOutput(){
        Vector2D ori = new Vector2D();
        ori.setX((float) Math.sin(character.getOrientation()));
        ori.setZ((float) Math.cos(character.getOrientation()));
        
        Vector2D velocity = new Vector2D();
        velocity = Vector2D.mulConstant(ori, maxSpeed);
        float rotation = randomBinomial()*maxRotation;
              
        return new KinematicOutput(velocity, rotation);
        
    }
   
}
    