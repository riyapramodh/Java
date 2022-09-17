class dimensions{
    int radius;
    int height;
    float s_area;
    float volume;
    public void setRadius(int r){
        radius = r;
    }
    public int getRadius(){
        return radius;
    }
    public void setHeight(int h){
        height = h;
    }
    public int getHeight(){
        return height;
    }
    public void setSurfaceArea(int radius, int height){
        s_area = (2*3.14f*radius*height) + (2*3.14f*radius*radius);
    }
    public float getSurfaceArea(){
        return s_area;
    }
    public void setVolume(int radius,int height){
        volume = 3.14f*radius*radius*height;
    }
    public float getVolume(){
        return volume;
    }
    public dimensions(int r, int h){
        radius = r;
        height = h;
    }}
public class cylinder {
    public static void main(String[] args) {
        dimensions cylinder = new dimensions(1,1);
        System.out.println("radius is : "+cylinder.getRadius());
        System.out.println("height is: "+cylinder.getHeight());
        cylinder.setSurfaceArea(1,1);
        System.out.println("surface area is : "+cylinder.getSurfaceArea());
        cylinder.setVolume(1,1);
        System.out.println("volume is : "+cylinder.getVolume());

    }
}
