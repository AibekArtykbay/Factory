public class FastDelivery implements DeliveryFactor {

    @Override
    public TypeofMovement createType() {
        return new Аuto();
    }
}
