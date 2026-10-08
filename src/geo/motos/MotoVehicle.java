package geo.motos;

public abstract class MotoVehicle {
    private String no;
    private String color;
    private double price;

    public MotoVehicle() {}

    public MotoVehicle(String no, String color) {
        this.no = no;
        this.color = color;
    }

    public abstract double calcRent(int days);

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MotoVehicle other = (MotoVehicle) obj;
        return no.equals(other.no);
    }
    // get/set
    public String getNo() { return no; }
    public void setNo(String no) { this.no = no; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}
