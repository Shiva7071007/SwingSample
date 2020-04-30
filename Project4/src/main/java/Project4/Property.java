package Project4;

public class Property implements StateChangeable<STATUS> {

    String address;
    int bedRoomCount;
    int squareFootage;
    int price;
    STATUS status;

    Property(String address, int bedRoomCount, int squareFootage, int price) {
        this.address = address;
        this.bedRoomCount = bedRoomCount;
        this.squareFootage = squareFootage;
        this.price = price;
        this.status = STATUS.FOR_SALE;
    }

    @Override
    public void changeState(STATUS status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Property{" +
                "address='" + address + '\'' +
                ", bedRoomCount=" + bedRoomCount +
                ", squareFootage=" + squareFootage +
                ", price=" + price +
                ", status=" + status +
                '}';
    }
}
