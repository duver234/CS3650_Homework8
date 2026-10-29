public class BitcoinPayment implements PaymentMethod {
    @Override
    public String setPaymentTypeMessage() {
        return "Payment Confirmation of Order:\nBitcoin payment made successfully.";
    }
}