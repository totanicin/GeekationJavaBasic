package objectExercise;

public class Land extends Property {
    private double area;

    public Land(String name, String owner, int price, double area) {
        super(name, owner, "土地", price);
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void printDetails() {
        super.printDetails();
        System.out.println("広さ：" + area + "㎡");
        System.out.println("=============================");
    }
}
