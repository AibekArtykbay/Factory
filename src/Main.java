public class Main {
    public static void main(String[] args) {
        DeliveryFactor factory;
        factory =  new FastDelivery();
        TypeofMovement type = factory.createType();
        type.move();
    }

}
