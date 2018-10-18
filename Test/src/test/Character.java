package test;

public class Character {
    private float orientation;
    private Vector2D position;
    private float routation;
    private Vector2D velocity;

    public Character() {
    }

    public Character(float orientation, Vector2D position, float routation, Vector2D velocity) {
        this.orientation = orientation;
        this.position = position;
        this.routation = routation;
        this.velocity = velocity;
    }

    public float getOrientation() {
        return orientation;
    }

    public void setOrientation(float orientation) {
        this.orientation = orientation;
    }

    public Vector2D getPosition() {
        return position;
    }

    public void setPosition(Vector2D position) {
        this.position = position;
    }

    public float getRotation() {
        return routation;
    }

    public void setRotation(float routation) {
        this.routation = routation;
    }

    public Vector2D getVelocity() {
        return velocity;
    }

    public void setVelocity(Vector2D velocity) {
        this.velocity = velocity;
    }
    
    public void update(KinematicOutput kinematicOutput,float time){
        this.velocity = kinematicOutput.getVelocity();
        this.routation = kinematicOutput.getRoutation();
        
        this.position.addVector2D(this.velocity.mulConstant(time));
        this.orientation+=this.routation*time;
    }
    
    public void applyNewOrientation(){
        if(this.velocity.Length()>0){
            this.orientation = (float) Math.atan2(-this.velocity.getX(),this.velocity.getZ());
        }
    }
    
}
