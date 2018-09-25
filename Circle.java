public class Circle {

    public Circle(float radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(float radius) {
        this.radius = radius;
        this.color = "Red";
    }

    public Circle(String color) {
        this.radius = 2.0f;
        this.color = color;
    }

    public Circle() {
        this.radius = 2.0f;
        this.color = "Red";
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private float radius;
    private String color;

}
