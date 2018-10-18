package test;

public class Vector2D {
    private float x;
    private float z;

    public Vector2D() {
    }

    public Vector2D(float x, float z) {
        this.x = x;
        this.z = z;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Vector2D{" + "x=" + x + ", z=" + z + '}';
    }
    
    public static Vector2D addVector2D(Vector2D v1,Vector2D v2){
        return new Vector2D(v1.getX()+v2.getX(), v1.getZ() + v2.getZ());
    }
    
    public Vector2D addVector2D(Vector2D v1){
        this.x +=v1.getX();
        this.z +=v1.getZ();
        return this;
    }
    
    public static Vector2D SubVector2D(Vector2D v1,Vector2D v2){
        return new Vector2D(v1.getX()-v2.getX(),v1.getZ() - v2.getZ());
    }
    
    public Vector2D SubVector2D(Vector2D v1){
        this.x -=v1.getX();
        this.z -=v1.getZ();
        return this;
    }
    
    public static Vector2D mulConstant(Vector2D v1,float Constant){
        return new Vector2D(v1.getX()*Constant, v1.getZ()*Constant);
    }
    
    public Vector2D mulConstant(float Constant){
        this.x*=Constant;
        this.z*=Constant;
        return this;
    }
    
    public float Length(){
        return (float) Math.sqrt(this.getX()*this.getX() + this.getZ()*this.getZ());
    }
    
    public void Nomalize(){
        float length = this.Length();
        this.x/=length;
        this.z/=length;
    }
    
    public static void main(String[] args) {
        
    }
    
}
