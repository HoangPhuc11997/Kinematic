package test;

public class KinematicOutput {
    private Vector2D Velocity;
    private float Routation;

    public KinematicOutput() {
    }

    public KinematicOutput(Vector2D Velocity, float Routation) {
        this.Velocity = Velocity;
        this.Routation = Routation;
    }

    public Vector2D getVelocity() {
        return Velocity;
    }

    public void setVelocity(Vector2D Velocity) {
        this.Velocity = Velocity;
    }

    public float getRoutation() {
        return Routation;
    }

    public void setRoutation(float Routation) {
        this.Routation = Routation;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "KinematicOutput{" + "Velocity=" + Velocity + ", Routation=" + Routation + '}';
    }
    
    
}
