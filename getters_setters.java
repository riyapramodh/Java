class circle{
   private float radius;
   private float area;
   private float perimeter;
   public void setRadius(float n){
       radius = n;
   }
   public float getRadius(){
       return this.radius;
   }
   public void setArea(float a){
       area = 3.14f*radius*radius;
       if(area==a){
           area = a;
       }
       else{
           System.out.println("invalid area");
       }
    }
    public float getArea(){
       return this.area;
    }
    public void setPerimeter(float p){
       perimeter = 2*3.14f*radius;
       if(perimeter == p){
           perimeter = p;
       }
       else{
           System.out.println("invalid perimeter");
       }

        }
    public float getPerimeter(){
       return this.perimeter;
    }
}
public class getters_setters {
    public static void main(String[] args) {
        float radius = 5f;
        float area = 25f;
        float perimeter = 40f;
        circle info = new circle();
        info.setRadius(radius);
        System.out.println(info.getRadius());
        info.setArea(area);
        System.out.println(info.getArea());
        info.setPerimeter(perimeter);
        System.out.println(info.getPerimeter());


    }
}
