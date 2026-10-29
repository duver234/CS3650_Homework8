public class OnlinePayment implements PaymentMethod {
    @Override
    public String setPaymentTypeMessage() {
        return "Payment Confirmation of Order:\nOnline payment made successfully.";
    }
}