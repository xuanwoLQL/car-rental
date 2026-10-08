package geo.motos;

public final  class Car extends MotoVehicle{
    private String type;

    public Car() {}

    public Car(String no, String color, String type) {
        super(no, color);
        this.type = type;
        if ("宝马".equals(type)) setPrice(500);
        else if ("别克".equals(type)) setPrice(300);
    }

    @Override
    public double calcRent(int days) {
        return getPrice() * days;
    }

    @Override
    public String toString() {
        return getNo() + "\t" + type + "\t" + getColor() + "\t" + getPrice();
    }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
}
