package geo.motos;

public final class Bus extends MotoVehicle{
    private int seatCount;

    public Bus() {}

    public Bus(String no, String color, int seatCount) {
        super(no, color);
        this.seatCount = seatCount;
        if (seatCount <= 16) setPrice(800);
        else setPrice(1500);
    }

    @Override
    public double calcRent(int days) {
        return getPrice() * days;
    }

    @Override
    public String toString() {
        return getNo() + "\t" + seatCount + "\t" + getColor() + "\t" + getPrice();
    }

    public int getSeatCount() { return seatCount; }
    public void setSeatCount(int seatCount) { this.seatCount = seatCount; }
}