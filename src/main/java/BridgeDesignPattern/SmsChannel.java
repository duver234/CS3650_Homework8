public class SmsChannel extends Notification {
    private String paymentTypeMessage;
    
    public SmsChannel(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    
    public void notifyUser() {
        String paymentTypeMessage = paymentMethod.setPaymentTypeMessage();
        System.out.println("SMS Notification: " + paymentTypeMessage + "\n");
    }
}