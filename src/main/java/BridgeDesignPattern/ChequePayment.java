public class ChequePayment implements PaymentMethod {
    @Override
    public String setPaymentTypeMessage() {
        return "Payment Confirmation of Order:\nCheque payment made successfully.";
    }
}