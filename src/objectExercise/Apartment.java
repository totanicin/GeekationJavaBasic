package objectExercise;

public class Apartment extends Property {
    private String layout;

    public Apartment(String name, String owner, int price, String layout) {
        super(name, owner, "マンション", price);
        this.layout = layout;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public void printDetails() {
        super.printDetails();
        System.out.println("間取り：" + layout);
        System.out.println("=============================");
    }
}
