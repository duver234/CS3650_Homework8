public class CashOnDeliveryPayment implements PaymentMethod {
    @Override
    public String setPaymentTypeMessage() {
        return "Payment Confirmation of Order:\nCash on Delivery payment made successfully.";
    }
}