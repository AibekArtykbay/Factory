public class RegularDelivery implements DeliveryFactor {

    @Override
    public TypeofMovement createType() {
        return new onfoot();
    }
}
